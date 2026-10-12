package task_13;
public class main {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 8, 40, 15};

        System.out.print("Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);

        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}