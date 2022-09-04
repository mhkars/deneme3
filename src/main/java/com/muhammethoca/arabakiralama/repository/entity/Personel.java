package com.muhammethoca.arabakiralama.repository.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="tblpersonel")
@Entity
public class Personel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private Long id;
    private String ad;
    private String soyad;
    
    @Temporal(TemporalType.DATE)
    private Date isebaslama;
    private String tckimlik;
    
    @ElementCollection
    private List<String> iletisim;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Araba> arabalar;
    
    @ManyToOne(cascade =CascadeType.ALL) 
    private Departman departman;
    
    public Personel() {
    }

    public Personel(String ad, String soyad, Date isebaslama, String tckimlik, List<String> iletisim) {
        this.ad = ad;
        this.soyad = soyad;
        this.isebaslama = isebaslama;
        this.tckimlik = tckimlik;
        this.iletisim = iletisim;
    }

    public Personel(Long id, String ad, String soyad, Date isebaslama, String tckimlik, List<String> iletisim) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.isebaslama = isebaslama;
        this.tckimlik = tckimlik;
        this.iletisim = iletisim;
    }

    public Personel(String ad, String soyad, Date isebaslama, String tckimlik, List<String> iletisim, List<Araba> arabalar) {
        this.ad = ad;
        this.soyad = soyad;
        this.isebaslama = isebaslama;
        this.tckimlik = tckimlik;
        this.iletisim = iletisim;
        this.arabalar = arabalar;
    }

    public Personel(String ad, String soyad, Date isebaslama, String tckimlik, List<String> iletisim, List<Araba> arabalar, Departman departman) {
        this.ad = ad;
        this.soyad = soyad;
        this.isebaslama = isebaslama;
        this.tckimlik = tckimlik;
        this.iletisim = iletisim;
        this.arabalar = arabalar;
        this.departman = departman;
    }

    
        
    
    public List<String> getIletisim() {
        return iletisim;
    }

    public void setIletisim(List<String> iletisim) {
        this.iletisim = iletisim;
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

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Date getIsebaslama() {
        return isebaslama;
    }

    public void setIsebaslama(Date isebaslama) {
        this.isebaslama = isebaslama;
    }

    public String getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
    }

    @Override
    public String toString() {
        return "Personel{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", isebaslama=" + isebaslama + ", tckimlik=" + tckimlik + ", iletisim=" + iletisim + '}';
    }

    public List<Araba> getArabalar() {
        return arabalar;
    }

    public void setArabalar(List<Araba> arabalar) {
        this.arabalar = arabalar;
    }

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }
    
    
}
