package observer;

public interface Subject {
    void Register(Observer observer);
    void LogOut(Observer observer);
    void notifyStudent();
}
