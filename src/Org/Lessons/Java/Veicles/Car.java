package Org.Lessons.Java.Veicles;

import java.time.LocalDate;

public class Car extends Veicles{

    private int numOfDors;


    public Car(String licensePlate, LocalDate yearOfEnrollment) {
        super(licensePlate, yearOfEnrollment);
        this.numOfDors = numOfDors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numOfDors=" + numOfDors +
                '}';
    }
}
