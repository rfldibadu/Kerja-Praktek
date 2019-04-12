
package UTS_LAB;

import java.util.Scanner;

public class MainRental {


    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Scanner keyboard = new Scanner(System.in);
        System.out.print(" ");
        Kamera_Peminjam.inputnama();
        String nama = keyboard.next();
        Kamera_Peminjam.inputID();
        String ID = keyboard.next();  
        Kamera_Peminjam.pilihan();  
       System.out.print("Transaksi lagi Ya=1 Tidak=2 : ");
        int hari=input.nextInt();
        if(hari==1){
            //  pemangilan kelas Kamera_Peminjam dan methode pilihan 
            //nama class.nama methode
            Kamera_Peminjam.pilihan();       
        }    

      }   
    }
    

