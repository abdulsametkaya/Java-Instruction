package aOrnekCalismalar;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0; i<3; i++) {
            String sl=scan.next();
            int x = scan.nextInt();


            System.out.printf("%-15s%03d\n", sl, x);

        }
        System.out.println("================================");


    }
}
