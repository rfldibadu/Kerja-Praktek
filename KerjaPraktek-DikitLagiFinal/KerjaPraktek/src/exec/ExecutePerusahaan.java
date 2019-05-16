/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Perusahaan;
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
public class ExecutePerusahaan {
        public List<Perusahaan> getPrs(){
        List<Perusahaan>myPrs = new ArrayList();
        String querry = "Select * from perusahaan";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while(rs.next()){
                Perusahaan prs = new Perusahaan();
                prs.setIdPerusahaan(rs.getString("id_perusahaan"));
                prs.setNamaPerusahaan(rs.getString("nama_perusahaan"));
                prs.setAlamatPerusahaan(rs.getString("alamat_perusahaan"));
                prs.setTlpPerusahaan(rs.getString("no_tlp_perusahaan"));
                
                myPrs.add(prs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        
        return myPrs;
        
    }
    
}
