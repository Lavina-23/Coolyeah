package PenyewaanMobil;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelanggan {
  private String namaPelanggan;
  private String noTelp;
  private ArrayList<SewaMobil> riwayatSewaMobil;
  SewaMobil sewa = new SewaMobil();

  public Pelanggan(String namaPelanggan, String noTelp) {
    this.namaPelanggan = namaPelanggan;
    this.noTelp = noTelp;
    this.riwayatSewaMobil = new ArrayList<SewaMobil>();
  }

  public void setNamaPelanggan(String namaPelanggan) {
    this.namaPelanggan = namaPelanggan;
  }

  public String getNamaPelanggan() {
    return namaPelanggan;
  }

  public void setNoTelp(String noTelp) {
    this.noTelp = noTelp;
  }

  public String getNoTelp() {
    return noTelp;
  }

  public SewaMobil sewaMobil(Mobil mobil, LocalDate tanggalSewa, LocalDate tanggalKembali) {
    sewa.setTanggalSewa(tanggalSewa);
    sewa.setTanggalKembali(tanggalKembali);
    sewa.setMobil(mobil);
    riwayatSewaMobil.add(sewa);

    return sewa;
  }

  public void displayInfo() {
    System.out.println("Nama Pelanggan: " + this.namaPelanggan);
    System.out.println("No Telepon: " + this.noTelp);
    System.out.println(sewa.getMobil());
    if (sewa.hitungTotalSewa() > 0) {
      System.out.println("Tanggal sewa: " + sewa.getTanggalSewa());
      System.out.println("Tanggal Kembali: " + sewa.getTanggalKembali());
      System.out.println("Jumlah Sewa: " + sewa.hitungTotalSewa() + "\n");
    }

  }
}
