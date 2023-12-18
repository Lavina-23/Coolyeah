import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // loop luar yang melakukan perulangan untuk baris dari 1 sampai n
            for (int j = 1; j <= n - i; j++) { // loop bagian dalam pertama untuk menampilkan spasi sebanyak n - i
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) { // loop dalam kedua untuk menampilkan angka dari 1 sampai i
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
