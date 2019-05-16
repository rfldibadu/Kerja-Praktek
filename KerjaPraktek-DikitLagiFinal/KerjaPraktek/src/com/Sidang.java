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
public class Sidang {
    private String idsidang;
    private String tanggal;
    private String ruangan;
    private String idkp;

    public Sidang() {
    }

    public Sidang(String idsidang, String tanggal, String ruangan, String idkp) {
        this.idsidang = idsidang;
        this.tanggal = tanggal;
        this.ruangan = ruangan;
        this.idkp = idkp;
    }

    public String getIdsidang() {
        return idsidang;
    }

    public void setIdsidang(String idsidang) {
        this.idsidang = idsidang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getIdkp() {
        return idkp;
    }

    public void setIdkp(String idkp) {
        this.idkp = idkp;
    }

    @Override
    public String toString() {
        return "Sidang{" + "idsidang=" + idsidang + ", tanggal=" + tanggal + ", ruangan=" + ruangan + ", idkp=" + idkp + '}';
    } 
    
}
