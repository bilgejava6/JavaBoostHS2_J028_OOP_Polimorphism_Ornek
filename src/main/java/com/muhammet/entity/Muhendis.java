package com.muhammet.entity;

public class Muhendis extends  Personel{

    public Muhendis(String ad, String adres, String telefon, String unvan){
        super(ad, adres, telefon, unvan);
        this.maas = 90_000;
    }
}
