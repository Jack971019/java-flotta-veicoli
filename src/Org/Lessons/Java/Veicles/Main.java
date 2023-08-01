package Org.Lessons.Java.Veicles;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car a1 = new Car("re432re", 2017, 5);
        Car a2 = new Car("re432re", 2017, 5);
        Car a3 = new Car("re432re", 2017, 5);

        Motorcycle m1 = new Motorcycle("re432re", 2021, true);
        Motorcycle m2 = new Motorcycle("re432re", 2021, true);
        Motorcycle m3 = new Motorcycle("re432re", 2021, true);

        GestoreFlotta gestoreFlotta = new GestoreFlotta();
        gestoreFlotta.aggiungiVeicolo(a1);
        gestoreFlotta.aggiungiVeicolo(a2);
        gestoreFlotta.aggiungiVeicolo(a3);
        gestoreFlotta.aggiungiVeicolo(m1);
        gestoreFlotta.aggiungiVeicolo(m2);
        gestoreFlotta.aggiungiVeicolo(m3);

        System.out.println(gestoreFlotta.contaVeicoliPerTipo("car"));
        System.out.println(gestoreFlotta.contaVeicoliPerTipo("motor"));
        System.out.println(gestoreFlotta.trovaveicolopertarga("re432re"));


    }
    /*public static void main(String[] args) {
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
                    gestoreflotta.aggiungiVeicolo(car);


                } else if (userChoice.equalsIgnoreCase("motor")) {
                    System.out.println("does it have an easel?  Y/N");
                    boolean easel = scan.nextBoolean();
                    Veicle motorcycle = new Motorcycle(licensePlate, yearOfEnrollment, easel);
                    gestoreflotta.aggiungiVeicolo(motorcycle);

                }


            } else if (userAnswer.equalsIgnoreCase("N")) {
                keepGoing = false;

            } else {
                System.out.println("invalid choice");
                break;
            }


        }

        //System.out.println("Car number" + gestoreflotta.contaVeicoliPerTipo());
       // System.out.println("motorcycle number"+ gestoreflotta.contaVeicoliPerTipo());
    } */
}

