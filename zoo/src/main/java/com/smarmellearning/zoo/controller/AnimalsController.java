package main.java.com.smarmellearning.zoo.controller;

import main.java.com.smarmellearning.zoo.model.*;

import java.util.ArrayList;
import java.util.List;

public class AnimalsController {


    public Animal getTallestAnimal(List<? extends Animal> animals) {
        Animal tallest = null;
        for (Animal animal : animals) {
            if (tallest == null || tallest.getHeight() < animal.getHeight())
                tallest = animal;
        }
        return tallest;
    }

    public Animal getShortestAnimal(List<? extends Animal> animals) {
        Animal shortest = null;
        for (Animal animal : animals) {
            if (shortest == null || shortest.getHeight() > animal.getHeight())
                shortest = animal;
        }
        return shortest;
    }

    public Animal getHeavierAnimal(List<? extends Animal> animals) {
        Animal heavier = null;
        for (Animal animal : animals) {
            if (heavier == null || heavier.getWeight() < animal.getWeight())
                heavier = animal;
        }
        return heavier;
    }

    public Animal getLighterAnimal(List<? extends Animal> animals) {
        Animal lighter = null;
        for (Animal animal : animals) {
            if (lighter == null || lighter.getWeight() > animal.getWeight())
                lighter = animal;
        }
        return lighter;
    }

    public AnimalWithTail getBiggerTailAnimal(List<? extends AnimalWithTail> animals) {
        AnimalWithTail bigTail = null;
        for (AnimalWithTail animal : animals) {
            if (bigTail == null || bigTail.getTailLength() < animal.getTailLength()) {
                bigTail = animal;

            }
        }
        return bigTail;
    }

    public AnimalWithTail getSmallerTailAnimal(List<? extends AnimalWithTail> animals) {
        AnimalWithTail smallerTail = null;
        for (AnimalWithTail animal : animals) {
            if (smallerTail == null || smallerTail.getTailLength() > animal.getTailLength())
                smallerTail = animal;
        }
        return smallerTail;
    }


    public AnimalWithWings getBiggerWingspanAnimal(List<? extends AnimalWithWings> animals) {
        AnimalWithWings bigWingspan = null;
        for (AnimalWithWings animal : animals) {
            if (bigWingspan == null || bigWingspan.getWingspan() < animal.getWingspan()) {
                bigWingspan = animal;

            }
        }
        return bigWingspan;
    }


    public AnimalWithWings getSmallerrWingspanAnimal(List<? extends AnimalWithWings> animals) {
        AnimalWithWings smallWingspan = null;
        for (AnimalWithWings animal : animals) {
                if (smallWingspan == null || smallWingspan.getWingspan() < animal.getWingspan()) {
                    smallWingspan = animal;

                }
            }
        return smallWingspan;

    }

    public List<AnimalWithTail> mergeAnimalsWithTail(List<? extends AnimalWithTail>... animals){
        List<AnimalWithTail> allAnimals = new ArrayList<>();
        for(List<? extends AnimalWithTail> animalWithTails : animals){
            allAnimals.addAll(animalWithTails);

        }
        return allAnimals;
    }

    public List<AnimalWithWings> mergeAnimalsWithWings(List<? extends AnimalWithWings>... animals){
        List<AnimalWithWings> allAnimals = new ArrayList<>();
        for(List<? extends AnimalWithWings> animalWithWings : animals){
            allAnimals.addAll(animalWithWings);

        }
        return allAnimals;
    }

}
