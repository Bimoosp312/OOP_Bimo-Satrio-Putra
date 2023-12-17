/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author Arika Cantik
 */
public class MotorSport extends MotorCredit {
    private String tipe;

    public MotorSport(String nama,String alamat,String merk, int harga, int durasiCicilan, String tipe) {
        super(nama,alamat,merk, harga, durasiCicilan);
        this.tipe = tipe;
    }

    // Getter dan setter untuk tipe 
     public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    // Metode overriding untuk menghitung cicilan per bulan
    @Override
    public int hitungCicilan() {
        // Implementasi khusus untuk MotorSport
        return super.hitungCicilan() + 100000; // Tambahan cicilan untuk tipe Sport
    }
}
