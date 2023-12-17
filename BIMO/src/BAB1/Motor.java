/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB1;

/**
 *
 * @author BIMO SP
 */
public class Motor {
    String idPenjual,namaPenjual,idPembeli,namaPembeli,MerkMotor,BungaCicilan,Tenor,CetakTransaksiKredit;
    public Motor(){
        this.idPenjual="id penjual : ";
        this.namaPenjual="Nama Penjual : ";
        this.idPembeli="id Pembeli : ";
        this.namaPembeli="Nama Pembeli : ";
        this.MerkMotor="Merk Motor : ";
        this.BungaCicilan="Bunga cicilan : ";
        this.Tenor="Tenor : ";
        this.CetakTransaksiKredit= getidPenjual()+getnamapenjual()+getidpembeli()+getnamapembeli()+getmerkmotor()+getBungCIcilan()+gettenor();
    }
    public String getidPenjual(){
        return this.idPenjual; 
    }
    public String getnamapenjual(){
        return this.namaPenjual;
    }
    public String getidpembeli(){
        return this.idPembeli;
    }
    public String getnamapembeli(){
        return this.namaPembeli;
    }
    public String getmerkmotor(){
        return this.MerkMotor;
    }
    public String getBungCIcilan(){
        return this.BungaCicilan;
    }
    public String gettenor(){
        return this.Tenor;
    }
    public String getcetaktransaksikredit(){
        return this.CetakTransaksiKredit;
    }
}
