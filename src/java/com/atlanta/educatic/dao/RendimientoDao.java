/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Rendimiento;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface RendimientoDao {

    public int save(Rendimiento x);

    public Rendimiento get(int id);

    public int update(Rendimiento x);

    public int drop(Rendimiento x);

    public List<Rendimiento> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Rendimiento CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
