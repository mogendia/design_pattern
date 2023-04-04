package factory;

public class Main {
    public static void main(String[] args) {
        Animal Dog= AnimalFactory.createAnimal("Dog");
        Dog.Sound();

        Animal Cat= AnimalFactory.createAnimal("Cat");
        Cat.Sound();
    }
}
