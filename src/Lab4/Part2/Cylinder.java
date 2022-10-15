package Lab4.Part2;

import java.util.Scanner;

public class Cylinder extends  Circle{
    private final double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * 3.14 * super.getRadius() + height;
    }


    public static Cylinder shapeGeneration(Scanner sc) {
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter Height:");
        double height = sc.nextDouble();
        return new Cylinder(radius, height);
    }

}
