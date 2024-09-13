/**
 * Anggota
 */
public class Anggota {
  private String noKTP;
  private String nama;
  private int limitPinjaman;
  private int pinjaman;

  public Anggota(String noKTP, String nama, int limitPinjaman) {
    this.noKTP = noKTP;
    this.nama = nama;
    this.limitPinjaman = limitPinjaman;
  }

  public String getNama() {
    return nama;
  }

  public int getLimitPinjaman() {
    return limitPinjaman;
  }

  public int getJumlahPinjaman() {
    return this.pinjaman;
  }

  public void pinjam(int pinjaman) {
    if (pinjaman > this.limitPinjaman) {
      System.out.println("Maaf, jumlah pinjaman melebihi limit.");
    } else {
      this.pinjaman = pinjaman;
      this.limitPinjaman -= pinjaman;
    }
  }

  public void angsur(int angsuran) {
    if (angsuran >= this.pinjaman * 0.1) {
      this.pinjaman -= angsuran;
      this.limitPinjaman += angsuran;
    } else {
      System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
    }
  }
}