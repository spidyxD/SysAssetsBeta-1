/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.dao.sysassets.activosFijosDAO;
import com.dao.sysassets.estadoActivoDAO;
import com.domain.sysassets.ActivosFijos;
import com.domain.sysassets.EstadoActivo;
import java.util.List;

/**
 *
 * @author Addiel
 */
public class testing {
    @SuppressWarnings("empty-statement")
    public static void main(String []args) {
    ActivosFijos af = new ActivosFijos();
    activosFijosDAO afD= new activosFijosDAO();
    List<String> afs = afD.getDescriptions();
     for(int j=0;j<10;j++){
    System.out.println(afs.get(j));}
    
    
    
    EstadoActivo ea = new EstadoActivo();
    estadoActivoDAO eaD = new estadoActivoDAO();
    List<EstadoActivo> efs = eaD.findAll();
    for(int i=0;i<10;i++){
    System.out.println(efs.get(i).getDescripcion());}
    
    
    }
}
