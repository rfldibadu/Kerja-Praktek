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
public class Nonmember extends Pembeli implements Interface {
    private boolean Status = false;
    private barang[] myBrg;
    private int totalHargaBeli; //total harga normal barang yang dibeli

    public Nonmember() {
    }

    public Nonmember(barang[] myBrg, String namaPembeli, String alamatPembeli, String kontakPembeli) {
        super(namaPembeli, alamatPembeli, kontakPembeli);
        this.myBrg = myBrg;
    }

    public boolean isStatus() {
        return Status;
    }
/*
    public void setStatus(boolean Status) {
        this.Status = Status;
    }
*/
    public barang[] getMyBrg() {
        return myBrg;
    }

    public void setMyBrg(barang[] myBrg) {
        this.myBrg = myBrg;
    }

    public int getTotalHargaBeli() {
        return totalHargaBeli;
    }

    public void setTotalHargaBeli(int totalHargaBeli) {
        this.totalHargaBeli = totalHargaBeli;
    }
       
    @Override
    public int totalHargaBeli(){
        int totalHB = 0;
        int total = 0;
        int kelDis;//kelipatan diskon
        
        for(barang brg : this.myBrg){
            totalHB += brg.getHarga()*brg.getJumlah()/2;
        }
        System.out.println("Harga sebelum diskon: "+totalHB);
        this.setTotalHargaBeli(totalHB); //harga sebelum diskon
        kelDis = totalHB/750000;
        //diskon setiap kelipatan 750 ribu dapat 10 persen
        total = totalHB - kelDis*(5*750000/100);
        
        return total;
    }
}
