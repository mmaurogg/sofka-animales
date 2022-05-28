package org.sofka.animals.utilities;

import java.util.Scanner;

public class MyScanner {
    
    protected static final Scanner scanner = new Scanner(System.in);

    public static MyScanner getInstance() {
        return new MyScanner();
    }

    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }

    public Integer getInteger() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }

}
