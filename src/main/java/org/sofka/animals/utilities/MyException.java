package org.sofka.animals.utilities;

public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Exception exception) {
        super(message, exception);
    }

}
