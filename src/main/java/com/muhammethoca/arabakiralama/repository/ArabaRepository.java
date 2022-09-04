/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammethoca.arabakiralama.repository;

import com.muhammethoca.arabakiralama.repository.entity.Araba;
import com.muhammethoca.arabakiralama.utility.MyFactoryRepository;

/**
 *
 * @author mhkars
 */
public class ArabaRepository extends MyFactoryRepository<Araba, Long>{
    public ArabaRepository(){
        super(new Araba());
    }
    
    
    
}
