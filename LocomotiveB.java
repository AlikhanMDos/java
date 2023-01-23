package kz.aitu.oop.practice.practice2;

public class LocomotiveB extends Wagon {
        public LocomotiveB(){
            setSpeed(90);
            setTraction(20);
        }
        //method of showing information
        @Override
        public String toString() {
            return "Locomotive B" +
                    "\nSpeed: " + getSpeed() +
                    "\nTraction: " + getTraction() +
                    "\nSeats: " + getSeats();
        }
    }
