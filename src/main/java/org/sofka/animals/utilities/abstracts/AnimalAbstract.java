package org.sofka.animals.utilities.abstracts;

public abstract class AnimalAbstract {
    
    private String type;
    private String feeding;
    private String size;


    public AnimalAbstract(String type, String feeding, String size) {
        this.type = type;
        this.feeding = feeding;
        this.size = size;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public abstract void move();

    public abstract void feed();

}
