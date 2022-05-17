package aOrnekCalismalar;

import java.util.Scanner;

public class Q14 {
    //Soru 6) Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar devam istemeyi ettirin.
    //Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum = 0;
        int toplamSayi = 0;
        System.out.println("lütfen 500 e ulaşıncaya kadar sayi giriniz = ");
        do {
            num = scan.nextInt();
            toplamSayi++;
            sum+=num;
        }while (sum<500);

        System.out.println("sayi toplamı = " + sum + "\ntoplam girilen sayi = " + toplamSayi);


    }



}
