import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number range : ");
        int n = input.nextInt();

        int count = 0, sum = 0, g = 0;
        double avg;

        for (int i = 1; i <= n; i++) {
            if (i % 2 ==0) {                
                count++;
            }
        }
        System.out.println("The number of even numbers from 1 to " + n + " is " + count);
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
                System.out.println("Even number " + count + " is " + i);
                sum += i;
            }
        }
        
        avg = (double) sum / count;
        System.out.println("The sum of the even numbers from 1 to " + n + " is " + sum);
        System.out.println("The average of the even numbers from 1 to " + n + " is " + avg);
    }
}
