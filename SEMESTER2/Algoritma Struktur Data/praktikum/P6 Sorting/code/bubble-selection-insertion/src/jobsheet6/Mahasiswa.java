package jobsheet6;

/**
 * Mahasiswa
 */
public class Mahasiswa {
  String nama;
  int thnMasuk, umur;
  double ipk;

  Mahasiswa(String n, int t, int u, double i) {
    nama = n;
    thnMasuk = t;
    umur = u;
    ipk = i;
  }

  void tampil() {
    System.out.printf("Nama = %s\nTahun Masuk = %d\nUmur = %d\nIPK = %.2f\n", nama, thnMasuk, umur, ipk);
  }

}