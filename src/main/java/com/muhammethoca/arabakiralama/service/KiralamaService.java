package com.muhammethoca.arabakiralama.service;

import com.muhammethoca.arabakiralama.repository.KiralamaRepository;
import com.muhammethoca.arabakiralama.repository.entity.Kiralama;
import com.muhammethoca.arabakiralama.utility.MyFactoryService;

public class KiralamaService extends MyFactoryService<KiralamaRepository , Kiralama, Long>{
    public KiralamaService(){
        super (new KiralamaRepository());
    }
}
