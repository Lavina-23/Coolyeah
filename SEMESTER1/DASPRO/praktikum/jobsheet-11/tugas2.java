import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // loop untuk menampilkan baris sebanyak n
            for (int j = 0; j < n; j++) { // loop untuk menampilkan kolom bintang sebanyak n
                System.out.print("*");
                if ((i + j) == (n - 1)) { // jika indeks i + indeks j = n - 1 maka akan di break, bintang tidak akan
                                          // diprint dan lanjut ke iterasi berikutnya
                    break;
                }
            }
            System.out.println();
        }
    }
}
