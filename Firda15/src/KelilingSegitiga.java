
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
public class KelilingSegitiga {
    public static void main(String[] args) {
        //deklarasi
        double Keliling;
        int sisiA, sisiB, sisiC;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("***Program hitung Keliling Segitiga***");
        System.out.println("input sisiA");
        sisiA = hitung.nextInt();
        System.out.println("input sisiB");
        sisiB = hitung.nextInt();
        System.out.println("input sisiC");
        sisiC = hitung.nextInt();
        
        //proses
        Keliling = Double.valueOf((sisiA + sisiB + sisiC));
        
        //output
        System.out.println("Keliling segitiga = "+Keliling);
        System.out.println("Hello World");
    }
}
