package RumahSakit;

import java.time.LocalDate;

/**
 * RumahSakitDemo
 */
public class RumahSakitDemo {

  public static void main(String[] args) {
    Pegawai ani = new Pegawai("1234", "dr. Ani");
    Pegawai bagus = new Pegawai("4567", "dr. Bagus");

    Pegawai desi = new Pegawai("1234", "Ns.Desi");
    Pegawai eka = new Pegawai("4567", "Ns.Eka");

    Pasien pasien1 = new Pasien("434678", "Puspa Widya");
    pasien1.tambahKonsultasi(LocalDate.of(2024, 9, 16), ani, desi);
    pasien1.tambahKonsultasi(LocalDate.of(2024, 10, 23), bagus, eka);

    System.out.println(pasien1.getInfo());

    Pasien pasien2 = new Pasien("998345", "Yenny Anggraeni");
    System.out.println(pasien2.getInfo());
  }
}