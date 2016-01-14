/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Modalidadingreso;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface ModalidadingresoDao {

    public int save(Modalidadingreso x);

    public Modalidadingreso get(int id);

    public int update(Modalidadingreso x);

    public int drop(Modalidadingreso x);

    public List<Modalidadingreso> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Modalidadingreso CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
