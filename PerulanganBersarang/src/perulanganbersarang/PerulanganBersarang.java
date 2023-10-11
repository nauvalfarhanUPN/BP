/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulanganbersarang;
import java.util.Scanner;
/**
 *
 * @author nauval
 */
public class PerulanganBersarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("deret bilangan ganjil");
            System.out.print("masukkan angka = ");
            int bilangan = s.nextInt();
            for (int i = 1; i <= bilangan; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+"");
                }
                System.out.println("");
            }
        
    }
    
}
