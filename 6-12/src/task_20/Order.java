package task_20;
public class Order {
    private Customer customer;
    private Product product;
    private int quantity;
    private static int orderCount = 0;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        orderCount++;
    }
    public double calculateTotal() {
        return product.getPrice() * quantity;
    }
    public double calculateTotal(double discount) {
        double total = calculateTotal();
        return total - (total * (discount / 100.0));
    }
    public void showOrderInfo(double discount) {
        customer.showCustomerInfo();
        product.showProductInfo();
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "% | Total: " + calculateTotal());
        System.out.println("Final price: " + calculateTotal(discount));
    }

    public static void showOrderCount() {
        System.out.println("Total orders: " + orderCount);
    }
}
