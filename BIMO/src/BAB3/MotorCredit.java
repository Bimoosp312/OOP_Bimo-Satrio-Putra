/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author Arika Cantik
 */
public class MotorCredit {

    String merk;
    float harga;
    float durasiCicilan;

    float cicilanPerBulan() {
        float cicilanPerBulan = harga / durasiCicilan;
        return cicilanPerBulan;
    }

}
