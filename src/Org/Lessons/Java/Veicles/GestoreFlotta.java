package Org.Lessons.Java.Veicles;


import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

    /*aggiungere nuovi veicoli alla flotta
    contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
    trovare un veicolo specifico tramite il numero di targa */

    private List<Veicle> veiclesList;

    // COSTRUTTORI
    // inizializzo la lista di veicoli come una lista vuota invece di null
    public GestoreFlotta(){
        veiclesList = new ArrayList<>();
    }

    // GETTER E SETTER

    // METODI

    //aggiungere alla lsita un veicolo
    public void aggiungiVeicolo(Veicle veicle){
        veiclesList.add(veicle);
    }

    // contare se ho aggiunto alla lista una macchina o una moto
    public int contaVeicoliPerTipo(String tipo) throws IllegalArgumentException{

        int count = 0;
        for (Veicle veicle : veiclesList) {
            if (tipo.equals("car")) {
                if(veicle instanceof Car){
                    count ++;
                }

            } else if (tipo.equals("motor")) {
                if(veicle instanceof Motorcycle){
                    count ++;
                }
            }
        }
        return count;
    }

    //trovare un veicolo specifico tramite targa
    public Veicle trovaveicolopertarga(String licenseplate){
        boolean found = false;
        int contatore = 0;
        Veicle veicoloCercato = null;
        while (!found && contatore <veiclesList.size()){
            if(licenseplate.equals(veiclesList.get(contatore).getLicensePlate())){
               veicoloCercato =veiclesList.get(contatore);
               found = true;
            }
            contatore ++;
        }
        return veicoloCercato;
    }



    /*ArrayList<Veicle> getVeiclesList(){
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


