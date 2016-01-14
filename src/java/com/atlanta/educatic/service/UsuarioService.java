/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.UsuarioDao;
import com.atlanta.educatic.daoImp.UsuarioDaoImp;
import com.atlanta.educatic.pojo.Usuario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class UsuarioService {

    UsuarioDao usuarioDao = new UsuarioDaoImp();

    public int create(Usuario x) {
        return usuarioDao.save(x);
    }

    public Usuario read(int id) {
        return usuarioDao.get(id);
    }

    public int update(Usuario x) {
        return usuarioDao.update(x);
    }

    public int delete(Usuario x) {
        return usuarioDao.drop(x);
    }

    public List<Usuario> list() {
        return usuarioDao.findAll();
    }

    public Usuario get(Map mapa) {
        return usuarioDao.CriteriaUnique(mapa);
    }
}
