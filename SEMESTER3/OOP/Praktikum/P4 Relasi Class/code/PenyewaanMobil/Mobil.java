package PenyewaanMobil;

public class Mobil {
  private String merk;
  private int hargaSewa;

  public Mobil(String merk, int hargaSewa) {
    this.merk = merk;
    this.hargaSewa = hargaSewa;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public String getMerk() {
    return merk;
  }

  public void setHargaSewa(int hargaSewa) {
    if (hargaSewa != 0) {
      this.hargaSewa = hargaSewa;
    } else {
      System.out.println("Harga sewa tidak valid");
    }
  }

  public int getHargaSewa() {
    return hargaSewa;
  }
}
