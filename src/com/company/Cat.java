package com.company;

public class Cat {
    private String name;
    private String color;
    private String breed;
    private byte age;
    private double weight;


    public Cat(String name, String color, String breed, byte age, double weight){
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }



    String getName () {
        return name;
    }

    String getColor () {
        return color;
    }

    String getBreed () {
        return breed;
    }

    byte getAge () {
        return age;
    }

    double getWeight () {
        return weight;
    }
}
