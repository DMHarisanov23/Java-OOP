package task_20;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer city: ");
        String city = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();

        if (price > 0 && quantity > 0 && discount >= 0 && discount <= 100) {

            Customer customer = new Customer(customerName, city);
            Product product = new Product(productName, price);
            Order order = new Order(customer, product, quantity);


            System.out.println("Order Details ");
            order.showOrderInfo(discount);
            Order.showOrderCount();
        } else {
            System.out.println("Invalid order data.");
        }

        scanner.close();
    }
}
