package org.sofka.animals.utilities;

import org.jboss.logging.Logger;

/** 
 * Esta clase define todos los mensajes que se mostrarán en la app
 * @author Mauricio Gómez
 * @version 1.0.0
*/
public class MessagesAnimal {
    
    private static final Logger logger = Logger.getLogger(MessagesAnimal.class);

    /**
     * Método para instanciar la clase MessagesAnimal
     * @return new MessagesAnimal();
     */
    public static MessagesAnimal getInstance(){
        return new MessagesAnimal();
    }

    /**
     * Método para mostrar mensaje de bienvenida
     */
    public void showWelcome() {
        logger.info("Welcome to your animal creator, Please Choose an option:");
    }

    /**
     * Método para mostrar mensaje elija opcion 1-Perro 2-Gato
     */
    public void showAnimalsOption() {
        logger.info("\n1. Dog\n2. Cat\n0. Exit");
    }

    /**
     * Método para mostrar mensaje para solicitar ingresar el tamaño del perro o gato
     */
    public void showAskSize() {
        logger.info("Enter the size of the animal (big, medium, small):");
    }

    /**
     * Método para mostrar mensaje para solicitar ingresar el color del perro o gato
     */
    public void showAskColor() {
        logger.info("Enter the color of the animal:");
    }

    /**
     * Método para mostrar mensaje para solicitar ingresar la raza del perro o gato
     */
    public void showAskBreed() {
        logger.info("Enter the breed of the animal:");
    }

    /**
     * Método para mostrar mensaje que enlista las acciones de un gato para mostrarla como opciones seleccionables
     */
    public void showActionCat() {
        logger.info("\nChoose an option:\n1. Meow\n2. Play\n3. Climb\n4. Hunt\n5. Move\n6. feed\n0. Return");
    }

    /**
     * Método para mostrar mensaje que enlista las acciones de un perro para mostrarla como opciones seleccionables
     */
    public void showActionDog() {
        logger.info("\nChoose an option:\n1. Bark\n2. trick\n3. Stay Alert\n4. Move\n5. feed\n0. Return");
    }

    /**
     * Método para mostrar mensaje que muestra qué hace el anumal con el comportamiento moverse
     * @param animal es el tipo de animal dado por la clase (perro / gato)
     * @param type  es el tipo de animal (acuatico, aereo, terrestre)
     */
    public void showMove(String animal, String type){
        logger.info("The " + animal + " is " + type + "ing");
    };

    /**
     * Método para mostrar mensaje que muestra qué hace el aniaml con el comportamiento comer
     * @param animal es el tipo de animal dado por la clase (perro / gato)
     * @param food Es el tipo de comida que le darás al animal 
     */
    public void showFeed(String animal, String food){
        logger.info("The " + animal + " is feeding " + food);
    };

    /**
     * Método para mostrar mensaje que muestra qué hace el gato con el comportamiento  maullar
     */
    public void showMeow(){
        logger.info("Meow Meow Meowwww");
    };

    /**
     * Método para mostrar mensaje que muestra qué hace el gato con el comportamiento jugar
     */
    public void showPlay(){
        logger.info("The cat is playing");
    };

    /**
     * Método para mostrar mensaje Método para mostrar mensaje que muestra qué hace el gato con el comportamiento escalar
     */
    public void showClimb(){
        logger.info("The cat is on the refrigerator");
    };

    /**
     * Método para mostrar mensaje Método para mostrar mensaje que muestra qué hace el gato con el comportamiento cazar
     */
    public void showHunt(){
        logger.info("The cat brougth you a mouse");
    };

    /**
     * Método para mostrar mensaje Método para mostrar mensaje que muestra qué hace el perro con el comportamiento ladrar
     */
    public void showBark(){
        logger.info("Roff Roff Roff");
    };

    /**
     * Método para mostrar mensaje que muestra qué hace el perro con el comportamienté hacer un truco
     */
    public void showTrick(){
        logger.info("The dog is sit");
    };

    /**
     * Método para mostrar mensaje que muestra qué hace el perro con el comportamiento alerta
     */
    public void showAlert(){
        logger.info("The dog is alert");
    };

    /**
     * Método para mostrar mensaje de textoq ue sea ingre¿¿sado como parámetro
     * @param message es el texto que se quiere imprimir
     */
    public void showMessage(String message) {
        logger.info(message);
    }

    /**
     * Método para mostrar mensaje de despedida
     */
    public void showBye() {
        logger.info("Ok Bye!");
    }



}
