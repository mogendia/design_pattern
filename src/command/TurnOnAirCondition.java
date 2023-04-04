package command;

public class TurnOnAirCondition implements Command{

    private AirCondition airCon;
    TurnOnAirCondition(AirCondition airCon){
        this.airCon=airCon;
    }
    @Override
    public void execute() {
        this.airCon.turnOn();
    }
}
