/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Adri
 */
public class Mahasiswa {
    private String NRP;
    private String Nama;
    private String Tgl_Lahir;
    private String Alamat;   
    private String noHp;
    private String Jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String NRP, String Nama, String Tgl_Lahir, String Alamat, String noHp, String Jurusan) {
        this.NRP = NRP;
        this.Nama = Nama;
        this.Tgl_Lahir = Tgl_Lahir;
        this.Alamat = Alamat;
        this.noHp = noHp;
        this.Jurusan = Jurusan;
    }

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTgl_Lahir() {
        return Tgl_Lahir;
    }

    public void setTgl_Lahir(String Tgl_Lahir) {
        this.Tgl_Lahir = Tgl_Lahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "NRP=" + NRP + ", Nama=" + Nama + ", Tgl_Lahir=" + Tgl_Lahir + ", Alamat=" + Alamat + ", noHp=" + noHp + ", Jurusan=" + Jurusan + '}';
    }
    
    
}
