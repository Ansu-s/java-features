package org.java17;

public class PatternSwitch {
    public static void main(String[] args) {
        System.out.println(formattedString("05dfdf"));
    }

    static String formattedString(Object o) {

        return switch (o) {
            case Integer i -> String.format("This is a int %d", i);
            case Double d -> String.format("This is a double %f", d);
            case String s -> String.format("This is a string %S", s);
            case null -> String.format("This is null");
            default -> String.format(o.toString());
        };
    }

}
