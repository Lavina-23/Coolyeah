package Struk;

import java.util.Scanner;

public class StrukMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Berapa struk: ");
    int jmlStruk = sc.nextInt();
    sc.nextLine();
    Stack stk = new Stack(jmlStruk);

    for (int i = 0; i < jmlStruk; i++) {
      System.out.print("No Transaksi: ");
      int no_trans = sc.nextInt();
      sc.nextLine();
      System.out.print("Tanggal Pembelian: ");
      String tgl = sc.nextLine();
      System.out.print("Jumlah Barang: ");
      int jml = sc.nextInt();
      sc.nextLine();
      System.out.print("Total: ");
      int total = sc.nextInt();
      sc.nextLine();

      Struk s = new Struk(no_trans, tgl, jml, total);
      stk.push(s);
    }

    int menu;
    do {
      System.out.println("1. Pop Struk\n2. Sisa Struk\n3. Keluar");
      System.out.print("Pilih: ");
      menu = sc.nextInt();
      sc.nextLine();

      switch (menu) {
        case 1:
          System.out.print("Berapa struk yang ingin diambil: ");
          int voucher = sc.nextInt();
          sc.nextLine();
          stk.pop(voucher);
          break;
        case 2:
          stk.print();
          break;
        case 3:
          break;
        default:
          break;
      }
    } while (menu < 3);
  }
}
