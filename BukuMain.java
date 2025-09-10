package ObjectClassDriverclass;

public class BukuMain {
    public static void main(String[] args) {
        // Membuat objek buku dengan constructor
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 529);

        // Menampilkan info buku
        buku1.tampilkanInfo();

        // Mengubah data dengan setter
        buku1.setJudul("Sang Pemimpi");
        buku1.setHalaman(300);

        // Menampilkan info terbaru
        System.out.println("\nSetelah diubah:");
        buku1.tampilkanInfo();

        // Mengakses data dengan getter
        System.out.println("\nJudul buku adalah: " + buku1.getJudul());
    }
}


