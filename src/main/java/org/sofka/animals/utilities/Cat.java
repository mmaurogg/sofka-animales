package org.sofka.animals.utilities;

import org.sofka.animals.utilities.abstracts.AnimalAbstract;
import org.sofka.animals.utilities.interfaces.CatInterface;

public class Cat extends AnimalAbstract implements CatInterface {

    private String color;
    private String breed;
    private static String type = "Walk";
    private static String feeding = "carnivorous";  

    static MessagesAnimal message = MessagesAnimal.getInstance();

    public Cat(String size, String color, String breed) {
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
    public void meow() {
        message.showMeow();
        
    }

    @Override
    public void play() {
        message.showPlay();
        
    }

    @Override
    public void climb() {
        message.showClimb();
        
    }

    @Override
    public void hunt() {
        message.showHunt();
        
    }

    // abstract methos

    public void move() {
        message.showMove("Cat", type);
    }

    public void feed() {
        message.showFeed("Cat", "cat food");
    }
    
}
