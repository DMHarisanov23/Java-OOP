package Circle;

public class Circle {

        private double radius;
        public Circle() {
            this.radius = 0.0;
        }
        public Circle(double radius) {
            setRadius(radius);
        }
        public void setRadius(double radius) {
            if (radius >= 0) {
                this.radius = radius;
            }
        }
        public double getRadius() {
            return radius;
        }
        public double area() {
            return Math.PI * radius * radius;
        }

}
