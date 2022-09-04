
package com.muhammethoca.arabakiralama.repository.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="tblkiralama")
@Entity
public class Kiralama {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)        
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date kiralamatarihi;
    @Temporal(TemporalType.TIMESTAMP)
    private Date islemtarihi;
    
    @ManyToMany(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Araba> arabalar;

    public Kiralama(Date kiralamatarihi, Date islemtarihi, List<Araba> arabalar) {
        this.kiralamatarihi = kiralamatarihi;
        this.islemtarihi = islemtarihi;
        this.arabalar = arabalar;
    }

    public Kiralama() {
    } 

    public Kiralama(Date kiralamatarihi, Date islemtarihi) {
        this.kiralamatarihi = kiralamatarihi;
        this.islemtarihi = islemtarihi;
    }

    public Kiralama(Long id, Date kiralamatarihi, Date islemtarihi) {
        this.id = id;
        this.kiralamatarihi = kiralamatarihi;
        this.islemtarihi = islemtarihi;
    }

    public Date getIslemtarihi() {
        return islemtarihi;
    }

    public void setIslemtarihi(Date islemtarihi) {
        this.islemtarihi = islemtarihi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getKiralamatarihi() {
        return kiralamatarihi;
    }

    public void setKiralamatarihi(Date kiralamatarihi) {
        this.kiralamatarihi = kiralamatarihi;
    }

    @Override
    public String toString() {
        return "Kiralama{" + "id=" + id + ", kiralamatarihi=" + kiralamatarihi + ", islemtarihi=" + islemtarihi + '}';
    }

    public List<Araba> getArabalar() {
        return arabalar;
    }

    public void setArabalar(List<Araba> arabalar) {
        this.arabalar = arabalar;
    }
    
    
    }