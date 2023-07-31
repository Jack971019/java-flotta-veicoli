package Org.Lessons.Java.Veicles;

import java.time.LocalDate;

public class Veicles {

    // ATTRIBUTI
    private String licensePlate;

    private LocalDate yearOfEnrollment;

    // COSTRUTTORI

    public Veicles(String licensePlate, LocalDate yearOfEnrollment) {
        this.licensePlate = licensePlate;
        this.yearOfEnrollment = yearOfEnrollment;
    }




    // GETTER AND SETTER


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public LocalDate getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(LocalDate yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    @Override
    public String toString() {
        return "Veicles{" +
                "licensePlate='" + licensePlate + '\'' +
                ", yearOfEnrollment=" + yearOfEnrollment +
                '}';
    }
}
