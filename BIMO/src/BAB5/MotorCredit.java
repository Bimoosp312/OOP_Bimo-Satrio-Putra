/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author Arika Cantik
 */
public class MotorCredit {
    
    private String nama, alamat, merk;
    private int harga;
    private int durasiCicilan;

    public MotorCredit(String nama, String alamat, String merk, int harga, int durasiCicilan) {
        this.nama = nama;
        this.alamat = alamat;
        this.merk = merk;
        this.harga = harga;
        this.durasiCicilan = durasiCicilan;
    }  

    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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

    // Metode overloading untuk menghitung cicilan per bulan
    public int hitungCicilan() {
        return harga / durasiCicilan;
    }

    // Metode overloading untuk menghitung cicilan per bulan dengan bunga
    public int hitungCicilan(int bunga) {
        return (harga + (harga * bunga / 100)) / durasiCicilan;
    }
}

    

