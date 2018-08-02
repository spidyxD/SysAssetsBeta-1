/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.sysassets;

import com.domain.sysassets.ActivosFijos;
import com.domain.sysassets.EstadoActivo;
import com.utils.sysassets.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Addiel
 */
public class estadoActivoDAO  extends HibernateUtil implements IBaseDAO <EstadoActivo,Integer>{

     @Override
    public void add(EstadoActivo o) {
          try{
            operationStart();
            getSesion().save(o);
            getTransac().commit();
        }
        catch(HibernateException he){
            handleException(he);
            throw he;
        }
        finally{
        getSesion().close();
        }
    }

    @Override
    public EstadoActivo merge(EstadoActivo o) {
        try{
            operationStart();
            o = (EstadoActivo)getSesion().merge(o);
            getTransac().commit();
        }
        catch(HibernateException he){
            handleException(he);
            throw he;
        }
        finally{
        getSesion().close();
        }
         return o;
    }

    @Override
    public void delete(EstadoActivo o) {
        try{
            operationStart();
            getSesion().delete(o);
            getTransac().commit();
        }
        catch(HibernateException he){
            handleException(he);
            throw he;
        }
        finally{
        getSesion().close();
        }
    }

    @Override
    public EstadoActivo findById(Integer id) {
         EstadoActivo af = new EstadoActivo();
         
         try{
            operationStart();
            af = (EstadoActivo) getSesion().get(EstadoActivo.class,id);
            getTransac().commit();
        }
        catch(HibernateException he){
            handleException(he);
            throw he;
        }
        finally{
        getSesion().close();
        }
         return af;
    }

    @Override
    public List<EstadoActivo> findAll() {
         List<EstadoActivo> listEst = new ArrayList();
         try{
            operationStart();
            listEst = getSesion().createSQLQuery("select *from ACTIVOS.ESTADO_ACTIVO").addEntity(EstadoActivo.class).list();
            getTransac().commit();
        }
        catch(HibernateException he){
            handleException(he);
            throw he;
        }
        finally{
        getSesion().close();
        }
    return listEst;
    }

}
