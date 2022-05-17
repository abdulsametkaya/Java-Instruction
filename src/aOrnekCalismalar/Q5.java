package aOrnekCalismalar;

public class Q5 {
    //Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
    //Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yazin.

    public static void main(String[] args) {
        String str = "abdulsamet kaya";
        System.out.println(tersCevir(str));


    }

    private static String tersCevir(String str) {
        String tersStr = "";
        for (int i = str.length()-1; i>=0;i--){
            tersStr += str.charAt(i);
        }
        return tersStr;
    }

}
