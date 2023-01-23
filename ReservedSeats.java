package kz.aitu.oop.practice.practice2;

public class ReservedSeats extends Wagon{
    //constructor
    public ReservedSeats(){
        setSeats(50);
    }
    //method of showing information
    @Override
    public String toString() {
        return "Reserved Seats" +
                "\nSpeed: " + getSpeed() +
                "\nTraction: " + getTraction() +
                "\nSeats: " + getSeats();
    }
}
