package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {

        // ===== Kode dari modul =====
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111"));
        buku.tambahKontak(new Kontak("Budi", "0822222"));
        buku.tambahKontak(new Kontak("Citra", "0833333"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());

        // ===== Latihan Mandiri 3.4 No.1: cariKontak =====
        System.out.println("\n=== Latihan Mandiri 3.4 No.1: Cari Kontak ===");
        bukuLain.cariKontak("Budi");
        bukuLain.cariKontak("Dodi"); // tidak ada

        // ===== Latihan Mandiri 3.4 No.2: atribut email =====
        System.out.println("\n=== Latihan Mandiri 3.4 No.2: Kontak dengan Email ===");
        BukuKontak bukuEmail = new BukuKontak("kontak_email.txt");
        bukuEmail.tambahKontak(new Kontak("Andi",  "0811111", "andi@email.com"));
        bukuEmail.tambahKontak(new Kontak("Budi",  "0822222", "budi@email.com"));
        bukuEmail.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        bukuEmail.tampilkanSemua();
        bukuEmail.simpanKeBerkas();

        BukuKontak bukuEmailLoad = new BukuKontak("kontak_email.txt");
        bukuEmailLoad.muatDariBerkas();
        System.out.println("Setelah dimuat dari berkas:");
        bukuEmailLoad.tampilkanSemua();

        // ===== Latihan Mandiri 3.4 No.3: hapusKontak =====
        System.out.println("\n=== Latihan Mandiri 3.4 No.3: Hapus Kontak ===");
        bukuEmailLoad.hapusKontak("Budi");
        System.out.println("Setelah Budi dihapus:");
        bukuEmailLoad.tampilkanSemua();
        bukuEmailLoad.hapusKontak("Zara"); // tidak ada
    }
}
