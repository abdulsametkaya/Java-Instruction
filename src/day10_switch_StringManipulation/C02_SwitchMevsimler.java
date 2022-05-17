package day10_switch_StringManipulation;
import java.util.Scanner;

public class C02_SwitchMevsimler {

        // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
        // switch olusturun
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen kacinci ay oldugunu giriniz");
            int ayNo=scan.nextInt();
            switch (ayNo) {
                case 12, 1, 2 -> System.out.println("Kis");
                case 3, 4, 5 -> System.out.println("Ilkbahar");
                case 6, 7, 8 -> System.out.println("Yaz");
                case 9, 10, 11 -> System.out.println("Sonbahar");
                default -> System.out.println("Lutfen gecerli bir ay numarasi giriniz");
            }

            scan.close();
        }

    }
