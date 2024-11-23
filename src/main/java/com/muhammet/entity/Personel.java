package com.muhammet.entity;

public class Personel {
    public String unvan;
    public String ad;
    public String adres;
    public String telefon;
    public double maas;
    public Personel(String ad, String adres,String telefon,String unvan){
        this.adres = adres;
        this.ad = ad;
        this.telefon = telefon;
        this.unvan = unvan;
    }

    public void maasGoster(){
        System.out.println(unvan+ " ünvanlı "+ ad+ " ın maaşı..: "+maas);
    }

}
