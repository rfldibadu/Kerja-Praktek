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
public class Pembimbing {
    private String idPmb;
    private String namaPmb;
    private String tlpPmb;

    public Pembimbing() {
    }

    public Pembimbing(String idPmb, String namaPmb, String tlpPmb) {
        this.idPmb = idPmb;
        this.namaPmb = namaPmb;
        this.tlpPmb = tlpPmb;
    }

    public String getIdPmb() {
        return idPmb;
    }

    public void setIdPmb(String idPmb) {
        this.idPmb = idPmb;
    }

    public String getNamaPmb() {
        return namaPmb;
    }

    public void setNamaPmb(String namaPmb) {
        this.namaPmb = namaPmb;
    }

    public String getTlpPmb() {
        return tlpPmb;
    }

    public void setTlpPmb(String tlpPmb) {
        this.tlpPmb = tlpPmb;
    }

    @Override
    public String toString() {
        return "Pembimbing{" + "idPmb=" + idPmb + ", namaPmb=" + namaPmb + ", tlpPmb=" + tlpPmb + '}';
    }
    
    
    
}
