/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.Connection;

/**
 *
 * @author asus
 */
public class MainConnection {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        connectionManager conMan = new connectionManager();
        Connection conn = conMan.Logon();
        System.out.println("Koneksi Tersedia");
    }
    
}
