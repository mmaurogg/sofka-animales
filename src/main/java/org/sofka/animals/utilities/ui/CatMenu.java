package org.sofka.animals.utilities.ui;

import org.sofka.animals.utilities.Cat;
import org.sofka.animals.utilities.MessagesAnimal;
import org.sofka.animals.utilities.MyScanner;

/** 
 * Esta clase Extiende el menú y lista los comportamientos de un gato para seleccionarlo
 * @author Mauricio Gómez
 * @version 1.0.0
*/
public class CatMenu {
    
    static MessagesAnimal message = MessagesAnimal.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Funcion que enlista las acciones que puede realizar el gato
     * @param cat Gato creado en el menu anterior en la clase Menu
     */
    public static void actionCat( Cat cat ){

        int option = 0;
        do {
            message.showActionDog();
            option = scanner.getInteger();

            switch(option){
                case 1:
                    cat.meow();
                    break;
                
                case 2:
                    cat.play();
                    break;
                
                case 3:
                    cat.climb();
                    break;

                case 4:
                    cat.hunt();;
                    break;

                case 5:
                    cat.move();
                    break;
                
                case 6:
                    cat.feed();
                    break;

                case 0:
                    message.showBye();
                    break;
            }

        } while (option != 0);

        
    }
}
