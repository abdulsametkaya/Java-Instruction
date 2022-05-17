package btkKurs;

public class Alıstırmalar2 {
    public static void main(String[] args) {
        //mükemmel sayi

        int num = 23;
        int count = 0;

        for (int i = 1; i<num; i++){
            if (num%i == 0){
                count += i;
            }
        }
        if (count == num){
            System.out.println(num + " " + "mükemmel sayidir");
        }else {
            System.out.println(num + " " + "mükemmel sayi değildir");
        }



    }
}
