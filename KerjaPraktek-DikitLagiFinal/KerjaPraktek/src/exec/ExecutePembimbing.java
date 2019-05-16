/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Dosen;
import com.Pembimbing;
import db.ConnectionManager;
import java.sql.Connection;
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
public class ExecutePembimbing {
        public List<Pembimbing> getPmb(){
        List<Pembimbing>myPmb = new ArrayList();
        String querry = "Select * from pembimbing";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while(rs.next()){
                Pembimbing pmb = new Pembimbing();
                pmb.setIdPmb(rs.getString("id_pmb"));
                pmb.setNamaPmb(rs.getString("nama_pmb"));
                pmb.setTlpPmb(rs.getString("no_tlp_pmb"));
                
                myPmb.add(pmb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return myPmb;
        
    }

    
}
