package Org.Lessons.Java.Veicles;


import java.util.ArrayList;

public class GestoreFlotta {

    /*aggiungere nuovi veicoli alla flotta
    contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
    trovare un veicolo specifico tramite il numero di targa */

    ArrayList<Veicle> veiclesList = new ArrayList<>();



    ArrayList<Veicle> getVeiclesList(){
        return veiclesList;
    }

    void addVeicle(Veicle veicle){
        String numOfLicensePlate = veicle.getLicensePlate();
        veiclesList.add(veicle);
    }

    int carCounter;

    int motorCounter;

    void counterOfveicles(){
        carCounter = 0;
        motorCounter = 0;

        for (Veicle veicle : veiclesList){

            if (veicle instanceof Car){
                carCounter++;
            } else if (veicle instanceof Motorcycle) {
                motorCounter ++;

            }

        }
    }





    /*int getMotorCounter (){
        return motorCounter;
    }

    void typeCounter(){
        carCounter = 0;
        motorCounter = 0;
        for (carCounter = 0, getVeiclesList().size(), carCounter ++;;){


        }

        boolean findLicensePlate{
            boolean found = false;
            for (Veicle veicle : veiclesList){

            }
        }
    }*/












    }


