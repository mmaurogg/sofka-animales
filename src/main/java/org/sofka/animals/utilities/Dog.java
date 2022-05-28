package org.sofka.animals.utilities;

import org.sofka.animals.utilities.abstracts.AnimalAbstract;
import org.sofka.animals.utilities.interfaces.DogInterface;

public class Dog extends AnimalAbstract implements DogInterface {
    
    private String color;
    private String breed;
    private static String type = "Walk";
    private static String feeding = "carnivorous";

    static MessagesAnimal message = MessagesAnimal.getInstance();


    public Dog(String size, String color, String breed) {
        super(type,feeding, size);
        this.color = color;
        this.breed = breed;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public void bark() {
        message.showBark();
    }


    @Override
    public void trick() {
        message.showTrick();
    }


    @Override
    public void alert() {
        message.showAlert();
    }


    // Abstract Methos


    public void move() {
        message.showMove("Dog", type);
    }


    public void feed() {
        message.showFeed("Dog", "Dog food");
    }  


}
