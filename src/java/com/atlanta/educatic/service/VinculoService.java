/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atlanta.educatic.service;


import com.atlanta.educatic.dao.VinculoDao;
import com.atlanta.educatic.daoImp.VinculoDaoImp;
import com.atlanta.educatic.pojo.Vinculo;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Canelzi
 */
public class VinculoService {
      VinculoDao vinculoDao =  new VinculoDaoImp();

 
    public int create(Vinculo x) {
        return vinculoDao.save(x);
    }

    public Vinculo read(int id) {
        return vinculoDao.get(id);
    }

    public int update(Vinculo x) {
        return vinculoDao.update(x);
    }

    public int delete(Vinculo x) {
        return vinculoDao.drop(x);
    }

    public List<Vinculo> list() {
        return vinculoDao.findAll();
    }

    public Vinculo get(Map mapa) {
        return vinculoDao.CriteriaUnique(mapa);
    }
}
