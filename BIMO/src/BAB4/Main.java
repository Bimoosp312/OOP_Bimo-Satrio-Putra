/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author Arika Cantik
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek MotorCredit menggunakan konstruktor
        MotorCredit motorCredit = new MotorCredit("Honda", 12000000, 12);

        // Menggunakan setter untuk mengubah nilai merk
        motorCredit.setMerk("Yamaha");

        // Menggunakan getter untuk mendapatkan nilai harga
        System.out.println("Informasi Motor Credit:");
         System.out.println("============================");
        System.out.println("Merk: " + motorCredit.getMerk());
        System.out.println("Harga: Rp " + motorCredit.getHarga());
        System.out.println("Durasi Cicilan: " + motorCredit.getDurasiCicilan() + " bulan");
        System.out.println("Cicilan per Bulan: Rp " + motorCredit.hitungCicilan());

        System.out.println();

        // Membuat objek MotorSport menggunakan konstruktor
        MotorSport motorSport = new MotorSport("Yamaha", 15000000, 10, "Sporty");

        // Menggunakan setter untuk mengubah nilai tipe
        motorSport.setTipe("Super Sporty");

        // Menggunakan getter untuk mendapatkan nilai tipe
        System.out.println("Informasi Motor Sport:");
         System.out.println("============================");
        System.out.println("Merk: " + motorSport.getMerk());
        System.out.println("Harga: Rp " + motorSport.getHarga());
        System.out.println("Durasi Cicilan: " + motorSport.getDurasiCicilan() + " bulan");
        System.out.println("Tipe: " + motorSport.getTipe());
        System.out.println("Cicilan per Bulan: Rp " + motorSport.hitungCicilan());

        System.out.println();

        // Membuat objek MotorMatic menggunakan konstruktor
        MotorMatic motorMatic = new MotorMatic("Suzuki", 11000000, 8, "Automatic Transmission");

        // Menggunakan setter untuk mengubah nilai fitur
        motorMatic.setFitur("Advanced Automatic Transmission");

        // Menggunakan getter untuk mendapatkan nilai fitur
        System.out.println("Informasi Motor Matic:");
        System.out.println("============================");
        System.out.println("Merk: " + motorMatic.getMerk());
        System.out.println("Harga: Rp " + motorMatic.getHarga());
        System.out.println("Durasi Cicilan: " + motorMatic.getDurasiCicilan() + " bulan");
        System.out.println("Fitur: " + motorMatic.getFitur());
        System.out.println("Cicilan per Bulan: Rp " + motorMatic.hitungCicilan());
    }
}

