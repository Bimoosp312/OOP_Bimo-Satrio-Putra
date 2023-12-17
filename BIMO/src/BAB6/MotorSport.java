/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6;

/**
 *
 * @author Arika Cantik
 */
public class MotorSport extends MotorCredit {

    protected int jumlahCicilan;

    public MotorSport(String nama, String alamat, String merk, int harga, int durasiCicilan, int jumlahCicilan) {
        super(nama, alamat, merk, harga, durasiCicilan);
        this.jumlahCicilan = jumlahCicilan;
    }

    public MotorSport() {
        super("", "", "", 0, 0);
    }

    // Getter dan Setter untuk Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk Alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    // Getter dan Setter untuk Merk

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter dan Setter untuk Harga
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Getter untuk jumlahCicilan
    public int getJumlahCicilan() {
        return jumlahCicilan;
    }

    // Setter untuk jumlahCicilan
    public void setJumlahCicilan(int jumlahCicilan) {
        this.jumlahCicilan = jumlahCicilan;
    }
    // Getter untuk jumlahCicilan

    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    // Setter untuk jumlahCicilan
    public void setDurasiCicilan(int durasiCicilan) {
        this.durasiCicilan = durasiCicilan;
    }

    @Override
    public void kredit() {
        if (durasiCicilan != 0) {
            jumlahCicilan = harga / durasiCicilan;
        } else {
            // Tangani kasus jika jumlahCicilan sama dengan nol
            // Misalnya, beri nilai default pada durasiCicilan atau tampilkan pesan kesalahan.
            durasiCicilan = 0; // Atau nilai default lainnya sesuai kebutuhan
            // Atau tampilkan pesan kesalahan
            System.err.println("Error: Jumlah Cicilan tidak boleh nol.");
        }
    }
}





