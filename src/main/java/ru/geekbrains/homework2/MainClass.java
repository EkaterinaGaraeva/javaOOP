package ru.geekbrains.homework2;

import ru.geekbrains.homework1.Product;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 50);
        Cat cat2 = new Cat("Businka", 30);
        Cat cat3 = new Cat("Simba", 70);
        Cat cat4 = new Cat("Belka", 10);
        Cat cat5 = new Cat("Pusha", 40);
        Plate plate = new Plate(100);
        plate.info();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        for (Cat cat : cats) {
            if (plate.getFood() >= cat.getAppetite() && !cat.getSatiety()) {
                cat.eat();
                cat.setSatiety(true);
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
        }

        for (Cat cat : cats) {
            if (cat.getSatiety()) {
                System.out.printf("%s сыт(а)\n", cat.getName());
            } else {
                System.out.printf("%s все еще голоден(а)\n", cat.getName());
            }
        }

        plate.info();

        plate.addFood(100);

        plate.info();

        for (Cat cat : cats) {
            if (plate.getFood() >= cat.getAppetite() && !cat.getSatiety()) {
                cat.eat();
                cat.setSatiety(true);
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
        }

        for (Cat cat : cats) {
            if (cat.getSatiety()) {
                System.out.printf("%s сыт(а)\n", cat.getName());
            } else {
                System.out.printf("%s все еще голоден(а)\n", cat.getName());
            }
        }

        plate.info();

    }
}
