package aOrnekCalismalar;

public class Q4 {
    //Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3un
    // veya 5”in kati olan sayilari yazdirin.

    //Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den başlayarak
    // girİlen sayiya kadar tum sayilari yazdirin. Ancak;
    //Sayi 3’un kati ise sayi yerine “Java” yazdirin.
    //Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
    // Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.

    public static void main(String[] args) {
        int sayi = 60;

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("java guzeldir ");
            } else if (i % 5 == 0) {
                System.out.print("guzeldir ");
            } else if (i % 3 == 0) {
                System.out.print("java ");
            }else{
                System.out.print(i + " ");
            }
        }


    }

}
