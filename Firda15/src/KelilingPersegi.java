
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
public class KelilingPersegi {
    public static void main(String[] args) {
        //deklarasi
        double Keliling;
        int sisi;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("***Program hitung Keliling Persegi***");
        System.out.println("input sisi");
        sisi = hitung.nextInt();

        //proses
        Keliling = Double.valueOf((4 * sisi));
        
        //output
        System.out.println("Keliling segitiga = "+Keliling);
        System.out.println("Hello World");
    }
}
