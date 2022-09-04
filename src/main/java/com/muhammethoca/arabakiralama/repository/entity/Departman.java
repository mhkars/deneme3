/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.muhammethoca.arabakiralama.repository.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="tbldepartman")
@Entity
public class Departman {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private Long id;
    private String ad;
  
    @OneToMany(mappedBy = "departman")
    private List<Personel> personeller;

    public Departman(String ad) {
        this.ad = ad;
    }

    public Departman() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Departman{" + "id=" + id + ", ad=" + ad + ", personeller=" + personeller + '}';
    }
    
}
