package tack_3;

public class Main {
 static Calc obj = new Calc(20,6);
    public static void main(String[] args) {

        System.out.println("Sum: " + obj.add());
        System.out.println("Sub: " + obj.subtract());
        System.out.println("Multi: " + obj.multiply());
        System.out.println("Diff: " + obj.divide());
        System.out.println("Rem: " + obj.remainder());

    }
}
