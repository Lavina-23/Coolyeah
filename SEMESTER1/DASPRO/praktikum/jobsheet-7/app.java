import java.util.Scanner;

public class app {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // do while
    // int rekening = 1234567890;

    // boolean isRekening = false;
    // do {
    // System.out.print("Masukkan rekening: ");
    // int inputRekening = sc.nextInt();
    // sc.nextLine();

    // if (inputRekening == rekening) {
    // isRekening = true;
    // } else {
    // System.out.println("Rekening salah!");
    // }

    // } while (!isRekening);

    // do while + break
    int stokBarang = 10;
    String konfirmasi;
    do {
      System.out.print("Ada transaksi? (y/t): ");
      konfirmasi = sc.next();

      if (konfirmasi.equals("y")) {
        System.out.print("Berapa barang terjual? ");
        int barangTerjual = sc.nextInt();
        sc.nextLine();
        if (barangTerjual <= stokBarang) {
          stokBarang -= barangTerjual;
          System.out.println("Sisa stok barang: " + stokBarang);
        } else {
          System.out.println("Stok tidak mencukupi");
        }
      } else {
        break;
      }
    } while (stokBarang > 0);
  }
}
