package com.muhammet.entity;

public class Hizmetli extends Personel{
    public Hizmetli(String ad,String adres,String telefon,String unvan){
        super(ad, adres, telefon, unvan);
        this.maas = 35_000;
    }

}
