/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author Arika Cantik
 */
public class MotorMatic extends MotorCredit {
    private String fitur;

    public MotorMatic(String merk, int harga, int durasiCicilan, String fitur) {
        super(merk, harga, durasiCicilan);
        this.fitur = fitur;
    }

    // Getter dan setter untuk fitur
    public String getFitur() {
        return fitur;
    }

    public void setFitur(String fitur) {
        this.fitur = fitur;
    }
}

