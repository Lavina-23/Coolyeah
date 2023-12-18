import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int midScore, fnlScore, quizScore, assgnScore;
        double finalscore;

        System.out.println("Enter midterm exam score");
        midScore = input.nextInt();
        System.out.println("Enter final exam score");
        fnlScore = input.nextInt();
        System.out.println("Enter quiz score");
        quizScore = input.nextInt();
        System.out.println("Enter assignment score");
        assgnScore = input.nextInt();
    
        finalscore = (0.3*midScore) + (0.4*fnlScore) + (0.1*quizScore) + (0.2*assgnScore);

        if (finalscore >= 65) {
            System.out.println(finalscore);
        } else {
            System.out.println("Remedies");
        }
    }
}

