import java.util.Scanner;

public class OnlineQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("===== ONLINE QUIZ =====");

        // Question 1
        System.out.println("\n1. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. HTML");
        System.out.println("3. SQL");
        System.out.println("4. CSS");

        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 1) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which keyword is used to create a class in Java?");
        System.out.println("1. function");
        System.out.println("2. class");
        System.out.println("3. define");
        System.out.println("4. create");

        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which symbol is used to end a Java statement?");
        System.out.println("1. :");
        System.out.println("2. .");
        System.out.println("3. ;");
        System.out.println("4. ,");

        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            score++;
        }

        // Result
        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score >= 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}
