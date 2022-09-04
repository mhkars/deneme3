package com.muhammethoca.arabakiralama;

import com.muhammethoca.arabakiralama.repository.entity.Adres;
import com.muhammethoca.arabakiralama.repository.entity.Araba;
import com.muhammethoca.arabakiralama.repository.entity.Departman;
import com.muhammethoca.arabakiralama.repository.entity.Musteri;
import com.muhammethoca.arabakiralama.repository.entity.Personel;
import com.muhammethoca.arabakiralama.service.ArabaService;
import com.muhammethoca.arabakiralama.service.DepartmanService;
import com.muhammethoca.arabakiralama.service.MusteriService;
import com.muhammethoca.arabakiralama.service.PersonelService;
import java.util.Arrays;
import java.util.Date;


public class ArabaKiralama {

    public static void main(String[] args) {
   
    
    
    }
    
    public static void MusteriEkle(){
        new MusteriService().findAll().forEach(System.out::println);
    }
    public static void Öncekiler(){
//        Musteri musteri = new Musteri("Muhammet","Hoca","05552222888");
        MusteriService ms = new MusteriService();
//     
        Adres adres = new Adres("Ev Adresi", "İzmir");
        Musteri musteri = new Musteri("Deniz", "Kalın", "05055555", adres);
//        new MusteriService().save(musteri);
         ms.save(musteri);
    
        Araba araba = new Araba("Audi", "a8","22 GF 14",5000 );
        Araba araba2 = new Araba("Mercedses", "EQC","22 GF 15",15000 );
        ArabaService as = new ArabaService();
        as.save(araba);
        as.save(araba2);
        
        Departman departman = new Departman("Satis");
        DepartmanService ds = new DepartmanService();
        ds.save(departman);
        
        Personel personel = new Personel("Galerici", "Yok", new Date(), "444444444", 
                    Arrays.asList("0555","0532"),Arrays.asList(araba,araba2),departman);
        Personel personel2 = new Personel("Ahmet", "Nadir",
                    new Date(), "45654654546", null  ,null, departman);
        PersonelService ps = new PersonelService();
        ps.save(personel);
        ps.save(personel2);
        
        
        
        as.findAll().forEach(System.out::println);
        ps.findAll().forEach(System.out::println);
        ds.findAll().forEach(System.out::println);
        
    }


}
