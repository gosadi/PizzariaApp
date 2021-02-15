/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria.repository;

import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;


public class HibernateUtil<E> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected List<E> findAll(String namedQuery) {
        Query query = getSession().createNamedQuery(namedQuery);
        List<E> list = query.getResultList();
        return list;
    }

    protected E findById(String namedQuery, String parameterKey, int parameterValue) {
        Query query = getSession().createNamedQuery(namedQuery);
        query.setParameter(parameterKey, parameterValue);
        E e = (E) query.getSingleResult();
        return e;
    }

    protected void save(E e){
        getSession().saveOrUpdate(e);
        
    }
//    na to kanoume me MAP
//    protected List<E> findByNamedQueryDynamic(String namedQuery, Map<String,Object> parameters){
//        for(Entry e : parameters){
//            query.setParameter(e.key,e.value);
//        }
//    }

}
