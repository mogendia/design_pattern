package adapter;

public class Main {
    public static void main(String[] args) {
        Vehicle car=new Car();
        useVehicle(car);
        Vehicle bike=new BicycleAdapter(new Bicycle());
        useVehicle(bike);
    }

    private static void useVehicle(Vehicle car) {
        car.action();
        car.breakHand();
        car.soundHorn();
        System.out.println();
    }
}
