package main.java.com.smarmellearning.zoo.bootstrap;


import main.java.com.smarmellearning.zoo.model.Animal;
import main.java.com.smarmellearning.zoo.model.Eagle;
import main.java.com.smarmellearning.zoo.model.Lion;
import main.java.com.smarmellearning.zoo.model.Tiger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    List<Eagle> eagles = Arrays.asList(new Eagle("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Eagle("Ika", "pizza", 23, LocalDate.now(), 3.8,3.5, 1.3),
            new Eagle("Mir", "pizza", 25, LocalDate.now(), 3.7,3.4, 1.2));
    List<Lion> lions = Arrays.asList(new Lion("Mar", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Lion("Ika", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Lion("Mir", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));
    List<Tiger> tigers = Arrays.asList(new Tiger("TigreMar", "pizza", 22, LocalDate.now(), 3.6,3.8, 1.8),
            new Tiger("TigreIka", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8),
            new Tiger("TigreMir", "pizza", 22, LocalDate.now(), 3.6,3.6, 1.8));

    public Zoo() {
    }

    public List<Eagle> getEagles() {
        return eagles;
    }

    public void setEagles(List<Eagle> eagles) {
        this.eagles = eagles;
    }

    public List<Lion> getLions() {
        return lions;
    }

    public void setLions(List<Lion> lions) {
        this.lions = lions;
    }

    public List<Tiger> getTigers() {
        return tigers;
    }

    public void setTigers(List<Tiger> tigers) {
        this.tigers = tigers;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "eagles=" + eagles +
                ", lions=" + lions +
                ", tigers=" + tigers +
                '}';
    }
}
