package lelang;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//membust objek baru
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Lelang lelang = new Lelang();
        Laporan laporan = new Laporan();

        laporan.laporan(petugas);
        System.out.print("Masukkan ID Petugas : ");//untuk mengeluarkan di output
        int id = input.nextInt();
        System.out.println("Selamat datang " + petugas.getNama(id));
        System.out.println("");

        Barang barang = new Barang();//untuk membuat objek baru
        laporan.laporan(masyarakat);
        lelang.prosesLelang(petugas, masyarakat, lelang, barang, laporan);
        laporan.laporan(barang);
    }
}