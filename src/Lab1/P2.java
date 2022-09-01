package Lab1;

import java.util.Scanner;

public class P2 {
    private static char calculator(int salary, int merit) {
        if(salary >= 700) {
            if(salary <= 799 && merit < 20) return 'B';
            else return 'A';
        }
        else if(salary >=600) {
            if(salary <= 649 && merit < 10) return 'C';
            else return 'B';
        }
        else return 'C';
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.println("enter salary:");
            int salary = sc.nextInt();
            if(salary == 1) {
                run = false;
                break;
            }
            System.out.println("enter merit:");
            int merit = sc.nextInt();
            char grade = calculator(salary, merit);
            System.out.println("Grade " + grade);
        }
    }
}
