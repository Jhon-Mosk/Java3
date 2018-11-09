package Dz1;

import java.util.*;

public class TestArray {
    public static void main(String[] args) {
        String [] strArray = {"one","two","three","four","five","six","seven"};
        Array arr = new Array(strArray);
        arr.permutation(1,4);
        arr.toArrayList();
    }

}
