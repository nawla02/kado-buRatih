/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komisi;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Komisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi variabel
        int hasil;
        
        //menggunakan scanner
        Scanner io = new Scanner(System.in);
        System.out.print("hasil penjualan : ");
        hasil = io.nextInt();
        
        //membuat struktur kondisi if
         if(hasil >= 200000) {
             System.out.println("uang jasa 10000 + uang komisi 10%");
         }else if(hasil > 200000) {
             System.out.println("uang jasa 20000 + uang komisi 15%");
         }else if(hasil > 500000) {
             System.out.println("uang jasa 30000 + uang komisi 20%");
         }
        
                
                
                
                
             
    }
    
}
