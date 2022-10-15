package Lab4.Part2;

import java.util.Scanner;

public class Cone extends  Circle{
    private final double slantHeight;

    public Cone(double radius, double slantHeight) {
        super(radius);
        this.slantHeight = slantHeight;
    }

    @Override
    public double getArea() {
        return (super.getArea() + Math.PI*super.getRadius()*slantHeight);
    }

    public static Cone shapeGeneration(Scanner sc) {
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter Slant Height:");
        double slantHeight = sc.nextDouble();
        return new Cone(radius,slantHeight);
    }
}
