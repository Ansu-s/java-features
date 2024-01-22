package org.java17;

import java.util.Arrays;
import java.util.List;

public class StreamTransform {


    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");


        List<String> upperCasefruits = fruits.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Original fruits: " + fruits);
        System.out.println("Upper-cased fruits: " + upperCasefruits);
    }


}
