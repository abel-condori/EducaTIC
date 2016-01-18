/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.rest;

import com.atlanta.educatic.pojo.Persona;
import com.atlanta.educatic.service.PersonaService;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Nerio
 */
@Stateless
@Path("/persona")
public class PersonaREST {
    @GET
    public Persona getPersona(@QueryParam("id") int id){
        PersonaService pService = new PersonaService();
        return pService.read(1);
    }
}
