/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Persona;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Abel
 */
public interface PersonaDao {
    public int save(Persona x);

    public Persona get(int id);

    public int update(Persona x);

    public int drop(Persona x);

    public List<Persona> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Persona CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
