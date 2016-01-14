/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.ModalidadingresoDao;
import com.atlanta.educatic.daoImp.ModalidadingresoDaoImp;
import com.atlanta.educatic.pojo.Modalidadingreso;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class ModalidadingresoService {

    ModalidadingresoDao modalidadingresoDao = new ModalidadingresoDaoImp();

    public int create(Modalidadingreso x) {
        return modalidadingresoDao.save(x);
    }

    public Modalidadingreso read(int id) {
        return modalidadingresoDao.get(id);
    }

    public int update(Modalidadingreso x) {
        return modalidadingresoDao.update(x);
    }

    public int delete(Modalidadingreso x) {
        return modalidadingresoDao.drop(x);
    }

    public List<Modalidadingreso> list() {
        return modalidadingresoDao.findAll();
    }

    public Modalidadingreso get(Map mapa) {
        return modalidadingresoDao.CriteriaUnique(mapa);
    }
}
