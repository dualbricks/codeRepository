package Lab4;

import java.util.Scanner;

public class Strings {
    public static void main (String[] args)
    {
        String[] stringsList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many Strings do you want to sort? ");
        size = scan.nextInt();
        stringsList = new String[size];
        System.out.println ("\nEnter the String...");
        for (int i = 0; i < size; i++)
            stringsList[i] = scan.next();
        Sorting.selectionSort(stringsList);
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(stringsList[i] + " ");
        System.out.println ();
    }
}
