package org.java17;
 sealed class Shape permits Circle, Rectangle, Triangle {

     public void draw() {

     }


 }

final class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("The circle has the radius " + radius);
    }
}

final class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Creating the rectangle with the data " + width + " and height " + height);
    }
}

non-sealed class Triangle extends Shape {
    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void draw() {
        System.out.println("Side of the triangle are " + side1 + ", " + side2 + ", " + side3);
    }
}

public class SealedClassEx {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        drawShape(circle);
        drawShape(rectangle);
        drawShape(triangle);
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }
}
