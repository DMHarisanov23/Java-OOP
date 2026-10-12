package task_16;
public class main {
    public static void main(String[] args) {
        Student maria = new Student("Maria", 16, 6.00, 5.50, 5.00);
        Student ivan = new Student("Ivan", 17, 5.00, 4.50, 5.50);

        maria.showInfo();
        ivan.showInfo();
    }
}