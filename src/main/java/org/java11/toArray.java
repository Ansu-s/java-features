package org.java11;

import java.util.ArrayList;
import java.util.Arrays;

public class toArray {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,76);
        System.out.println(list);
        Integer[] intlist = list.toArray(size ->new Integer[size]);
        Integer[] intlist1 = list.toArray(Integer[] ::new);

        System.out.println(Arrays.toString(intlist));
        System.out.println(Arrays.toString(intlist));
        System.out.println(Arrays.toString(intlist1));

    }
}