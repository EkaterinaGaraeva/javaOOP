package ru.geekbrains.homework4;

import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект
        * */
    public static void main(String[] args) {
        Box<Fruct> box1 = new Box<>();
        Box<Fruct> box2 = new Box<>();
        Box<Fruct> box3 = new Box<>();
        Box<Fruct> box4 = new Box<>();

        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        System.out.printf("Вес первой коробки = %2s\n", box1.getWeight());

        box2.add(new Apple());
        box2.add(new Apple());

        System.out.printf("Вес второй коробки = %2s\n", box2.getWeight());

        box3.add(new Orange());
        box3.add(new Orange());

        System.out.printf("Вес третьей коробки = %2s\n", box3.getWeight());

        box4.add(new Orange());
        box4.add(new Orange());
        box4.add(new Orange());

        System.out.printf("Вес четвертой коробки = %2s\n", box4.getWeight());

        System.out.printf("Сравнение 1 и 3 коробки = %2s\n", box1.compare(box3));
        System.out.printf("Сравнение 2 и 4 коробки = %2s\n", box2.compare(box4));

        box1.pour(box2);
        System.out.println();
        System.out.printf("Вес первой коробки = %2s\n", box1.getWeight());
        System.out.printf("Вес второй коробки = %2s\n", box2.getWeight());

        System.out.println();
        box1.add(new Apple());
        box1.add(new Orange());
        System.out.printf("Вес первой коробки = %2s\n", box1.getWeight());

    }

}
