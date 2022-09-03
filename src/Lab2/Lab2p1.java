package Lab2;

import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: mulTest();
                    break;
                case 2:  divide();
                    break;
                case 3: modulus();
                    break;
                case 4: countDigits();
                    break;
                case 5: position();
                    break;
                case 6: extractOddDigits();
                    break;
                case 7:
                    System.out.println("Program terminating ….");

            }

        } while (choice < 7);
    }
    public static void mulTest() {
        Scanner sc = new Scanner(System.in);
        int correctAnswers = 0;
        for(int i=0; i<=4; i++) {
            int one = (int) Math.floor(Math.random()*9+1);
            int two = (int) Math.floor(Math.random()*9+1);
            int result = one * two;
            System.out.println("How much is "+one+" times "+two+"?");
            int answer = sc.nextInt();
            if(answer == result) correctAnswers++;
        }
        System.out.println(correctAnswers+" answers out of 5 are correct.");
    }
    public static int divide(int m, int n) {
        int quotient = 0;
        while(m>=n) {
            m= m-n;
            quotient++;
        }
        return quotient;
    }
    public static void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to divide:");
        int m = sc.nextInt();
        System.out.println("Enter the divider:");
        int n = sc.nextInt();
        int result = divide(m,n);
        System.out.println("Quotient is "+result);
    }
    public static int modulus(int m, int n) {
        while(m>=n) {
            m= m-n;
        }
        return m;
    }
    public static void modulus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to divide:");
        int m = sc.nextInt();
        System.out.println("Enter the divider:");
        int n = sc.nextInt();
        int result = modulus(m,n);
        System.out.println("Remainder is "+result);
    }
    public static int countDigits(int n) {
        int count =0;
        while(n>0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void countDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();
        if(n<0) {
            System.out.println("Input Error");
            return;
        }
        int count = countDigits(n);
        System.out.println("The number of digits is "+count);
    }

    public static int position(int n, int digit) {
        int count =1;
        int testDigit;
        while(n>0) {
            testDigit = n % 10;
            if(testDigit == digit) return count;
            n = n / 10;
            count++;
        }
        return -1;
    }
    public static void position() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();
        System.out.println("Enter the digit you want to find:");
        int digit = sc.nextInt();
        if(n<0) {
            System.out.println("Input Error");
            return;
        }
        int count = position(n, digit);
        System.out.println("The position of the digit is "+count);
    }

    public static long extractOddDigits(long n) {
        long count =0;
        long testDigit;
        long result = 0;
        while(n>0) {
            testDigit = n % 10;
            if((testDigit %2) > 0) {
                result += testDigit * (Math.pow(10, count));
                count++;
            }
            n = n / 10;
        }
        if(result>0) return result;
        return -1;

    }
    public static void extractOddDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        long n = sc.nextInt();
        if(n<0) {
            System.out.println("Input Error");
            return;
        }
        long result = extractOddDigits(n);
        System.out.println("Odd Digits: "+result);
    }


}
