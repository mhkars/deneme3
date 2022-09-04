/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammethoca.arabakiralama.service;

import com.muhammethoca.arabakiralama.repository.DepartmanRepository;
import com.muhammethoca.arabakiralama.repository.entity.Departman;
import com.muhammethoca.arabakiralama.utility.MyFactoryService;

/**
 *
 * @author mhkars
 */
public class DepartmanService extends MyFactoryService<DepartmanRepository , Departman, Long>{
    public DepartmanService(){
        super (new DepartmanRepository());
    }
}


