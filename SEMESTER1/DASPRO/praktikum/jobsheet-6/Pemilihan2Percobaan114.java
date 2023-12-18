import java.util.Scanner;

/**
 * Pemilihan2Percobaan114
 */
public class Pemilihan2Percobaan114 {

    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukkan tahun : ");
        int tahun = input14.nextInt();

        if ((tahun % 4 ) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Tahun kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}