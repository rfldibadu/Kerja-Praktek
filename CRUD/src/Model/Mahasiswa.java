/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author asus
 */
public class Mahasiswa {
    private String Nrp,Nama,Gender,Alamat,NoHP;
    
    public Mahasiswa(){
    }
    
    public Mahasiswa(String Nrp,String Nama,String Gender,String Alamat,String NoHP){
        this.Nrp = Nrp;
        this.Nama = Nama;
        this.Gender = Gender;
        this.Alamat = Alamat;
        this.NoHP = NoHP;
    }
    
    public String getNrp(){
        return Nrp;
    }
    
    public void setNrp(String Nrp){
        this.Nrp = Nrp;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }
    
}
