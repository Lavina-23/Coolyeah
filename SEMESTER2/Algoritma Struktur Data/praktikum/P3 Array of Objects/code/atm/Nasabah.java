package atm;

import java.util.Locale;
import java.util.Scanner;

public class Nasabah {
  private String no_rek;
  private String nama;
  private String pin;
  private String nama_bank;
  private int saldo, sisaSaldo;

  static Scanner sc = new Scanner(System.in);

  public Nasabah(String noRek, String nm, String pin, String nmBank, int sld) {
    no_rek = noRek;
    nama = nm;
    this.pin = pin;
    nama_bank = nmBank;
    saldo = sld;
  }

  boolean login(Nasabah[] nasabah) {
    do {
      System.out.println("\n====================================");
      System.out.println("    SELAMAT DATANG DI BANK BTS !");
      System.out.println("====================================");
      System.out.print("\nMasukkan Nomor Rekening anda : ");
      String noRek = sc.nextLine();
      System.out.print("Masukkan PIN anda            : ");
      String pin = sc.nextLine();
      System.out.println("\n====================================");

      for (int i = 0; i < nasabah.length;) {
        if (nasabah[i].no_rek.equals(noRek) && nasabah[i].pin.equals(pin)) {
          int indexNasabah = i;
          mainMenu(nasabah, indexNasabah);
          return true;
        }
        return false;
      }
    } while (true);
  }

  void mainMenu(Nasabah[] nasabah, int index) {
    System.out.println("Pilihan Menu");
    System.out.println("1. Cek Saldo");
    System.out.println("2. Tarik Tunai");
    System.out.print("Pilih menu: ");
    int menu = sc.nextInt();
    sc.nextLine();

    switch (menu) {
      case 1:
        showSaldo(nasabah, index);
        break;
      case 2:
        tarikTunai(nasabah, index);
        break;
      case 3:
        break;
      default:
        break;
    }
  }

  void showSaldo(Nasabah[] nasabah, int index) {
    System.out.println("\n======== JUMLAH SALDO ANDA =========");
    System.out.printf(Locale.ITALY, "\nRp %,d %n", nasabah[index].saldo);
    System.out.println("\n====================================\n");
  }

  void tarikTunai(Nasabah[] nasabah, int index) {
    System.out.print("Masukkan nominal yang ingin ditarik: ");
    int nominal = sc.nextInt();
    sc.nextLine();

    sisaSaldo = nasabah[index].saldo - nominal;
    System.out.printf(Locale.ITALY, "Sisa saldo: Rp %,d %n", sisaSaldo);
  }
}
