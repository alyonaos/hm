package oop;

public class Road {
    public static void main(String[] args) {
        Car toyota= new Car(90, 43, 7.5){

        };
        toyota.goDistance(1000);
        System.out.println(" ");
        toyota.addFuel();
        toyota.goDistance(1000);
    }
}
