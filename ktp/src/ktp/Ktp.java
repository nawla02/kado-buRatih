/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Ktp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama,TTL,JenisKelamin,GolDarah,Alamat,Desa,Kecamatan,Agama,StatusPerkawinan,
        Pekerjaan,Kewarganegaraan,NIK,Berlakuhingga; 
        int RT;
        
        //menggunakan Scanner
        Scanner io = new Scanner (System.in);
        System.out.println("Kartu Tanda Penduduk");
        System.out.println("NIK : ");
        NIK = io.next();
        System.out.println("Nama : ");
        Nama = io.next();
        System.out.println("TTL : ");
        TTL = io.next();
        System.out.println("Jenis Kelamin : ");
        JenisKelamin = io.next();
        System.out.println("Gol Darah : ");
        GolDarah = io.next();
        System.out.println("Alamat : ");
        Alamat = io.next();
        System.out.println("RT/RW : ");
        RT = io.nextByte();
        System.out.println("Kel/Desa : ");
        Desa = io.next();
        System.out.println("Kecamatan : ");
        Kecamatan = io.next();
        System.out.println("Agama : ");
        Agama = io.next();
        System.out.println("Status Perkawinan : ");
        StatusPerkawinan = io.next();
        System.out.println("Pekerjaan : ");
        Pekerjaan = io.next();
        System.out.println("Kewarganegaraan : ");
        Kewarganegaraan = io.next();
        System.out.println("Berlaku Hingga : ");
        Berlakuhingga = io.next();
        
        
        
    }
    
}
