
package com.muhammethoca.arabakiralama.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="tbladres")
@Entity
public class Adres {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)        
    private Long id;
    private String ad;
    private String acikadres;
    
    @OneToOne(mappedBy = "adres")
    private Musteri musteri;  


    public Adres(String ad, String acikadres) {
        this.ad = ad;
        this.acikadres = acikadres;
    }

    public Adres(Long id, String ad, String acikadres) {
        this.id = id;
        this.ad = ad;
        this.acikadres = acikadres;
    }

    public Adres() {
        
    }

    @Override
    public String toString() {
        return "Adres{" + "id=" + id + ", ad=" + ad + ", acikadres=" + acikadres + '}';
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

    public String getAcikadres() {
        return acikadres;
    }

    public void setAcikadres(String acikadres) {
        this.acikadres = acikadres;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }
    
    
}
