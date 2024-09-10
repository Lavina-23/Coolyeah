public class BukuDemo {

  public static void main(String[] args) {
    Buku buku1 = new Buku();
    buku1.judul = "Java Dasar";
    buku1.penulis = "Ahmad";
    buku1.jumlahHalaman = 150;
    buku1.genre = "Teknologi";
    buku1.status = false;

    buku1.cetakInfo();

    Buku buku2 = new Buku();
    buku2.judul = "Belajar OOP";
    buku2.penulis = "Rina";
    buku2.jumlahHalaman = 200;
    buku2.genre = "Teknologi";
    buku2.status = true;

    buku2.cetakInfo();

    Buku buku3 = new Buku();
    buku3.judul = "Algoritma";
    buku3.penulis = "Budi";
    buku3.jumlahHalaman = 250;
    buku3.genre = "Teknologi";
    buku3.status = false;

    buku3.cetakInfo();
  }
}