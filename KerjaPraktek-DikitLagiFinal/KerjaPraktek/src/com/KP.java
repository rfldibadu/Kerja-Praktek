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
public class KP {
    private String idKp;
    private String nrp;
    private String idPmb;
    private String idPerusahaan;
    private String nidn;

    public KP() {
    }

    public KP(String idKp, String nrp, String idPmb, String idPerusahaan, String nidn) {
        this.idKp = idKp;
        this.nrp = nrp;
        this.idPmb = idPmb;
        this.idPerusahaan = idPerusahaan;
        this.nidn = nidn;
    }

    public String getIdKp() {
        return idKp;
    }

    public void setIdKp(String idKp) {
        this.idKp = idKp;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getIdPmb() {
        return idPmb;
    }

    public void setIdPmb(String idPmb) {
        this.idPmb = idPmb;
    }

    public String getIdPerusahaan() {
        return idPerusahaan;
    }

    public void setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    @Override
    public String toString() {
        return "KP{" + "idKp=" + idKp + ", nrp=" + nrp + ", idPmb=" + idPmb + ", idPerusahaan=" + idPerusahaan + ", nidn=" + nidn + '}';
    }
    
}
