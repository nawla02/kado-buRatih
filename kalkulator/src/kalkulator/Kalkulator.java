   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,hasil;
        
        System.out.println("Kalkulator Sederhana");
        
       System.out.println("Operator Perhitungan : ");
       String Penjumlahan = "(1) Penjumlahan (+)";
       System.out.println("Penjumlahan");
       String Pengurangan = "(2) Pengurangan (-)";
       System.out.println("Pengurangan");
       String Perkalian = "(3) Perkalian (*)";
       System.out.println("Perkalian");
       String Pembagian = "(4) Pembagian (/)";
       System.out.println("Pembagian");
       
      Scanner io = new Scanner (System.in);
       System.out.println("Masukan Angka Pertama = ");
       x = io.nextByte();
       System.out.println("Masukan Angka Kedua = ");
       y = io.nextByte();
       
       int a;
       System.out.println("Pilih Operator Hitung = ");
       a = io.nextByte();
       
        switch (a) {
            case 1:
                hasil=x+y;
                System.out.println("Hasil Penjumlahan = "+hasil);
                break;
            case 2:
                hasil=x-y;
                System.out.println("Hasil Pengurangan = "+hasil);
                break;
            case 3:
                hasil=x*y;
                System.out.println("Hasil Perkalian = "+hasil);
                break;
            case 4:
                hasil=x/y;
                System.out.println("Hasil Pembagian = "+hasil);
                System.out.println("Terimakasi");
                break;
            default:
                break;
        }
       
    }
    
}
