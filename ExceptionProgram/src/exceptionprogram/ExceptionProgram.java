package exceptionprogram;

/**
 *
 * @fikripraja
 */
import java.util.Scanner;
public class ExceptionProgram {

    public static void main(String[] args) {
        
        double x =0;
        double y=0;
        double hasil = 0;
        
        do {
            try {
                System.out.println("");
                System.out.println("...Contoh Exception...");
                System.out.println("======================");
                System.out.println("1. Kali");
                System.out.println("2. Bagi");
                System.out.println("3. Tambah");
                System.out.println("4. Kurang");
                System.out.println("5. Advance Kalkulator");
                System.out.println("6. Keluar");
                System.out.print("Pilih [1..6] : ");
                Scanner scan = new Scanner(System.in);
                int choice = scan.nextInt();  


                switch (choice) {
                    case 1: 
                        
                        System.out.println(" ");
                        System.out.print("x : ");
                        x = scan.nextDouble();
                        System.out.print("y : ");
                        y = scan.nextDouble();
                        hasil = x*y;
                        System.out.print("Hasil : "+hasil);
                        System.out.println("");
                            break;  
                    case 2: 
                        System.out.println(" ");
                        System.out.print("x : ");
                        x = scan.nextDouble();
                        System.out.print("y : ");
                        y = scan.nextDouble();
                        hasil = x/y;
                        System.out.print("Hasil : "+hasil);
                        System.out.println("");
                        
                        break;
                    case 3: 
                        System.out.println(" ");
                        System.out.print("x : ");
                        x = scan.nextDouble();
                        System.out.print("y : ");
                        y = scan.nextDouble();
                        hasil = x+y;
                        System.out.print("Hasil : "+hasil);
                        System.out.println("");
                        
                        break;  
                    case 4: 
                        System.out.println(" ");
                        System.out.print("x : ");
                        x = scan.nextDouble();
                        System.out.println("y : ");
                        y = scan.nextDouble();
                        hasil = x-y;
                        System.out.print("Hasil : "+hasil);
                        System.out.println("");
                        
                         break;
                    case 5: 
                        
                        
                        break;
                    case 6: 
                        System.out.println("");
                        System.out.println("Now exiting program...");
                        break;  
                }
            } catch (Throwable e) {
               System.out.println("Yang anda inputkan salah!");
            }
            
        } while (x==1);
    } 
            
        
}