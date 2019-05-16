/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import java.util.List;
import com.Sidang;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adri
 */
public class ExecuteSidang {
    
     public String DeleteSidang(String sdg){
        String hasil ="";
        String query="delete from sidang where id_sidang='"+sdg+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil; 

    }
    
    public String UpdateSidang(Sidang sdg){
    String hasil="";
         String query ="update sidang SET tgl_sidang='"+sdg.getTanggal()+"',ruangan='"+sdg.getRuangan()+
               "',id_kp='"+sdg.getIdkp()+"'where id_sidang='"+sdg.getIdsidang()+"'";
        // 
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
             stm.executeUpdate(query);
             hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;    
    }
    
    public String InsertSidang(Sidang sdg){
        String query = "INSERT INTO Sidang value(?,?,?,?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String Respon;
        try{
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, sdg.getIdsidang());
            pstm.setString(2, sdg.getTanggal());
            pstm.setString(3, sdg.getRuangan());
            pstm.setString(4, sdg.getIdkp());
            pstm.executeUpdate();
            Respon="Insert Sukses";            
        }catch(SQLException ex){
            Respon = "Insert Gagal";
        Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return Respon;
    }
    public List<Sidang> ListSidang(){
        List<Sidang> arlistSidang = new ArrayList<>();
        String query = "SELECT * FROM sidang";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Sidang sdg = new Sidang();
                sdg.setIdsidang(rs.getString("id_sidang"));
                sdg.setTanggal(rs.getString("tgl_sidang"));
                sdg.setRuangan(rs.getString("ruangan"));
                sdg.setIdkp(rs.getString("id_kp"));
                arlistSidang.add(sdg);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    
        }
        conMan.logOff();
        return arlistSidang;
    }   
    
}
