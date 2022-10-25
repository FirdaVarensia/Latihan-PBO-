
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
public class LuasPersegiPanjang {
    public static void main(String[] args) {
        //deklarasi
        double Luas;
        int panjang, lebar;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("***Program hitung Luas Persegi Panjang***");
        System.out.println("input Panjang");
        panjang = hitung.nextInt();
        System.out.println("input Lebar");
        lebar = hitung.nextInt();

        //proses
        Luas = Double.valueOf((panjang * lebar));
        
        //output
        System.out.println("Keliling segitiga = "+Luas);
        System.out.println("Hello World");
    }
}
