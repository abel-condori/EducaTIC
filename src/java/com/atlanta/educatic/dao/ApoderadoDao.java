/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Apoderado;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface ApoderadoDao {

    public int save(Apoderado x);

    public Apoderado get(int id);

    public int update(Apoderado x);

    public int drop(Apoderado x);

    public List<Apoderado> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Apoderado CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
