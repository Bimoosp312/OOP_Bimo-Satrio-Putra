/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author Arika Cantik
 */
public class MotorSport extends MotorCredit {
    private String tipe;

    public MotorSport(String merk, int harga, int durasiCicilan, String tipe) {
        super(merk, harga, durasiCicilan);
        this.tipe = tipe;
    }

    // Getter dan setter untuk tipe
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}

