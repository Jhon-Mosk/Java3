package Dz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Array<T> {
//    int[] arr;
    private T[] array;

    Array(T[] o ) {//int[] x
        this.array = o;
//        this.arr = x;
    }

List<T> toArrayList(){
    List<T> listOfT = new ArrayList<T>();// не знал можно ли использовать существующие методы, написал свой
    for (int i = 0; i <array.length ; i++) {
        listOfT.set(i, array[i]);
    }
    System.out.println("Successful");
    return listOfT;
}

    private void info(T[] array){
        System.out.println(Arrays.toString(array));
    }

    void permutation(int index1, int index2) {
        info(array);
        for (int i = 0; i < array.length; i++) {
            if (index1 > array.length || index2 > array.length) {
                System.out.println("Array is shorter");
            } else if (i == index1) {
                T temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
            }
        }
        info(array);
    }
}

