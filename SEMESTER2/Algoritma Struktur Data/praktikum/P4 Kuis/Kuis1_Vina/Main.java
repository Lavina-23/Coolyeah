import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc14 = new Scanner(System.in);
    String judul14, penyanyi14;
    int jumlah14, harga14;

    System.out.print("Masukkan Jumlah Album: ");
    int jmlAlbum14 = sc14.nextInt();
    sc14.nextLine();
    System.out.println();

    Album14[] albums = new Album14[jmlAlbum14];

    for (int i = 0; i < jmlAlbum14; i++) {
      System.out.println("Masukkan Data Album ke-" + (1 + i));
      System.out.print("Masukkan judul: ");
      judul14 = sc14.nextLine();
      System.out.print("Masukkan penyanyi: ");
      penyanyi14 = sc14.nextLine();
      System.out.print("Masukkan jumlah: ");
      jumlah14 = sc14.nextInt();
      sc14.nextLine();
      System.out.print("Masukkan harga: ");
      harga14 = sc14.nextInt();
      sc14.nextLine();
      System.out.println();

      albums[i] = new Album14(judul14, penyanyi14, jumlah14, harga14);
    }

    for (Album14 a : albums) {
      a.tampil();
    }

    Album14 albm = new Album14();
    System.out.println("Total Penjualan: " + albm.hitungPenjualan(albums));

    albm.cariAlbumTerlaris(albums);
    albm.daftarAlbum(albums);
    System.out.println("\nDaftar Album Kami");
    for (Album14 albu : albums) {
      System.out.println(albu.judul14);
    }
  }
}
