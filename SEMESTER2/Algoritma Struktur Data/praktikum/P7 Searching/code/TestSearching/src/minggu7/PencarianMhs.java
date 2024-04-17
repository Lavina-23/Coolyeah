package minggu7;

public class PencarianMhs {
  int jmlMhs;
  Mahasiswa listMhs[];
  int idx = 0;

  PencarianMhs(int jmlMhs) {
    this.jmlMhs = jmlMhs;
    listMhs = new Mahasiswa[jmlMhs];
  }

  void tambah(Mahasiswa m) {
    if (idx >= listMhs.length) {
      System.out.println("Data sudah penuh !");
      return;
    }
    int i = idx;
    while (i > 0 && listMhs[i - 1].nama.compareTo(m.nama) > 0)
      i--;

    for (int j = idx; j > i; j--) {
      listMhs[j] = listMhs[j - 1];
    }

    listMhs[i] = m;
    idx++;
  }

  void tampil() {
    for (Mahasiswa m : listMhs) {
      m.tampil();
      System.out.println("-------------------------------------");
    }
  }

  public int FindSeqSearch(int cari) {
    int posisi = -1;
    for (int j = 0; j < listMhs.length; j++) {
      if (listMhs[j].nim == cari) {
        posisi = j;
        break;
      }
    }
    return posisi;
  }

  public int FindBinarySearch(String cari, int left, int right) {
    int mid;
    if (right >= left) {
      mid = (left + right) / 2;
      if (cari.compareTo(listMhs[mid].nama) == 0) {
        if ((mid > 0 && cari.equals(listMhs[mid - 1].nama))
            ||
            (mid < listMhs.length - 1 && cari.equals(listMhs[mid + 1].nama)))
          System.err.println("Nama yang di cari lebih dari 1!!!");
        return (mid);
      } else if (cari.compareTo(listMhs[mid].nama) < 0) {
        return FindBinarySearch(cari, left, mid - 1);
      } else {
        return FindBinarySearch(cari, mid + 1, right);
      }
    }
    return -1;
  }

  public void TampilPosisi(String x, int pos) {
    if (pos != -1) {
      System.out.println("Data\t : " + x + " ditemukan pada indeks " + pos);
    } else {
      System.out.println("Data " + x + " tidak ditemukan");
    }
  }

  public void TampilData(String x, int pos) {
    if (pos != -1) {
      System.out.printf("\nNIM\t : %d\nNama\t : %s\nUmur\t : %d\nIPK\t : %.2f\n",
          listMhs[pos].nim, listMhs[pos].nama, listMhs[pos].umur,
          listMhs[pos].ipk);
    } else {
      System.out.println("Data " + x + " tidak ditemukan");
    }
  }
}
