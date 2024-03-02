import java.util.Scanner;

public class MahasiswaMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jmlMhs;
    double ipk;
    String nama, nim, gender;

    System.out.print("Masukkan jumlah mahasiswa: ");
    jmlMhs = sc.nextInt();
    sc.nextLine();
    Mahasiswa[] mhs = new Mahasiswa[jmlMhs];
    Mahasiswa mahasiswa = new Mahasiswa(null, null, null, 0);

    for (int i = 0; i < jmlMhs; i++) {
      System.out.println("Masukkan data mahasiswa ke-" + (1 + i));
      System.out.print("Masukkan NIM: ");
      nim = sc.nextLine();
      System.out.print("Masukkan nama: ");
      nama = sc.nextLine();
      System.out.print("Masukkan jenis kelamin: ");
      gender = sc.nextLine();
      System.out.print("Masukkan IPK: ");
      ipk = sc.nextDouble();
      sc.nextLine();
      System.out.println();

      mhs[i] = new Mahasiswa(nim, nama, gender, ipk);
    }

    mahasiswa.hitungRataRata(mhs);

    int i = 0;
    for (Mahasiswa m : mhs) {
      System.out.println("Data mahasiswa ke-" + (1 + i));
      m.cetakData();
      i++;
    }
    System.out.printf("\nRata-rata IPK: %5.2f%n", mahasiswa.rata);
  }
}