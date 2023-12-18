import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // loop untuk menampilkan baris sebanyak n
            for (int j = 1; j <= n; j++) { // loop bagian dalam untuk menampilkan kolom sebanyak n
                if (i == 1 || i == n || j == 1 || j == n) { // jika indeks i = 1 atau indeks i = n atau indeks j = 1
                                                            // atau indeks j = n maka print angka 5
                    System.out.print("5 ");
                } else { // jika selain indeks diatas maka print spasi
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
