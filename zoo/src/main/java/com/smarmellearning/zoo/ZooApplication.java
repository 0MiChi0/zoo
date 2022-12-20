package main.java.com.smarmellearning.zoo;


import main.java.com.smarmellearning.zoo.model.*;
import main.java.com.smarmellearning.zoo.controller.AnimalsController;

import java.time.LocalDate;


public class ZooApplication {



    public static void main(String[] args) throws Exception {

        AnimalsController animalsController = new AnimalsController();
        Zoo zoo =new Zoo();
        zoo.initializeZoo();


        System.out.println(zoo.getAnimalMap());
        System.out.println(animalsController.getTallestAnimal(zoo.getAnimalMap().get(Eagle.class)));
        System.out.println(animalsController.getShortestAnimal(zoo.getAnimalMap().get(Eagle.class)));
        System.out.println(animalsController.getHeavierAnimal(zoo.getAnimalMap().get(Eagle.class)));
        System.out.println(animalsController.getLighterAnimal(zoo.getAnimalMap().get(Eagle.class)));
        System.out.println(animalsController.getBiggerTailAnimal(zoo.getAnimalMap().get(Tiger.class),zoo.getAnimalMap().get(Lion.class)));
        System.out.println(animalsController.getBiggerWingspanAnimal(zoo.getAnimalMap().get(Eagle.class)));

        zoo.addAnimalToZoo(new Eagle("clara", "pizza", 12, LocalDate.now(), 1.2,1.3, 1.7));
        zoo.addAnimalToZooV2(new Eagle("anto", "pizza", 12, LocalDate.now(), 1.2,1.3, 1.7));

        System.out.println(zoo.getAnimalMap());




    }

}
