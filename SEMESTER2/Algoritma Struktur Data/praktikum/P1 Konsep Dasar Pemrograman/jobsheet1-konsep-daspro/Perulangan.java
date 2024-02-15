import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        long nim = sc.nextLong();
        int n = (int) (nim % 100);

        for (int i = 1; i <= (n > 10 ? n : n + 10); i++) {
            if ((i % 2 == 0) && i != 6 && i != 10) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }
        sc.close();
    }
}
