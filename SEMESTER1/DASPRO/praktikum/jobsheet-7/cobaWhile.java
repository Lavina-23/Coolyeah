import java.util.Scanner;

/**
 * cobaWhile
 */
public class cobaWhile {

  // Jumlah karyawan:2
  // Gaji karayawan ke-1:3000000
  // Gaji karayawan ke-2:500000

  // Gaji karyawan ke-1:4000000
  // Gaji karyawan ke-2: 1500000
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalGaji = 0;

    System.out.print("Jumlah karyawan: ");
    int jumlahKaryawan = sc.nextInt();
    sc.nextLine();

    int i = 0;
    while (i < jumlahKaryawan) {
      System.out.println("Pilihan jabatannya (tinggi, sedang, rendah)");
      System.out.println("Jabatan karyawan ke-" + (i + 1) + " : ");
      String jabatan = sc.next();

      System.out.print("Gaji karayawan ke- " + (i + 1) + ": ");
      int gaji = sc.nextInt();
      sc.nextLine();
      i++;

      if (jabatan.equals("tinggi")) {
        continue;
      } else if (jabatan.equals("sedang")) {
        totalGaji = gaji + 1_000_000;
      } else if (jabatan.equals("rendah")) {
        totalGaji = gaji + 5_000_000;
      } else {
        System.out.println("Jabatan gajelas, minggir lu miskin");
      }

      System.out.println("Total gaji karyawan ke-" + i + ": " + totalGaji);
    }

    // for (int j = 0; j < jumlahKaryawan; j++) {
    // System.out.println("Gaji karyawan ke-" + (j + 1) + ": " + totalGaji);
    // }
  }
}
