package com.company;

public class Fish {
    private String name1; // дельфин
    private String colors; // полосатый дельфин
    private String family; // delphinidae
    private byte age1; // возраст 45 лет
    private float weight1; // масса 4000 кг или 4 тонна

    public Fish(String name1, String colors, String family, byte age1, float weight1){
        this.name1 = name1;
        this.colors = colors;
        this.family = family;
        this.age1 = age1;
        this.weight1 = weight1;
    }
    public String getName1(){
        return name1;
    }
    public String getFamily(){
        return family;
    }
    public String getColors(){
        return colors;
    }
    public byte getAge1(){
        return age1;
    }
    public float getWeight1(){
        return weight1;
    }

}
