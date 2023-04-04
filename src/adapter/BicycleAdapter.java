package adapter;

public class BicycleAdapter implements Vehicle {
    private final Bicycle bike;

    public BicycleAdapter(Bicycle bike) {
        this.bike = bike;
    }

    @Override
    public void action() {
        this.bike.pedal();
    }

    @Override
    public void breakHand() {
        this.bike.stop();
    }

    @Override
    public void soundHorn() {
        this.bike.ring();
    }
}
