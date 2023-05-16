
package BACKEND;

public class clsGeneral {
    
    
    /*RECPCIONISTAS*/
    public String NOMBRE_RECEPCIONISTA;
    public String CONTRASEÑA;
    
    
    /*EXPERTOS*/
    public String NOMBRE; /*TAMBIEN APLICADO EN CITA*/
    public String PELICULA; 
    public String DIA;
    public String CODIGO_EXPERTO;
    
    /*PERSONAJES*/
    public String NOMBRE_PERSONAJE; /*TAMBIEN APLICADO EN CITA*/
    public String PELICULA1;
    public String PELICULA2;
    public String PELICULA3;
    public String PELICULA4;
    public String PELICULA5;
    public String PELICULA6;
    public String PELICULA7;
    public String PELICULA8;
    public String CODIGO_PERSONAJE;
    
    
    /*CITA*/
    public String NOMBRE_AFICIONADO;
    public String DIA_DESEADO;
    public String CODIGO_CITA;
    
    
    public clsGeneral(){
    }
    
    
        /*RECEPCIONISTA  GET Y SET*/
        public String getNOMBRE_RECEPCIONISTA(){
            return NOMBRE_RECEPCIONISTA;
        }
       public void setNOMBRE_RECEPCIONISTA(String NOMBRE_RECEPCIONISTA){
        this.NOMBRE_RECEPCIONISTA= NOMBRE_RECEPCIONISTA;
    }
       public String getCONSTRASEÑA(){
            return CONTRASEÑA;
        }
       public void setCONTRASEÑA(String CONTRASEÑA){
        this.CONTRASEÑA= CONTRASEÑA;
    }
       
       
       /*EXPERTOS GET Y SET*/
       public String getNOMBRE(){
            return NOMBRE;
        }
       public void setNOMBRE(String NOMBRE){
        this.NOMBRE= NOMBRE;   /*APLICA A CITA*/
        }
       public String getPELICULA(){
            return PELICULA; 
        }
       public void setPELICULA(String PELICULA){
        this.PELICULA= PELICULA;   /*APLICA A PERSONAJE*/
        }
       public String getDIA(){
            return DIA;
        }
       public void setDIA(String DIA){
        this.DIA= DIA;
        }
       public String getCODIGO_EXPERTO(){
            return CODIGO_EXPERTO;
        }
       public void setCODIGO_EXPERTO(String CODIGO_EXPERTO){
        this.CODIGO_EXPERTO= CODIGO_EXPERTO;
        }
       
       /*PERSONAJE GET Y SET*/
       public String getNOMBRE_PERSONAJE(){
            return NOMBRE_PERSONAJE;
        }
       public void setNOMBRE_PERSONAJE(String NOMBRE_PERSONAJE){
        this.NOMBRE_PERSONAJE= NOMBRE_PERSONAJE; /*APLICA A CITA*/
        }
       public String getPELICULA1(){
            return PELICULA1; 
        }
       public void setPELICULA1(String PELICULA1){
        this.PELICULA1= PELICULA1;   
        }
       public String getPELICULA2(){
            return PELICULA2; 
        }
       public void setPELICULA2(String PELICULA2){
        this.PELICULA2= PELICULA2;   
        }
       public String getPELICULA3(){
            return PELICULA3; 
        }
       public void setPELICULA3(String PELICULA3){
        this.PELICULA3= PELICULA3;   
        }
       public String getPELICULA4(){
            return PELICULA4; 
        }
       public void setPELICULA4(String PELICULA4){
        this.PELICULA4= PELICULA4;   
        }
       public String getPELICULA5(){
            return PELICULA5; 
        }
       public void setPELICULA5(String PELICULA5){
        this.PELICULA5= PELICULA5;   
        }
       public String getPELICULA6(){
            return PELICULA6; 
        }
       public void setPELICULA6(String PELICULA6){
        this.PELICULA6= PELICULA6;   
        }
       public String getPELICULA7(){
            return PELICULA7; 
        }
       public void setPELICULA7(String PELICULA7){
        this.PELICULA7= PELICULA7;   
        }
       public String getPELICULA8(){
            return PELICULA8; 
        }
       public void setPELICULA8(String PELICULA8){
        this.PELICULA8= PELICULA8;   
        }
       public String getCODIGO_PERSONAJE(){
            return CODIGO_PERSONAJE; 
        }
       public void setCODIGO_PERSONAJE(String CODIGO_PERSONAJE){
        this.CODIGO_PERSONAJE= CODIGO_PERSONAJE;   
        }
       
       /*CITA GET Y SET*/
       public String getNOMBRE_AFICIONADO(){
            return NOMBRE_AFICIONADO; 
        }
       public void setNOMBRE_AFICIONADO(String NOMBRE_AFICIONADO){
        this.NOMBRE_AFICIONADO= NOMBRE_AFICIONADO;   
        }
       public String getDIA_DESEADO(){
            return DIA_DESEADO; 
        }
       public void setDIA_DESEADO(String DIA_DESEADO){
        this.DIA_DESEADO= DIA_DESEADO;   
        }
       public String getCODIGO_CITA(){
            return CODIGO_CITA; 
        }
       public void setCODIGO_CITA(String CODIGO_CITA){
        this.CODIGO_CITA= CODIGO_CITA;   
        }

    public String getCONTRASEÑA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}