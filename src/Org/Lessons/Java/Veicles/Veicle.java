package Org.Lessons.Java.Veicles;

public class Veicle {

    // ATTRIBUTI
    private String licensePlate;

    private int yearOfEnrollment;

    // COSTRUTTORI

    public Veicle(String licensePlate, int yearOfEnrollment) {
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

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
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
