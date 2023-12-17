/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author Arika Cantik
 */
public class MotorMatic extends MotorCredit {

    private String fitur;

    public MotorMatic(String nama, String alamat, String merk, int harga, int durasiCicilan, String fitur) {
        super(nama, alamat, merk, harga, durasiCicilan);
        this.fitur = fitur;
    }

// Metode overriding untuk menghitung cicilan per bulan
    @Override
    public int hitungCicilan() {
        // Perbaikan: Hapus super.hitungCicilan()
        return super.hitungCicilan();
    }

}
