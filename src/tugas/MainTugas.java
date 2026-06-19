// Nama  : Muhammad Azriel Wardana
// NPM   : 2410010289
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // ---- 1. Array kategori (ukuran tetap, minimal 3) ----
        String[] kategori = {"Elektronik", "Makanan & Minuman", "Alat Tulis"};
        System.out.println("=== Kategori Barang ===");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println();

        // ---- 2. Buat gudang dan tambah minimal 5 barang ----
        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Laptop ASUS",         8_500_000, 10));
        gudang.tambahBarang(new Barang("Mouse Wireless",        250_000, 35));
        gudang.tambahBarang(new Barang("Mie Instan (karton)",   95_000, 50));
        gudang.tambahBarang(new Barang("Pulpen Pilot (lusin)",  30_000, 80));
        gudang.tambahBarang(new Barang("Keyboard Mechanical", 1_200_000, 15));

        // Tampilkan sebelum simpan
        gudang.tampilkanSemua();
        System.out.printf("Total Nilai Persediaan: Rp%,.0f%n%n",
                          gudang.totalNilai());

        // ---- 3. Simpan ke berkas ----
        gudang.simpanKeBerkas();
        System.out.println();

        // ---- 4. Muat kembali ke objek Gudang baru ----
        System.out.println("=== Memuat ulang dari barang.txt ke objek baru ===");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        System.out.printf("Total Nilai Persediaan: Rp%,.0f%n", gudangBaru.totalNilai());
        System.out.println("Jumlah jenis barang   : " + gudangBaru.jumlahBarang());
    }
}
