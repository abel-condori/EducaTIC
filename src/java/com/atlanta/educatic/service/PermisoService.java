/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.PermisoDao;
import com.atlanta.educatic.daoImp.PermisoDaoImp;
import com.atlanta.educatic.pojo.Permiso;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class PermisoService {

    PermisoDao permisoDao = new PermisoDaoImp();

    public int create(Permiso x) {
        return permisoDao.save(x);
    }

    public Permiso read(int id) {
        return permisoDao.get(id);
    }

    public int update(Permiso x) {
        return permisoDao.update(x);
    }

    public int delete(Permiso x) {
        return permisoDao.drop(x);
    }

    public List<Permiso> list() {
        return permisoDao.findAll();
    }

    public Permiso get(Map mapa) {
        return permisoDao.CriteriaUnique(mapa);
    }
}
