/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Docente;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface DocenteDao {

    public int save(Docente x);

    public Docente get(int id);

    public int update(Docente x);

    public int drop(Docente x);

    public List<Docente> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Docente CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
