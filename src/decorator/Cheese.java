package decorator;

public class Cheese extends SandwichDecorator{
    Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese" ;
    }

    @Override
    public double getCost() {
        return super.getCost() + 7;
    }
}
