package com.temelt.grup32java.ders7;

import java.util.Arrays;
import java.util.Scanner;

public class Ders7 {

    public void diziSiralama() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Adedi:");
        int sayiAdedi = scanner.nextInt();
        int[] dizi = new int[sayiAdedi];

        for (int i = 0; i < sayiAdedi; i++) {
            System.out.println("Sayı:");
            dizi[i] = scanner.nextInt();
        }
        int[] siraliDizi = new int[sayiAdedi];
        for (int j = 0; j < sayiAdedi; j++) {

            int enKucuk = dizininEnKucugu(dizi);
            for (int k = 0; k < sayiAdedi; k++) {
                if (dizi[k] == enKucuk)
                    dizi[k] = Integer.MAX_VALUE;
            }
            siraliDizi[j] = enKucuk;
        }
        for (int i = 0; i < sayiAdedi; i++) {
            System.out.println(siraliDizi[i]);
        }
    }


    public int dizininEnKucugu(int[] dizi) {
        int enKucuk = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] != Integer.MAX_VALUE && enKucuk > dizi[i]) {
                enKucuk = dizi[i];
            }
        }
        return enKucuk;
    }


    public int[] bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] siralama(int[] dizi) {
        Arrays.sort(dizi);
        return dizi;
    }

}
























