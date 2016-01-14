/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Permiso;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface PermisoDao {

    public int save(Permiso x);

    public Permiso get(int id);

    public int update(Permiso x);

    public int drop(Permiso x);

    public List<Permiso> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Permiso CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
