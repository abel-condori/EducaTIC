/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Estudiante;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface EstudianteDao {

    public int save(Estudiante x);

    public Estudiante get(int id);

    public int update(Estudiante x);

    public int drop(Estudiante x);

    public List<Estudiante> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Estudiante CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
