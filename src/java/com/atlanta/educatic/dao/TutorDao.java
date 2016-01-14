/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Tutor;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface TutorDao {

    public int save(Tutor x);

    public Tutor get(int id);

    public int update(Tutor x);

    public int drop(Tutor x);

    public List<Tutor> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Tutor CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
