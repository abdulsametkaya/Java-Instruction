package aOrnekCalismalar;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //cümlede kaç defa "a" harfi geçiyor?

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz:");
        String cumle = scan.nextLine();

        kontrol(cumle);

    }

    private static void kontrol(String str) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char ch = scan.next().charAt(0);
        int num1 = 0;

        for (int i =0; i<str.length()-1; i++){

            if(str.charAt(i) == ch){
                num1 ++;
            }
        }

        System.out.println(num1);

    }


}
