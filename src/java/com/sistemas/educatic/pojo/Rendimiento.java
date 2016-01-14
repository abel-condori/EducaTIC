package com.sistemas.educatic.pojo;
// Generated Jan 13, 2016 4:10:46 PM by Hibernate Tools 4.3.1



/**
 * Rendimiento generated by hbm2java
 */
public class Rendimiento  implements java.io.Serializable {


     private int id;
     private GradoCurso gradoCurso;
     private Byte promedio1;
     private Byte promedio2;
     private Byte promedio3;
     private Byte promedioFinal;
     private Byte estado;
     private String observacion;
     private int idUsuario;

    public Rendimiento() {
    }

	
    public Rendimiento(int id, GradoCurso gradoCurso, int idUsuario) {
        this.id = id;
        this.gradoCurso = gradoCurso;
        this.idUsuario = idUsuario;
    }
    public Rendimiento(int id, GradoCurso gradoCurso, Byte promedio1, Byte promedio2, Byte promedio3, Byte promedioFinal, Byte estado, String observacion, int idUsuario) {
       this.id = id;
       this.gradoCurso = gradoCurso;
       this.promedio1 = promedio1;
       this.promedio2 = promedio2;
       this.promedio3 = promedio3;
       this.promedioFinal = promedioFinal;
       this.estado = estado;
       this.observacion = observacion;
       this.idUsuario = idUsuario;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public GradoCurso getGradoCurso() {
        return this.gradoCurso;
    }
    
    public void setGradoCurso(GradoCurso gradoCurso) {
        this.gradoCurso = gradoCurso;
    }
    public Byte getPromedio1() {
        return this.promedio1;
    }
    
    public void setPromedio1(Byte promedio1) {
        this.promedio1 = promedio1;
    }
    public Byte getPromedio2() {
        return this.promedio2;
    }
    
    public void setPromedio2(Byte promedio2) {
        this.promedio2 = promedio2;
    }
    public Byte getPromedio3() {
        return this.promedio3;
    }
    
    public void setPromedio3(Byte promedio3) {
        this.promedio3 = promedio3;
    }
    public Byte getPromedioFinal() {
        return this.promedioFinal;
    }
    
    public void setPromedioFinal(Byte promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
    public Byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(Byte estado) {
        this.estado = estado;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }




}

