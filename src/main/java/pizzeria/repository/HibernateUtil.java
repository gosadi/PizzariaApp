/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author alkinoos
 */
public class HibernateUtil<E> {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected List<E> findAll(String namedQuery) {
        Query query = getSession().createNamedQuery(namedQuery);
        List<E> list = query.getResultList();
        return list;
    }

    protected E find(Class<E> type, int id) {
        session = getSession();
        E e = session.find(type, id);
        return e;
    }

    

}
