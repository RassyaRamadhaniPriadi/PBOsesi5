import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input data rekening
        try (Scanner scanner = new Scanner(System.in)) {
            // Input data rekening
            System.out.print("Masukkan Nama Pemilik: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan Nomor Rekening: ");
            String nomor = scanner.nextLine();
            
            System.out.print("Masukkan Saldo Awal: Rp ");
            double saldoAwal = scanner.nextDouble();
            
            System.out.print("Masukkan Bunga Tahunan (%): ");
            double bungaTahunan = scanner.nextDouble();
            
            // Membuat objek tabungan
            Tabungan tabungan = new Tabungan(nama, nomor, saldoAwal, bungaTahunan);
            tabungan.tampilkanInfo();
            
            // Menabung
            System.out.print("\nMasukkan jumlah yang ingin disetor: Rp ");
            double setor = scanner.nextDouble();
            tabungan.setorSaldo(setor);
            
            // Menarik uang
            System.out.print("\nMasukkan jumlah yang ingin ditarik: Rp ");
            double tarik = scanner.nextDouble();
            tabungan.tarikSaldo(tarik);
            
            // Menghitung bunga
            System.out.print("\nMasukkan jumlah bulan untuk menghitung bunga: ");
            int bulan = scanner.nextInt();
            tabungan.hitungBunga(bulan);
        }
    }
}