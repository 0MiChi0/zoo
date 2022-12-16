package main.java.com.smarmellearning.zoo.model;

import java.time.LocalDate;

public class Tiger extends AnimalWithTail {

    public Tiger(String name, String favoriteFood, Integer age, LocalDate dateOfEntry, Double weight, Double height, Double tailLength) {
        super(name, favoriteFood, age, dateOfEntry, weight, height, tailLength);
    }
}
