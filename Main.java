package kz.aitu.oop.practice.practice2;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Wagon> wagons = new ArrayList<>();      //Creating Array list for wagons

        Scanner scan = new Scanner(System.in);            //Creating a Scanner

        System.out.println("Choose train");

        Wagon LocomotiveA = new LocomotiveA();            //Create Locomotive objects
        Wagon LocomotiveB = new LocomotiveB();
        Wagon LocomotiveC = new LocomotiveC();
        int choice = -1;
        System.out.println("With which locomotive?:");
        System.out.println("1. Locomotive A");
        System.out.println("2. Locomotive B");
        System.out.println("3. Locomotive C");
        choice = scan.nextInt();
        double speed = 0;
        int traction = 0;
        int seats = 0;
        switch (choice) {
            case 1:
                speed = LocomotiveA.getSpeed();
                traction = LocomotiveA.getTraction();
                break;

            case 2:
                speed = LocomotiveB.getSpeed();
                traction = LocomotiveB.getTraction();
                break;

            case 3:
                speed = LocomotiveC.getSpeed();
                traction = LocomotiveC.getTraction();
                break;
            }
        Wagon coupe = new Coupe();                                  //Creating objects(types of wagon) for Wagon
        Wagon lux = new Lux();
        Wagon reservedSeats = new ReservedSeats();

        while (true) {                                              //Creating a loop for operations with wagon
            System.out.println("What would you like to do?\n 1)Show type of wagons\n 2)Add wagon to train\n 3)Show train's wagons\n 4)Show statistics");
            int com = scan.nextInt();
            if (com == 1) {                                         //Information about type of Wagons
                System.out.println(coupe + "\n");
                System.out.println(lux + "\n");
                System.out.println(reservedSeats + "\n");
            }
            else if (com == 2) {                                    //Adding wagons to the train
                System.out.println("1)Coupe\n 2)Lux\n 3)Reserved seats");
                int vag = scan.nextInt();
                if (vag == 1) {
                    wagons.add(coupe);
                    seats += 25;
                } else if (vag == 2) {
                    wagons.add(lux);
                    seats += 10;
                } else if (vag == 3) {
                    wagons.add(reservedSeats);
                    seats += 50;
                }
            }
            else if (com == 3) {                                     //Showing wagons in array
                System.out.println(wagons);
            }
            else if (com == 4) {                                     //Showing statistics of train
                System.out.println("Train" +
                        "\nSpeed: " + speed +
                        "\nTraction: " + traction +
                        "\nSeats: " + seats +
                        "\nPassengers: " );
                }
                for (int j = 1; j <= 40; j++) {
                    Passenger per = new Passenger();
                    per.setId(j);
                    per.setName("Passenger " + j);
                    per.setAge(20 + j);
                    per.setDisability(j % 2 == 0);
                    System.out.println("(" + per.getId() + ", " + per.getName() + ", " + per.getAge() + ", " + per.isDivisibility() + ")");
                }
                }
            }
        }