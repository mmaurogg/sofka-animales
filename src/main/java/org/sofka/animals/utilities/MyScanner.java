package org.sofka.animals.utilities;

import java.util.Scanner;

/** 
 * Por medio de esta clase se accede a todos los métodos de escaner de la app
 * @author Mauricio Gómez
 * @version 1.0.0
*/
public class MyScanner {
    
    protected static final Scanner scanner = new Scanner(System.in);

    /**
     * Método para crear una instancia de MyScanner
     * @return new MyScanner();
     */
    public static MyScanner getInstance() {
        return new MyScanner();
    }

    /**
     * Método para capturar datos de entrada de consola y devolverlos en formato String
     * @return dato en formato String
     */
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new MyException(exception.getMéssage(), exception);
        }
    }

    /**
     * Método para capturar datos de entrada de consola y devolverlos en formato Integer
     * @return dato en formato Integer
     */
    public Integer getInteger() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }

}
