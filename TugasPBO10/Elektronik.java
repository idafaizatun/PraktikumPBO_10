/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO10;

/**
 *
 * @author ASUS
 */
public class Elektronik implements Pembayaran {
    @Override
    public double HitungPajak(double harga){
        return harga * 0.10;
    }
}


