package Lab4.Part2;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        int size, choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Shapes");
        size = sc.nextInt();
        Shape[] shapes = new Shape[size];
        for(int i=0; i<size; i++) {
            System.out.println("Please choose the shape you want:");
            System.out.println("1. Cuboid");
            System.out.println("2. Sphere");
            System.out.println("3. Square Pyramid");
            System.out.println("4. Cone");
            System.out.println("5. Cylinder");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> shapes[i] = Cubiod.shapeGeneration(sc);
                case 2 -> shapes[i] = Sphere.shapeGeneration(sc);
                case 3 -> shapes[i] = SquarePyramid.shapeGeneration(sc);
                case 4 -> shapes[i] = Cone.shapeGeneration(sc);
                case 5 -> shapes[i] = Cylinder.shapeGeneration(sc);
            }
        }
        choice = 0;
        while(choice != 1) {
            System.out.println("1. Calculate Total Surface Area");
            System.out.println("Select type of calculation: ");
            choice = sc.nextInt();
            if(choice == 1) {
                double totalArea = 0.0;
                for(int i=0; i<size; i++) {
                    totalArea += shapes[i].getArea();
                }
                System.out.printf("Total area: %.2f", totalArea);
            }
        }
        sc.close();

    }
}
