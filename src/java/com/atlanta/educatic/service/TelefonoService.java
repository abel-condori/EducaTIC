/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.TelefonoDao;
import com.atlanta.educatic.daoImp.TelefonoDaoImp;
import com.atlanta.educatic.pojo.Telefono;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class TelefonoService {

    TelefonoDao telefonoDao = new TelefonoDaoImp();

    public int create(Telefono x) {
        return telefonoDao.save(x);
    }

    public Telefono read(int id) {
        return telefonoDao.get(id);
    }

    public int update(Telefono x) {
        return telefonoDao.update(x);
    }

    public int delete(Telefono x) {
        return telefonoDao.drop(x);
    }

    public List<Telefono> list() {
        return telefonoDao.findAll();
    }

    public Telefono get(Map mapa) {
        return telefonoDao.CriteriaUnique(mapa);
    }
}
