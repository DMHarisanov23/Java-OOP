package tack_3;

public class Calc {
    static public int a;
    static public int b;
    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int  add() {
        return a + b;

    }

    int  subtract() {
        return a - b;
    }
    int  multiply() {
        return a * b;

    }
    int  divide() {
        return a / b;
    }
    int  remainder() {
        return a % b;
    }
}
