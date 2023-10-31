import java.util.Scanner;
public class Main {
    private String nama;
    private int umur;

    public Main(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = obj.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = obj.nextInt();

        Main Hafis = new Main(nama,umur);
        Hafis.tampilkanInformasi();
    }
}
