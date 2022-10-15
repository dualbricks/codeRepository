package Lab4.Part2;

import java.util.Scanner;

public class Cubiod extends Rectangle{
    private final double height;
    public Cubiod(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    @Override
    public double getArea() {
        double l = super.getLength();
        double b = super.getBreadth();
        return 2*(l*height+l*b+height*b);
    }

    public static Cubiod shapeGeneration(Scanner sc) {
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        return new Cubiod(length, breadth, height);
    }
}
