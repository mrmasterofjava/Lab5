package org.example;

public class Coordinates {
    private double x; //Поле не может быть null
    private double y; //Поле не может быть null

    public Coordinates(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return x + ";" + y;
    }

}
