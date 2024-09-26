import java.util.Scanner;

public class cobaDoWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rekening = 1234567890;

    boolean isRekening = false;
    do {
      System.out.println("Masukkan rekening: ");
      int inputRekening = sc.nextInt();
      sc.nextLine();

      if (inputRekening == rekening) {
        isRekening = true;
      } else {
        System.out.println("Rekening salah!");
      }

    } while (!isRekening);

    boolean isExit = false;
    while (!isExit) {
      System.out.println("Menu: 1. roti, 2. sego padang, 3. soto, 4. rawon, 3. exit");
      int menu = sc.nextInt();

      switch (menu) {
        case 1:
          System.out.println("Selamat makan roti!");
          break;
        // continue;
        case 2:
          System.out.println("Selamat makan sego padang!");
          // break;
          continue;
        case 3:
          System.out.println("Selamat makan sego soto!");
          // break;
          continue;
        case 4:
          System.out.println("Selamat makan sego rawon!");
          break;
        case 5:
          isExit = true;
          break;
        default:
          System.out.println("Pilihan tidak valid");
          break;
      }
    }

    do {

    } while (isExit);
  }
}
