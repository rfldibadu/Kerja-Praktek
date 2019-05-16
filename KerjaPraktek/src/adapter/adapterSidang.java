/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.List;
import com.Sidang;
import exec.ExecuteSidang;

/**
 *
 * @author asus
 */
public class adapterSidang {
    
    public Object[][] getAllGuru(){
    ExecuteSidang es = new ExecuteSidang();
    List<Sidang>lstsidang = es.ListSidang();
    Object[][] datasidang = new Object[lstsidang.size()][4];
    
    int mysize = 0;
    for(Sidang sdg: lstsidang){
        datasidang[mysize][0] = sdg.getIdsidang();
        datasidang[mysize][1] = sdg.getTanggal();
        datasidang[mysize][2] = sdg.getRuangan();
        datasidang[mysize][3] = sdg.getIdkp();
        mysize++;
    }
    return datasidang;
    }
}
