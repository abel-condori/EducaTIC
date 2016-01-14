/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.RendimientoDao;
import com.atlanta.educatic.daoImp.RendimientoDaoImp;
import com.atlanta.educatic.pojo.Rendimiento;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class RendimientoService {

    RendimientoDao rendimientoDao = new RendimientoDaoImp();

    public int create(Rendimiento x) {
        return rendimientoDao.save(x);
    }

    public Rendimiento read(int id) {
        return rendimientoDao.get(id);
    }

    public int update(Rendimiento x) {
        return rendimientoDao.update(x);
    }

    public int delete(Rendimiento x) {
        return rendimientoDao.drop(x);
    }

    public List<Rendimiento> list() {
        return rendimientoDao.findAll();
    }

    public Rendimiento get(Map mapa) {
        return rendimientoDao.CriteriaUnique(mapa);
    }
}
