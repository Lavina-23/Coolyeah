public class Mahasiswa {
  public String nim;
  public String nama;
  public String gender;
  public double ipk;
  public double rata;

  public Mahasiswa(String nim, String nama, String gender, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.gender = gender;
    this.ipk = ipk;
  }

  void cetakData() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("Jenis Kelamin: " + gender);
    System.out.println("IPK: " + ipk + "\n");
  }

  void hitungRataRata(Mahasiswa[] mhs) {
    double total = 0;
    for (int i = 0; i < mhs.length; i++) {
      total += mhs[i].ipk;
    }
    rata = total / mhs.length;
  }
}
