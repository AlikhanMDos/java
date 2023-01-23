package kz.aitu.oop.practice.practice2;

public class LocomotiveC extends Wagon {
    public LocomotiveC(){
        setSpeed(85);
        setTraction(10);
    }
    //method of showing information
    @Override
    public String toString() {
        return "Locomotive C" +
                "\nSpeed: " + getSpeed() +
                "\nTraction: " + getTraction() +
                "\nSeats: " + getSeats();
    }
}
