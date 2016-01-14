/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Vinculo;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Canelzi
 */
public interface VinculoDao {
      public int save(Vinculo x);

    public Vinculo get(int id);

    public int update(Vinculo x);

    public int drop(Vinculo x);
//dfgfs
    public List<Vinculo> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Vinculo CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
