package com.temelt.grup32java.ders6;

public class HastaIslemleri {

    String metin = "patId|467|name|Taner|sname|TEMEL|bdate|01/01/1956|RBC|46|L|45|H|50|LB|34|L|23|H|67|WBC|34|L|23|H|67";

    public void deviceParser() {
        String[] dizi = metin.split("\\|");
        System.out.println("Id :"+dizi[1]);
        System.out.println("Adı :"+dizi[3]);
        System.out.println("Soyadı :"+dizi[5]);
        System.out.println("D.Tarihi :"+dizi[7]);
        for (int i=8;i<dizi.length;i+=6){
            System.out.println("" + dizi[i] + ": " +dizi[i+1] +" " + dizi[i+2]+":" +dizi[i+3] +" " + dizi[i+4]+":"+ dizi[i+5] );
        }

    }
}
