/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammethoca.arabakiralama.repository;


import com.muhammethoca.arabakiralama.repository.entity.Kiralama;
import com.muhammethoca.arabakiralama.utility.MyFactoryRepository;

/**
 *
 * @author mhkars
 */
public class KiralamaRepository extends MyFactoryRepository<Kiralama, Long>{
    public KiralamaRepository(){
        super(new Kiralama());
    }
    
}
