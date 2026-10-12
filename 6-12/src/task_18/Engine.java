package task_18;
public class Engine {
    String type;
    int horsepower;
    double consumption;

    public Engine(String type, int horsepower, double consumption) {
        this.type = type;
        this.horsepower = horsepower;
        this.consumption = consumption;
    }

    void showEngineInfo() {
        System.out.println("Engine Type: " + type + ", Horsepower: " + horsepower + " hp, Consumption: " + consumption + " L/100km");
    }
}