/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.daoImp;

import com.atlanta.educatic.dao.ModalidadingresoDao;
import com.atlanta.educatic.pojo.Modalidadingreso;
import com.atlanta.educatic.util.HibernateUtil;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Nerio
 */
public class ModalidadingresoDaoImp implements ModalidadingresoDao {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    @Override
    public int save(Modalidadingreso x) {
        Session sesion = sesionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        //Variable de respuesta
        int r = 0;

        try {
            sesion.save(x);
            tx.commit();

            r++;
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            tx.rollback();
        } finally {
            sesion.close();
        }
        return r;
    }

    @Override
    public Modalidadingreso get(int id) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Criteria criteria = sesion.createCriteria(Modalidadingreso.class);
        Modalidadingreso x = (Modalidadingreso) criteria.add(Restrictions.eq("id", id)).uniqueResult();

        sesion.close();

        return x;
    }

    @Override
    public int update(Modalidadingreso x) {
        Session sesion = sesionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        //Variable de respuesta
        int r = 0;

        try {
            sesion.clear();
            sesion.update(x);
            tx.commit();

            r++;
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            tx.rollback();
        } finally {
            sesion.close();
        }

        return r;
    }

    @Override
    public int drop(Modalidadingreso x) {
        Session sesion = sesionFactory.openSession();
        Transaction tx = sesion.beginTransaction();

        //Variable de respuesta
        int r = 0;

        try {
            sesion.delete(x);
            tx.commit();

            r++;
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            tx.rollback();
        } finally {
            sesion.close();
        }
        return r;
    }

    @Override
    public List<Modalidadingreso> findAll() {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Criteria criteria = sesion.createCriteria(Modalidadingreso.class);
        List<Modalidadingreso> lista = (List<Modalidadingreso>) criteria.list();

        sesion.close();

        return lista;
    }

    @Override
    public Object consultUnique(String consulta) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Query query = sesion.createQuery(consulta);
        Object objeto = query.uniqueResult();

        sesion.close();

        return objeto;
    }

    @Override
    public List consultList(String consulta) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Query query = sesion.createQuery(consulta);
        List lista = query.list();

        sesion.close();

        return lista;
    }

    @Override
    public Modalidadingreso CriteriaUnique(Map mapa) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Criteria criteria = sesion.createCriteria(Modalidadingreso.class);
        for (String key : (List<String>) mapa.keySet()) {
            criteria.add(Restrictions.eq(key, mapa.get(key)));
        }
        Modalidadingreso x = (Modalidadingreso) criteria.uniqueResult();

        sesion.close();
        return x;
    }

    @Override
    public List CriteriaList(Map mapa) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Criteria criteria = sesion.createCriteria(Modalidadingreso.class);
        for (String key : (List<String>) mapa.keySet()) {
            criteria.add(Restrictions.eq(key, mapa.get(key)));
        }
        List<Modalidadingreso> lista = (List<Modalidadingreso>) criteria.list();

        sesion.close();
        return lista;
    }
}
