package task_9;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score.");
        } else if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Very Good");
        } else if (score >= 60) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}