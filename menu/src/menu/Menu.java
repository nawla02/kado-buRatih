/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String[] Menu = {"Nasi Goreng","Mie Goreng","Ayam Bakar","Es Teh","Es Jeruk"};
         int[] harga = {20000,23000,35000,10000,15000};
         System.out.println("Selamat Datang Di Rumah Makan Azkaban");
         System.out.println("Daftar Menu");
         
         for (int i = 0; i < harga.length; i++){
        System.out.println(i+"."+Menu[i]+" = " +harga[i]); 
        
        System.out.println("Silahkan Pilih Menu : ");
        Scanner input = new Scanner(System.in);
        
        int pilihan = input.nextInt();
        System.out.println("pilih nomor menu  : "+Menu[pilihan]);
        
        
    }
    }
    
}
