package kz.aitu.oop.practice.practice2;

public class Coupe extends Wagon {
    //constructor
    public Coupe(){
        setSeats(20);
    }
    //method of showing information
    @Override
    public String toString() {
        return "Coupe" +
                "\nSpeed: " + getSpeed() +
                "\nTraction: " + getTraction() +
                "\nSeats: " + getSeats();
    }
}
