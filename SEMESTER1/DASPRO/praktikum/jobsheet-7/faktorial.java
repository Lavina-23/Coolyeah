import java.util.Scanner;

public class faktorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan bilangan: ");
    int n = sc.nextInt();
    int faktorial = 1;
    for (int i = 1; i <= n; i++) {
      faktorial *= i;
    }
    System.out.println("Faktorial dari " + n + " adalah " + faktorial);

  }
}
