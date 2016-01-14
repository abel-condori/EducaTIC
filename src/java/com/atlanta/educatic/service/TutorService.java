/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.TutorDao;
import com.atlanta.educatic.daoImp.TutorDaoImp;
import com.atlanta.educatic.pojo.Tutor;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class TutorService {

    TutorDao tutorDao = new TutorDaoImp();

    public int create(Tutor x) {
        return tutorDao.save(x);
    }

    public Tutor read(int id) {
        return tutorDao.get(id);
    }

    public int update(Tutor x) {
        return tutorDao.update(x);
    }

    public int delete(Tutor x) {
        return tutorDao.drop(x);
    }

    public List<Tutor> list() {
        return tutorDao.findAll();
    }

    public Tutor get(Map mapa) {
        return tutorDao.CriteriaUnique(mapa);
    }
}
