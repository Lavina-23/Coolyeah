import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
