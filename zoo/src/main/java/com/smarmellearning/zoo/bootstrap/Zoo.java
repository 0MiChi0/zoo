package main.java.com.smarmellearning.zoo.bootstrap;


import main.java.com.smarmellearning.zoo.model.Animal;
import main.java.com.smarmellearning.zoo.model.Eagle;
import main.java.com.smarmellearning.zoo.model.Lion;
import main.java.com.smarmellearning.zoo.model.Tiger;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    List<Animal> animals = Arrays.asList(new Eagle("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Eagle("Ika", "pizza", 23, LocalDate.now(), 3.8,3.5, 1.3),
            new Eagle("Mir", "pizza", 25, LocalDate.now(), 3.7,3.4, 1.2),
            new Lion("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Lion("Ika", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Lion("Mir", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Tiger("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Tiger("Ika", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Tiger("Mir", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));

    public Zoo() {
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
