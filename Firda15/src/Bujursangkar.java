
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
public class Bujursangkar {
    public static void main(String[] args) {
        System.out.println("Menghitung luas bangun datar bujursangkar");
    Scanner masukkan = new Scanner(System.in);
        
    
        System.out.println("masukkan nilai sisi:");
            int var_c = masukkan.nextInt();
            
        double luas = var_c*var_c;
        
        System.out.println("hasilnya adalah:" +luas);
    }
    
}
