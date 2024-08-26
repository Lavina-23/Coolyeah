package film;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    DoubleLinkedLists dll = new DoubleLinkedLists();

    int pilih;
    do {
      System.out.println("=============================");
      System.out.println("DATA FILM LAYAR LEBAR");
      System.out.println("=============================");
      System.out.println("1. Tambah Data Awal\n2. Tambah Data Akhir\n3. Tambah Data Index Tertentu");
      System.out.println("4. Hapus Data Pertama\n5. Hapus Data Terakhir\n6. Hapus Data Tertentu");
      System.out.println("7. Cetak\n8. Cari ID Film\n9. Urut Data Rating Film-DESC\n10. Keluar");
      System.out.println("=============================");
      pilih = sc.nextInt();

      int id;
      String judul;
      double rating;
      switch (pilih) {
        case 1:
          System.out.println("Masukkan Data Posisi Awal");
          System.out.println("ID Film");
          id = sc.nextInt();
          sc.nextLine();
          System.out.println("Judul Film");
          judul = sc.nextLine();
          System.out.println("Rating");
          rating = sc.nextDouble();
          sc.nextLine();
          dll.addFirst(id, judul, rating);
          break;
        case 2:
          System.out.println("Masukkan Data Posisi Awal");
          System.out.println("ID Film");
          id = sc.nextInt();
          sc.nextLine();
          System.out.println("Judul Film");
          judul = sc.nextLine();
          System.out.println("Rating");
          rating = sc.nextDouble();
          sc.nextLine();
          dll.addLast(id, judul, rating);
          break;
        case 3:
          System.out.println("Masukkan Film Urutan ke-");
          System.out.println("ID Film");
          id = sc.nextInt();
          sc.nextLine();
          System.out.println("Judul Film");
          judul = sc.nextLine();
          System.out.println("Rating");
          rating = sc.nextDouble();
          sc.nextLine();
          System.out.println("Data film ini akan masuk diurutan ke- ");
          int index = sc.nextInt();
          sc.nextLine();
          dll.add(index, id, judul, rating);
          break;
        case 4:
          dll.removeFirst();
          break;
        case 5:
          dll.removeLast();
          break;
        case 6:
          System.out.println("Hapus Film Urutan ke-");
          index = sc.nextInt();
          sc.nextLine();
          dll.remove(index);
          break;
        case 7:
          dll.print();
          break;
        case 8:
          System.out.println("Cari data");
          System.out.println("Masukkan ID Film yang dicari");
          id = sc.nextInt();
          sc.nextLine();
          dll.getId(id);
          break;
        case 9:
          dll.sortRating();
          dll.print();
          break;
        case 10:
          break;
      }
    } while (pilih < 10);
  }
}
