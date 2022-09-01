package Lab1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while(run) {
            System.out.println("height:");
            int height = sc.nextInt();
            if(height <= 0) {
                System.out.println("input error");
                continue;
            }
            else if(height==999) {
                break;
            }
            String pattern1 = "AA";
            String pattern2 = "BB";
            String tree = "";
            for(int i=0; i<height;i++) {
                if(i%2==0) {
                    tree = pattern1 + tree;
                }
                else tree = pattern2 + tree;
                System.out.println(tree);
            }

        }
    }
}
