package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class IfElseSorulari {
    /* Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini
yazdirin, sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi
farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
50’den kucukse “D”, 50 60 arasi “C”, 60 80 arasi “B”, 80’nin uzerinde ise “A”
Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 60 80.000 arasinda ise
“Konusabiliriz”, 60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
Soru
9 Interview Question Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
Kural 1 4 ile bolunemeyen yillar artik yil degildir
Kural 2 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
Kural3 4 ’un kati olmasina ragmen 100 ilebolunebilen yillardan sadece 400 ’unkati olan yillar artik yildir

Soru11 Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
Kullanicidan bir sifre girmesini isteyin
Eger ilk harf buyuk harf ise “ olup olmadigini kontrol edin Ilk harf A ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin
Eger ilk harf kucuk harf ise “ olup olmadigini kontrol edin Ilk harf z ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin

Soru 12 Kullanıcıdan 4 basamakli bir sayi girmesini isteyin Girdiği sayi 5 ’e bölünüyorsa
son rakamını kontrol edin Son rakamı 0 ise ekrana 5 ’e bölünen çift sayı”
yazdırın Son rakamı 0 değil ise 5 ’e bölünen tek sayı” yazdırın Girdiği password
5 ’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("kenar uzunluklarını giriniz: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4){
            System.out.println("dörtgeniniz karedir");
        }

        //Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
        //isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
        //gecerli degilse “Gecerli gun ismi giriniz” yazdirin
        System.out.println("gün giriniz");

        String day = scanner.next();

        if (day.equalsIgnoreCase("pazartesi")||day.equalsIgnoreCase("sali")||
                day.equalsIgnoreCase("carsamba")||day.equalsIgnoreCase("persembe")||
                day.equalsIgnoreCase("cuma")||day.equalsIgnoreCase("cumartesi")||
                day.equalsIgnoreCase("pazar")){
            System.out.println( "" + day.toUpperCase().charAt(0) + day.toLowerCase().charAt(1) + day.toLowerCase().charAt(2));
        }



        scanner.close();
    }





}
