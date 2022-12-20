package main.java.com.smarmellearning.zoo.model;

import java.time.LocalDate;

public abstract class AnimalWithTail extends Animal {

    private Double tailLength;

    public AnimalWithTail(String name, String favoriteFood, Integer age, LocalDate dateOfEntry, Double weight, Double height, Double tailLength) {
        super(name, favoriteFood, age, dateOfEntry, weight, height);
        this.tailLength = tailLength;
    }

    public Double getTailLength() {
        return tailLength;
    }

    public void setTailLength(Double tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "AnimalWithTail{" +
                "name=" + super.getName() + " " +
                "weight" + super.getWeight() + " " +
                "height" + super.getHeight() + " " +
                "tailLength=" + tailLength +
                '}';
    }
}
