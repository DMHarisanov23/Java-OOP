package task_18;
public class Car {
    String brand;
    String model;
    Engine engine;
    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }
    void showCarInfo() {
        System.out.println("Car: " + brand + " " + model);
        engine.showEngineInfo();
    }
}