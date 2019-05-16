/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Dosen;
import com.KP;
import com.Mahasiswa;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adri
 */
public class ExecuteKP {
    public List<KP> getKP(){
        List<KP>myKP = new ArrayList();
        String querry = "Select * from kp";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while(rs.next()){
                KP k = new KP();
                k.setIdKp(rs.getString("id_kp"));
                k.setNrp(rs.getString("nrp"));
                k.setIdPmb(rs.getString("id_pmb"));
                k.setIdPerusahaan(rs.getString("id_perusahaan"));
                k.setNidn(rs.getString("nidn"));
                
                myKP.add(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteKP.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return myKP;
        
    }
    public String InsertKP(KP k){
        String query = "INSERT INTO kp value(?,?,?,?,?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String Respon;
        try{
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, k.getIdKp());
            pstm.setString(2, k.getNrp());
            pstm.setString(3, k.getIdPmb());
            pstm.setString(4, k.getIdPerusahaan());
            pstm.setString(5, k.getNidn());
            pstm.executeUpdate();
            Respon="Insert Sukses";            
        }catch(SQLException ex){
            Respon = "Insert Gagal";
        Logger.getLogger(ExecuteKP.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return Respon;
    }
    
    public String UpdateKP(KP k){
    String hasil="";
         String query ="update kp SET nidn='"+k.getNidn()+"',nrp='"+k.getNrp()+
               "',id_pmb='"+k.getIdPmb()+"',id_perusahaan='"+k.getIdPerusahaan()+"'where id_kp='"+k.getIdKp()+"'";
        // 
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
             stm.executeUpdate(query);
             hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteKP.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;    
    }
      public String DeleteKP(String k){
        String hasil ="";
        String query="delete from kp where id_kp='"+k+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteKP.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil; 

    }
    
}
