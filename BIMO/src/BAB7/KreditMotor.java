package BAB7;

public class KreditMotor extends abstrack_class implements intermotor {

    protected String nama;
    protected String alamat;
    protected String merk;
    protected int harga;
    protected int durasiCicilan;

    public KreditMotor(String nama, String alamat, String merk, int harga, int durasiCicilan) {
        this.nama = nama;
        this.alamat = alamat;
        this.merk = merk;
        this.harga = harga;
        this.durasiCicilan = durasiCicilan;
    }

    @Override
    public void kredit() {
        // Logika kredit umum
        durasiCicilan = harga / durasiCicilan;
    }

    @Override
    public void info() {
        System.out.println("Informasi Kredit Motor");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Merk Motor: " + merk);
        System.out.println("Harga Motor: " + harga);
        System.out.println("Durasi Cicilan: " + durasiCicilan + " bulan");
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan Setter untuk merk
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter dan Setter untuk harga
    public int getHarga() {
        return harga;
    }

    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Getter dan Setter untuk durasiCicilan
    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    @Override
    public void setDurasiCicilan(int durasiCicilan) {
        this.durasiCicilan = durasiCicilan;
    }
}
