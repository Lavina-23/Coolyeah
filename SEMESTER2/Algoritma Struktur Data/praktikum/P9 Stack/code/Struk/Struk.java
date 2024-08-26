package Struk;

public class Struk {
  int no_transaksi, jmlBarang, total;
  String tgl_beli;

  Struk(int no_trans, String tgl, int jml, int total) {
    no_transaksi = no_trans;
    tgl_beli = tgl;
    jmlBarang = jml;
    this.total = total;
  }
}
