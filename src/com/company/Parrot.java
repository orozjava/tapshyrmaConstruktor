package com.company;

public class Parrot {
    private String name2; // какаду
    private String color2; // белый
    private byte age2; // 15 лет
    private int weight2; //1 кг

    public Parrot(String name2, String color2, byte age2, int weight2){
        this.name2 = name2;
        this.color2 = color2;
        this.age2 = age2;
        this.weight2 = weight2;
    }



    public String getName2(){
        return name2;
    }

    public String getColor2(){
        return color2;
    }

    public byte getAge2() {
        return age2;
    }

    public int getWeight2() {
        return weight2;
    }
}
