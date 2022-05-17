package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        // verilen bir array'de en kucuk ve en buyuk degerleri yazdirin
        int[] arr = {3,5,6,1,9,45,25,4,9,0};
        // sort methodu olmadan yapalim
        int enKucukSayi= Integer.MAX_VALUE;  // arr[0];
        int enBuyukSayi= Integer.MIN_VALUE; //arr[0];
        for (int j : arr) {
            if (j < enKucukSayi) {
                enKucukSayi = j;
            }
            if (j > enBuyukSayi) {
                enBuyukSayi = j;
            }
        }
        System.out.println("Array'deki en kucuk sayi : " + enKucukSayi);
        System.out.println("Array'deki en buyuk sayi : " + enBuyukSayi);
        Arrays.sort(arr);
        System.out.println("Array'deki en kucuk sayi : " + arr[0]);
        System.out.println("Array'deki en buyuk sayi : " + arr[arr.length-1]);
    }
}
