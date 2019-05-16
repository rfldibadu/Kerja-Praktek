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
public class Perusahaan {
    private String idPerusahaan;
    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String tlpPerusahaan;

    public Perusahaan() {
    }

    public Perusahaan(String idPerusahaan, String namaPerusahaan, String alamatPerusahaan, String tlpPerusahaan) {
        this.idPerusahaan = idPerusahaan;
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.tlpPerusahaan = tlpPerusahaan;
    }

    public String getIdPerusahaan() {
        return idPerusahaan;
    }

    public void setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getTlpPerusahaan() {
        return tlpPerusahaan;
    }

    public void setTlpPerusahaan(String tlpPerusahaan) {
        this.tlpPerusahaan = tlpPerusahaan;
    }

    @Override
    public String toString() {
        return "Perusahaan{" + "idPerusahaan=" + idPerusahaan + ", namaPerusahaan=" + namaPerusahaan + ", alamatPerusahaan=" + alamatPerusahaan + ", tlpPerusahaan=" + tlpPerusahaan + '}';
    }
}
