class Kendaraan {
  String noTNKB, nama, jenis;
  int cc, tahun, bulanHarusBayar;
  Kendaraan prev, next;

  Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
    this.noTNKB = noTNKB;
    this.nama = nama;
    this.jenis = jenis;
    this.cc = cc;
    this.tahun = tahun;
    this.bulanHarusBayar = bulanHarusBayar;
    this.prev = null;
    this.next = null;
  }

  @Override
  public String toString() {
    return String.format("| %-15s | %-15s | %-5s | %-15d | %-5d | %-15d |",
        noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
  }
}
