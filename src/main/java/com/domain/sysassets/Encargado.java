package com.domain.sysassets;
// Generated 01/08/2018 09:51:25 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Encargado generated by hbm2java
 */
public class Encargado  implements java.io.Serializable {


     private EncargadoId id;
     private Departamento departamento;
     private String nombre;
     private Set<ActivosFijos> activosFijoses = new HashSet<ActivosFijos>(0);

    public Encargado() {
    }

	
    public Encargado(EncargadoId id, Departamento departamento) {
        this.id = id;
        this.departamento = departamento;
    }
    public Encargado(EncargadoId id, Departamento departamento, String nombre, Set<ActivosFijos> activosFijoses) {
       this.id = id;
       this.departamento = departamento;
       this.nombre = nombre;
       this.activosFijoses = activosFijoses;
    }
   
    public EncargadoId getId() {
        return this.id;
    }
    
    public void setId(EncargadoId id) {
        this.id = id;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<ActivosFijos> getActivosFijoses() {
        return this.activosFijoses;
    }
    
    public void setActivosFijoses(Set<ActivosFijos> activosFijoses) {
        this.activosFijoses = activosFijoses;
    }




}


