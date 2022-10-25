
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Persegipanjang {
    public static void main(String[] args) {
        System.out.println("menghitung luas dari bangun datar persegi panjang");
            Scanner masukkan = new  Scanner(System.in);
        
        System.out.println("masukkan panjang : ");
            int panjang = masukkan.nextInt();
            
        System.out.println("masukkan lebar : ");
            int lebar = masukkan.nextInt();
        int luas = panjang * lebar;
        
         System.out.println("hasilnya adalah :" + luas);  
    }
}
