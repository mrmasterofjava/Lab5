package org.example;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private int height; //Значение поля должно быть больше 0
    private EyeColor eyeColor; //Поле не может быть null
    private HairColor hairColor; //Поле может быть null
    private Country nationality; //Поле может быть null

    public Person(String name, int height, EyeColor eyeColor, HairColor hairColor, Country nationality){
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.nationality = nationality;
    }
 }


