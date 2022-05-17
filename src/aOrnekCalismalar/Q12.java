package aOrnekCalismalar;

import java.util.Arrays;

public class Q12 {
    //Array ekleme ve array silme methodu oluştur

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int eklenecekSayi = 4;
        System.out.println(arr.length);
        arr = arrayEkleme(arr, eklenecekSayi);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        int silinecekSayi = 2;
        arr=arraySilme(arr,silinecekSayi);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] arraySilme(int[] arr, int silinecekSayi) {
        int[] yeniArr = new int[arr.length-1];
        int count=0;
        for (int i : arr) {
            if (i != silinecekSayi) {
                yeniArr[count] = i;
                count++;
            }
        }
        return yeniArr;
    }

    private static int[] arrayEkleme(int[] arr, int eklenecekSayi) {
        int[] yeniArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }
        yeniArr[arr.length] = eklenecekSayi;

        return yeniArr;
    }


}
