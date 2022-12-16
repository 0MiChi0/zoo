package main.java.com.smarmellearning.zoo.utils;

import main.java.com.smarmellearning.zoo.model.Animal;
import main.java.com.smarmellearning.zoo.model.AnimalWithTail;
import main.java.com.smarmellearning.zoo.model.AnimalWithWings;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static Animal getTallestAnimal(List<Animal> animals) {
        Animal tallest = null;
        for (Animal animal : animals) {
            if (tallest == null || tallest.getHeight() < animal.getHeight())
                tallest = animal;
        }
        return tallest;
    }

    public static Animal getShortestAnimal(List<Animal> animals) {
        Animal shortest = null;
        for (Animal animal : animals) {
            if (shortest == null || shortest.getHeight() > animal.getHeight())
                shortest = animal;
        }
        return shortest;
    }

    public static Animal getHeavierAnimal(List<Animal> animals) {
        Animal heavier = null;
        for (Animal animal : animals) {
            if (heavier == null || heavier.getWeight() < animal.getWeight())
                heavier = animal;
        }
        return heavier;
    }

    public static Animal getLighterAnimal(List<Animal> animals) {
        Animal lighter = null;
        for (Animal animal : animals) {
            if (lighter == null || lighter.getWeight() > animal.getWeight())
                lighter = animal;
        }
        return lighter;
    }

    public static AnimalWithTail getBiggerTailAnimal(List<Animal> animals) {
        AnimalWithTail bigTail = null;
        for (Animal animal : animals) {
            if (animal instanceof AnimalWithTail) {
                AnimalWithTail animalWithTail = (AnimalWithTail) animal;
                if (bigTail == null || bigTail.getTailLength() < animalWithTail.getTailLength()) {
                    bigTail = animalWithTail;

                }
            }
        }
        return bigTail;
    }

    public static AnimalWithTail getSmallerTailAnimal(List<Animal> animals) {
        AnimalWithTail smallerTail = null;
        for (Animal animal : animals) {
            if (animal instanceof AnimalWithTail) {
                AnimalWithTail animalWithTail = (AnimalWithTail) animal;
                if (smallerTail == null || smallerTail.getTailLength() > animalWithTail.getTailLength())
                    smallerTail = animalWithTail;
            }
        }
        return smallerTail;
    }


    public static AnimalWithWings getBiggerWingspanAnimal(List<Animal> animals) {
        AnimalWithWings bigWingspan = null;
        for (Animal animal : animals) {
            if (animal instanceof AnimalWithWings) {
                AnimalWithWings animalWithWings = (AnimalWithWings) animal;
                if (bigWingspan == null || bigWingspan.getWingspan() < animalWithWings.getWingspan()) {
                    bigWingspan = animalWithWings;

                }
            }
        }
        return bigWingspan;
    }


    public static AnimalWithWings getSmallerrWingspanAnimal(List<Animal> animals) {
        AnimalWithWings smallWingspan = null;
        for (Animal animal : animals) {
            if (animal instanceof AnimalWithWings) {
                AnimalWithWings animalWithWings = (AnimalWithWings) animal;
                if (smallWingspan == null || smallWingspan.getWingspan() < animalWithWings.getWingspan()) {
                    smallWingspan = animalWithWings;

                }
            }
        }
        return smallWingspan;

    }

}
