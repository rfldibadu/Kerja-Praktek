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
public class Dosen {
    private String nama;
    private int nidn;
    private String tgllahir;
    private String jabatanakademik;

    public Dosen() {
    }

    public Dosen(String nama, int nidn, String tgllahir, String jabatanakademik) {
        this.nama = nama;
        this.nidn = nidn;
        this.tgllahir = tgllahir;
        this.jabatanakademik = jabatanakademik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }

    public String getJabatanakademik() {
        return jabatanakademik;
    }

    public void setJabatanakademik(String jabatanakademik) {
        this.jabatanakademik = jabatanakademik;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nama=" + nama + ", nidn=" + nidn + ", tgllahir=" + tgllahir + ", jabatanakademik=" + jabatanakademik + '}';
    }
    
}
