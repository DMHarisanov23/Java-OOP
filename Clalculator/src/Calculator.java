public class Calculator {
    private double num1;
    private double num2;
    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
   double add() {
        return num1 + num2;
   }
   double sub() {
        return num2 - num1;
   }
   double mul() {
        return num1 * num2;
   }
   double div() {
        return num2 / num1;
   }

}
