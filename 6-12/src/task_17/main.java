package task_17;
public class main {
    public static void main(String[] args) {
        Student maria = new Student("Maria", 16);
        Student ivan = new Student("Ivan", 17);
        Student alex = new Student("Alex", 16);
        Student peter = new Student("Peter", 18);

        maria.showInfo();
        ivan.showInfo();
        alex.showInfo();
        peter.showInfo();

        Student.showStudentCount();
    }
}