/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO10;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        // Objek Elektronik
        Elektronik KipasAngin = new Elektronik();
        double hargaElektronik = 500000;
        double pajakElektronik = KipasAngin.HitungPajak(hargaElektronik);
        System.out.println("Harga  Elektronik (KipasAngin): Rp. " + hargaElektronik);
        System.out.println("Harga Pajak Elektronik (KipasAngin): Rp. " + pajakElektronik);
        System.out.println();
        
        // Objek Makanan
        Makanan PisangKeju = new Makanan();
        double hargaMakanan = 300000;
        double pajakMakanan = PisangKeju.HitungPajak(hargaMakanan);
        System.out.println("Harga Makanan (PisangKeju): Rp. " + hargaMakanan);
        System.out.println("Harga Pajak Makanan (PisangKeju): Rp. " + pajakMakanan);
        System.out.println();
    }   
}
