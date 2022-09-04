package com.muhammethoca.arabakiralama.service;

import com.muhammethoca.arabakiralama.repository.ArabaRepository;
import com.muhammethoca.arabakiralama.repository.entity.Araba;
import com.muhammethoca.arabakiralama.utility.MyFactoryService;

/**
 *
 * @author mhkars
 */
public class ArabaService extends MyFactoryService<ArabaRepository , Araba, Long>{
    public ArabaService(){
        super(new ArabaRepository());
    }
}
