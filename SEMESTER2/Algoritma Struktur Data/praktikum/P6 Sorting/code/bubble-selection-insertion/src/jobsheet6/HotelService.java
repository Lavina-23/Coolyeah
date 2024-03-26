package jobsheet6;

public class HotelService {
  Hotel rooms[] = new Hotel[4];
  int idx;

  void tambah(Hotel h) {
    if (idx <= rooms.length) {
      rooms[idx] = h;
      idx++;
    } else {
      System.out.println("Data sudah penuh !!");
    }
  }

  void tampilAll() {
    for (Hotel h : rooms) {
      System.out.println("Nama Hotel: " + h.nama);
      System.out.println("Kota: " + h.kota);
      System.out.println("Harga: " + h.harga);
      System.out.println("Bintang: " + h.bintang);
      System.out.println("=============================");
    }
  }

  void bubbleSort() {
    for (int i = 0; i < rooms.length - 1; i++) {
      for (int j = 1; j < rooms.length - i; j++) {
        Hotel tmp = rooms[j];
        if (rooms[j].harga < rooms[j - 1].harga) {
          rooms[j] = rooms[j - 1];
          rooms[j - 1] = tmp;
        }
      }
    }
  }

  void selectionSort() {
    for (int i = 0; i < rooms.length - 1; i++) {
      int idxMin = i;
      for (int j = i + 1; j < rooms.length; j++) {
        if (rooms[j].bintang > rooms[idxMin].bintang) {
          idxMin = j;
        }
        Hotel tmp = rooms[idxMin];
        rooms[idxMin] = rooms[i];
        rooms[i] = tmp;
      }
    }
  }
}
