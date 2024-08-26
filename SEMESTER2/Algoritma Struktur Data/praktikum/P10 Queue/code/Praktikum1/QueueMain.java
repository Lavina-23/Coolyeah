package Praktikum1;

import java.util.Scanner;

public class QueueMain {
  public static void menu() {
    System.out.println(
        "Masukkan operasi yang diinginkan:\n1. Enqueue\n2. Dequeue\n3. Print\n4. Peek\n5. Clear\n---------------------------");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan kapasitas queue: ");
    int n = sc.nextInt();
    Queue q = new Queue(n);

    int pilih;
    do {
      menu();
      pilih = sc.nextInt();
      switch (pilih) {
        case 1:
          System.out.print("Masukkan data baru: ");
          int dataMasuk = sc.nextInt();
          q.Enqueue(dataMasuk);
          break;
        case 2:
          int dataKeluar = q.Dequeue();
          if (dataKeluar != 0) {
            System.out.println("Data yang dikeluarkan: " + dataKeluar);
          }
          break;
        case 3:
          q.print();
          break;
        case 4:
          q.peek();
          break;
        case 5:
          q.clear();
          break;
      }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
  }
}
