package ru.geekbrains.homework4;

import java.util.ArrayList;

public class Box<T extends Fruct> {

    ArrayList<T> fructs;
    float weight;

    public Box() {
        this.fructs = new ArrayList<>();
    }

    public void add (T fruct) {
        if (fructs.isEmpty() || fruct.getClass() == fructs.get(0).getClass()) {
            fructs.add(fruct);
            weight += fruct.getWeight();
        } else {
            System.out.println("Нельзя добавить другой вид фруктов в коробку");
        }
    }

    public float getWeight() {
        return weight;
    }

    public boolean compare (Box<T> oneBox) {
        return oneBox.getWeight() == this.getWeight();
    }

    public void pour (Box<T> box) {
        for (T fruct : fructs) {
            box.add(fruct);
        }
        fructs.clear();
        weight = 0;
    }

}
