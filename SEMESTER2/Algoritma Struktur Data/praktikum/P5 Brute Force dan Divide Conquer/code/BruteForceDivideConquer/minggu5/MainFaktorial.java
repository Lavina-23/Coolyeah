import java.util.Scanner;

public class MainFaktorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=============================================");
    System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
    int elemen = sc.nextInt();

    Faktorial[] fk = new Faktorial[elemen];
    for (int i = 0; i < elemen; i++) {
      fk[i] = new Faktorial();
      System.out.print("Masukkan nilai data ke-" + (1 + i) + ": ");
      fk[i].nilai = sc.nextInt();
    }

    long start = System.nanoTime();
    System.out.println("=============================================");
    System.out.println("Hasil Faktorial dengan Brute Force");
    for (int i = 0; i < elemen; i++) {
      System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
    }
    long end = System.nanoTime();
    long timeElapsed1 = end - start;

    start = System.nanoTime();
    System.out.println("=============================================");
    System.out.println("Hasil Faktorial dengan Divide Conquer");
    for (int i = 0; i < elemen; i++) {
      System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
    }
    end = System.nanoTime();
    long timeElapsed2 = end - start;

    System.out.println("Waktu eksekusi BF: " + timeElapsed1);
    System.out.println("Waktu eksekusi DC: " + timeElapsed2);
  }
}
