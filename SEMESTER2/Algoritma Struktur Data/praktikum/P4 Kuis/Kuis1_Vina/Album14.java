public class Album14 {
  public String judul14;
  public String penyanyi14;
  public int jumlah14;
  public int harga14;

  public Album14() {

  }

  public Album14(String judul, String penyanyi, int jumlah, int harga) {
    judul14 = judul;
    penyanyi14 = penyanyi;
    jumlah14 = jumlah;
    harga14 = harga;
  }

  void tampil() {
    System.out.println("Judul         : " + judul14);
    System.out.println("Penyanyi      : " + penyanyi14);
    System.out.println("Jumlah Terjual: " + jumlah14);
    System.out.println("Harga         : " + harga14);
    System.out.println();
  }

  int hitungPenjualan(Album14[] albums) {
    int total14 = 0;
    int totalPenjualan14 = 0;

    for (int i = 0; i < albums.length; i++) {
      total14 = albums[i].jumlah14 * albums[i].harga14;
      totalPenjualan14 += total14;
    }

    return totalPenjualan14;
  }

  void cariAlbumTerlaris(Album14[] albums) {
    int terlaris = 0;
    int index = -1;

    for (int i = 0; i < albums.length; i++) {
      if (i == 0 || albums[i].jumlah14 > terlaris) {
        terlaris = albums[i].jumlah14;
        index = i;
      }
    }

    System.out.println("Album Terlaris: " + albums[index].judul14);
  }

  void daftarAlbum(Album14[] albums) {
    for (int i = 0; i < albums.length - 1; i++) {
      for (int j = 0; j < albums.length - i - 1; j++) {
        if (albums[j].judul14.compareTo(albums[j + 1].judul14) > 0) {
          String tempJdl = albums[j].judul14;
          albums[j].judul14 = albums[j + 1].judul14;
          albums[j + 1].judul14 = tempJdl;
        }
      }
    }
  }
}
