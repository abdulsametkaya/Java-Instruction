package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        // primitive data turu ile non-primitive arasindaki farklar nelerdir ?
        //
        String str= "Java";
        int sayi=10;
        System.out.println(str.toUpperCase()); // JAVA
        System.out.println(str);
        // non-primitive data turleri data depolamak yaninda bir cok faydali method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container)
        // primitive data turleri icin de bazi method'lar gerekli oldugunda
        // Java ara bir cozum uretmistir
        // Java her bir primitive data turunu, non-primitive  olarak kullanabilmek icin
        // ozel Class'lar olusturmus ve bunlara Wrapper Class adini vermistir
        double sayi2=20.5;
        // sayi2 primitive oldugundan sayi2. dedigimizde hic bir method gelmez
        Double sayi3= 15.2;
        // sayi3 wrapper Class olan Double class'ini kullandigindan
        // sayi3. dedigimizde bircok method gelir

        short sayi1=20;
        Short num2=30;
        sayi1=num2;  // wrapper class ile ayni isimdeki primitive data turu arasinda gecis olabilir
        System.out.println(sayi1); // 30
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.BYTES); // 2 Byte=16 bit

    }
}
