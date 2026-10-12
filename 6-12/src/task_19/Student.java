package task_19;
public class Student {
    String name;
    int age;
    double grade;
    Subject subject;

    public Student(String name, int age, double grade, Subject subject) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.subject = subject;
    }
    boolean hasPassed() {
        return grade >= 3.00;
    }

    void showStudentInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
        if (subject != null) {
            subject.showSubjectInfo();
        }

        String status = hasPassed() ? "Passed" : "Failed";
        System.out.println("Status: " + status);

    }
}