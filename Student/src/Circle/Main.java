package Circle;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);

        System.out.println("Радиус на кръга: " + myCircle.getRadius());
        System.out.println("Площ на кръга: " + myCircle.area());

    }
}
