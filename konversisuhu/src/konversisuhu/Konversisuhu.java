/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Konversisuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int c, k, f, r;
        System.out.println("KONVERSI SUHU");
        
        Scanner io = new Scanner (System.in);
        System.out.println("Masukan Celcius");
        c = io.nextByte();
        
        int a;
       System.out.println("Pilih Operator Hitung = ");
       a = io.nextByte();
       
        switch (a) {
            case 1:
                k = c+273;
                System.out.println("Hasil kelvin = "+k);
                break;
            case 2:
                f = 9/5*c +32;
                System.out.println("Hasil fahrenheit = "+f);
                break;
            case 3:
                r = 4/5 *c;
                System.out.println("Hasil Reamur = "+r);
                break;
            
               
               
            default:
                break;
        } 
            
    }
    
}
