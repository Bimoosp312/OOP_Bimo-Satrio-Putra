/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7;

/**
 *
 * @author Arika Cantik
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme: objek MotorMatic disimpan dalam referensi KreditMotor
        KreditMotor motor = new MotorMatic("Bimo", "Jl. Raya", "Honda", 15000000, 12, 1000000);

        // Memanggil metode kredit() dari objek KreditMotor
        motor.kredit();

        // Memanggil metode info() dari objek KreditMotor (akan memanggil metode info() pada MotorMatic)
        motor.info();
    }
}
