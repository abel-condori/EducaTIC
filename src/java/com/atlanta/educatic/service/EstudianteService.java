/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.EstudianteDao;
import com.atlanta.educatic.daoImp.EstudianteDaoImp;
import com.atlanta.educatic.pojo.Estudiante;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class EstudianteService {

    EstudianteDao estudianteDao = new EstudianteDaoImp();

    public int create(Estudiante x) {
        return estudianteDao.save(x);
    }

    public Estudiante read(int id) {
        return estudianteDao.get(id);
    }

    public int update(Estudiante x) {
        return estudianteDao.update(x);
    }

    public int delete(Estudiante x) {
        return estudianteDao.drop(x);
    }

    public List<Estudiante> list() {
        return estudianteDao.findAll();
    }

    public Estudiante get(Map mapa) {
        return estudianteDao.CriteriaUnique(mapa);
    }
}
