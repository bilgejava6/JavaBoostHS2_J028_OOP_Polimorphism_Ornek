package com.muhammet.repository;

import com.muhammet.entity.Hizmetli;
import com.muhammet.entity.Mudur;
import com.muhammet.entity.Muhendis;
import com.muhammet.entity.Personel;

public class PersonelRepository implements Repository{


    @Override
    public void save(Personel personel) {
        System.out.println("""
                **** KAYIT İŞLEMİ ****
                """);
        System.out.println(personel.ad+ " adlı personel kayıt edildi.");
        personel.maasGoster();
        System.out.println("---------------------------------");
    }
}
