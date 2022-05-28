package org.sofka.animals.utilities;

import org.sofka.animals.utilities.abstracts.AnimalAbstract;
import org.sofka.animals.utilities.interfaces.CatInterface;

/** 
 * Esta clase define a un gato que extiende de la superclase animal
 * @author Mauricio Gómez
 * @version 1.0.0
*/
public class Cat extends AnimalAbstract implements CatInterface {

    private String color;
    private String breed;
    private static String type = "Walk";
    private static String feeding = "carnivorous";  

    static MessagesAnimal message = MessagesAnimal.getInstance();

    /**
     * Constructor para la clase Gato
     * @param size es el tamaño del gato (grande, mediano, pequeño)
     * @param color es el color del gato
     * @param breed es la raza del gato
     */
    public Cat(String size, String color, String breed) {
        super(type,feeding, size);
        this.color = color;
        this.breed = breed;
    }

    /**
     * Método que devuelve el color del gato
     * @return el color del gato
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para establecer el color del gato
     * @param color es el color del gato
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que devuelve la raza del gato
     * @return la raza del gato
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Método para establecer la raza del gato
     * @param breed la raza del gato
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Metodo que muestra el comportamiento de maullar
     */
    @Override
    public void meow() {
        message.showMeow();
        
    }

    /**
     * Metodo que muestra el comportamiento de jugar
     */
    @Override
    public void play() {
        message.showPlay();
        
    }

    /**
     * Metodo que muestra el comportamiento de  escalar
     */
    @Override
    public void climb() {
        message.showClimb();
        
    }

    /**
     * Metodo que muestra el comportamiento de cazar
     */
    @Override
    public void hunt() {
        message.showHunt();
        
    }


    /**
     * Metodo que muestra el comportamiento de moverse
     */
    public void move() {
        message.showMove("Cat", type);
    }

    /**
     * Metodo que muestra el comportamiento de Comer
     */
    public void feed() {
        message.showFeed("Cat", "cat food");
    }
    
}
