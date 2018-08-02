package com.domain.sysassets;
// Generated 01/08/2018 09:51:25 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ActivosFijos generated by hbm2java
 */
public class ActivosFijos  implements java.io.Serializable {


     private ActivosFijosId id;
     private Localizacion localizacion;
     private Encargado encargado;
     private Departamento departamento;
     private String tipActivo;
     private String descripcion;
     private String ubicacion;
     private String estado;
     private String numOrden;
     private Date fechaAdq;
     private BigDecimal montoCompra;
     private String codCta;
     private String placaFisica;
     private Integer vidaUtil;
     private BigDecimal valorActual;
     private BigDecimal depreciacionAcumulada;
     private String modelo;
     private String serie;
     private BigDecimal mejoras;
     private String indActivo;
     private BigDecimal revaluacion;
     private Short numDepreciaciones;
     private BigDecimal valorRescate;
     private String indPlaca;
     private String marca;
     private String caracteristicas;
     private String numFactura;
     private String numCheque;
     private String activoContable;
     private Date fechaIngreso;
     private String registradox;
     private String foto;
     private Long cajaChica;
     private Set<Mejoras> mejorases = new HashSet<Mejoras>(0);
     private Retiro retiro;
     private Set<Traslados> trasladoses = new HashSet<Traslados>(0);
     private Set<Depreciacion> depreciacions = new HashSet<Depreciacion>(0);

    public ActivosFijos() {
    }

	
    public ActivosFijos(ActivosFijosId id, Encargado encargado, Departamento departamento, String estado) {
        this.id = id;
        this.encargado = encargado;
        this.departamento = departamento;
        this.estado = estado;
    }
    public ActivosFijos(ActivosFijosId id, Localizacion localizacion, Encargado encargado, Departamento departamento, String tipActivo, String descripcion, String ubicacion, String estado, String numOrden, Date fechaAdq, BigDecimal montoCompra, String codCta, String placaFisica, Integer vidaUtil, BigDecimal valorActual, BigDecimal depreciacionAcumulada, String modelo, String serie, BigDecimal mejoras, String indActivo, BigDecimal revaluacion, Short numDepreciaciones, BigDecimal valorRescate, String indPlaca, String marca, String caracteristicas, String numFactura, String numCheque, String activoContable, Date fechaIngreso, String registradox, String foto, Long cajaChica, Set<Mejoras> mejorases, Retiro retiro, Set<Traslados> trasladoses, Set<Depreciacion> depreciacions) {
       this.id = id;
       this.localizacion = localizacion;
       this.encargado = encargado;
       this.departamento = departamento;
       this.tipActivo = tipActivo;
       this.descripcion = descripcion;
       this.ubicacion = ubicacion;
       this.estado = estado;
       this.numOrden = numOrden;
       this.fechaAdq = fechaAdq;
       this.montoCompra = montoCompra;
       this.codCta = codCta;
       this.placaFisica = placaFisica;
       this.vidaUtil = vidaUtil;
       this.valorActual = valorActual;
       this.depreciacionAcumulada = depreciacionAcumulada;
       this.modelo = modelo;
       this.serie = serie;
       this.mejoras = mejoras;
       this.indActivo = indActivo;
       this.revaluacion = revaluacion;
       this.numDepreciaciones = numDepreciaciones;
       this.valorRescate = valorRescate;
       this.indPlaca = indPlaca;
       this.marca = marca;
       this.caracteristicas = caracteristicas;
       this.numFactura = numFactura;
       this.numCheque = numCheque;
       this.activoContable = activoContable;
       this.fechaIngreso = fechaIngreso;
       this.registradox = registradox;
       this.foto = foto;
       this.cajaChica = cajaChica;
       this.mejorases = mejorases;
       this.retiro = retiro;
       this.trasladoses = trasladoses;
       this.depreciacions = depreciacions;
    }
   
    public ActivosFijosId getId() {
        return this.id;
    }
    
    public void setId(ActivosFijosId id) {
        this.id = id;
    }
    public Localizacion getLocalizacion() {
        return this.localizacion;
    }
    
    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
    public Encargado getEncargado() {
        return this.encargado;
    }
    
    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getTipActivo() {
        return this.tipActivo;
    }
    
    public void setTipActivo(String tipActivo) {
        this.tipActivo = tipActivo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getNumOrden() {
        return this.numOrden;
    }
    
    public void setNumOrden(String numOrden) {
        this.numOrden = numOrden;
    }
    public Date getFechaAdq() {
        return this.fechaAdq;
    }
    
    public void setFechaAdq(Date fechaAdq) {
        this.fechaAdq = fechaAdq;
    }
    public BigDecimal getMontoCompra() {
        return this.montoCompra;
    }
    
    public void setMontoCompra(BigDecimal montoCompra) {
        this.montoCompra = montoCompra;
    }
    public String getCodCta() {
        return this.codCta;
    }
    
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    public String getPlacaFisica() {
        return this.placaFisica;
    }
    
    public void setPlacaFisica(String placaFisica) {
        this.placaFisica = placaFisica;
    }
    public Integer getVidaUtil() {
        return this.vidaUtil;
    }
    
    public void setVidaUtil(Integer vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
    public BigDecimal getValorActual() {
        return this.valorActual;
    }
    
    public void setValorActual(BigDecimal valorActual) {
        this.valorActual = valorActual;
    }
    public BigDecimal getDepreciacionAcumulada() {
        return this.depreciacionAcumulada;
    }
    
    public void setDepreciacionAcumulada(BigDecimal depreciacionAcumulada) {
        this.depreciacionAcumulada = depreciacionAcumulada;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getSerie() {
        return this.serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public BigDecimal getMejoras() {
        return this.mejoras;
    }
    
    public void setMejoras(BigDecimal mejoras) {
        this.mejoras = mejoras;
    }
    public String getIndActivo() {
        return this.indActivo;
    }
    
    public void setIndActivo(String indActivo) {
        this.indActivo = indActivo;
    }
    public BigDecimal getRevaluacion() {
        return this.revaluacion;
    }
    
    public void setRevaluacion(BigDecimal revaluacion) {
        this.revaluacion = revaluacion;
    }
    public Short getNumDepreciaciones() {
        return this.numDepreciaciones;
    }
    
    public void setNumDepreciaciones(Short numDepreciaciones) {
        this.numDepreciaciones = numDepreciaciones;
    }
    public BigDecimal getValorRescate() {
        return this.valorRescate;
    }
    
    public void setValorRescate(BigDecimal valorRescate) {
        this.valorRescate = valorRescate;
    }
    public String getIndPlaca() {
        return this.indPlaca;
    }
    
    public void setIndPlaca(String indPlaca) {
        this.indPlaca = indPlaca;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCaracteristicas() {
        return this.caracteristicas;
    }
    
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public String getNumFactura() {
        return this.numFactura;
    }
    
    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }
    public String getNumCheque() {
        return this.numCheque;
    }
    
    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }
    public String getActivoContable() {
        return this.activoContable;
    }
    
    public void setActivoContable(String activoContable) {
        this.activoContable = activoContable;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getRegistradox() {
        return this.registradox;
    }
    
    public void setRegistradox(String registradox) {
        this.registradox = registradox;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Long getCajaChica() {
        return this.cajaChica;
    }
    
    public void setCajaChica(Long cajaChica) {
        this.cajaChica = cajaChica;
    }
    public Set<Mejoras> getMejorases() {
        return this.mejorases;
    }
    
    public void setMejorases(Set<Mejoras> mejorases) {
        this.mejorases = mejorases;
    }
    public Retiro getRetiro() {
        return this.retiro;
    }
    
    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }
    public Set<Traslados> getTrasladoses() {
        return this.trasladoses;
    }
    
    public void setTrasladoses(Set<Traslados> trasladoses) {
        this.trasladoses = trasladoses;
    }
    public Set<Depreciacion> getDepreciacions() {
        return this.depreciacions;
    }
    
    public void setDepreciacions(Set<Depreciacion> depreciacions) {
        this.depreciacions = depreciacions;
    }




}


