package Tugas;

import java.util.Scanner;

public class QueueMain {
  public static void menu() {
    System.out.println(
        "Pilih menu:\n1. Antrian baru\n2. Antrian keluar\n3. Cek antrian terdepan\n4. Cek semua antrian\n5. Cek antrian paling belakang\n6. Cek nomor antrian\n7. Daftar pasien\n---------------------------");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan kapasitas antrian: ");
    int jumlah = sc.nextInt();
    Queue antri = new Queue(jumlah);

    int pilih;
    do {
      menu();
      pilih = sc.nextInt();
      sc.nextLine();

      switch (pilih) {
        case 1:
          System.out.print("No ID: ");
          int noID = sc.nextInt();
          sc.nextLine();
          System.out.print("Nama: ");
          String nama = sc.nextLine();
          System.out.print("Jenis kelamin: ");
          char jenisKelamin = sc.next().charAt(0);
          System.out.print("Umur: ");
          int umur = sc.nextInt();

          Pasien p = new Pasien(nama, noID, jenisKelamin, umur);
          sc.nextLine();
          antri.Enqueue(p);
          break;
        case 2:
          Pasien data = antri.Dequeue();
          if (data.noID != 0 && !"".equals(data.nama) && data.jenisKelamin != ' ' && data.umur != 0) {
            System.out.println("Antrian yang keluar: " + data.noID + " " + data.nama + " " + data.jenisKelamin + " "
                + data.umur);
            break;
          }
        case 3:
          antri.peek();
          break;
        case 4:
          antri.print();
          break;
        case 5:
          antri.peekRear();
          break;
        case 6:
          System.out.print("Masukkan nama pasien yang dicari: ");
          String nm = sc.nextLine();
          antri.peekPosition(nm);
          break;
        case 7:
          antri.daftarPasien();
          break;
      }
    } while (pilih < 8);
  }
}
