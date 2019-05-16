/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

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
public class ExecuteMahasiswa {
  public String DeleteMahasiswa(String mhs){
        String hasil ="";
        String query="delete from mahasiswa where NRP='"+mhs+"'";
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
    public String UpdateMahasiswa(Mahasiswa mhs){
    String hasil="";
         String query ="update mahasiswa SET nama_mhsw='"+mhs.getNama()+"',jurusan='"+mhs.getJurusan()+
               "',alamat_mhsw='"+mhs.getAlamat()+"',no_tlp='"+mhs.getNoHp()+"'where nrp='"+mhs.getNRP()+"'";
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

    public String InsertMahasiswa(Mahasiswa mhs){
        String query = "INSERT INTO Mahasiswa value(?,?,?,?,?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String Respon;
        try{
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, mhs.getNRP());
            pstm.setString(2, mhs.getNama());
            pstm.setString(3, mhs.getJurusan());
            pstm.setString(4, mhs.getAlamat());
            pstm.setString(5, mhs.getNoHp());
            pstm.executeUpdate();
            Respon="Insert Sukses";            
        }catch(SQLException ex){
            Respon = "Insert Gagal";
        Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return Respon;
    }
    
    public List<Mahasiswa>ListMhs(){
        List<Mahasiswa> arlistmhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNRP(rs.getString("nrp"));
                mhs.setNama(rs.getString("nama_mhsw"));
                mhs.setJurusan(rs.getString("jurusan"));
                mhs.setAlamat(rs.getString("alamat_mhsw"));
                mhs.setNoHp(rs.getString("no_tlp"));
                arlistmhs.add(mhs);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    
        }
        conMan.logOff();
        return arlistmhs;
    }     
}
