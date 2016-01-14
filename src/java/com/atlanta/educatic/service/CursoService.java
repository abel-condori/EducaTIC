/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.CursoDao;
import com.atlanta.educatic.daoImp.CursoDaoImp;
import com.atlanta.educatic.pojo.Curso;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class CursoService {

    CursoDao cursoDao = new CursoDaoImp();

    public int create(Curso x) {
        return cursoDao.save(x);
    }

    public Curso read(int id) {
        return cursoDao.get(id);
    }

    public int update(Curso x) {
        return cursoDao.update(x);
    }

    public int delete(Curso x) {
        return cursoDao.drop(x);
    }

    public List<Curso> list() {
        return cursoDao.findAll();
    }

    public Curso get(Map mapa) {
        return cursoDao.CriteriaUnique(mapa);
    }
}
