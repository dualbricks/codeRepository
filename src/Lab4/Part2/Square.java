package Lab4.Part2;

import java.util.Scanner;

public class Square implements Shape{
    private final double length;

    public  Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }


    public static Square shapeGeneration(Scanner sc) {
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        return new Square(length);
    }
}
