/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.service;

import com.atlanta.educatic.dao.HorarioDao;
import com.atlanta.educatic.daoImp.HorarioDaoImp;
import com.atlanta.educatic.pojo.Horario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nerio
 */
public class HorarioService {

    HorarioDao horarioService = new HorarioDaoImp();

    public int create(Horario x) {
        return horarioService.save(x);
    }

    public Horario read(int id) {
        return horarioService.get(id);
    }

    public int update(Horario x) {
        return horarioService.update(x);
    }

    public int delete(Horario x) {
        return horarioService.drop(x);
    }

    public List<Horario> list() {
        return horarioService.findAll();
    }

    public Horario get(Map mapa) {
        return horarioService.CriteriaUnique(mapa);
    }
}
