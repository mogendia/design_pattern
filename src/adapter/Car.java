package adapter;

public class Car implements Vehicle{
    @Override
    public void action() {
        System.out.println("car moved");
    }

    @Override
    public void breakHand() {
        System.out.println("car stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("beeeeeeeeb.....");
    }
}
