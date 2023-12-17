/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB1;

/**
 *
 * @author BIMO SP
 */
public class kreditmotor {
    public static void main(String[] args) {
        Motor kredit = new Motor();
        System.out.println("idp "+kredit.getidPenjual());
        System.out.println("namap "+kredit.getnamapenjual());
        System.out.println("id "+kredit.getidpembeli());
        System.out.println("nama "+kredit.getnamapembeli());
        System.out.println("merk "+kredit.getmerkmotor());
        System.out.println("bunga "+kredit.getBungCIcilan());
        System.out.println("tenor "+kredit.gettenor());
        System.out.println("cetak "+kredit.getcetaktransaksikredit());
    }
    
}
