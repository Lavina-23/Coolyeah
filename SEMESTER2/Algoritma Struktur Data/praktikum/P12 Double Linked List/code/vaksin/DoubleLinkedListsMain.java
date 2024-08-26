package vaksin;

import java.util.Scanner;

public class DoubleLinkedListsMain {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    DoubleLinkedLists dll = new DoubleLinkedLists();

    int pilih;
    do {
      System.out.println("+++++++++++++++++++++++++++++");
      System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
      System.out.println("+++++++++++++++++++++++++++++");
      System.out.println(
          "\n1. Tambah data penerima vaksin\n2. Hapus data pengantri vaksin\n3. Daftar penerima vaksin\n4. Keluar");
      System.out.println("+++++++++++++++++++++++++++++");
      pilih = sc.nextInt();
      sc.nextLine();

      switch (pilih) {
        case 1:
          System.out.println("=============================");
          System.out.println("Masukkan Data Penerima Vaksin");
          System.out.println("=============================");
          System.out.println("Nomor Antrian: ");
          String id = sc.nextLine();
          System.out.println("Nama Penerima: ");
          String nama = sc.nextLine();
          Node nd = new Node(id, nama);
          dll.addLast(id, nama);
          break;
        case 2:
          dll.removeFirst();
          break;
        case 3:
          dll.print();
          break;
        case 4:
          break;
      }
    } while (pilih < 4);
  }
}
