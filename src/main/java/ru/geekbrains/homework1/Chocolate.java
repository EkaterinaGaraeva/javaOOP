package ru.geekbrains.homework1;

public class Chocolate extends Product{
    private int weight; // вес
    private int caloric; // калорийность

    public int getWeight() {
        return weight;
    }

    public void setWeight(int volume) {
        this.weight = weight;
    }

    public int getCaloric() {
        return caloric;
    }

    public void setCaloric(int fat) {
        this.caloric = caloric;
    }

    public Chocolate(String brand, String name, double price, int weight, int caloric) {
        super(brand, name, price);
        this.weight = weight;
        this.caloric = caloric;

    }

    @Override
    public String displayInfo() {
        return String.format("[ШОКОЛАД] %s - %s - %.2f - вес: %d; калорийность: %d",
                brand, name, price, weight, caloric);
    }

}
