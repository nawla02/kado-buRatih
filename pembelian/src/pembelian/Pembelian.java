/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembelian;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pembelian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi variabel
        int total;
        
        // menggunakan scanner
        Scanner io = new Scanner(System.in);
        System.out.print("total belanja : ");
        total = io.nextInt();
        
        // membuat struktur kondisi if
        if(total >= 50000) {
        System.out.println("mendapat potongan 20%");
          }else{
            System.out.println("tidak mendapat potongan");
        }
   
        
    }
    
}
