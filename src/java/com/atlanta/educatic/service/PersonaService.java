/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

/**
 *
 * @author Abel
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.atlanta.educatic.dao.PersonaDao;
import com.atlanta.educatic.daoImp.PersonaDaoImp;
import com.atlanta.educatic.pojo.Persona;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Nerio
 */
public class PersonaService {

    PersonaDao personaDao =  new PersonaDaoImp();

 
    public int create(Persona x) {
        return personaDao.save(x);
    }

    public Persona read(int id) {
        return personaDao.get(id);
    }

    public int update(Persona x) {
        return personaDao.update(x);
    }

    public int delete(Persona x) {
        return personaDao.drop(x);
    }

    public List<Persona> list() {
        return personaDao.findAll();
    }

    public Persona get(Map mapa) {
        return personaDao.CriteriaUnique(mapa);
    }
}
