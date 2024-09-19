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

  public int hitungTotalSewa() {
    long lamaSewa = ChronoUnit.DAYS.between(this.tanggalSewa, this.tanggalKembali);

    this.totalSewa = mobil.getHargaSewa() * (int) lamaSewa;
    return totalSewa;
  }
}
