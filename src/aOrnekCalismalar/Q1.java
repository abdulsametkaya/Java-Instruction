package aOrnekCalismalar;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //HESAP MAKİNESİ YAPIMI

        Scanner scan = new Scanner(System.in);

        System.out.println("lüften toplama işlemi için 1'e basınız");
        System.out.println("lüften cıkarma işlemi için 2'e basınız");
        System.out.println("lüften carpma işlemi için 3'e basınız");
        System.out.println("lüften bolme işlemi için 4'e basınız");

        int num1 = scan.nextInt();

        switch (num1) {
            case 1:
                toplama();
                break;
            case 2:
                cıkarma();
                break;

            case 3:
                carpma();
                break;
            case 4:
                bolme();
                break;
            default:
                System.out.println("lütfen gecerli sayi giriniz");
        }
    }


    private static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1 / num2);
    }

    private static void carpma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1 * num2);
    }

    private static void cıkarma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1 - num2);
    }


    public static void toplama() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1 + num2);
    }
}
