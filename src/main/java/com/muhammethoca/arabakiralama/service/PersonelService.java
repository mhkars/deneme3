package com.muhammethoca.arabakiralama.service;

import com.muhammethoca.arabakiralama.repository.PersonelRepository;
import com.muhammethoca.arabakiralama.repository.entity.Personel;
import com.muhammethoca.arabakiralama.utility.MyFactoryService;

public class PersonelService extends MyFactoryService<PersonelRepository , Personel, Long>{
    public PersonelService(){
        super (new PersonelRepository());
    }
}
