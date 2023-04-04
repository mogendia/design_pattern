package factory;

public class AnimalFactory {
    public static Animal createAnimal(String type){
        if (
                type.equals("Dog")){
            return new Dog();
        }
         else if (type.equals("Cat")) {
            return new Cat();
        }
         else
             return null;
    }
}
