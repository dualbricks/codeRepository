package Lab4.Part2;

import java.util.Scanner;

public class Rectangle implements Shape{
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    private final double length;
    private final double breadth;

    public  Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    @Override
    public double getArea() {
        return length*breadth;
    }

    public static  Rectangle shapeGeneration(Scanner sc) {
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();
        return new Rectangle(length, breadth);
    }
}
