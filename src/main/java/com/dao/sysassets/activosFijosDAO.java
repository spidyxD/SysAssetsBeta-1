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
public class activosFijosDAO  extends HibernateUtil implements IBaseDAO <ActivosFijos,Integer>{

    @Override
    public void add(ActivosFijos o) {
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
    public ActivosFijos merge(ActivosFijos o) {
        try{
            operationStart();
            o = (ActivosFijos)getSesion().merge(o);
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
    public void delete(ActivosFijos o) {
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
    public ActivosFijos findById(Integer id) {
         ActivosFijos af = new ActivosFijos();
         
         try{
            operationStart();
            af = (ActivosFijos) getSesion().get(ActivosFijos.class,id);
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
    public List<ActivosFijos> findAll() {
         List<ActivosFijos> listAct = new ArrayList();
         try{
            operationStart();
            listAct = getSesion().createSQLQuery("select *from ACTIVOS.ACTIVOS_FIJOS").addEntity(ActivosFijos.class).list();
            getTransac().commit();
        }
        catch(HibernateException he){
            handleException(he);
            throw he;
        }
        finally{
        getSesion().close();
        }
    return listAct;
    }

    public List<String> getDescriptions() {
         List<String> listAct = new ArrayList();
         try{
            operationStart();
            listAct = getSesion().createSQLQuery("select descripcion from ACTIVOS.ACTIVOS_FIJOS").list();
            getTransac().commit();
        }
        catch(HibernateException he){
            handleException(he);
            throw he;
        }
        finally{
        getSesion().close();
        }
    return listAct;
    }

    
    
    
}
