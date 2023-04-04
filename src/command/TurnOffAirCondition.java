package command;

public class TurnOffAirCondition implements Command{

    private AirCondition airCon;
    TurnOffAirCondition(AirCondition airCon){
        this.airCon=airCon;
    }
    @Override
    public void execute() {
        this.airCon.turnOff();
    }
}
