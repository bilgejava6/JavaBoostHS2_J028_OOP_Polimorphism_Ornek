package com.muhammet.entity;

public class Ceo extends  Personel{
    public Ceo(String ad,String adres,String telefon, String unvan){
        super(ad, adres, telefon, unvan);
        this.maas = 980_000;
    }
}
