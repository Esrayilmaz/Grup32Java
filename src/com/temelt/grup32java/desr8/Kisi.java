package com.temelt.grup32java.desr8;

import java.util.Date;

public class Kisi {

    private Long tcKimlikNo;
    private String adi;
    private String soyadi;
    private Integer yas;
    private Date dogumTarihi;

    public Long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(Long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Integer getYas() {
        return yas;
    }

    private void setYas(Integer yas) {
        this.yas = yas;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.yas = 2018 - dogumTarihi.getYear();
        this.dogumTarihi = dogumTarihi;
    }
}
