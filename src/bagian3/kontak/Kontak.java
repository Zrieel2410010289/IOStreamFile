package bagian3.kontak;

public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email; // Latihan Mandiri 3.4 No.2

    // Constructor
    public Kontak(String nama, String nomor) {
        this.nama  = nama;
        this.nomor = nomor;
        this.email = "";
    }

    // Constructor dengan email (Latihan Mandiri 3.4 No.2)
    public Kontak(String nama, String nomor, String email) {
        this.nama  = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter
    public String getNama()  { return nama;  }
    public String getNomor() { return nomor; }
    public String getEmail() { return email; } // Latihan Mandiri 3.4 No.2

    // Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
    // Format: nama;nomor;email
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan kontak dalam bentuk teks
    public String info() {
        if (email == null || email.isEmpty()) {
            return nama + " - " + nomor;
        }
        return nama + " - " + nomor + " - " + email;
    }
}
