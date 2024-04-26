package bank;

import java.util.Scanner;

public class MainTransaksi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Rekening[] rek = new Rekening[3];
    rek[0] = new Rekening("456", "Repret", "Devi", "0863981621", "repret@gmail.com");
    rek[1] = new Rekening("123", "Mima", "Maria", "0987654321", "mima@gmail.com");
    rek[2] = new Rekening("789", "Yono", "Siti", "0264892641", "yono@gmail.com");

    boolean con = true;
    while (con) {
      System.out.println("MENU");
      System.out.println("1. Data Nasabah\n2. Transfer\n3. Cari\n4. Keluar");
      System.out.print("Pilih : ");
      int menu = sc.nextInt();
      sc.nextLine();

      Transaksi trans = new Transaksi();
      for (int i = 0; i < rek.length; i++) {
        trans.addData(rek[i]);
      }

      switch (menu) {
        case 1:
          System.out.println("\nINFORMASI NASABAH");
          trans.showRekening();
          break;
        case 2:
          System.out.print("Masukkan jumlah transaksi (transfer) : ");
          int jmlTrans = sc.nextInt();
          sc.nextLine();
          Transaksi[] arrTrans = new Transaksi[jmlTrans];

          for (int i = 0; i < jmlTrans; i++) {
            String type = "Transfer";
            System.out.print("Tanggal transfer : ");
            String tgl = sc.nextLine();
            System.out.print("Masukkan saldo : ");
            double saldo = sc.nextDouble();
            System.out.print("Masukkan jumlah transfer : ");
            double jmlTF = sc.nextDouble();
            sc.nextLine();
            trans.Transfer(saldo, jmlTF);

            arrTrans[i] = new Transaksi(saldo, saldo, 0, tgl, type);
          }
          trans.showDataTransaksi(arrTrans);
          break;
        case 3:
          System.out.println("Cari Nasabah");
          System.out.print("Nama : ");
          String cari = sc.nextLine();
          int data = trans.searchNama(cari, 0, rek.length - 1);
          trans.showNama(cari, data);
          break;
        case 4:
          con = false;
          break;
        default:
          break;
      }
    }

  }
}
