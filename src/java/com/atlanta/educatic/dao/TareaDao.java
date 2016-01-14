/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Tarea;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface TareaDao {

    public int save(Tarea x);

    public Tarea get(int id);

    public int update(Tarea x);

    public int drop(Tarea x);

    public List<Tarea> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Tarea CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
