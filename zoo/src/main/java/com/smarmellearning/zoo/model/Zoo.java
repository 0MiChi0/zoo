package main.java.com.smarmellearning.zoo.model;


import main.java.com.smarmellearning.zoo.model.Animal;
import main.java.com.smarmellearning.zoo.model.Eagle;
import main.java.com.smarmellearning.zoo.model.Lion;
import main.java.com.smarmellearning.zoo.model.Tiger;

import java.time.LocalDate;
import java.util.*;

public class Zoo {

    private Map<Class<? extends Animal>, List<Animal>> animalMap = new HashMap<>();

    public void initializeZoo(){
        List<Animal> eagles = new ArrayList<>();
        List<Animal> tigers = new ArrayList<>();
        List<Animal> lions = new ArrayList<>();

        eagles.add(new Eagle("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));
        eagles.add(new Eagle("Ika", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));
        eagles.add(new Eagle("Mir", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));

        lions.add(new Lion("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));
        lions.add(new Lion("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));
        lions.add(new Lion("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));

        tigers.add(new Tiger("TigreMar", "pizza", 22, LocalDate.now(), 3.6,3.8, 1.8));
        tigers.add(new Tiger("TigreMar", "pizza", 22, LocalDate.now(), 3.6,3.8, 1.8));
        tigers.add(new Tiger("TigreMar", "pizza", 22, LocalDate.now(), 3.6,3.8, 1.8));

        animalMap.put(Eagle.class, eagles);
        animalMap.put(Lion.class, lions);
        animalMap.put(Tiger.class, tigers);
    }

    public Zoo() {
    }

    public Map<Class<? extends Animal>, List<Animal>> getAnimalMap() {
        return animalMap;
    }

    public void setAnimalMap(Map<Class<? extends Animal>, List<Animal>> animalMap) {
        this.animalMap = animalMap;
    }


    public void addAnimalToZoo (Animal animal) {
        List <Animal> animals = animalMap.get(animal.getClass());
        if(animals==null){
            animals = new ArrayList<>();
            animals.add(animal);
            animalMap.put(animal.getClass(), animals);
        }else{
            animals.add(animal);
        }
    }

    public void addAnimalToZooV2 (Animal animal){
        List <Animal> animals = animalMap.putIfAbsent(animal.getClass(), new ArrayList<>());
        animals.add(animal);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animalMap=" + animalMap +
                '}';
    }
}
