package Lab4.Part2;

import java.util.Scanner;

public class Circle implements Shape{
    public double getRadius() {
        return radius;
    }

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static Circle shapeGeneration(Scanner sc) {
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }
}
