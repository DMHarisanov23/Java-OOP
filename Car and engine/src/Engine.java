public class Engine {
    String type;
    int horsePower;
    Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }
     void getEngineInfo(){
        System.out.println("Engine Type: " + type);
        System.out.println("Engine Horse Power: " + horsePower + "hp");
     }
}
