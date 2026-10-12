package task_5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Лицето на кръга е: " + area);
        System.out.println("Обиколката на окръжността е: " + perimeter);

        scanner.close();
    }
}
