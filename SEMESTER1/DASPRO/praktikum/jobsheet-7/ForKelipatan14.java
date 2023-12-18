import java.util.Scanner;

/**
 * ForKelipatan14
 */
public class ForKelipatan14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        double rata;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        scan.close();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        rata = (double) jumlah / counter;
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rata);
    }
}