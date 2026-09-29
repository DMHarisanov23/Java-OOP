public class Student {
    String name;
    int age;
    double grade;
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    void Introduce(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Maria", 16, 5.75);
        student1.Introduce();
        Student student2 = new Student("Alex", 17, 5.5);
        student2.Introduce();
    }


}
