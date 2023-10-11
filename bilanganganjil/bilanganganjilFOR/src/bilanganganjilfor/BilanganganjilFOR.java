/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilanganganjilfor;
import java.util.Scanner;
/**
 *
 * @author nauval
 */
public class BilanganganjilFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = 1;
        System.out.println("deret bilangan ganjil");
        System.out.print("masukkan angka = ");
        int bilangan = s.nextInt();
        for (int i = 1; i <= bilangan; i+=2) {
            System.out.println(""+i);
        }
        
        // TODO code application logic here
    }
    
}
