import java.util.Scanner;

public class Selection2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score1, score2;
        double average;

        System.out.println("Enter first score");
        score1 = input.nextInt();
        System.out.println("Enter second score");
        score2 = input.nextInt();

        average = (score1+score2)/2;

        if (average >= 100) {
            average -= 5;
        }

        System.out.println("The average is " + average);

        // if (score >= 100) {
        //     score += 10;
        // } else {
        //     score -= 10;
        // }
        // System.out.println("The final score is " + score);
    }
}
