public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double calculateArea() {
        return width * height;
    }
    double calculatePerimeter() {
        return 2 * (width + height);
    }
    void draw() {
        System.out.println("Area of circle: "+ calculateArea());
        System.out.println("Perimeter of circle: "+ calculatePerimeter());
    }
    static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.draw();
    }
}
