package task_19;
public class Teacher {
    String name;
    int experience;

    public Teacher(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
    void showTeacherInfo() {
        System.out.println("Teacher: " + name + ", Experience: " + experience + " years");
    }
}