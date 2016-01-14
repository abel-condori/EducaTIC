/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.DocenteDao;
import com.atlanta.educatic.daoImp.DocenteDaoImp;
import com.atlanta.educatic.pojo.Docente;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class DocenteService {

    DocenteDao docenteDao = new DocenteDaoImp();

    public int create(Docente x) {
        return docenteDao.save(x);
    }

    public Docente read(int id) {
        return docenteDao.get(id);
    }

    public int update(Docente x) {
        return docenteDao.update(x);
    }

    public int delete(Docente x) {
        return docenteDao.drop(x);
    }

    public List<Docente> list() {
        return docenteDao.findAll();
    }

    public Docente get(Map mapa) {
        return docenteDao.CriteriaUnique(mapa);
    }
}
