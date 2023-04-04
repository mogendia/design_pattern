package decorator;

public class Beef extends SandwichDecorator{
    Beef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Beef" ;
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }
}
