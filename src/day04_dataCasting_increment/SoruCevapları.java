package day04_dataCasting_increment;

public class SoruCevapları {
  /*  Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
               birer degisken olusturup adim adim widening yapin ve yazdirin
    Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
    Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
    Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
    yazdirin
    Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
    Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
    Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim */

    public static void main(String[] args) {

        //1
        byte num1 = 10;
        short num2 = num1;
        System.out.println(num2);
        int num3 = num2;
        float num4 = num3;
        double num5 = num4;
        System.out.println(num5);

        //2
        int sayi1 = 27;
        short sayi2 = (short) sayi1;
        byte sayi3 = (byte) sayi1;
        float sayi4 = sayi1;
        System.out.println(sayi4);

        //4
        double sayi5 = 255.36;
        int sayi6 = (int) sayi5;
        byte sayi7 = (byte) sayi6;

        //6
        System.out.println(num5/sayi6);
  }



}
