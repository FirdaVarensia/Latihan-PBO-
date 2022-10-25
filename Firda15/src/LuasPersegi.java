
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
public class LuasPersegi {
    public static void main(String[] args) {
        //deklarasai
        double Luas;
        int sisi;
        
        //membuat Scannner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("***Program hitung Luas Persegi***");
        System.out.println("input sisi");
        sisi = hitung.nextInt();
        
        //proses
        Luas = Double.valueOf((sisi * sisi));
        
        //output
        System.out.println("Keliling segitiga = "+Luas);
        System.out.println("Hello World");
    }
}
