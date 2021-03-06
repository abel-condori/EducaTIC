package com.atlanta.educatic.pojo;
// Generated 14/01/2016 06:39:31 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Apoderado generated by hbm2java
 */
public class Apoderado  implements java.io.Serializable {


     private int id;
     private Persona persona;
     private Tablamaestra tablamaestra;
     private Vinculo vinculo;
     private String descripcion;
     private String observacion;
     private int idusuario;
     private Date fechaRegistro;
     private Set matriculas = new HashSet(0);

    public Apoderado() {
    }

	
    public Apoderado(int id, Persona persona, Tablamaestra tablamaestra, Vinculo vinculo, String descripcion, int idusuario, Date fechaRegistro) {
        this.id = id;
        this.persona = persona;
        this.tablamaestra = tablamaestra;
        this.vinculo = vinculo;
        this.descripcion = descripcion;
        this.idusuario = idusuario;
        this.fechaRegistro = fechaRegistro;
    }
    public Apoderado(int id, Persona persona, Tablamaestra tablamaestra, Vinculo vinculo, String descripcion, String observacion, int idusuario, Date fechaRegistro, Set matriculas) {
       this.id = id;
       this.persona = persona;
       this.tablamaestra = tablamaestra;
       this.vinculo = vinculo;
       this.descripcion = descripcion;
       this.observacion = observacion;
       this.idusuario = idusuario;
       this.fechaRegistro = fechaRegistro;
       this.matriculas = matriculas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Tablamaestra getTablamaestra() {
        return this.tablamaestra;
    }
    
    public void setTablamaestra(Tablamaestra tablamaestra) {
        this.tablamaestra = tablamaestra;
    }
    public Vinculo getVinculo() {
        return this.vinculo;
    }
    
    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }




}


