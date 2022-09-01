package Lab1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        boolean run = true;
        double conversion = 1.82;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("starting:");
            int start = sc.nextInt();
            if(start== 999) {
                run = false;
                break;
            }
            System.out.println("ending:");
            int end = sc.nextInt();
            System.out.println("increment:");
            int inc = sc.nextInt();

            if(start > end) {
                System.out.println("error");
                break;
            }
            System.out.println("US$             S$\n----------------");
            for(int i=start; i<=end; i+=inc) {
                System.out.println(i + "             "+i*conversion);
            }
            System.out.println("US$             S$\n----------------");
            int counter = start;
            while(counter <= end) {
                System.out.println(counter + "             "+counter*conversion);
                counter+=inc;
            }
            counter = start;
            System.out.println("US$             S$\n----------------");
            do{
                System.out.println(counter + "             "+counter*conversion);
                counter+=inc;
            } while(counter <=end);
        }

    }
}
