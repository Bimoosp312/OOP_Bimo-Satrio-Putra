/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5;

/**
 *
 * @author Arika Cantik
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek MotorCredit
        MotorCredit motorCredit1 = new MotorCredit("Bimo", "Malang","Honda",15000000, 12);
        MotorCredit motorCredit2 = new MotorCredit("Tria", "Malang","Honda", 12000000, 10);

        // Mencetak hasil perhitungan cicilan
        System.out.println("Cicilan Motor 1 per bulan: " + motorCredit1.hitungCicilan());
        System.out.println("Cicilan Motor 2 per bulan: " + motorCredit2.hitungCicilan());

        // Membuat objek MotorMatic dan MotorSport
        MotorMatic motorMatic = new MotorMatic("Rahamat", "Malang","Honda", 12000000, 8, "Automatic");
        MotorSport motorSport = new MotorSport("Bimo", "Malang","Aerox", 18000000, 12, "Sport");

        // Mencetak informasi MotorMatic dan MotorSport
       
        System.out.println("MotorSport: " + motorSport.getMerk() + ", Tipe: " + motorSport.getTipe());
    }
}


