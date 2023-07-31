package Org.Lessons.Java.Veicles;

import java.time.LocalDate;

public class Motorcycle extends Veicles{
    private boolean easel;


    public Motorcycle(String licensePlate, LocalDate yearOfEnrollment, boolean easel) {
        super(licensePlate, yearOfEnrollment);
        this.easel = easel;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "easel=" + easel +
                '}';
    }
}
