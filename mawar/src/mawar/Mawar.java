/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mawar;

/**
 *
 * @author MOKLET-2
 */
public class Mawar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mawar = 21, melati = 3, matahari = 5;
        double harga;
        harga = 4500.5;
        double total, bayar;
        
        mawar = 21;
        melati = 3;
        matahari = 5;
        
        total = mawar+melati+matahari;
        bayar = total*harga;
        
        System.out.println(total+"jumlah barang yang dibeli = "+mawar+"+"+melati+"+"+matahari);
        System.out.println("total yang dibayar = Rp"+bayar);
    }
    
}
