package Org.Lessons.Java.Veicles;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GestoreFlotta gestoreflotta = new GestoreFlotta();


        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("do tou want to add a veicle? Y/N");
            String userAnswer = scan.nextLine();


            if (userAnswer.equalsIgnoreCase("y")) {

                System.out.println("are you adding a motocycle or a car? digit c for car or motor for motorcycle C/M");
                String userChoice = scan.nextLine();

                System.out.println("digit veicle's license plate");
                String licensePlate = scan.nextLine();
                System.out.println("digit veicle's year of enrollment");
                int yearOfEnrollment = Integer.parseInt(scan.nextLine());


                if (userChoice.equalsIgnoreCase("c")) {
                    System.out.println("digit numbers of dors");
                    int numOfDors = Integer.parseInt(scan.nextLine());
                    Veicle car = new Car(licensePlate, yearOfEnrollment, numOfDors);
                    gestoreflotta.addVeicle(car);


                } else if (userChoice.equalsIgnoreCase("motor")) {
                    System.out.println("does it have an easel?  Y/N");
                    boolean easel = scan.nextBoolean();
                    Veicle motorcycle = new Motorcycle(licensePlate, yearOfEnrollment, easel);
                    gestoreflotta.addVeicle(motorcycle);

                }


            } else if (userAnswer.equalsIgnoreCase("N")) {
                keepGoing = false;

            } else {
                System.out.println("invalid choice");
                break;
            }


        }

        System.out.println("Car number" + gestoreflotta.carCounter);
        System.out.println("motorcycle number"+ gestoreflotta.motorCounter);
    }
}

