package PenyewaanMobil;

import java.time.LocalDate;

public class PenyewaanMobilDemo {
  public static void main(String[] args) {
    Mobil mobil1 = new Mobil("Avanza", 10_000);
    Mobil mobil2 = new Mobil("Toyota", 20_000);

    Pelanggan pelanggan1 = new Pelanggan("Lavina", "08712345678");
    pelanggan1.sewaMobil(mobil2, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 9, 5));
    pelanggan1.displayInfo();
  }
}
