/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        Configuration config = new Configuration();
        config.configure();

        SessionFactory sessionFactory = config.buildSessionFactory();

        return sessionFactory;

    }

}
