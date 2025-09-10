package ObjectClassDriverclass;

public class Buku {
    //  Variabel private
    private String judul;
    private String penulis;
    private int halaman;

    //  Constructor
    public Buku(String judul, String penulis, int halaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.halaman = halaman;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHalaman() {
        return halaman;
    }

    // 📥 Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    // 🔧 Method untuk menampilkan info buku
    public void tampilkanInfo() {
        System.out.println(" Judul: " + judul);
        System.out.println(" Penulis: " + penulis);
        System.out.println(" Jumlah Halaman: " + halaman);
    }
}
