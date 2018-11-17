package Dz1.FruitBox;

import java.util.ArrayList;
import java.util.Arrays;

import static java.awt.Color.orange;

class Box<T extends Fruit> {
    private ArrayList<T> box;

    Box() {

        this.box = new ArrayList<T>();
    }

    float getWeight() {
        float weight = box.get(0).weight * box.size();
        System.out.println("Вес коробки " + weight);
        return weight;
    }

    void addFruit(Fruit fruit) {
        if (box.contains(fruit) || box.isEmpty()) {
            this.box.add((T) fruit);
        } else {
            System.out.println(fruit.type+ " добавить нельзя, в этой коробке " + this.box.get(0).type);
        }
    }

    boolean compare(Box<T> another) {
        if (this.getWeight() == another.getWeight()) {
            System.out.println("Коробки весят одинаково");
            return true;
        } else {
            System.out.println("Одна из коробок тяжелее");
        }
        return false;
    }

    void move(Box<T> another) {
        if (another.box.isEmpty() || box.get(0).type.equalsIgnoreCase(another.box.get(0).type)) {
            another.box.addAll(box);
            box.clear();
            System.out.println("Фрукты пересыпали");
        } else {
            System.out.println("Фрукты смешивать нельзя!");
        }
    }

    void info (){
        for (int i = 0; i <box.size() ; i++) {
            System.out.println(box.get(i).type);
        }
    }
}
