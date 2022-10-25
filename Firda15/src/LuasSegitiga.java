
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        //deklarasi
        double luas;
        int alas, tinggi;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("***Program hitung Luas Segitiga****");
        System.out.println("input alas");
        alas = hitung.nextInt();
        System.out.println("input tinggi");
        tinggi = hitung.nextInt();
        
        //proses
        luas = Double.valueOf((alas * tinggi/2));
        
        //output
        System.out.println("Luas segitiga = "+luas);
        System.out.println("Hello World");
    }
}
