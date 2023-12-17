package BAB2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BIMO SP
 */
public class KreditMotor {
    
    String idPenjual,namaPenjual,idPembeli,namaPembeli,MerkMotor;
    double BungaCicilan,bunga;
    
    public KreditMotor(){
        this.idPenjual = "id penjual : ";
        this.namaPenjual = "nama penjual : ";
        this.idPembeli = "id pembeli : ";
        this.namaPembeli = "nama pembeli : ";
        this.MerkMotor = "merk motor : " ;
        BungaCicilan = 00.2;
    }
    String cetakidjual(){
        return idPenjual;
    }
    String cetakidbeli(){
        return idPembeli;
    }
    String cetakpenjual(){
        return namaPenjual;
    }
    String cetakpembeli(){
        return namaPembeli;
    }
    String getmerk(){
        return MerkMotor;
    }
    double getbunga(int a){
        bunga=a*BungaCicilan;
        return bunga;
    }
    }

