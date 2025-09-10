package ObjectClassDriverclass;

public class Guru {
    
   // Properti
    private String mapel;
    private String namaGuru;
    private double salary;
    private int umur;

    // Konstruktor
    public Guru(String mapel, String namaGuru, double salary, int umur) {
        this.mapel = mapel;
        this.namaGuru = namaGuru;
        this.salary = salary;
        this.umur = umur;
        
    }

    public String getMapel() {
        return mapel;
    }

    public String getNamaGuru() {
        return namaGuru;
    }

    public double getSalary() {
                return salary;
    }

    public int getUmur() {
        return umur;
    }
    //setter

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }
    public void setNamaGuru(String namaGuru) {
        this.namaGuru = namaGuru;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    // Method print()
    public void print() {
        System.out.println("=== Informasi Mata Pelajaran ===");
        System.out.println("Mapel       : " + mapel);
        System.out.println("Nama Guru   : " + namaGuru);
        System.out.println("Gaji        : Rp " + salary);
        System.out.println("Umur        : " + umur + " tahun");
    }
}


