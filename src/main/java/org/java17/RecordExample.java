package org.java17;

public class RecordExample {

    public record Bank(int id, String name) {

    }


    public static void main(String[] args) {
        Bank bank = new Bank(5, "AXIS");
        System.out.println(bank.id());

    }

}
