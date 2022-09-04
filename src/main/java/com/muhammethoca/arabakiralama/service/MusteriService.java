package com.muhammethoca.arabakiralama.service;

import com.muhammethoca.arabakiralama.repository.MusteriRepository;
import com.muhammethoca.arabakiralama.repository.entity.Musteri;
import com.muhammethoca.arabakiralama.utility.MyFactoryService;

public class MusteriService extends MyFactoryService<MusteriRepository , Musteri, Long>{
    public MusteriService(){
        super (new MusteriRepository());
    }
    
}
