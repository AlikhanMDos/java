package kz.aitu.oop.practice.practice2;

public abstract class Wagon {
    private double speed;
    private int traction;
    private int seats;
    public Wagon(double speed, int traction, int seats){
        setSeats(seats);
        setSpeed(speed);
        setTraction(traction);
    }

    public Wagon() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getTraction() {
        return traction;
    }

    public void setTraction(int traction) {
        this.traction = traction;
    }
    @Override
    public String toString() {
        return "Train" +
                "\nSpeed: " + speed +
                "\nTraction: " + traction +
                "\nSeats: " + seats;
    }
}



