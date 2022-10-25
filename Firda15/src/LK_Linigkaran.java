
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
public class LK_Linigkaran {
    public static void main(String[] args) {
        //deklarasi
        double Luas, Keliling, PHI;
        int r;
        
        //membuat Scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("***Program hitung Luas dan Keliling Lingkaran***");
        System.out.println("input Jari-jari");
        r = hitung.nextInt();

        //proses
        PHI = 3.14;
        Luas = Double.valueOf((r * PHI * r));
        Keliling = Double.valueOf((2 * PHI * r));
        
        //output
        System.out.println("Keliling segitiga = "+Luas);
        System.out.println("Keliling segitiga = "+Keliling);
        System.out.println("Hello World");
    }
}
