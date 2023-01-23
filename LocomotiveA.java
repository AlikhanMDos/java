package kz.aitu.oop.practice.practice2;

public class LocomotiveA extends Wagon {
    //constructor
    public LocomotiveA(){
        setSpeed(120);
        setTraction(30);
    }
    //method of showing information
    @Override
    public String toString() {
        return "Locomotive A" +
                "\nSpeed: " + getSpeed() +
                "\nTraction: " + getTraction() +
                "\nSeats: " + getSeats();
    }
}
