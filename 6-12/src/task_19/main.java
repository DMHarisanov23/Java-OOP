package task_19;
public class main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs. Brown", 10);
        Subject subject = new Subject("Java Programming", 4, teacher);

        Student maria = new Student("Maria", 16, 5.75, subject);
        Student ivan = new Student("Ivan", 17, 2.50, subject);

        maria.showStudentInfo();
        ivan.showStudentInfo();
    }
}