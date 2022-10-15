package Lab4.Part2;

import java.util.Scanner;

public class SquarePyramid extends Triangle{
    @Override
    public double getHeight() {
        return height;
    }

    private final double height;

    public SquarePyramid(double height, double base) {
        super(height, base);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getBase() * super.getBase() + 2 * super.getBase() * Math.sqrt((super.getBase()*super.getBase()/4)+ super.getHeight()*super.getHeight());
    }

    public static SquarePyramid shapeGeneration(Scanner sc) {
        System.out.println("Enter base: ");
        double base = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        return new SquarePyramid(base, height);
    }
}
