package com.sistemas.educatic.pojo;
// Generated Jan 13, 2016 4:10:46 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Matricula generated by hbm2java
 */
public class Matricula  implements java.io.Serializable {


     private int id;
     private Apoderado apoderado;
     private Estudiante estudiante;
     private Modalidadingreso modalidadingreso;
     private Date fecha;
     private int idUsuario;
     private Set grados = new HashSet(0);

    public Matricula() {
    }

	
    public Matricula(int id, Apoderado apoderado, Estudiante estudiante, Modalidadingreso modalidadingreso, int idUsuario) {
        this.id = id;
        this.apoderado = apoderado;
        this.estudiante = estudiante;
        this.modalidadingreso = modalidadingreso;
        this.idUsuario = idUsuario;
    }
    public Matricula(int id, Apoderado apoderado, Estudiante estudiante, Modalidadingreso modalidadingreso, Date fecha, int idUsuario, Set grados) {
       this.id = id;
       this.apoderado = apoderado;
       this.estudiante = estudiante;
       this.modalidadingreso = modalidadingreso;
       this.fecha = fecha;
       this.idUsuario = idUsuario;
       this.grados = grados;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Apoderado getApoderado() {
        return this.apoderado;
    }
    
    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Modalidadingreso getModalidadingreso() {
        return this.modalidadingreso;
    }
    
    public void setModalidadingreso(Modalidadingreso modalidadingreso) {
        this.modalidadingreso = modalidadingreso;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Set getGrados() {
        return this.grados;
    }
    
    public void setGrados(Set grados) {
        this.grados = grados;
    }




}

