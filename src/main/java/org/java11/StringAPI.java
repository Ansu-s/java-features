package org.java11;

public class StringAPI {
    public static void main(String[] args) {
        String str = " Goodmorning, how are you doing today \n Bye" +" see you soon";

        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());
       str.lines().forEach(System.out :: println);
        System.out.println(str.repeat(5));


    }
}
