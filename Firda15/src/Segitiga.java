
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
public class Segitiga {
    public static void main(String[] args) {
        //LUAS SEGITIGA
        System.out.println("Menghitung luas bangun datar Segitiga");
        // float setengah = (float)0.5;
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Masukkan nilai alas: ");
            int var_a = masukkan.nextInt();
        System.out.println("Masukkan nilai tinggi; ");
            int var_b = masukkan.nextInt();
            
        float luas = var_a * var_b * (float)0.5;
        
        System.out.println("Hasilnya adalah: "+luas);
        
    }
    
}
