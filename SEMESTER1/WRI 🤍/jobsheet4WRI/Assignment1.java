import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.println("Enter the first number");
        number1 = input.nextInt();
        System.out.println("Enter the second number");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("The largest number is " + number1);
        } else {
            System.out.println("The largest number is " + number2);
        }
    }
}
