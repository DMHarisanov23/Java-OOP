import java.util.ArrayList;

public class Animal {
    String name;
    String type;
    String sound;
    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }
 void makeSound() {
        System.out.println(name + " " + sound);
 }

    public String toString() {
        return "Jivotno: ime " + name + ", Vid: " + type + ", zvuk: " + sound ;
    }

}
