public class Car {
    String brand;
    String model;
    Engine engine;

    Car(String brand, String model, Engine engine){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }
    void showCar(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        engine.getEngineInfo();
    }
    public static void main(String[] args) {
        Engine engine1 = new Engine("Petrol" , 150);
        Car car1 = new Car("Toyota" , "Corolla" , engine1);
        car1.showCar();
    }

}
