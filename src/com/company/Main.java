package com.company;

public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish("Дельфин", "полосатый дельфин", "delphinidae",
                (byte) 45, 4.000F);
        System.out.println("имя = " + fish.getName1() + " \n" + "цвет = " + fish.getColors() +  " \n" + "семейства = " + fish.getFamily());
        System.out.println("возраст = " + fish.getAge1() + " лет" + " \n" + "вес = " + fish.getWeight1() + " кг");
        System.out.println();

        Parrot parrot = new Parrot("Какаду", "белый", (byte) 15, 1200);
        System.out.println("имя = " + parrot.getName2() + " \n" + "цвет = " + parrot.getColor2());
        System.out.println("возраст = " + parrot.getAge2() + " лет" + " \n" + "вес = " + parrot.getWeight2() + " кг");
        System.out.println();

        Cat cat = new Cat("Pepa", "black", "bombay cat", (byte) 15, 4.4);
        System.out.println("имя = " + cat.getName() + " \n" + "цвет = " + cat.getColor() +  " \n" + "семейства = " + cat.getBreed());
        System.out.println("возраст = " + cat.getAge() + " лет" + " \n" + "вес = " + cat.getWeight() + " кг");
        System.out.println();

        Dog dog = new Dog("Bobik", "коричневый", "овчарка", (short) 5, 5.5);
        System.out.println("имя = " + dog.getNickName() + " \n" + "цвет = " + dog.getColor() +  " \n" + "семейства = " + dog.getTheFamily());
        System.out.println("возраст = " + dog.getAge() + " лет" + " \n" + "вес = " + dog.getTheWeight() + " кг");






    }
}
