package com.domain.sysassets;
// Generated 01/08/2018 09:51:25 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Traslados generated by hbm2java
 */
public class Traslados  implements java.io.Serializable {


     private TrasladosId id;
     private ActivosFijos activosFijos;
     private Date fechaTraslado;
     private Short anoFiscal;
     private Byte perProceso;
     private String numDocto;
     private String idEncargadoAnt;
     private String idEncargadoAct;
     private String observaciones;
     private String registradox;

    public Traslados() {
    }

	
    public Traslados(TrasladosId id, ActivosFijos activosFijos) {
        this.id = id;
        this.activosFijos = activosFijos;
    }
    public Traslados(TrasladosId id, ActivosFijos activosFijos, Date fechaTraslado, Short anoFiscal, Byte perProceso, String numDocto, String idEncargadoAnt, String idEncargadoAct, String observaciones, String registradox) {
       this.id = id;
       this.activosFijos = activosFijos;
       this.fechaTraslado = fechaTraslado;
       this.anoFiscal = anoFiscal;
       this.perProceso = perProceso;
       this.numDocto = numDocto;
       this.idEncargadoAnt = idEncargadoAnt;
       this.idEncargadoAct = idEncargadoAct;
       this.observaciones = observaciones;
       this.registradox = registradox;
    }
   
    public TrasladosId getId() {
        return this.id;
    }
    
    public void setId(TrasladosId id) {
        this.id = id;
    }
    public ActivosFijos getActivosFijos() {
        return this.activosFijos;
    }
    
    public void setActivosFijos(ActivosFijos activosFijos) {
        this.activosFijos = activosFijos;
    }
    public Date getFechaTraslado() {
        return this.fechaTraslado;
    }
    
    public void setFechaTraslado(Date fechaTraslado) {
        this.fechaTraslado = fechaTraslado;
    }
    public Short getAnoFiscal() {
        return this.anoFiscal;
    }
    
    public void setAnoFiscal(Short anoFiscal) {
        this.anoFiscal = anoFiscal;
    }
    public Byte getPerProceso() {
        return this.perProceso;
    }
    
    public void setPerProceso(Byte perProceso) {
        this.perProceso = perProceso;
    }
    public String getNumDocto() {
        return this.numDocto;
    }
    
    public void setNumDocto(String numDocto) {
        this.numDocto = numDocto;
    }
    public String getIdEncargadoAnt() {
        return this.idEncargadoAnt;
    }
    
    public void setIdEncargadoAnt(String idEncargadoAnt) {
        this.idEncargadoAnt = idEncargadoAnt;
    }
    public String getIdEncargadoAct() {
        return this.idEncargadoAct;
    }
    
    public void setIdEncargadoAct(String idEncargadoAct) {
        this.idEncargadoAct = idEncargadoAct;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getRegistradox() {
        return this.registradox;
    }
    
    public void setRegistradox(String registradox) {
        this.registradox = registradox;
    }




}


