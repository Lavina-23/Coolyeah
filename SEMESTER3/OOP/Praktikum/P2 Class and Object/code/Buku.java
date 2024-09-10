public class Buku {
  public String judul;
  public String penulis;
  public int jumlahHalaman;
  public String genre;
  public boolean status;

  public void statusPinjam() {
    String statusPinjam = status ? "Buku " + judul + " dipinjam" : "Buku " + judul + " tersedia";
    System.out.println(statusPinjam + "\n");
  }

  public void cetakInfo() {
    System.out.println("Informasi Buku:");
    System.out.println("Judul : " + judul);
    System.out.println("Penulis : " + penulis);
    System.out.println("Jumlah Halaman : " + jumlahHalaman);
    System.out.println("Genre : " + genre);
    statusPinjam();
  }
}
