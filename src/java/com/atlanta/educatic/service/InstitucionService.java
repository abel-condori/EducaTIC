/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.InstitucionDao;
import com.atlanta.educatic.dao.InstitucionDao;
import com.atlanta.educatic.daoImp.InstitucionDaoImp;
import com.atlanta.educatic.pojo.Institucion;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Canelzi
 */
public class InstitucionService {
        InstitucionDao institucionDao =  new InstitucionDaoImp();

 
    public int create(Institucion x) {
        return institucionDao.save(x);
    }

    public Institucion read(int id) {
        return institucionDao.get(id);
    }

    public int update(Institucion x) {
        return institucionDao.update(x);
    }

    public int delete(Institucion x) {
        return institucionDao.drop(x);
    }

    public List<Institucion> list() {
        return institucionDao.findAll();
    }

    public Institucion get(Map mapa) {
        return institucionDao.CriteriaUnique(mapa);
    }
}
