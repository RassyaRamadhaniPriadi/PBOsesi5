public class Tabungan extends Rekening {
    private final double bungaTahunan;

    // Konstruktor
    public Tabungan(String namaPemilik, String nomorRekening, double saldo, double bungaTahunan) {
        super(namaPemilik, nomorRekening, saldo);
        this.bungaTahunan = bungaTahunan;
    }

    // Menampilkan info rekening tabungan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Rekening  : Tabungan");
        System.out.println("Bunga Tahunan   : " + bungaTahunan + " % per tahun\n");
    }

    // Menghitung bunga berdasarkan jumlah bulan
    public void hitungBunga(int bulan) {
        if (bulan > 0) {
            double bungaDihasilkan = (saldo * bungaTahunan * bulan) / (12 * 100);
            saldo += bungaDihasilkan;
            System.out.println("Bunga untuk " + bulan + " bulan: Rp " + bungaDihasilkan);
            System.out.println("Saldo setelah bunga: Rp " + saldo);
        } else {
            System.out.println("Periode perhitungan bunga harus lebih dari 0!");
        }
    }
}
