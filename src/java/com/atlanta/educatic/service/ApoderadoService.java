/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.ApoderadoDao;
import com.atlanta.educatic.daoImp.ApoderadoDaoImp;
import com.atlanta.educatic.pojo.Apoderado;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class ApoderadoService {

    ApoderadoDao apoderadoDao = new ApoderadoDaoImp();

    public int create(Apoderado x) {
        return apoderadoDao.save(x);
    }

    public Apoderado read(int id) {
        return apoderadoDao.get(id);
    }

    public int update(Apoderado x) {
        return apoderadoDao.update(x);
    }

    public int delete(Apoderado x) {
        return apoderadoDao.drop(x);
    }

    public List<Apoderado> list() {
        return apoderadoDao.findAll();
    }

    public Apoderado get(Map mapa) {
        return apoderadoDao.CriteriaUnique(mapa);
    }
}
