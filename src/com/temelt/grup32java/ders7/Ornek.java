package com.temelt.grup32java.ders7;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ornek {

    List<String> birBas = Arrays.asList("", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz");
    List<String> onBas = Arrays.asList("", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan");
    List<String> yuzBas = Arrays.asList("", "Yüz", "İkiyüz", "Üçyüz", "Dörtyüz", "Beşyüz", "Altıyüz", "Yediyüz", "Sekizyüz", "Dokuzyüz");
    List<String> binBas = Arrays.asList("", "Bin", "İkibin", "Üçbin", "Dörtbin", "Beşbin", "Altıbin", "Yedibin", "Sekizbin", "Dokuzbin");
    List<String> milyonBas = Arrays.asList("", "BirMilyon", "İkiMilyon", "ÜçMilyon", "DörtMilyon", "BeşMilyon", "AltıMilyon", "YediMilyon", "SekizMilyon", "DokuzMilyon");

    public void calistirma() {
        String girdi = JOptionPane.showInputDialog(null, "Para Miktarını Giriniz");
        System.out.println(girdi);
        Integer girilenDeger = Integer.parseInt(girdi);

        sayiyiYaziyaCevirme(girilenDeger);
    }

    public String sayiyiYaziyaCevirme(Integer deger) {
        int birler = (deger % 10);
        int onlar = ((deger / 10) % 10);
        int yuzler = ((deger / 100) % 10);
        int binler = ((deger / 1000) % 10);
        int onBinler = ((deger / 10000) % 10);
        int yuzBinler = ((deger / 100000) % 10);
        int milyon = ((deger / 1000000) % 10);
        System.out.println(milyonBas.get(milyon) + " "
                + yuzBas.get(yuzBinler) + " " + onBas.get(onBinler) + " "
                + binBas.get(binler) + " " +
                yuzBas.get(yuzler) + " " + onBas.get(onlar) + " " +
                birBas.get(birler));

        return "";
    }



    List<String> birBas1 = Arrays.asList("", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz");
    List<String> onBas1 = Arrays.asList("", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan");
    List<String> yuzBas1 = Arrays.asList("", "Yüz", "Bin", "Milyon", "Milyar", "Trilyon");
}
