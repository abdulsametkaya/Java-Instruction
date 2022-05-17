package aOrnekCalismalar;

import java.util.Scanner;

public class Q11 {
    //Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi
    // tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

    //Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a
    // basmasini soyleyin. Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi
    //pozitif sayilarin toplaminin kac oldugunu yazdirin.
    public static void main(String[] args) {
        int num = 72;
        int sum = 0;
        String str = "";

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                str += " " + i;
            }
        }
        System.out.println(str.trim());
        System.out.println(sum);

        Scanner scan = new Scanner(System.in);
        int num1 = 1;
        int num2 = 0;
        int sum1 = 0;
        int count = 1;

        while (num1 != 0) {

            System.out.println("iki sayi giriniz");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if (num2 < 0) {
                sum1 += num1;
            } else if (num1 < 0) {
                sum1 += num2;
            } else {
                sum1 += num1;
            }


            while (num1 != 0) {
                num1 = scan.nextInt();
                if (!(num1 < 0)) {
                    sum1 += num1;
                }

                count++;
            }
        }
        System.out.println("toplam = " + sum1 + "\n Toplam " + count + " sayi girdiniz");


    }
}
