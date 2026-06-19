package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        // ---- Soal 1: Cek keberadaan dan ukuran laporan.txt ----
        System.out.println("=== Soal 1: Cek laporan.txt ===");
        File berkas1 = new File("laporan.txt");
        if (berkas1.exists()) {
            System.out.println("Berkas ada, ukuran: " + berkas1.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        // ---- Soal 2: Buat folder baru bernama arsip ----
        System.out.println("\n=== Soal 2: Buat folder arsip ===");
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Gagal membuat folder 'arsip' (mungkin sudah ada).");
        }

        // ---- Soal 3: Buat sementara.txt lalu hapus ----
        System.out.println("\n=== Soal 3: Buat dan hapus sementara.txt ===");
        File berkas3 = new File("sementara.txt");
        try {
            berkas3.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + berkas3.exists());
            berkas3.delete();
            System.out.println("Sesudah dihapus, ada? " + berkas3.exists());
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
