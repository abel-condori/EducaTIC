/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.TareaDao;
import com.atlanta.educatic.daoImp.TareaDaoImp;
import com.atlanta.educatic.pojo.Tarea;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class TareaService {

    TareaDao tareaDao = new TareaDaoImp();

    public int create(Tarea x) {
        return tareaDao.save(x);
    }

    public Tarea read(int id) {
        return tareaDao.get(id);
    }

    public int update(Tarea x) {
        return tareaDao.update(x);
    }

    public int delete(Tarea x) {
        return tareaDao.drop(x);
    }

    public List<Tarea> list() {
        return tareaDao.findAll();
    }

    public Tarea get(Map mapa) {
        return tareaDao.CriteriaUnique(mapa);
    }
}
