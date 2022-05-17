package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();
        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi guc olabilir
        // bunun yerine switch - case yapisini kullanabiliriz
        switch (ayNo) {
            case 1 -> System.out.println("Ocak");
            case 2 -> System.out.println("Subat");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Nisan");
            case 5 -> System.out.println("Mayis");
            case 6 -> System.out.println("Haziran");
            case 7 -> System.out.println("Temmuz");
            case 8 -> System.out.println("Agustos");
            case 9 -> System.out.println("Eylul");
            case 10 -> System.out.println("Ekim");
            case 11 -> System.out.println("Kasim");
            case 12 -> System.out.println("Aralik");
            default -> System.out.println("Lutfen gecerli bir ay numarasi giriniz");
        }
        // switch icine yazilan variable'in degerine gore
        // ilgili case'i bulur ve break gorene kadar kodu calistirir
        // eger break yoksa ilgili case'den asagi dogru tum case'ler calisir
        // if else'deki son else gibi, geriye kalan durumlari tamamen
        // kapsayacak bir satir daha ekleyebiliriz

        scan.close();
    }
}
