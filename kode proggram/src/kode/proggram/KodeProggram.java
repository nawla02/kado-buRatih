/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kode.proggram;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class KodeProggram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  deklarasi variabel
        int nilai;
        
        // menggunakan scanner
        Scanner io = new Scanner (System.in);
        System.out.println("Nilai :" );
        nilai = io.nextInt();
        
        //membuat struktur kondisi if
        if (nilai > 90){
            System.out.println("grade A");
        }
        else if (nilai > 80) {    
            System.out.println("grade b+");
        }
       else if (nilai > 70) {
           System.out.println("grade b");
       }
       else{ 
           System.out.println("grade f");
       }
        
        
        
       
       
    
     
        
        
        
