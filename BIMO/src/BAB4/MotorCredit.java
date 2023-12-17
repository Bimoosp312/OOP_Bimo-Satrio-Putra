/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author Arika Cantik
 */
public class MotorCredit {
    private String merk;
    private int harga;
    private int durasiCicilan;

    public MotorCredit(String merk, int harga, int durasiCicilan) {
        this.merk = merk;
        this.harga = harga;
        this.durasiCicilan = durasiCicilan;
    }

    // Getter dan setter untuk merk
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter dan setter untuk harga
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Getter dan setter untuk durasiCicilan
    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    public void setDurasiCicilan(int durasiCicilan) {
        this.durasiCicilan = durasiCicilan;
    }

    // Metode untuk menghitung cicilan per bulan
    public int hitungCicilan() {
        return harga / durasiCicilan;
    }
}

