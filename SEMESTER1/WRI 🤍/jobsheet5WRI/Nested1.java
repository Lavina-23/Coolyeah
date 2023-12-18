import java.util.Scanner;

/**
 * Nested1
 */
public class Nested1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value;

            System.out.println("Enter a value (0-100) : ");
            value = sc.nextInt();

            if (value >= 0 || value <= 100) {
                if (value >= 90 && value <= 100) {
                    System.out.println("Grade A, EXCELLENT !");
                } else if (value >= 80 && value <= 89) {
                    System.out.println("Grade B, Keep up your achievement !");
                } else if (value >= 60 && value <= 79) {
                    System.out.println("Grade C, Increase your achievement !");
                } else if (value >= 50 && value <= 59) {
                    System.out.println("Grade D, Improve your study !");
                } else {
                    System.out.println("Grade E, You dont pass !");
                }
            } 
            // else {
            //     System.out.println("The number you entered is invalid");
            // }
            else if (value <= 0) {
                System.out.println("The value you entered is less than 0 !");
            } else if (value >= 100) {
                System.out.println("The value you entered is more than 100 !");
            }
        }
    }
}