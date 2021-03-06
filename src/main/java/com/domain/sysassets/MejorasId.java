package com.domain.sysassets;
// Generated 01/08/2018 09:51:25 PM by Hibernate Tools 4.3.1



/**
 * MejorasId generated by hbm2java
 */
public class MejorasId  implements java.io.Serializable {


     private String codCia;
     private long codActivo;
     private int numMejora;

    public MejorasId() {
    }

    public MejorasId(String codCia, long codActivo, int numMejora) {
       this.codCia = codCia;
       this.codActivo = codActivo;
       this.numMejora = numMejora;
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
    public int getNumMejora() {
        return this.numMejora;
    }
    
    public void setNumMejora(int numMejora) {
        this.numMejora = numMejora;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MejorasId) ) return false;
		 MejorasId castOther = ( MejorasId ) other; 
         
		 return ( (this.getCodCia()==castOther.getCodCia()) || ( this.getCodCia()!=null && castOther.getCodCia()!=null && this.getCodCia().equals(castOther.getCodCia()) ) )
 && (this.getCodActivo()==castOther.getCodActivo())
 && (this.getNumMejora()==castOther.getNumMejora());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodCia() == null ? 0 : this.getCodCia().hashCode() );
         result = 37 * result + (int) this.getCodActivo();
         result = 37 * result + this.getNumMejora();
         return result;
   }   


}


