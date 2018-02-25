package com.temelt.grup32java.desr8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ders8 {

    public void streamOrnek(){

        List<Kisi> liste=new ArrayList<>();

        Kisi kisi=new Kisi();
        kisi.setAdi("Taner");
        kisi.setDogumTarihi(new Date(1966,1,1));
        kisi.setSoyadi("TEMEL");
        kisi.setTcKimlikNo(321654987L);
        liste.add(kisi);

        Kisi kisi2=new Kisi();
        kisi2.setAdi("Cemal");
        kisi2.setDogumTarihi(new Date(1956,1,1));
        kisi2.setSoyadi("SÜREYA");
        kisi2.setTcKimlikNo(321654987L);
        liste.add(kisi2);

        System.out.println(liste.size());


        Kisi k = liste.stream().
                filter(item -> item.getSoyadi().equals("TEMEL")
                        && item.getYas()>40
                        || item.getTcKimlikNo()<2345L).
                findFirst().get();

        kisiYaz(k);

    }


    public void kisiYaz(Kisi k){
        System.out.println("Adı :" + k.getAdi());
        System.out.println("Soyadı :" + k.getSoyadi());
        System.out.println("Yaş :" + k.getYas());
        System.out.println("TC :" + k.getTcKimlikNo());
        System.out.println("Doğum Tarihi :" + k.getDogumTarihi());
        System.out.println("--------------------------");
    }
}
