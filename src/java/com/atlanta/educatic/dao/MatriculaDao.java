/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Matricula;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface MatriculaDao {

    public int save(Matricula x);

    public Matricula get(int id);

    public int update(Matricula x);

    public int drop(Matricula x);

    public List<Matricula> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Matricula CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
