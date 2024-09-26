package PenyewaanMobil;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SewaMobil {
  private LocalDate tanggalSewa;
  private LocalDate tanggalKembali;
  private Mobil mobil;
  private int totalSewa;

  public void setTanggalSewa(LocalDate tanggalSewa) {
    this.tanggalSewa = tanggalSewa;
  }

  public LocalDate getTanggalSewa() {
    return tanggalSewa;
  }

  public void setTanggalKembali(LocalDate tanggalKembali) {
    this.tanggalKembali = tanggalKembali;
  }

  public LocalDate getTanggalKembali() {
    return tanggalKembali;
  }

  public void setMobil(Mobil mobil) {
    this.mobil = mobil;
  }

  public Mobil getMobil() {
    return mobil.getMerk();
  }

  public int hitungTotalSewa() {
    if (this.tanggalSewa == null || this.tanggalKembali == null) {
      System.out.println("Tidak ada sewa");
      return 0;
    }
    long lamaSewa = ChronoUnit.DAYS.between(this.tanggalSewa, this.tanggalKembali);

    this.totalSewa = mobil.getHargaSewa() * (int) lamaSewa;
    return totalSewa;
  }

  public void displayInfo() {
    // if (hitungTotalSewa() > 0) {
    System.out.println("Merk mobil: " + mobil.getMerk());
    System.out.println("Tanggal sewa: " + getTanggalSewa());
    System.out.println("Tanggal Kembali: " + getTanggalKembali());
    System.out.println("Jumlah Sewa: " + hitungTotalSewa() + "\n");
    // } else {
    // System.out.println("Tidak ada sewa");
    // }
  }
}
