import java.util.Random;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1 - 10) : ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer < number) {
                    System.out.println("Jawaban anda lebih kecil dari angka yang benar");
                } else if (answer == number) {
                    System.out.println("Jawaban anda benar !");
                } else {
                    System.out.println("Jawaban anda lebih besar dari angka yang benar");
                }

                success = (answer == number);
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (y / n) ? ");
            menu = input.nextLine().charAt(0);
            if (menu == 'n') {
                break;
            }
        } while (menu == 'y');
    }
}
