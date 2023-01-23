package kz.aitu.oop.practice.practice2;

public class Lux extends Wagon{
    //constructor
    public Lux(){
        setSeats(10);
    }
    //method of showing information
    @Override
    public String toString() {
        return "Lux" +
                "\nSpeed: " + getSpeed() +
                "\nTraction: " + getTraction() +
                "\nSeats: " + getSeats();
    }
}
