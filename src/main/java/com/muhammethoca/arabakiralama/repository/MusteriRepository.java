
package com.muhammethoca.arabakiralama.repository;


import com.muhammethoca.arabakiralama.repository.entity.Musteri;
import com.muhammethoca.arabakiralama.utility.MyFactoryRepository;

/**
 *
 * @author mhkars
 */
public class MusteriRepository extends MyFactoryRepository<Musteri, Long>{
      public MusteriRepository(){
        super(new Musteri());
    }
}
