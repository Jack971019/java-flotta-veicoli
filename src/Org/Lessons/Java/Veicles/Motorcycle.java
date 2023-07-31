package Org.Lessons.Java.Veicles;

public class Motorcycle extends Veicle {
    private boolean easel;


    public Motorcycle(String licensePlate, int yearOfEnrollment, boolean easel) {
        super(licensePlate, yearOfEnrollment);
        this.easel = easel;
    }

    @Override
    public String toString() {
        return super.toString()+"Motorcycle{" +
                "easel=" + easel +
                '}';
    }
}
