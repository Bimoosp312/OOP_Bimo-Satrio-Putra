package BAB7;

public class MotorMatic extends KreditMotor {
    private int bonusService;

    public MotorMatic(String nama, String alamat, String merk, int harga, int durasiCicilan, int bonusService) {
        super(nama, alamat, merk, harga, durasiCicilan);
        this.bonusService = bonusService;
    }

    @Override
    public void kredit() {
        // Periksa apakah durasiCicilan tidak sama dengan nol untuk menghindari pembagian oleh nol
        if (durasiCicilan != 0) {
            durasiCicilan = (harga - bonusService) / durasiCicilan;
        } else {
            System.err.println("Error: Durasi Cicilan tidak boleh nol.");
            // Atau lakukan tindakan lain sesuai kebutuhan
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Bonus Service: " + bonusService);
    }

    // Getter dan Setter untuk bonusService
    public int getBonusService() {
        return bonusService;
    }

    public void setBonusService(int bonusService) {
        this.bonusService = bonusService;
    }
}


