package Lab3;

import java.util.Scanner;

public class PlaneApp {

    public static void main(String[] args) {
        Plane plane = new Plane();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome:");
            System.out.println("1: Show the number of empty seats");
            System.out.println("2: Show the list of empty seats");
            System.out.println("3: Show the list of customers with their seat numbers in the order of the seat numbers");
            System.out.println("4: Show the list of customers together with their seat numbers in the order of customer ID");
            System.out.println("5: Assign a customer to a seat");
            System.out.println("6: Assign a customer to a seat");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: plane.showNumEmptySeats();
                    break;
                case 2: plane.showEmptySeats();
                    break;
                case 3: plane.showAssignedSeat(true);
                    break;
                case 4: plane.showAssignedSeat(false);
                    break;
                case 5: assign(sc,plane);
                    break;
                case 6: unAssign(sc,plane);
                    break;
                case 7:
                    System.out.println("Program terminating ….");

            }

        } while (choice < 7);
        sc.close();
    }
    private static void assign(Scanner sc, Plane plane) {
        System.out.println("Assigning Seat ...");
        System.out.println("Please enter SeatID: ");
        int seatID = sc.nextInt();
        System.out.println("Please enter Customer ID:");
        int customerID = sc.nextInt();
        plane.assignSeat(seatID,customerID);
    }

    private static void unAssign(Scanner sc, Plane plane) {
        System.out.println("Please enter SeatID to unassgin customer from: ");
        int seatID = sc.nextInt();
        plane.unAssignSeat(seatID);
        System.out.println("Seat unassigned");
    }

}
