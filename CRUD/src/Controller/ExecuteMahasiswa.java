/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mahasiswa;
import java.util.List;
import connection.connectionManager;
//import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;

/**
 *
 * @author asus
 */
public class ExecuteMahasiswa {
    public String DeleteMahasiswa(String mhs){
        String hasil ="";
        String query="delete from mahasiswa where NRP='"+mhs+"'";
        connectionManager conMan = new connectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil; 

    }
    public String UpdateMahasiswa(Mahasiswa mhs){
    String hasil="";
         String query ="update mahasiswa SET Nama='"+mhs.getNama()+"',Gender='"+mhs.getGender()+
               "',NoHP='"+mhs.getNoHP()+"',Alamat='"+mhs.getAlamat()+"'where NRP='"+mhs.getNrp()+"'";
        // 
        connectionManager conMan = new connectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
             stm.executeUpdate(query);
             hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil;    
    }

    public String InsertMahasiswa(Mahasiswa mhs){
        String query = "INSERT INTO Mahasiswa value(?,?,?,?,?)";
        connectionManager conMan = new connectionManager();
        Connection conn = conMan.Logon();
        String Respon;
        try{
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, mhs.getNrp());
            pstm.setString(2, mhs.getNama());
            pstm.setString(3, mhs.getGender());
            pstm.setString(4, mhs.getNoHP());
            pstm.setString(5, mhs.getAlamat());
            pstm.executeUpdate();
            Respon="Insert Sukses";            
        }catch(SQLException ex){
            Respon = "Insert Gagal";
        Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return Respon;
    }
    
    public List<Mahasiswa> ListMhs(){
        List<Mahasiswa> arlistmhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        connectionManager conMan = new connectionManager();
        Connection conn = conMan.Logon();
        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNrp(rs.getString("NRP"));
                mhs.setNama(rs.getString("Nama"));
                mhs.setGender(rs.getString("Gender"));
                mhs.setNoHP(rs.getString("NoHP"));
                mhs.setAlamat(rs.getString("Alamat"));
                arlistmhs.add(mhs);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    
        }
        conMan.Logoff();
        return arlistmhs;
    }   
}

