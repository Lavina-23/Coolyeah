import java.util.Scanner;

/**
 * nestedLoop_2341760062
 */
public class nestedLoop_2341760062 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke - " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke - " + (j + 1) + " : ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke - " + (i + 1) + " : ");
            double jumlah = 0;
            for (int j = 0; j < temps[0].length; j++) {
                jumlah += temps[i][j];
                System.out.print(temps[i][j] + " ");
            }
            double rata = 0;
            rata = jumlah / temps.length;
            System.out.println("\nRata-rata suhu kota ke - " + i + " : " + rata);
            System.out.println();
        }
    }
}