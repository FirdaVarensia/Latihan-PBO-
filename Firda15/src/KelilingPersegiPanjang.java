
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
public class KelilingPersegiPanjang {
    public static void main(String[] args) {
        //deklarasi
        double Keliling;
        int panjang, lebar;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("***Program hitung Keliling Persegi Panjang***");
        System.out.println("input panjang");
        panjang = hitung.nextInt();
        System.out.println("input lebar");
        lebar = hitung.nextInt();
        
        //proses
        Keliling = Double.valueOf((2 * panjang + 2 * lebar));
        
        //output
        System.out.println("Keliling segitiga = "+Keliling);
        System.out.println("Hello World");
}
}
