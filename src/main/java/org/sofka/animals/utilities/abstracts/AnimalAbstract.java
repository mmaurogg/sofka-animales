package org.sofka.animals.utilities.abstracts;

/** 
 * Esta es una superclase de animales para que cada tipo de animal pueda heredar de ella
 * @author Mauricio Gómez
 * @version 1.0.0
*/
public abstract class AnimalAbstract {
    
    private String type;
    private String feeding;
    private String size;

    /**
     * Constructor para la clase Animal
     * @param type es el tipo de animal (acuatico, aereo, terrestre)
     * @param feeding es la alimentacion dle animal (carnivoro, omnívoro, herbivoro)
     * @param size es el tamaño del animal (grande, mediano, pequeño)
     */
    public AnimalAbstract(String type, String feeding, String size) {
        this.type = type;
        this.feeding = feeding;
        this.size = size;
    }

    /**
     * Método que devuelve el tipo de animal
     * @return el tipo de animal (acuatico, aereo, terrestre)
     */
    public String getType() {
        return type;
    }

    /**
     * Método que para establecer el tipo de animal
     * @param type es el tipo de animal (acuatico, aereo, terrestre)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Método que devuelve la alimentación del animal
     * @return devuelve el tipo de alimentacion dle animal (carnivoro, omnívoro, herbivoro)
     */
    public String getFeeding() {
        return feeding;
    }

    /**
     * Método para establecer el tipo de alimentación del animal
     * @param feeding alimentacion dle animal (carnivoro, omnívoro, herbivoro)
     */
    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    /**
     * Método que devuelve el tamaño del animal
     * @return el tamaño del animal (grande, mediano, pequeño)
     */
    public String getSize() {
        return size;
    }

    /**
     * Método que establece el tamaño del animal
     * @param size el tamaño del animal (grande, mediano, pequeño)
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Método abstracto para el movimiento del animal
     */
    public abstract void move();

    /**
     * Método abstracto para que el animal se alimente
     */
    public abstract void feed();

}
