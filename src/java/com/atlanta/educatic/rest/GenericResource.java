/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atlanta.educatic.rest;

import com.atlanta.educatic.pojo.Persona;
import com.atlanta.educatic.service.PersonaService;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Abel
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }
//eswghfjgaaghjsfg
    /**
     * Retrieves representation of an instance of com.sistemas.educatic.rest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("prueba")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona getXml() {
        //TODO return proper representation object
        Persona oPersona = new PersonaService().read(1);
        return oPersona;
        
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
