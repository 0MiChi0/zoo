package main.java.com.smarmellearning.zoo.model;

import java.time.LocalDate;

public class Lion extends AnimalWithTail {


    public Lion(String name, String favoriteFood, Integer age, LocalDate dateOfEntry, Double weight, Double height, Double tailLength) {
        super(name, favoriteFood, age, dateOfEntry, weight, height, tailLength);
    }
}
