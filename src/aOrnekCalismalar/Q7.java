package aOrnekCalismalar;

public class Q7 {
    //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
    //asagidaki sekli cizdirin
    //*
    //* *
    //* * *
    //* * * *
    //Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
    //tablosu olusturun. Ornek,kullanici 3 girerse,
    //1 2 3
    //2 4 6
    //3 6 9
    public static void main(String[] args) {
        int digit = 5;

        for (int i = 0; i <= digit; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(("*"));
            }
            System.out.println();
        }

        for (int i = digit; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
