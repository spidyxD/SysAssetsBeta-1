package com.domain.sysassets;
// Generated 01/08/2018 09:51:25 PM by Hibernate Tools 4.3.1



/**
 * ActivosFijosId generated by hbm2java
 */
public class ActivosFijosId  implements java.io.Serializable {


     private String codCia;
     private long codActivo;

    public ActivosFijosId() {
    }

    public ActivosFijosId(String codCia, long codActivo) {
       this.codCia = codCia;
       this.codActivo = codActivo;
    }
   
    public String getCodCia() {
        return this.codCia;
    }
    
    public void setCodCia(String codCia) {
        this.codCia = codCia;
    }
    public long getCodActivo() {
        return this.codActivo;
    }
    
    public void setCodActivo(long codActivo) {
        this.codActivo = codActivo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ActivosFijosId) ) return false;
		 ActivosFijosId castOther = ( ActivosFijosId ) other; 
         
		 return ( (this.getCodCia()==castOther.getCodCia()) || ( this.getCodCia()!=null && castOther.getCodCia()!=null && this.getCodCia().equals(castOther.getCodCia()) ) )
 && (this.getCodActivo()==castOther.getCodActivo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodCia() == null ? 0 : this.getCodCia().hashCode() );
         result = 37 * result + (int) this.getCodActivo();
         return result;
   }   


}


