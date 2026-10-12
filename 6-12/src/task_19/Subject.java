package task_19;
public class Subject {
    String name;
    int hours;
    Teacher teacher;

    public Subject(String name, int hours, Teacher teacher) {
        this.name = name;
        this.hours = hours;
        this.teacher = teacher;
    }

    void showSubjectInfo() {
        System.out.println("Subject: " + name + ", Hours: " + hours);
        if (teacher != null) {
            teacher.showTeacherInfo();
        }
    }
}