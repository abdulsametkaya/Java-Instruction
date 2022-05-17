package aOrnekCalismalar;

import java.util.Scanner;

public class Q13 {
    //Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    // kontrol edin ve sifredeki hatalari yazdirin.
    //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
    // “Sifreniz Kabul edilmistir” yazdirin.
    //Sifre kucuk harf icermelidir
    //Sifre buyuk harf icermelidir
    //Sifre ozel karakter icermelidir
    //Sifre en az 8 karakter olmalidir.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        if ((buyukHarf(password))) {
            System.out.println("sifre buyuk harf icermelidir");
        }
        if ((kucukHarf(password))) {
            System.out.println("sifre kucuk harf icermelidir");
        }
        if ((ozelHarf(password))) {
            System.out.println("sifre ozel karakter icermelidir");
        }
        if ((harfSayisi(password))) {
            System.out.println("sifre en az 8 karakterli olmalidir");
        }

        if (!(harfSayisi(password)) && !(ozelHarf(password)) && !(kucukHarf(password)) && !(buyukHarf(password))) {
            System.out.println("şifreniz başarı ile kaydedilmiştir.");
        }


        scan.close();
    }

    private static boolean harfSayisi(String password) {
        return password.length() < 8;
    }

    private static boolean ozelHarf(String password) {
        boolean ozelHarf = true;
        password = password.replaceAll("\\w", "");
        if (!password.isEmpty()) {
            ozelHarf = false;
        }

        return ozelHarf;
    }

    private static boolean kucukHarf(String password) {
        boolean kucukHarf = true;
        int i = 0;
        do {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                kucukHarf = false;
                break;
            }
            i++;

        } while (i < password.length());

        return kucukHarf;
    }

    private static boolean buyukHarf(String password) {
        boolean buyukHarf = true;
        int i = 0;
        do {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                buyukHarf = false;
                break;
            }
            i++;

        } while (i < password.length());

        return buyukHarf;
    }
}
