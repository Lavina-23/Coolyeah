import java.util.Scanner;

public class KalkulatorStruktural {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int angka1, angka2;
    char operator;

    System.out.print("Masukkan angka pertama: ");
    angka1 = sc.nextInt();
    sc.nextLine();

    System.out.print("Masukkan angka kedua: ");
    angka2 = sc.nextInt();
    sc.nextLine();

    System.out.print("Masukkan operator (+, -, *, /): ");
    operator = sc.next().charAt(0);

    System.out.println("Hasil dari " + angka1 + operator + angka2 + " = " + hitung(angka1, angka2, operator));
  }

  public static int hitung(int angka1, int angka2, char operator) {
    int hasil = 0;
    switch (operator) {
      case '+':
        hasil = angka1 + angka2;
        break;
      case '-':
        hasil = angka1 - angka2;
        break;
      case '*':
        hasil = angka1 * angka2;
        break;
      case '/':
        hasil = angka1 / angka2;
        break;
      default:
        System.out.println("Operator tidak valid!");
        break;
    }

    return hasil;
  }
}
