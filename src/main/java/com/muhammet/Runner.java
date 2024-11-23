package com.muhammet;

import com.muhammet.entity.Ceo;
import com.muhammet.entity.Hizmetli;
import com.muhammet.entity.Mudur;
import com.muhammet.entity.Muhendis;
import com.muhammet.repository.PersonelRepository;

public class Runner {
    public static void main(String[] args) {
        Mudur mudur = new Mudur("Tekin TAŞ","Ankara","0 555 999 6655","MÜDÜR");
        Muhendis muhendis = new Muhendis("Hakan TAHTA","İzmir","0 999 888 7744","MÜHENDİS");
        Hizmetli hizmetli = new Hizmetli("Tarık KOŞAN","Bursa","0 666 555 4411","HİZMETLİ");
        Ceo ceo = new Ceo("Berkant Caner BURYAN","Ankara","0 555 666 9988", "CEO");
        PersonelRepository repository = new PersonelRepository();
        repository.save(mudur);
        repository.save(muhendis);
        repository.save(hizmetli);
        repository.save(ceo);
    }
}