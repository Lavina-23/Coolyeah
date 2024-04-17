package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa : ");
    int jmlMhs = sc.nextInt();
    PencarianMhs data = new PencarianMhs(jmlMhs);
    sc.nextLine();

    System.out.println("-------------------------------------");
    System.out.println("Masukkan data mahasiswa secara urut");
    for (int i = 0; i < data.jmlMhs; i++) {
      System.out.println("-------------------");
      System.out.print("NIM\t : ");
      int nim = sc.nextInt();
      sc.nextLine();
      System.out.print("Nama\t : ");
      String nama = sc.nextLine();
      System.out.print("Umur\t : ");
      int umur = sc.nextInt();
      sc.nextLine();
      System.out.print("IPK\t : ");
      double ipk = sc.nextDouble();
      sc.nextLine();

      Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
      data.tambah(m);
    }

    System.out.println("====================================");
    System.out.println("Data Keseluruhan Mahasiswa");
    data.tampil();

    System.out.println("_____________________________________");
    System.out.println("_____________________________________");
    System.out.println("Pencarian Data");
    System.out.println("Masukkan Nama Mahasiswa yang dicari");
    System.out.print("Nama : ");
    String cari = sc.nextLine();
    // sc.nextLine();
    // System.out.println("Menggunakan sequential search");
    // int posisi = data.FindSeqSearch(cari);
    // data.TampilPosisi(cari, posisi);
    // data.TampilData(cari, posisi);
    // System.out.println("====================================");
    System.out.println("\nMenggunakan binary search");
    int posisi = data.FindBinarySearch(cari, 0, data.jmlMhs - 1);
    data.TampilPosisi(cari, posisi);
    data.TampilData(cari, posisi);

  }
}
