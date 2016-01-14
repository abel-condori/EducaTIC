/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Telefono;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface TelefonoDao {

    public int save(Telefono x);

    public Telefono get(int id);

    public int update(Telefono x);

    public int drop(Telefono x);

    public List<Telefono> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Telefono CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
