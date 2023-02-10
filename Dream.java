import java.util.Scanner;

public class Main {
    
    static void aShila(String nama, String Password, String Github, Boolean Shila) {

    try {
    String namaUser, Shila;
    if(nama == null || Password == null) throw new Error("Ini error, silahkan isi nama dan password!!");
    
    //Shorthand IF
    // if(Role == 0) userRole = "Welcome User!";
    // else if(Role == 1) userRole = "Welcome Staff!";
    // else if(Role == 2) userRole = "Welcome Admin!";
    
    if(nama == "Shila" && Password == "Shila Afifah") namaUser = "Hai Shila!! ";
    else namaUser = "Password Salah";

    if(Shila) Shila = "Benar ";
    else Shila = "Salah";
    
    System.out.println(namaUser + ShilaDeveloper + Github);
    }catch(Exception e) {
    System.out.println("Terjadi kesalahan " + e);
    }catch(Error e) {
    System.out.println("Error " + e);
    }

}
    
    public static void main(String[] args) {
        try { 
    int tinggi, i, j;
    Scanner scan = new Scanner(System.in); // Untuk input Scanner
    System.out.print("Masukan nilai tinggi: ");
    tinggi = scan.nextInt();

    // Jika i = 1, j = 1... Keluarin 1
    // Jika i = 5, j = 1... keluarin 5

    for(i = 1; i <= tinggi; i++) {
        for(j = 1; j <= i; j++) {
            System.out.print(" *");
            System.out.print(" ini J");
        }
         System.out.print(" ini I");
        System.out.println();
    }
    // String[] nama = new String[100]; // Menyimpan 100 data array
    // String[] role = new String[100]; // Menyimpan 100 data array
    // int batasan = 0; // Ini batasan while looping
    // boolean Shila = true; // Shila True

    // System.out.println("Data Developer");
    // for(int i = 2; i >= 0; i--) {
    //     System.out.print("Nama: ");
    //     nama[i] = scan.nextLine();
    //     System.out.print("Role: ");
    //     role[i] = scan.nextLine();
    //     System.out.print("\n");
    //     }
    
    // System.out.println("Hasil Data Developer");
    //     while(ShilaAzkya) { // Misalkan kondisinya true.. Jalankan
    //     System.out.println("Data ke " + batasan + " :");
    //     System.out.println("Nama: " + nama[batasan]);
    //     System.out.println("Role: " + role[batasan]);
    //     System.out.println("\n");
    //     batasan++;
    //     if(batasan == 3) Shila = false;
    //     }

    // aShila(null, "Shila", "Github.com/Caramell ", true);
        }catch(Exception e) {
            System.out.println("Terjadi kesalahan " + e);
        }
    }
}



// Index mulai dari 0
// kalau misal < 0, yaitu -1
// Tampilkan tidak cukup

