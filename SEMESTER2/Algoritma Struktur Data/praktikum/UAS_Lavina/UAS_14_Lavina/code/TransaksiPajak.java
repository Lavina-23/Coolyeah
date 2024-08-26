import java.util.Scanner;

public class TransaksiPajak {
  Scanner sc = new Scanner(System.in);
  int kode, bulanBayar;
  long nominalBayar, denda;
  Kendaraan kendaraan;
  Kendaraan head, tail;
  int size;

  public TransaksiPajak() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public TransaksiPajak(int kode, long nominalBayar, long denda, int bulanBayar) {
    this.kode = kode++;
    this.nominalBayar = nominalBayar;
    this.denda = denda;
    this.bulanBayar = bulanBayar;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void addFirst(Kendaraan data) {
    if (isEmpty()) {
      head = data;
      tail = data;
    } else {
      data.next = head;
      head.prev = data;
      head = data;
    }
    size++;
  }

  public void addLast(Kendaraan data) {
    if (isEmpty()) {
      addFirst(data);
    } else {
      tail.next = data;
      data.prev = tail;
      tail = data;
    }
    size++;
  }

  public void print() {
    System.out.println("++++++++++++++++++++++++++++++");
    System.out.println("DAFTAR KENDARAAN");
    System.out.println("++++++++++++++++++++++++++++++");
    System.out.println("| No TNKB         | Nama Pemilik   | Jenis | CC Kendaraan   | Tahun | Bulan harus bayar |");

    if (!isEmpty()) {
      Kendaraan current = head;
      while (current != null) {
        System.out.println(current);
        current = current.next;
      }
    } else {
      System.out.println("Kendaraan kosong");
    }
  }

  public void bayarPajak(int kode, String noTNKB, int bulanBayar) {
    Kendaraan tmp = head;
    int index = 0;
    while (tmp != null && !tmp.noTNKB.equals(noTNKB)) {
      tmp = tmp.next;
      index++;
    }

    if (tmp.jenis.equals("Motor")) {
      if (tmp.cc <= 100) {
        nominalBayar = 100_000 * tmp.bulanHarusBayar;
      } else if (tmp.cc > 100 && tmp.cc <= 250) {
        nominalBayar = 250_000 * tmp.bulanHarusBayar;
      } else {
        nominalBayar = 500_000 * tmp.bulanHarusBayar;
      }
    } else if (tmp.jenis.equals("Mobil")) {
      if (tmp.cc <= 1000) {
        nominalBayar = 750_000 * tmp.bulanHarusBayar;
      } else if (tmp.cc > 1000 && tmp.cc <= 2500) {
        nominalBayar = 1_000_000 * tmp.bulanHarusBayar;
      } else {
        nominalBayar = 1_500_000 * tmp.bulanHarusBayar;
      }
    }

    if (tmp.bulanHarusBayar < bulanBayar) {
      int terlambat = bulanBayar - tmp.bulanHarusBayar;
      if (terlambat <= 3) {
        denda = 50_000;
      } else {
        denda = 50_000 * terlambat;
      }
    }

    nominalBayar += denda;

    if (tmp != null) {
      System.out.println(kode);
      System.out.println(tmp.noTNKB);
      System.out.println(tmp.nama);
      System.out.println(tmp.jenis);
      System.out.println(tmp.cc);
      System.out.println(nominalBayar);
      System.out.println(denda);
    }
  }

}
