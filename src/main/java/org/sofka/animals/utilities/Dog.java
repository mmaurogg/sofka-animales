package org.sofka.animals.utilities;

import org.sofka.animals.utilities.abstracts.AnimalAbstract;
import org.sofka.animals.utilities.interfaces.DogInterface;

/** 
 * Esta clase define a un perro que extiende de la superclase animal
 * @author Mauricio Gómez
 * @version 1.0.0
*/
public class Dog extends AnimalAbstract implements DogInterface {
    
    private String color;
    private String breed;
    private static String type = "Walk";
    private static String feeding = "carnivorous";

    static MessagesAnimal message = MessagesAnimal.getInstance();

    /**
     * Constructor para la clase pero
     * @param size es el tamaño del pero (grande, mediano, pequeño)
     * @param color es el color del pero
     * @param breed es la raza del pero
     */
    public Dog(String size, String color, String breed) {
        super(type,feeding, size);
        this.color = color;
        this.breed = breed;
    }

    /**
     * Método que devuelve el color del perro
     * @return el color del perro
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para establecer el color del perro
     * @param color es el color del perro
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que devuelve la raza del perro
     * @return la raza del perro
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Método para establecer la raza del perro
     * @param breed la raza del perro
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Metodo que muestra el comportamiento de ladrar
     */
    @Override
    public void bark() {
        message.showBark();
    }

    /**
     * Metodo que muestra el comportamiento de hacer un truco
     */
    @Override
    public void trick() {
        message.showTrick();
    }

    /**
     * Metodo que muestra el comportamiento de estar alerta
     */
    @Override
    public void alert() {
        message.showAlert();
    }

    /**
     * Metodo que muestra el comportamiento de moverse
     */
    public void move() {
        message.showMove("Dog", type);
    }

    /**
     * Metodo que muestra el comportamiento de comer
     */
    public void feed() {
        message.showFeed("Dog", "Dog food");
    }  


}
