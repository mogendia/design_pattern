package observer;

public class Main {
    public static void main(String[] args) {
        Student name=new Student("Mo");
        Student name1=new Student("Ali");
        Student name2=new Student("Mona");
        Student name3=new Student("Molina");
        Student name4=new Student("Mostafa");

        Course course=new Course("Java");

        course.Register(name);
        course.Register(name1);
        course.Register(name2);
        course.Register(name3);
        course.Register(name4);

        course.LogOut(name);

        course.setAvailability(true);
    }
}
