package org.sofka.animals.utilities.ui;

import org.sofka.animals.utilities.Dog;
import org.sofka.animals.utilities.MessagesAnimal;
import org.sofka.animals.utilities.MyScanner;

/** 
 * Esta clase Extiende el menú y lista los comportamientos de un perro para seleccionarlo
 * @author Mauricio Gómez
 * @version 1.0.0
*/
public class DogMenu {
    
    static MessagesAnimal message = MessagesAnimal.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    
    /**
     * Funcion que enlista las acciones que puede realizar el perro
     * @param dog Perro creado en el menu anterior en la clase Menu
     */
    public static void actionDog(Dog dog) {

        int option = 0;
        do {
            message.showActionDog();
            option = scanner.getInteger();

            switch(option){
                case 1:
                    dog.bark();
                    break;
                
                case 2:
                    dog.trick();
                    break;
                
                case 3:
                    dog.alert();
                    break;

                case 4:
                    dog.move();
                    break;

                case 5:
                    dog.feed();
                    break;

                case 0:
                    message.showBye();
                    break;
            }

        } while (option != 0);

    }
}
