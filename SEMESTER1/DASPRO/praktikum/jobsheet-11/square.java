import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int iOuter = 0; iOuter <= n; iOuter++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println("1");
        }
    }
}
