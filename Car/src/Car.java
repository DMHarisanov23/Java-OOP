public class Car {
    String brand;
    String color;
    int year;
    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    void showCar(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
    void drive(){
 System.out.println(brand + "is driving");
    }
    public static void main(String[] args) {
    Car car1 = new Car("BMW", "Black", 2020);
    Car car2 = new Car("Toyota", "Red", 2009);
    car1.drive();
    car2.drive();
    }



}
