/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azkaban;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Azkaban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] menu = {"Ayam Bakar","Nasi Goreng","Air Mineral","Es teh","Es jeruk"};
        int[] harga = {30000,20000,5000,15000,16000};
        
        System.out.println("Selamat Datang Di Rumah Makan Azkaban");
        System.out.println("Silahkan pilih dari menu");
            
        for (int i =   0; i < harga.length; i++ ){
            System.out.println(i+","+menu[i]+" : "+harga[i]);
        }
        System.out.println("Silahkan Masukan Nomor Menu");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        
        System.out.println("masukan pilihan = "+menu[pilihan]);
        
        System.out.println("Silahkan Berikan Uang Anda");
        
        int uang = input.nextInt();
        if (uang > harga[pilihan]){
            System.out.println("kembalian"+(uang - harga[pilihan]));
        }else if (uang == harga[pilihan]);
        System.out.println("uang anda pas");
       
}
    
}
