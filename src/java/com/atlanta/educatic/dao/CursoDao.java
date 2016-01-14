/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Curso;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface CursoDao {

    public int save(Curso x);

    public Curso get(int id);

    public int update(Curso x);

    public int drop(Curso x);

    public List<Curso> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Curso CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
