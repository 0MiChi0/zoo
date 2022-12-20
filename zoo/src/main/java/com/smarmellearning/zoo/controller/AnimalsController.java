package main.java.com.smarmellearning.zoo.controller;

import main.java.com.smarmellearning.zoo.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalsController {


    public Animal getTallestAnimal(List<? extends Animal> animals) throws Exception {
        if(animals==null){
            throw new Exception("Animals in input are not correct!");
        }
        Animal tallest = null;
        for (Animal animal : animals) {
            if (tallest == null || tallest.getHeight() < animal.getHeight())
                tallest = animal;
        }
        return tallest;

    }

    public Animal getShortestAnimal(List<? extends Animal> animals) throws Exception {
        if(animals==null){
            throw new Exception("Animals in input are not correct!");
        }
        Animal shortest = null;
        for (Animal animal : animals) {
            if (shortest == null || shortest.getHeight() > animal.getHeight())
                shortest = animal;
        }
        return shortest;
    }

    public Animal getHeavierAnimal(List<? extends Animal> animals) throws Exception {
        if(animals==null){
            throw new Exception("Animals in input are not correct!");
        }
        Animal heavier = null;
        for (Animal animal : animals) {
            if (heavier == null || heavier.getWeight() < animal.getWeight())
                heavier = animal;
        }
        return heavier;
    }

    public Animal getLighterAnimal(List<? extends Animal> animals) throws Exception {
        if(animals==null){
            throw new Exception("Animals in input are not correct!");
        }
        Animal lighter = null;
        for (Animal animal : animals) {
            if (lighter == null || lighter.getWeight() > animal.getWeight())
                lighter = animal;
        }
        return lighter;
    }


    public AnimalWithTail getBiggerTailAnimal(List<Animal>... animals) throws Exception {
        AnimalWithTail bigTail = null;
        for(List<Animal> animalList : animals){
            for (Animal animal : animalList) {
                if (animal instanceof AnimalWithTail){
                    AnimalWithTail animalWithTail = (AnimalWithTail) animal;
                    if (bigTail == null || bigTail.getTailLength() < animalWithTail.getTailLength()) {
                        bigTail = animalWithTail;
                    }
                }else{
                    throw new Exception("Animals in input are not correct!");
                }
            }
        }
        return bigTail;
    }

    public AnimalWithTail getSmallerTailAnimal(List<Animal>... animals) throws Exception {
        AnimalWithTail smallerTail = null;
        for(List<Animal> animalList : animals){
            for (Animal animal : animalList) {
                if (animal instanceof AnimalWithTail){
                    AnimalWithTail animalWithTail = (AnimalWithTail) animal;
                    if (smallerTail == null || smallerTail.getTailLength() > animalWithTail.getTailLength()) {
                        smallerTail = animalWithTail;
                    }
                }else{
                    throw new Exception("Animals in input are not correct!");
                }
            }
        }
        return smallerTail;
    }


    public AnimalWithWings getBiggerWingspanAnimal(List<Animal>... animals) throws Exception {
        AnimalWithWings bigWingspan = null;
        for (List<Animal> animalList : animals) {
            for (Animal animal : animalList) {
                if (animal instanceof AnimalWithWings) {
                    AnimalWithWings animalWithWings = (AnimalWithWings) animal;
                    if (bigWingspan == null || bigWingspan.getWingspan() < animalWithWings.getWingspan()) {
                        bigWingspan = animalWithWings;
                    }
                }else{
                throw new Exception("Animals in input are not correct!");
                }
            }
        }
        return bigWingspan;
    }


    public AnimalWithWings getSmallerWingspanAnimal (List < Animal >...animals) throws Exception {
                AnimalWithWings smallWingspan = null;
                for (List<Animal> animalList : animals) {
                    for (Animal animal : animalList) {
                        if (animal instanceof AnimalWithWings) {
                            AnimalWithWings animalWithWings = (AnimalWithWings) animal;
                            if (smallWingspan == null || smallWingspan.getWingspan() < animalWithWings.getWingspan()) {
                                smallWingspan = animalWithWings;
                            }
                        }else {
                            throw new Exception("Animals in input are not correct!");
                        }
                    }
                }
        return smallWingspan;
    }
}
