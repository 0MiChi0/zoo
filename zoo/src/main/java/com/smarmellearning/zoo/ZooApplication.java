package main.java.com.smarmellearning.zoo;


import main.java.com.smarmellearning.zoo.bootstrap.Zoo;
import main.java.com.smarmellearning.zoo.controller.AnimalsController;


public class ZooApplication {



    public static void main(String[] args) {

        AnimalsController animalsController = new AnimalsController();

        Zoo zoo =new Zoo();
        System.out.println(zoo.getEagles());
        System.out.println(animalsController.getTallestAnimal(zoo.getEagles()));
        System.out.println(animalsController.getShortestAnimal(zoo.getEagles()));
        System.out.println(animalsController.getHeavierAnimal(zoo.getEagles()));
        System.out.println(animalsController.getLighterAnimal(zoo.getEagles()));
        System.out.println(animalsController.getBiggerTailAnimal(animalsController.mergeAnimalsWithTail(zoo.getTigers(),zoo.getLions())));
        System.out.println(animalsController.getBiggerWingspanAnimal(animalsController.mergeAnimalsWithWings(zoo.getEagles())));

    }

}
