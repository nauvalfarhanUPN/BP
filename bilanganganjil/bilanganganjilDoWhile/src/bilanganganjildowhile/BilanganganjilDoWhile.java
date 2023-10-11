/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilanganganjildowhile;
import java.util.Scanner;
/**
 *
 * @author nauval
 */
public class BilanganganjilDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan angka = ");
        int bilangan = s.nextInt();
        System.out.println("deretan bilangan ganjil : ");
        int counter = 1;
        do{
            System.out.println(counter+"");
            counter+= 2;
        }while(bilangan >= counter);
        
        
        
       
           
        
        
    }
    
}
