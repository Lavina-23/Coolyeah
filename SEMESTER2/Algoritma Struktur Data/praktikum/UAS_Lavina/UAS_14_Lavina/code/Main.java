import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    Kendaraan[] kendaraan = {
        new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4),
        new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3),
        new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2),
        new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1),
    };

    TransaksiPajak tp = new TransaksiPajak();
    for (Kendaraan k : kendaraan) {
      tp.addLast(k);
    }
    int pilih;
    do {
      System.out.println("Menu");
      System.out.println("1. Daftar Kendaraan\n2. Bayar Pajak\n3. Tampilkan seluruh transaksi");
      System.out.println("4. Urutkan transaksi berdasarkan nama pemilik\n5. Keluar");
      System.out.print("Pilih(1-5): ");
      pilih = sc.nextInt();
      sc.nextLine();

      switch (pilih) {
        case 1:
          tp.print();
          break;
        case 2:
          int kode = 0;
          System.out.println("---------------------------");
          System.out.println("Masukkan Data Pembayaran");
          System.out.println("---------------------------");
          System.out.print("Masukkan nomor TNBK: ");
          String noTNKB = sc.nextLine();
          System.out.print("Bulan bayar: ");
          int bulanBayar = sc.nextInt();
          sc.nextLine();
          kode++;

          tp.bayarPajak(kode, noTNKB, bulanBayar);
          break;
      }
    } while (pilih < 6);
  }
}
