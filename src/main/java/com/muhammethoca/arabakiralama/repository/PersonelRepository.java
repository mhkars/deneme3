/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammethoca.arabakiralama.repository;


import com.muhammethoca.arabakiralama.repository.entity.Personel;
import com.muhammethoca.arabakiralama.utility.MyFactoryRepository;

/**
 *
 * @author mhkars
 */
public class PersonelRepository extends MyFactoryRepository<Personel, Long>{
     public PersonelRepository(){
        super(new Personel());
    }
}
