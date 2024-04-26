package bank;

public class Transaksi {
  double saldo, saldoAwal, saldoAkhir;
  String tanggalTransaksi, type;
  Rekening[] listRek = new Rekening[3];
  int index;

  Transaksi() {

  }

  Transaksi(double a, double b, double c, String d, String e) {
    saldo = a;
    saldoAwal = b;
    saldoAkhir = c;
    tanggalTransaksi = d;
    type = e;
  }

  void addData(Rekening r) {
    int i = index;
    while (i > 0 && listRek[i - 1].nama.compareTo(r.nama) > 0)
      i--;

    for (int j = index; j > i; j--) {
      listRek[j] = listRek[j - 1];
    }
    listRek[i] = r;
    index++;
  }

  void showRekening() {
    for (Rekening r : listRek) {
      r.showData();
      System.out.println("===================================");
    }
  }

  void Transfer(double saldoAwal, double jmlTF) {
    this.saldoAkhir = saldoAwal - jmlTF;
    System.out.println("Sisa saldo = " + this.saldoAkhir);
  }

  void showDataTransaksi(Transaksi[] t) {
    for (int i = 0; i < t.length; i++) {
      if (t[i] != null) {
        System.out.println("Saldo : " + t[i].saldo);
        System.out.println("Saldo Awal : " + t[i].saldoAwal);
        System.out.println("Saldo Akhir : " + saldoAkhir);
        System.out.println("Tanggal Transaksi : " + t[i].tanggalTransaksi);
        System.out.println("Tipe : " + t[i].type);
      }
    }
  }

  int searchNama(String cari, int l, int r) {
    int mid;

    if (r >= l) {
      mid = (l + r) / 2;
      if (cari.compareTo(listRek[mid].nama) == 0) {
        if ((mid > 0 && cari.equals(listRek[mid - 1].nama))
            || (mid < listRek.length - 1 && cari.equals(listRek[mid + 1].nama)))
          System.err.println("Nama yang di cari lebih dari 1!!!");
        return (mid);
      } else if (cari.compareTo(listRek[mid].nama) < 0) {
        return searchNama(cari, l, mid - 1);
      } else {
        return searchNama(cari, mid + 1, r);
      }
    }
    return -1;
  }

  void showNama(String x, int pos) {
    if (pos != -1) {
      System.out.printf("\nNo Rekening\t : %s\nNama\t\t : %s\nNama Ibu\t : %s\nNo Telp\t\t : %s\nEmail\t\t : %s\n",
          listRek[pos].noRekening, listRek[pos].nama, listRek[pos].namaIbu,
          listRek[pos].phone, listRek[pos].email);
    } else {
      System.out.println("Data " + x + " tidak ditemukan");
    }
  }
}
