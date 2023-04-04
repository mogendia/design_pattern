package command;

public class Remote {
    private final Command[]onCommand;
    private final Command[]offCommand;
    Remote(){
       onCommand=new Command[3];
       offCommand=new Command[3];
    }
    public void addCommand(int slots,Command onCommand, Command offCommand){
        this.onCommand[slots]=onCommand;
        this.offCommand[slots]=offCommand;
    }
    public void onButtonPressed(int slots){
        onCommand[slots].execute();
    }
    public void offButtonPressed(int slots){
        offCommand[slots].execute();
    }
}
