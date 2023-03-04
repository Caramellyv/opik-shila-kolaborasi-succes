import java.util.Scanner;
public class Switch {
    public static void main (String[] args) {
        Scanner ya = new Scanner(System.in);
        String pilih;
        System.out.println("---Just Fun---");
        System.out.print("Pilih Bahasa Pemrograman ???  ");
        pilih = ya.nextLine();
        switch (pilih) {
            case "Java" :
                System.out.println("Welcome To Java ! ");
                break;
            case "PHP" :       
                System.out.println("Welcome To PHP ");
                break;    
            case "JavaScript" : 
                System.out.println("Welcome To JavaScript ");
                break; 
            case "Golang" :
                 System.out.println("Welcome to Golang");
                break;
            case "Dart" :
                 System.out.println("Welcome to Dart ");   
                break;  
            case "C++" :
                  System.out.println("Welcome to C++ ");  
                break;   
        }  
        System.out.println("End Program----Thank you----");             
    }    
}
