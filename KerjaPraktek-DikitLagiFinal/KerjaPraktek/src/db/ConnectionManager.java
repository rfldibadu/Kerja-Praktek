package db;

import java.sql.*;

public class ConnectionManager {
    private Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/kp_laboop";
    private String username = "root";
    private String password = "";
    
    public Connection logOn(){
        try{
            //Load JDBC Driver
            Class.forName(driver).newInstance();
            //Buat object connection
            con = DriverManager.getConnection(url, username, password);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
    
    public void logOff(){
        try{
            //Tutup koneksi
            con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}