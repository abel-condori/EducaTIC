/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.dao;

import com.atlanta.educatic.pojo.Usuario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public interface UsuarioDao {

    public int save(Usuario x);

    public Usuario get(int id);

    public int update(Usuario x);

    public int drop(Usuario x);

    public List<Usuario> findAll();

    public Object consultUnique(String consulta);

    public List consultList(String consulta);

    public Usuario CriteriaUnique(Map mapa);

    public List CriteriaList(Map mapa);
}
