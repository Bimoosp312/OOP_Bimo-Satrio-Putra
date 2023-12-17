/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author Arika Cantik
 */
public class MotorMatic extends MotorCredit {
    String tipe, merk;
    int harga, durasiCicilan, CicilanPerbulan;

    int DurasiCicilan() {
        durasiCicilan = harga / CicilanPerbulan;
        return durasiCicilan;
    }
}

