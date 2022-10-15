package Lab4.Part2;

import java.util.Scanner;

public class Triangle implements Shape{
    private final double height;

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }


    @Override
    public double getArea() {
        return  0.5 * base * height;
    }

    public static Triangle shapeGeneration(Scanner sc) {
        System.out.println("Enter base: ");
        double base = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        return new Triangle(base, height);
    }
}
