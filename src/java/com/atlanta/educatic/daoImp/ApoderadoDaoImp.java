/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.daoImp;

import com.atlanta.educatic.dao.ApoderadoDao;
import com.atlanta.educatic.pojo.Apoderado;
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
public class ApoderadoDaoImp implements ApoderadoDao {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    @Override
    public int save(Apoderado x) {
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
    public Apoderado get(int id) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Criteria criteria = sesion.createCriteria(Apoderado.class);
        Apoderado x = (Apoderado) criteria.add(Restrictions.eq("id", id)).uniqueResult();

        sesion.close();

        return x;
    }

    @Override
    public int update(Apoderado x) {
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
    public int drop(Apoderado x) {
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
    public List<Apoderado> findAll() {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Criteria criteria = sesion.createCriteria(Apoderado.class);
        List<Apoderado> lista = (List<Apoderado>) criteria.list();

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
    public Apoderado CriteriaUnique(Map mapa) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Criteria criteria = sesion.createCriteria(Apoderado.class);
        for (String key : (List<String>) mapa.keySet()) {
            criteria.add(Restrictions.eq(key, mapa.get(key)));
        }
        Apoderado x = (Apoderado) criteria.uniqueResult();

        sesion.close();
        return x;
    }

    @Override
    public List CriteriaList(Map mapa) {
        Session sesion = sesionFactory.openSession();
        sesion.beginTransaction().commit();

        Criteria criteria = sesion.createCriteria(Apoderado.class);
        for (String key : (List<String>) mapa.keySet()) {
            criteria.add(Restrictions.eq(key, mapa.get(key)));
        }
        List<Apoderado> lista = (List<Apoderado>) criteria.list();

        sesion.close();
        return lista;
    }
}
