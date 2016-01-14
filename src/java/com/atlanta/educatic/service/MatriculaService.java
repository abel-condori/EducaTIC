/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.MatriculaDao;
import com.atlanta.educatic.daoImp.MatriculaDaoImp;
import com.atlanta.educatic.pojo.Matricula;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class MatriculaService {

    MatriculaDao matriculaDao = new MatriculaDaoImp();

    public int create(Matricula x) {
        return matriculaDao.save(x);
    }

    public Matricula read(int id) {
        return matriculaDao.get(id);
    }

    public int update(Matricula x) {
        return matriculaDao.update(x);
    }

    public int delete(Matricula x) {
        return matriculaDao.drop(x);
    }

    public List<Matricula> list() {
        return matriculaDao.findAll();
    }

    public Matricula get(Map mapa) {
        return matriculaDao.CriteriaUnique(mapa);
    }
}
