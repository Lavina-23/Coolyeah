import java.util.Scanner;

public class MainAkar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Akar akr = new Akar();

    System.out.print("Masukkan angka: ");
    akr.nilai = sc.nextInt();

    System.out.println("Hasil dengan Brute Force    : " + akr.akarBF(akr.nilai));
    System.out.println("Hasil dengan Divide Conquer : " + akr.akarBF(akr.nilai));
  }
}
