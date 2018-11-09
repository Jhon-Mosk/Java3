package Dz1.FruitBox;

public class Action {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box box1 = new Box();
        box1.addFruit(apple);
        box1.addFruit(apple);
        box1.addFruit(apple);
        box1.addFruit(orange);
        box1.getWeight();

        Box box2 = new Box();
        box2.addFruit(orange);
        box2.addFruit(orange);
        box2.addFruit(apple);
        box2.getWeight();

        Box box3 = new Box();

        Box box4 = new Box();
        box4.addFruit(apple);

        box1.compare(box2);

        box1.move(box2);

        box1.move(box4);

        box4.move(box3);
    }
}
