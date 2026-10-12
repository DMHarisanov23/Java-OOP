package task_18;
public class main {
    public static void main(String[] args) {

        Engine petrolEngine = new Engine("Petrol", 150, 6.5);
        Engine dieselEngine = new Engine("Diesel", 250, 8.2);
        Car toyota = new Car("Toyota", "Corolla", petrolEngine);
        Car bmw = new Car("BMW", "X5", dieselEngine);

        toyota.showCarInfo();
        bmw.showCarInfo();
    }
}