package com.atlanta.educatic.pojo;
// Generated 14/01/2016 06:39:31 PM by Hibernate Tools 4.3.1



/**
 * UsuarioPermiso generated by hbm2java
 */
public class UsuarioPermiso  implements java.io.Serializable {


     private int id;
     private Permiso permiso;
     private Tablamaestra tablamaestra;
     private Usuario usuario;
     private String url;

    public UsuarioPermiso() {
    }

    public UsuarioPermiso(int id, Permiso permiso, Tablamaestra tablamaestra, Usuario usuario, String url) {
       this.id = id;
       this.permiso = permiso;
       this.tablamaestra = tablamaestra;
       this.usuario = usuario;
       this.url = url;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Permiso getPermiso() {
        return this.permiso;
    }
    
    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }
    public Tablamaestra getTablamaestra() {
        return this.tablamaestra;
    }
    
    public void setTablamaestra(Tablamaestra tablamaestra) {
        this.tablamaestra = tablamaestra;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


