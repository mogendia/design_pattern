package observer;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
    private final String name;
    private String availability;
    private final List<Observer>observerList; //control methods
    public Course(String name){
        this.name=name;
        observerList= new ArrayList<>();
    }

    @Override
    public void Register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void LogOut(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyStudent() {
        for(Observer observer:observerList){
        observer.update(availability);
        }
    }

    public void setAvailability(boolean available) {
        availability=this.name+ (available?"Available":"Not available");
        notifyStudent();
    }
}
