package resto;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc14 = new Scanner(System.in);
    Transaksi tr = new Transaksi();

    System.out.println("========== QUIZ 2 PRAKTIKUM ASD SIB - 1B ==========");
    System.out.println("Dibuat oleh: Lavina");
    System.out.println("NIM        : 2341760062");
    System.out.println("Absen      : 14");

    int menu;
    do {
      System.out.println("Menu");
      System.out.println("1. Tambah Antrian\n2. Cetak Antrian\n3. Hapus Antrian");
      System.out.println("4. Laporan Pengurutan Pesanan by Nama\n5. Hitung Total Pendapatan\n6. Keluar");
      System.out.print("Pilih (1-5): ");
      menu = sc14.nextInt();

      switch (menu) {
        case 1:
          System.out.println("-------------------------");
          System.out.println("Masukkan Data Pembeli");
          System.out.println("-------------------------");
          System.out.print("Nomor Antrian: ");
          int noAntrian = sc14.nextInt();
          sc14.nextLine();
          System.out.print("Nama Customer: ");
          String nama = sc14.nextLine();
          System.out.print("Nomor HP: ");
          String noHP = sc14.nextLine();

          Pembeli pb = new Pembeli(null, nama, noHP, null);
          tr.addLast(nama, noHP);
          break;
        case 2:
          tr.print();
          break;
        case 3:
          tr.removeLast();
          System.out.println("-------------------------");
          System.out.println("Masukkan Data Pembeli");
          System.out.println("-------------------------");
          System.out.print("Nomor Pesanan: ");
          int kd = sc14.nextInt();
          sc14.nextLine();
          System.out.print("Pesanan: ");
          String nm = sc14.nextLine();
          System.out.print("Harga: ");
          int hrg = sc14.nextInt();

          Pesanan psn = new Pesanan(null, kd, nm, hrg, null);
          tr.addPesananLast(kd, nm, hrg);
          tr.printPesanan();
          break;
        case 4:
          tr.sortByNamaPesanan();
          tr.printPesanan();
          break;
        case 5:
          tr.totalPendapatan();
          break;
        case 6:
          break;
      }
    } while (menu < 6);
  }

}
