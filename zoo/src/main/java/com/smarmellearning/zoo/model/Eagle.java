package main.java.com.smarmellearning.zoo.model;

import java.time.LocalDate;

public class Eagle extends AnimalWithWings {

    public Eagle(String name, String favoriteFood, Integer age, LocalDate dateOfEntry, Double weight, Double height, Double wingspan) {
        super(name, favoriteFood, age, dateOfEntry, weight, height, wingspan);
    }
}
