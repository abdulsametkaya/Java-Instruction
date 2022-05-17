package aOrnekCalismalar;

public class Q10 {
    //Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan
    // 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.

    //Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip
    //bitiş harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        //while
        int i = 100;
        while (i < 1000) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(" ");

        //4. soru
        char ch = 'c';
        while (ch < 'v') {
            System.out.print(Character.toUpperCase(ch) + " ");
            ch++;
        }


    }


}
