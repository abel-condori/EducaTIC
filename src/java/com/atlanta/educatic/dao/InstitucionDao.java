/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Institucion;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Canelzi
 */
public interface InstitucionDao {
    public int save(Institucion x);

    public Institucion get(int id);

    public int update(Institucion x);

    public int drop(Institucion x);

    public List<Institucion> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Institucion CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
