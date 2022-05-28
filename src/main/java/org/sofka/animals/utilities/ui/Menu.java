package org.sofka.animals.utilities.ui;

import org.sofka.animals.utilities.Cat;
import org.sofka.animals.utilities.Dog;
import org.sofka.animals.utilities.MessagesAnimal;
import org.sofka.animals.utilities.MyScanner;

public class Menu {

    static MessagesAnimal message = MessagesAnimal.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    
    public static void showMenu() {

        Dog dog;
        Cat cat;

        message.showWelcome();

        int option = 0;
        do {
            message.showAnimalsOption();
            option = scanner.getInteger();

            if(option == 0){
                message.showBye();
                continue;
            }

            message.showAskSize();
            String size = scanner.getString();
            message.showAskColor();
            String color = scanner.getString();
            message.showAskBreed();
            String breed = scanner.getString();

            switch (option) {
                case 1:
                    dog = new Dog(size, color, breed);
                    DogMenu.actionDog(dog);
                    break;

                case 2: 
                    cat = new Cat(size, color, breed);
                    CatMenu.actionCat(cat);
                    break;

            }

        } while (option != 0);

    }

    

}
