package day22_arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {
        // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        // bir method olusturun
        String cumle = "Nerede o 'hello world' yazdiramayan ogrenciler?";
        char harf = 'e';
        harfKacKereKullanilmis(cumle, harf);
    }

    private static void harfKacKereKullanilmis(String cumle, char harf) {
        int sayac = 0;
        String harfStr = "" + harf;
        String[] karakterler = cumle.split("");
        System.out.println(Arrays.toString(karakterler));
        for (String s : karakterler) {
            if (s.equals(harfStr)) {
                sayac++;
            }
        }
        System.out.println("Aradiginiz " + harf + " verilen cumlede " + sayac + " adet kullanilmis");
    }
}
