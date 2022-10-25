
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
public class Lingkaran {
    public static void main(String[] args) {
        double phi,jari_jari;
        Scanner masukkan = new Scanner(System.in);
        
        phi = 22/7;
        jari_jari = 14;
        
        double luas = phi*jari_jari*jari_jari;
        
        System.out.println("luas Lingkaran: "+luas);
    }
    
}
