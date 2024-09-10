public class MahasiswaDemo {
  public static void main(String[] args) {
    Mahasiswa m1 = new Mahasiswa();
    m1.nim = "123456789";
    m1.nama = "Muhammad";
    m1.alamat = "Jl. Raya Kebun, Jakarta";
    m1.kelas = "1";

    m1.displayBiodata();

    Mahasiswa m2 = new Mahasiswa();
    m2.nim = "876541234";
    m2.nama = "Lavina";
    m2.alamat = "Jl. Kembang, Malang";
    m2.kelas = "3";

    m2.displayBiodata();

    Mahasiswa m3 = new Mahasiswa();
    m3.nim = "63829384";
    m3.nama = "Rere";
    m3.alamat = "Jl. Raya, Surabaya";
    m3.kelas = "2";

    m3.displayBiodata();
  }
}
