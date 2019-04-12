package UTS_LAB;
import java.util.Scanner;
public class Kamera_Peminjam {
    int hari;
    int harga;
    int sewa;
    String nama;
    int ID;
   double kamera;
    Scanner input = new Scanner(System.in);
//    konstructor over loading member atau non member
   public static void inputnama(){
       Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama peminjam: ");
   }
    public Kamera_Peminjam(int sewa){
        this.sewa=sewa;    
        System.out.println("Sewa perhari: "+sewa);
    } 
//    konstructor over loading Kamera_Peminjam untuk non member
    public Kamera_Peminjam(int kamera,int hari){    
        this.kamera=kamera;
        this.hari=hari;
        int byr=kamera*hari;   
        System.out.println("Sewa perhari: "+byr);
    }
    public static void pilihan(){
     Scanner input = new Scanner(System.in);
     System.out.println("Silahkan pilih ID KTP atau SIM: ");
            System.out.println("1. SIM");
            System.out.println("2. KTP");
            System.out.print("Masukkan pilihan: "); 
            
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
            Kamera_Peminjam.SIM();
       break;
            case 2:
            Kamera_Peminjam.KTP();
       break;                    
    } 
        
    }
    public static void inputID(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nomer ID: ");
    }
//    methode member
    public static void SIM(){
        Scanner input = new Scanner(System.in);
        System.out.println("======================");
            System.out.println("Pilih Jenis Kamera:");
            System.out.println("======================");
            System.out.println("1.Nikon");
            System.out.println("2.Xiaomi");
            System.out.println("3.esia");
            System.out.println("4.Fuji");
            System.out.print("Masukan pilihan: ");
            int pilih1=input.nextInt();
            switch(pilih1){
                    case 1:
                     Kamera_Peminjam Nikon=new Kamera_Peminjam(100);
                     Nikon.tampilmember();
                  break;
                    case 2:
                    Kamera_Peminjam Xiaomi=new Kamera_Peminjam(100);
                    Xiaomi.tampilmember();
                  break;
                    case 3:
                        Kamera_Peminjam esia=new Kamera_Peminjam(100);
                        esia.tampilmember();
                        break;
                    case 4:
                        Kamera_Peminjam Fuji=new Kamera_Peminjam(100);
                        Fuji.tampilmember();
                        break;                        
            }
    }
//    methode non member
    public static void KTP(){
            Scanner input = new Scanner(System.in);
            System.out.println("======================");
            System.out.println("Pilih kamera ");
            System.out.println("======================");
            System.out.println("1.Nikon");
            System.out.println("2.Xiaomi");
            System.out.println("3.esia");
            System.out.println("4.Fuji");
            System.out.println("5.Acer");
            System.out.print("Masukka pilihan : ");
            int pilih2=input.nextInt();
            switch(pilih2){
                    case 1:
                     Kamera_Peminjam nikon=new Kamera_Peminjam(100,1);
                     nikon.tampilnonmember();
                  break;
                    case 2:
                    Kamera_Peminjam Xiaomi=new Kamera_Peminjam(100,1);
                    Xiaomi.tampilnonmember();
                  break;
                    case 3:
                        Kamera_Peminjam esia=new Kamera_Peminjam(100,1);
                        esia.tampilnonmember();
                        break;
                    case 4:
                        Kamera_Peminjam Fuji=new Kamera_Peminjam(100,1);
                        Fuji.tampilnonmember();
                        break;
                    case 5:
                        Kamera_Peminjam acer=new Kamera_Peminjam(100,1);
                        acer.tampilnonmember();          
            }
    }
    void tampilmember(){
        int jumlahharir2;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa: ");
        int jmhari=input.nextInt();
        jumlahharir2=jmhari*sewa; 
        System.out.print("Anda memilih SIM ");
        System.out.println("Dengan harga sewa: "+jumlahharir2);
    }
    void tampilnonmember(){
        int jumlahhari;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa: ");
        int jmhari=input.nextInt();
        jumlahhari=(int) (jmhari*kamera*hari);
        System.out.print("Anda memilih KTP ");
        System.out.println("Dengan harga sewa: "+jumlahhari);
    }
}
