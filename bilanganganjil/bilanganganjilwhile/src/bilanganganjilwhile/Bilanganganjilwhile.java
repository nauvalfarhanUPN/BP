/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilanganganjilwhile;
import java.util.Scanner;
/**
 *
 * @author nauval
 */
public class Bilanganganjilwhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bilangan, counter;
        System.out.println("deretan bilangan ganjil");
        System.out.print("masukkan angka = ");
        bilangan = s.nextInt();
        counter = 1;
        while(counter <= bilangan){
            System.out.println(counter+"");
            counter+= 2;
        }
        System.out.println("");
        
    }
    
}
