/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_kuis;

/**
 *
 * @author Cyborg_RT27
 */
public abstract class Pembeli {
    private String namaPembeli;
    private String alamatPembeli;
    private String kontakPembeli;

    public Pembeli() {
    }

    public Pembeli(String namaPembeli, String alamatPembeli, String kontakPembeli) {
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.kontakPembeli = kontakPembeli;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    public String getKontakPembeli() {
        return kontakPembeli;
    }

    public void setKontakPembeli(String kontakPembeli) {
        this.kontakPembeli = kontakPembeli;
    }

    public abstract int totalHargaBeli();
        
    @Override
    public String toString() {
        return "Pembeli{" + "namaPembeli = " + namaPembeli + ", alamatPembeli = " + alamatPembeli + ", kontakPembeli = " + kontakPembeli + '}';
    }
    
    
}
