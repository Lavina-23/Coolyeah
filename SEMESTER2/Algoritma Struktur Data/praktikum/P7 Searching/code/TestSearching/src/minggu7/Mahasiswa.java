package minggu7;

/**
 * Mahasiswa
 */
public class Mahasiswa {

  int nim, umur;
  String nama;
  double ipk;

  Mahasiswa(int ni, String n, int u, double i) {
    nim = ni;
    nama = n;
    umur = u;
    ipk = i;
  }

  void tampil() {
    System.out.printf("NIM = %d\nNama = %s\nUmur = %d\nIPK = %.2f\n", nim, nama, umur, ipk);
  }
}