package main.java.com.smarmellearning.zoo;


import main.java.com.smarmellearning.zoo.bootstrap.Zoo;


public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo =new Zoo();
        System.out.println(zoo.getAnimals().toString());
    }

}
