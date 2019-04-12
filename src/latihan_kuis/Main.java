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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        barang coffeeB = new barang("C001","Coffee Beans",55000,40);
        barang fcmilk = new barang("C002","Full Cream Milk",17500,20);
        barang cocoaP = new barang("C006","Cocoa Powder",25000,40);
        barang syrup = new barang("C011","Syrup",7500,15);
        
        barang[] namabrg = {coffeeB, fcmilk, cocoaP, syrup};
        barang[] mbrBrg = {coffeeB, cocoaP, syrup};
        barang[] noMbrBrg = {fcmilk, cocoaP, coffeeB};
        System.out.println("========== Daftar Barang jual ==========");
        for(barang brg : namabrg){
            System.out.println(brg);
        }
        int totalPH = 0;
        
        Member mbr = new Member(mbrBrg,"Maddison",
                "Leicester Barunstone","08335312441");
        Nonmember nbr = new Nonmember(noMbrBrg,"james",
                "Sumatera","031153824444");
        
        Pembeli[] pbl = {mbr, nbr};
        System.out.println("======= Transaksi Hari ini =======");
        
        for(Pembeli p : pbl){
            System.out.println(p.toString());
            System.out.println("Total pembelian : "+p.totalHargaBeli());
            //totalPH += p.totalHargaBeli();
        }
        //System.out.println("Total penjualan dalam sehari : "+totalPH);
    }
    
}
