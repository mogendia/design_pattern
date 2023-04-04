package command;

public class Main {
    public static void main(String[] args) {
        Remote remote=new Remote();
        AirCondition airCon=new AirCondition();
        TurnOnAirCondition turnOn=new TurnOnAirCondition(airCon);
        TurnOffAirCondition turnOff=new TurnOffAirCondition(airCon);

        remote.addCommand(0,turnOn,turnOff);
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
    }
}
