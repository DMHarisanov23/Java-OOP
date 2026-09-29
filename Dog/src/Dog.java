public class Dog {
    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void Bark() {
        System.out.println("Woof!");
    }
     void showInfo(){
System.out.println("Name: " + name);
System.out.println("Age: " + age);
     }

    public static void main(String[] args) {
Dog dog1 = new Dog("Rex", 4  );
dog1.showInfo();
        dog1.Bark();
    }


}
