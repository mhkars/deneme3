/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammethoca.arabakiralama.repository;

import com.muhammethoca.arabakiralama.repository.entity.Departman;

import com.muhammethoca.arabakiralama.utility.MyFactoryRepository;


public class DepartmanRepository extends MyFactoryRepository<Departman, Long>{
    public DepartmanRepository(){
        super(new Departman());
    }
    
}
