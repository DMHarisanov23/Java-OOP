package task_2;

public class Main {
    static String name = "Cheese";
    static double price = 2.6;
    static int quantity = 40;
    static boolean available = true;
    public Main(String name, double price, int quantity, boolean available) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.available = available;
    }
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(available);

    }
}
