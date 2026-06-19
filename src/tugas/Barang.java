// Nama  : Sarulah
// NPM   : 2410010643
package tugas;

public class Barang {
    private String  nama;
    private double  harga;
    private int     stok;

    public Barang(String nama, double harga, int stok) {
        this.nama  = nama;
        this.harga = harga;
        this.stok  = stok;
    }

    // Getter
    public String getNama()  { return nama;  }
    public double getHarga() { return harga; }
    public int    getStok()  { return stok;  }

    /**
     * Mengubah objek menjadi satu baris teks untuk disimpan ke berkas.
     * Format: nama;harga;stok
     */
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    /** Keterangan singkat barang untuk ditampilkan ke layar. */
    public String info() {
        return String.format("%-20s | Harga: Rp%,.0f | Stok: %d", nama, harga, stok);
    }
}
