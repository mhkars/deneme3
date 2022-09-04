package com.muhammethoca.arabakiralama.utility;

import com.muhammethoca.arabakiralama.repository.entity.Adres;
import com.muhammethoca.arabakiralama.repository.entity.Araba;
import com.muhammethoca.arabakiralama.repository.entity.Kiralama;
import com.muhammethoca.arabakiralama.repository.entity.Musteri;
import com.muhammethoca.arabakiralama.repository.entity.Personel;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    /**
     * Hibernate üzserinden bağlantı kurabilmek için Oturuma ihtiyaç duyarız bunu sağlamak için 
     * hibernate.cfg.xml üzerindeki ayarları kullanarak bir oturum oluşturulur.
     */
    private static final SessionFactory FACTORY;

    static{
        try {
            Configuration configuration = new Configuration();
//            configuration.addAnnotatedClass(Adres.class);
//            configuration.addAnnotatedClass(Araba.class);
//            configuration.addAnnotatedClass(Kiralama.class);
//            configuration.addAnnotatedClass(Musteri.class);
//            configuration.addAnnotatedClass(Personel.class);
            

           
            FACTORY = new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
    
    
}
