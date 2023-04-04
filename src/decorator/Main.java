package decorator;

public class Main {
    public static void main(String[] args) {
        Sandwich mySandwich=new Cheese(new Beef(new BasicSandwich()));
        System.out.println(mySandwich.getCost());
        System.out.println(mySandwich.getDescription());
    }
}
