import java.util.Scanner;

public class decision {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean isMember = false;
    int totalBeli = 25_000;
    String nama = "Lavina";
    String password = "123456";

    System.out.println("Manu");
    System.out.println("1. Login");
    System.out.println("2. Register");
    System.out.println("3. Logout");
    System.out.println("4. Info");
    System.out.println("5. Exit");
    int pilihan = sc.nextInt();

    // Switch case
    switch (pilihan) {
      case 1:
        System.out.println("Ini login");
        break;
      case 2:
        System.out.println("Ini register");
        break;
      default:
        break;
    }

    System.out.println("Masukkan nama: ");
    String username = sc.nextLine();

    // if else
    if (username.equalsIgnoreCase("Admin")) {
      System.out.println("HAHAHAHA");
    } else {
      System.out.println("Inputanmu salah");
    }

    // nested if
    if (totalBeli >= 10_000) {
      if (isMember) {
        System.out.println("Gratis");
      } else {
        double discount = 0.1;
        System.out.println("Bayar " + (totalBeli * discount));
      }
    } else {
      System.out.println("Bayar 1_000_000");
    }
  }
}

// if

// else if

// nested if

// switch case

// ternary

// Operator Comparison

// ==
// !=
// <
// <=
// >
// >=
// .equals() -> method compares two strings, and returns true if the strings are
// equal, and false if not.
// .equalsIgnoreCase() -> method compares two strings, ignoring lower case and
// upper case differences.

// SILAKAN KALO MAU COBA
// SEBAIKNYA DICOBA
// HEHE ^ ^
// JANGAN DIFOTO DOANG, DICOBA BENERAN
