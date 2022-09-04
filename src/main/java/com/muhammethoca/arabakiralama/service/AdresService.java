package com.muhammethoca.arabakiralama.service;

import com.muhammethoca.arabakiralama.repository.AdresRepository;
import com.muhammethoca.arabakiralama.repository.entity.Adres;
import com.muhammethoca.arabakiralama.utility.MyFactoryService;

public class AdresService extends MyFactoryService<AdresRepository , Adres, Long>{
    public AdresService(){
        super(new AdresRepository());
    }
    
}
