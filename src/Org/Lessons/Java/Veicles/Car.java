package Org.Lessons.Java.Veicles;

public class Car extends Veicle {

    private int numOfDors;

    public Car(String licensePlate, int yearOfEnrollment, int numOfDors) {
        super(licensePlate, yearOfEnrollment);
        this.numOfDors = numOfDors;
    }

    public int getNumOfDors() {
        return numOfDors;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" +
                "numOfDors=" + numOfDors +
                '}';
    }
}
