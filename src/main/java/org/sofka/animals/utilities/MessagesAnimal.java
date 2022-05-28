package org.sofka.animals.utilities;

import org.jboss.logging.Logger;

public class MessagesAnimal {
    
    private static final Logger logger = Logger.getLogger(MessagesAnimal.class);

    public static MessagesAnimal getInstance(){
        return new MessagesAnimal();
    }

    public void showWelcome() {
        logger.info("Welcome to your animal creator, Please Choose an option:");
    }

    public void showAnimalsOption() {
        logger.info("\n1. Dog\n2. Cat\n0. Exit");
    }

    public void showAskSize() {
        logger.info("Enter the size of the animal (big, medium, small):");
    }

    public void showAskColor() {
        logger.info("Enter the color of the animal:");
    }

    public void showAskBreed() {
        logger.info("Enter the breed of the animal:");
    }

    public void showActionCat() {
        logger.info("\nChoose an option:\n1. Meow\n2. Play\n3. Climb\n4. Hunt\n5. Move\n6. feed\n0. Return");
    }

    public void showActionDog() {
        logger.info("\nChoose an option:\n1. Bark\n2. trick\n3. Stay Alert\n4. Move\n5. feed\n0. Return");
    }

    public void showMove(String animal, String type){
        logger.info("The " + animal + " is " + type + "ing");
    };

    public void showFeed(String animal, String food){
        logger.info("The " + animal + " is feeding " + food);
    };

    public void showMeow(){
        logger.info("Meow Meow Meowwww");
    };

    public void showPlay(){
        logger.info("The cat is playing");
    };

    public void showClimb(){
        logger.info("The cat is on the refrigerator");
    };

    public void showHunt(){
        logger.info("The cat brougth you a mouse");
    };

    public void showBark(){
        logger.info("Roff Roff Roff");
    };

    public void showTrick(){
        logger.info("The dog is sit");
    };

    public void showAlert(){
        logger.info("The dog is alert");
    };

    public void showMessage(String message) {
        logger.info(message);
    }

    public void showBye() {
        logger.info("Ok Bye!");
    }



}
