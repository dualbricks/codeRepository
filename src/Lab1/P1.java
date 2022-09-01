package Lab1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("Please enter a char" );
            Scanner sc = new Scanner(System.in);
            char choice = sc.next().charAt(0);
            choice = Character.toLowerCase(choice);
            if(choice == 'a') System.out.println("Action movie fan");
            else if(choice == 'c') System.out.println("Comedy movie fan");
            else if(choice == 'd') System.out.println("Drama movie fan");
            else if(choice == 's') run = false;
            else System.out.println("Invalid choice");
        }

    }
}
