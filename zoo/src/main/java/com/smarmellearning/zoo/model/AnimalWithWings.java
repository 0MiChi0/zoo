package main.java.com.smarmellearning.zoo.model;

import java.time.LocalDate;

public abstract class AnimalWithWings extends Animal {

    private Double wingspan;

    public AnimalWithWings(String name, String favoriteFood, Integer age, LocalDate dateOfEntry, Double weight, Double height, Double wingspan) {
        super(name, favoriteFood, age, dateOfEntry, weight, height);
        this.wingspan = wingspan;
    }

    public Double getWingspan() {
        return wingspan;
    }

    public void setWingspan(Double wingspan) {
        this.wingspan = wingspan;
    }
}
