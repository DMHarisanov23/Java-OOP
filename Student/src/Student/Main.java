package Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setAge(18);
        System.out.println("Ime: " +student.getName());
        System.out.println("Godini: " +student.getAge());
    }
}
