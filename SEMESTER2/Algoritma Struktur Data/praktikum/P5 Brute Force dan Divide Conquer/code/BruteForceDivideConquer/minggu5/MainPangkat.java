import java.util.Scanner;

public class MainPangkat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nilai, pangkat;

    System.out.println("=============================================");
    System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
    int elemen = sc.nextInt();

    Pangkat[] png = new Pangkat[elemen];
    for (int i = 0; i < elemen; i++) {
      System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
      nilai = sc.nextInt();
      System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
      pangkat = sc.nextInt();

      png[i] = new Pangkat(nilai, pangkat);
    }

    System.out.println("=============================================");
    System.out.println("Menu");
    System.out.println("1. BF\n2. DC");
    System.out.print("Pilih: ");
    int pilihan = sc.nextInt();

    switch (pilihan) {
      case 1:
        System.out.println("=============================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
          System.out.println("Nilai " + png[i].nilai + " pangkat" + png[i].pangkat + " adalah: "
              + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        break;
      case 2:
        System.out.println("=============================================");
        System.out.println("Hasil Pangkat dengan Divide Conquer");
        for (int i = 0; i < elemen; i++) {
          System.out.println("Nilai " + png[i].nilai + " pangkat" + png[i].pangkat + " adalah: "
              + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        break;
      default:
        break;
    }

    System.out.println("=============================================");

  }
}
