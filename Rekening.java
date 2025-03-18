public class Rekening {
    protected String namaPemilik;
    protected String nomorRekening;
    protected double saldo;

    // Konstruktor
    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    // Menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("\n=== Informasi Rekening ===");
        System.out.println("Nama Pemilik    : " + namaPemilik);
        System.out.println("Nomor Rekening  : " + nomorRekening);
        System.out.println("Saldo           : Rp " + saldo);
    }

    // Menabung
    public void setorSaldo(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil menabung Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0!");
        }
    }

    // Menarik saldo
    public void tarikSaldo(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah tidak valid!");
        }
    }
}
