package com.temelt.grup32java.ders6;

import java.util.Scanner;

public class Diziler {

    int[] cDizi = new int[]{45, 56, 67, 789, 46, 234, 12};

    public void basitDizi() {
        int[] aDizisi = new int[500];

        int bDizi[] = new int[100];
    }

    public void diziIslemleri() {
        System.out.println(cDizi.length);
        System.out.println(cDizi[3]);
        cDizi[4] =1000;

        for (int i = 0; i<cDizi.length;i++){
            System.out.println(cDizi[i]);
        }
    }

    public void enBuyuk(){
        int enBuyuk=cDizi[0];
        for (int i=1;i<cDizi.length;i++){
            if(enBuyuk<cDizi[i])
                enBuyuk=cDizi[i];
        }
        System.out.println(enBuyuk);
    }


    public void kullaniciDizisi(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eleman Sayısı Giriniz");
        int sayiAdedi = scanner.nextInt();

        int[] dizi=new int[sayiAdedi];
        for (int i=0;i<dizi.length;i++){
            System.out.println("Deger gir");
            dizi[i] = scanner.nextInt();
        }

        for (int i=0;i<dizi.length;i++){
            if(i%2==0)
                dizi[i]=dizi[i]*dizi[i];
            else
                dizi[i] += 1;
        }

        for (int i=0;i<dizi.length;i++)
            System.out.println(dizi[i]);

    }


    public void stringDiziler(){
        String[] dizi = new  String[]{"Ahmet","Mehmet","Cemal"};

        for (int i=0;i<dizi.length;i++)
            System.out.println(dizi[i]);

    }

    public void stringMetodlari(){
        String degisken="Ahmet bla bla Mehmet";

        System.out.println(degisken.charAt(7));

        System.out.println(degisken.length());

        System.out.println(degisken.toLowerCase());

        System.out.println(degisken.toUpperCase());

        System.out.println(degisken.contains("bla"));

        System.out.println(degisken.substring(4,8));

        System.out.println(degisken.indexOf("b"));

        System.out.println(degisken.replace('a','x'));

    }
}





















