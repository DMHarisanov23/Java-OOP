
public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        Animal lion = new Animal("Fermendo", "krava", "Moooo");
        Animal elephant = new Animal("Checheneca", "jivotno", "AAAAAA");
        Animal dog = new Animal("Petyr", "kuche", "woof woof");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(dog);

        myZoo.displayAnimals();


        lion.makeSound();
        elephant.makeSound();
        dog.makeSound();
    }
}