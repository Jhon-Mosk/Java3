package Lesson_1;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.util.HashMap;

public class Box {

    private Object obj;

    public Box(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void info() {
        System.out.println("obj: " + obj);
        System.out.println("type: " + obj.getClass());
    }
}


class BoxInt {
    private Integer obj;

    public BoxInt(Integer obj) {
        this.obj = obj;
    }

    public Integer getObj() {
        return obj;
    }

    public void setObj(Integer obj) {
        this.obj = obj;
    }

    public void info() {
        System.out.println("obj: " + obj);
        System.out.println("type: " + obj.getClass());
    }
}


class BoxUltimate<T> {
    private T obj;

    public BoxUltimate(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void info() {
        System.out.println("obj: " + obj);
        System.out.println("type: " + obj.getClass());
    }
}

class TwoGen<T, V> {
    private T obj1;
    private V obj2;

    public TwoGen(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void showTypes() {
        System.out.println("Тип T: " + obj1.getClass().getName());
        System.out.println("Тип V: " + obj2.getClass().getName());
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }
}




class Stats1<T extends Number> {
    private T[] nums;

    public Stats1(T[] nums) {
        this.nums = nums;
    }

    public double avg() {
        double sum = 0.0;
        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i].doubleValue();
        }
        return  sum/nums.length;
    }

    public boolean sameAvg(Stats<?> another) {
        return Math.abs(this.avg() - another.avg()) < 0.01;
    }
}


class Main {
    public static void main(String[] args) {


        Integer[] inums = {1,2,3,4,5};
        Double[] dnums = {1.0,20.0,3.0,4.0,5.0};

        Stats<Integer> iob = new Stats<Integer>(inums);
        Stats<Double> iod = new Stats<Double>(dnums);

        if(iob.sameAvg(iod)) {
            System.out.println("Средние значения одинаковы!");
        } else {
            System.out.println("Средние значения различны!");
        }


//        String[] imass = {"Star1","asd"};
//        Stats<String> istats = new Stats<String>(imass);
//        double res = istats.avg();
//        System.out.println("Среднее значение равно " + res);















//        TwoGen<Integer, String> twoGen = new TwoGen<Integer, String>(555, "Hello");
//
//        twoGen.showTypes();
//
//        int intValue = twoGen.getObj1();
//        String strValue = twoGen.getObj2();
//
//        System.out.println(intValue);
//        System.out.println(strValue);


//        BoxUltimate<String> bStr = new BoxUltimate<String>("Hello");
//        BoxUltimate<Integer> iStr = new BoxUltimate<Integer>(10);
//
//        bStr.info();
//        iStr.info();


//        int x = 10;
//        x = x + (Integer) iStr.getObj();
//        System.out.println("x = " + x);
//
//        Box box1 = new Box(1);
//        BoxInt box2 = new BoxInt(20);
//
//        box1.info();
//        box2.info();
//
//        int x = 10;
//        x = x + (Integer) box2.getObj();
//        System.out.println("x = " + x);
    }
}