import java.util.Scanner;
public class Baby {
    public static void main(String[] args) {
     // Deklarasi
     String nama;
     int[] harga = new int[100];
     int total = 0;
     Scanner myObj = new Scanner(System.in);

     // Main
     System.out.println("----------------------------");
     System.out.println("Kharisma Agung Plaza < KAP >");
     System.out.println("Khusus Pembelian 5 Barang Pertama");
     System.out.println("Dengan harga minimum Rp 10000,00");
     System.out.println("----------------------------");
     System.out.print("Masukan nama pembeli : ");
     nama = myObj.nextLine();
     
     for(int x = 1; x <= 5; x++) {
         System.out.print("Masukan harga barang ke-" + x + ": ");
         harga[x] = myObj.nextInt();
         total += harga[x];
     }  
    System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
    if(total > 100000) System.out.print("Selamat.... \n Anda mendapat hadiah 1 buah mug cantik");
    else System.out.println("Terimakasih...");
    }
}