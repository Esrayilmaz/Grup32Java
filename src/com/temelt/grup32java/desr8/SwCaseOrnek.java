package com.temelt.grup32java.desr8;

import java.util.Scanner;

public class SwCaseOrnek {

    public void yaziOrnegi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakam Giriniz");
        int rakam = scanner.nextInt();
       swCase(rakam);
       ifElse(rakam);
    }
    void swCase(int rakam){
        switch (rakam) {
            case 0: System.out.println("Sıfır");break;
            case 1: System.out.println("Bir");break;
            case 2: System.out.println("İki");break;
            case 3: System.out.println("Üç");break;
            case 4: System.out.println("Dört");break;
            case 5: System.out.println("Beş");break;
            case 6: System.out.println("Altı");break;
            case 7: System.out.println("Yedi");break;
            case 8: System.out.println("Sekiz");break;
            case 9: System.out.println("Dokuz");break;
        }
    }
    void ifElse(int rakam){
        if (rakam == 0) {
            System.out.println("Sıfır");
        } else if (rakam == 1) {
            System.out.println("Bir");
        } else if (rakam == 2) {
            System.out.println("İki");
        } else if (rakam == 3) {
            System.out.println("Üç");
        } else if (rakam == 4) {
            System.out.println("Dört");
        } else if (rakam == 5) {
            System.out.println("Beş");
        } else if (rakam == 6) {
            System.out.println("Altı");
        } else if (rakam == 7) {
            System.out.println("Yedi");
        } else if (rakam == 8) {
            System.out.println("Sekiz");
        } else if (rakam == 9) {
            System.out.println("Dokuz");
        }
    }


    /**
     *
     *
     *
     Random uretec =new Random();
     int dizi[] =new int[1000];

     for (int i=0;i<1000;i++) {
     dizi[i]=uretec.nextInt(10);
     }


     System.out.println(" IF_ELSE Başladı :" + System.currentTimeMillis());
     for (int i=0;i<dizi.length;i++) {
     ifElse(dizi[i]);
     }
     System.out.println(" IF_ELSE Bitti :" +System.currentTimeMillis());

     System.out.println(" SW-CASE Başladı :" + System.currentTimeMillis());
     for (int i=0;i<dizi.length;i++) {
     swCase(dizi[i]);
     }
     System.out.println(" SW-CASE Bitti :" +System.currentTimeMillis());

     */
}
