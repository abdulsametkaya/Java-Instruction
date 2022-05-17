package aOrnekCalismalar;

public class Q6 {
    //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
    //toplayip, sonucu yazdiran bir program yaziniz
    //Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
    //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int temp = 0;

        for (int i = num1 + 1; i < num2; i++) {
            temp += i;
        }
        System.out.println("toplam: " + temp);

        int fak = 6;
        int temp2 = 1;

        for (int i = 1; i <= fak; i++) {
            temp2 *= i;
        }
        System.out.println(temp2);


    }
}
