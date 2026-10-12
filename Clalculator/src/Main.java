public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator(10, 94);
        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.sub());
        System.out.println("Multiplication: " + obj.mul());
        System.out.println("Division: " + obj.div());
    }
}