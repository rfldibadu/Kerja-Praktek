/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Dosen;

/**
 *
 * @author Adri
 */
public class ExecuteDosen {
    public List<Dosen> getAll(){
        List<Dosen>myDsn = new ArrayList();
        String querry = "Select * from dosen";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while(rs.next()){
                Dosen dsn = new Dosen();
                dsn.setNama(rs.getString("nama"));
                dsn.setNidn(rs.getInt("nidn"));
                dsn.setTgllahir(rs.getString("tgllahir"));
                dsn.setJabatanakademik(rs.getString("jabatanakademik"));
                
                myDsn.add(dsn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return myDsn;
        
    }

}
