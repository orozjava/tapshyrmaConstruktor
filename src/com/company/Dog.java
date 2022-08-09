package com.company;

public class Dog {
    private String nickName;
    private String color;
    private String theFamily;
    private short age;
    private double theWeight;

    public Dog(String nickName, String color, String theFamily, short age, double theWeight){
        this.nickName = nickName;
        this.color = color;
        this.theFamily = theFamily;
        this.age = age;
        this.theWeight = theWeight;
    }

    public String getNickName(){
        return nickName;
    }

    public String getColor() {
        return color;
    }

    public String getTheFamily(){
        return theFamily;
    }

    public short getAge() {
        return age;
    }

    public double getTheWeight() {
        return theWeight;
    }
}
