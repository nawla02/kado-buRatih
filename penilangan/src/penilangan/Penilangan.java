/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Penilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String[] razia = {"Masker","SIM","STNK"};
        int[] harga = {30000,20000,5000};
        
        System.out.println("RAZIA");
        System.out.println("bentuk pelanggaran");
            
        for (int i =   0; i < harga.length; i++ ){
            System.out.println(i+","+razia[i]+" : "+harga[i]);
        }
        System.out.println("Silahkan Masukan Nomor Pelanggaran");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        
        System.out.println("masukan pilihan = "+razia[pilihan]);
        
        System.out.println("Silahkan Berikan Uang Anda");
        
        int uang = input.nextInt();
        if (uang > harga[pilihan]){
            System.out.println("kembalian"+(uang - harga[pilihan]));
        }else if (uang == harga[pilihan]);
        System.out.println("uang anda pas");
        
        
}
        
        
        
        
        
        
       
    }
    
}
