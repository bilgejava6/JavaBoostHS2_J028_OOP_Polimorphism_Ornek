package com.muhammet.repository;

import com.muhammet.entity.Hizmetli;
import com.muhammet.entity.Mudur;
import com.muhammet.entity.Muhendis;
import com.muhammet.entity.Personel;

public interface Repository {
    /**
     * ÖNEMLİ!!!!
     * kaydetme işlemi tekbir işlemdir. diyelim ki sizlerin 50 adet sınıfı var yani
     * entity si. kaydetme işlemlerini nasıl yaparsınız?
     */
    void save(Personel personel);
}
