package Lab4.Part2;

import java.util.Scanner;

public class Sphere extends Circle{

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return 4 * super.getArea();
    }

    public static Sphere shapeGeneration(Scanner sc) {
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        return new Sphere(radius);
    }
}
