/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author Arika Cantik
 */
public class Main {

    public static void main(String[] args) {
        // Contoh penggunaan kelas MotorCredit
        MotorCredit motorCredit = new MotorCredit();
        motorCredit.merk = "Honda";
        motorCredit.harga = 12000000;
        motorCredit.durasiCicilan = 12;

        System.out.println("Informasi Motor Credit:");
        System.out.println("Merk: " + motorCredit.merk);
        System.out.println("Harga: Rp" + motorCredit.harga);
        System.out.println("Durasi Cicilan: " + motorCredit.durasiCicilan + " bulan");
        System.out.println("Cicilan per Bulan: Rp" + motorCredit.cicilanPerBulan());

        System.out.println();

        // Contoh penggunaan kelas MotorSport
        MotorSport motorSport = new MotorSport();
        motorSport.merk = "Yamaha";
        motorSport.harga = 15000000;
        motorSport.durasiCicilan = 10;
        motorSport.tipe = "Sporty";

        System.out.println("Informasi Motor Sport:");
        System.out.println("Merk: " + motorSport.merk);
        System.out.println("Harga: Rp" + motorSport.harga);
        System.out.println("Durasi Cicilan: " + motorSport.durasiCicilan + " bulan");
        System.out.println("Tipe: " + motorSport.tipe);
        System.out.println("Cicilan per Bulan: Rp" + motorSport.Cp());

        System.out.println();

        // Contoh penggunaan kelas MotorMatic
        MotorMatic motorMatic = new MotorMatic();
        motorMatic.merk = "Suzuki";
        motorMatic.harga = 11000000;
        motorMatic.CicilanPerbulan = 1000000;

        System.out.println("Informasi Motor Matic:");
        System.out.println("Merk: " + motorMatic.merk);
        System.out.println("Harga: Rp" + motorMatic.harga);
        System.out.println("Cicilan per Bulan: Rp" + motorMatic.CicilanPerbulan);
        System.out.println("Durasi Cicilan: " + motorMatic.DurasiCicilan() + " bulan");
    }
}
