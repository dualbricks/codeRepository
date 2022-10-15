package Lab4.Part2;

import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        int size, choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Shapes");
        size = sc.nextInt();
        Shape[] shapes = new Shape[size];
        for(int i=0; i<size; i++) {
            System.out.println("Please choose the shape you want:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> shapes[i] = Square.shapeGeneration(sc);
                case 2 -> shapes[i] = Rectangle.shapeGeneration(sc);
                case 3 -> shapes[i] = Circle.shapeGeneration(sc);
                case 4 -> shapes[i] = Triangle.shapeGeneration(sc);
            }
        }
        choice = 0;
        while(choice != 1) {
            System.out.println("1. Calculate Total Area");
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
