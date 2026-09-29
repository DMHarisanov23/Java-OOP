class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }


    public static void main(String[] args) {

        Person person1 = new Person("Maria", 20);
        Person person2 = new Person("Alex", 25);

        person1.showInfo();
        person2.showInfo();
    }
}