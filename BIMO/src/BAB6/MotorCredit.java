/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6;

/**
 *
 * @author Arika Cantik
 */
public abstract class  MotorCredit {
    protected String nama;
    protected String alamat;
    protected String merk;
    protected int harga;
    protected int durasiCicilan;
   public MotorCredit(String nama, String alamat, String merk, int harga, int durasiCicilan) {
    this.nama = nama;
    this.alamat = alamat;
    this.merk = merk;
    this.harga = harga;
    this.durasiCicilan = durasiCicilan;
}
    public abstract void kredit();

}
