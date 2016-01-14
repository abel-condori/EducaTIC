/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Horario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface HorarioDao {

    public int save(Horario x);

    public Horario get(int id);

    public int update(Horario x);

    public int drop(Horario x);

    public List<Horario> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Horario CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
