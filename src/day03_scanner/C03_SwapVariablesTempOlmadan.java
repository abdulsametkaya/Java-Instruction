package day03_scanner;

import java.util.Scanner;

public class C03_SwapVariablesTempOlmadan {

    /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */
    public static void main(String[] args) {

        int sayi1= 10;
        int sayi2=20;
        System.out.println("Swaptan önce sayı1 : " + sayi1 + " " + "sayi2 : " + sayi2);
        sayi1= sayi1+sayi2;//sayı1=30
        sayi2=sayi1-sayi2;//sayı2=10
        sayi1=sayi1-sayi2;//sayı1=20
        System.out.println("Swaptan sonra sayı1 : " +sayi1 +" " + "sayı2 " +sayi2);


        Scanner scan = new Scanner(System.in);

        System.out.println("please write your name and age:");
        String name = scan.nextLine();
        int num1 = scan.nextInt();

        System.out.println("your name is " + name);
        System.out.println("your age is " + num1);
        System.out.println("your name's first letter is " + name.charAt(0));

        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        System.out.println("write a number which has 4 character: ");
        int num2 = scan.nextInt();

        int num3= num2 % 10; //4
        int num4 = num2/10; //123
        int num5 = num4%10; // 3
        int num6 = num4/10; //12
        int num7 = num6%10; //2
        int num8 = num6/10; //1

        System.out.println(num3);
        System.out.println(num8);
        System.out.println(num5);
        System.out.println(num7);




    }
}
