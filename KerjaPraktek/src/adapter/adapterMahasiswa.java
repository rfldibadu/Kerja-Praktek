/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;
import com.Mahasiswa;
import exec.ExecuteMahasiswa;
import java.util.List;
/**
 *
 * @author asus
 */
public class adapterMahasiswa {

    public Object[][] getAllGuru(){
    ExecuteMahasiswa em = new ExecuteMahasiswa();
    List<Mahasiswa>lstmhs = em.ListMhs();
    Object[][] datamhs = new Object[lstmhs.size()][5];
    
    int mysize = 0;
    for(Mahasiswa mhs: lstmhs){
        datamhs[mysize][0] = mhs.getNRP();
        datamhs[mysize][1] = mhs.getNama();
        datamhs[mysize][2] = mhs.getJurusan();
        datamhs[mysize][3] = mhs.getAlamat();
        datamhs[mysize][4] = mhs.getNoHp();
        mysize++;
    }
    return datamhs;
    }
}
