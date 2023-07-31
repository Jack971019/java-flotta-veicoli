package Org.Lessons.Java.Veicles;

import java.util.ArrayList;
import java.util.Scanner;

public class GestoreFlotta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Veicles> veiclesList = new ArrayList<>();

        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("do you want to add a veicle to the list? Y/N");
            String userAnswer = scan.nextLine();


            if (userAnswer.equalsIgnoreCase("Y")) {

                System.out.println("digit veicle's license plate");
                String licensePlate = scan.nextLine();
                System.out.println("digit veicle's year of enrollment");
                int yearOfEnrollment = scan.nextInt();

                System.out.println("are you adding a motocycle or a car? digit c for car or motor for motorcycle C/M");
                String userChoice = scan.nextLine();

                if (userChoice.equalsIgnoreCase("c")){
                    System.out.println("digit numbers of dors");
                    int numbOfDors = scan.nextInt();

                    Veicles veicle = new
                } else if (userChoice.equalsIgnoreCase("motor")) {
                    System.out.println("does it have an easel?  Y/N");
                    boolean easel = scan.nextBoolean();
                    Veicles veicle = new Veicles(licensePlate, yearOfEnrollment, easel);

                }


            } else if (userAnswer.equalsIgnoreCase("N")) {
                keepGoing = false;

            } else {
                System.out.println("invalid choice");
                break;
            }


        }


    }
}

