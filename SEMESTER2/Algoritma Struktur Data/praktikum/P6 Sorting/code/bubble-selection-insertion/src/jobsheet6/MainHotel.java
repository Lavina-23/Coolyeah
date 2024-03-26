package jobsheet6;

import java.util.Scanner;

public class MainHotel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HotelService li = new HotelService();
    Hotel h1 = new Hotel("A", "Malang", 2_000_0000, (byte) 5);
    Hotel h2 = new Hotel("B", "Batu", 2_500_0000, (byte) 1);
    Hotel h3 = new Hotel("C", "Malang", 4_000_0000, (byte) 2);
    Hotel h4 = new Hotel("D", "Batu", 7_000_0000, (byte) 4);

    li.tambah(h1);
    li.tambah(h2);
    li.tambah(h3);
    li.tambah(h4);

    System.out.println("Menu Filter");
    System.out.println("1. Harga\n2. Bintang");
    System.out.print("Pilih: ");
    int menu = sc.nextInt();

    switch (menu) {
      case 1:
        System.out.println("\nData Hotel Berdasarkan Harga");
        System.out.println("=============================");
        li.bubbleSort();
        li.tampilAll();
        break;
      case 2:
        System.out.println("\nData Hotel Berdasarkan Bintang");
        System.out.println("=============================");
        li.selectionSort();
        li.tampilAll();
      default:
        break;
    }
  }
}
