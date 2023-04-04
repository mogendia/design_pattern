package Singleton;

public class Main {
    public static void main(String[] args) {
       Singleton stn= Singleton.getInstance();
       Singleton stn1= Singleton.getInstance();
       // for testing
       stn.printData();
       stn1.printData();
    }
}