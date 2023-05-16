
package DAO;

import BACKEND.clsGeneral;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class clsQuerys {
    
    /*INICIO DE SESION*/
    public int fncIniciar(String NOMBRE_RECEPCIONISTA,String CONTRASEÑA){
        int Resp = 0;  
        try{
            Statement sql = clsConexion.getConexion().createStatement();
            String Query = "SELECT NOMBRE_RECEPCIONISTA FROM TB_RECEPCIONISTA WHERE "
                         + "NOMBRE_RECEPCIONISTA = '" + NOMBRE_RECEPCIONISTA+ "' AND "
                         + "CONTRASEÑA = '"+ CONTRASEÑA+ "';";            
            System.out.println(Query);
            ResultSet resultado = sql.executeQuery(Query);
            if(resultado!=null && resultado.next()){
                Resp = 1;
            }
        }catch(SQLException Ex){
            System.out.println("ERROR: " + Ex.toString());
        }
        return Resp;
    }
    
    /*AGREGAR EXPERTO*/
public int fncIngresoExperto( String NOMBRE, String PELICULA, String DIA, String CODIGO_EXPERTO){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();
            
            String consulta = "INSERT INTO TB_EXPERTOS (NOMBRE, PELICULA, DIA, CODIGO_EXPERTO) "
                            + " VALUES (?,?,?,?)";
            System.out.println(consulta);
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.setString(1, NOMBRE);
            ps.setString(2, PELICULA);
            ps.setString(3, DIA);
            ps.setString(4, CODIGO_EXPERTO);
            ps.executeUpdate();
            Resp = 1;
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }

    /*EDITAR EXPERTO*/
    public int fncEditarExperto( clsGeneral objPersona){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();  
            String consulta = "UPDATE TB_EXPERTOS SET CODIGO_EXPERTO = ?, NOMBRE= ?, "
                    + "PELICULA = ?, DIA = ? "
                    + "WHERE CODIGO_EXPERTO = ?";
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.setString(1, objPersona.getCODIGO_EXPERTO()); 
            ps.setString(2, objPersona.getNOMBRE());  
            ps.setString(3, objPersona.getPELICULA());
            ps.setString(4, objPersona.getDIA());
            ps.setString(5, objPersona.getCODIGO_EXPERTO());
            ps.executeUpdate(); 
            Resp = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
    
    /*ELIMINAR EXPERTOS*/
    public int fncEliminarExpertos(String CODIGO_EXPERTO){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();  
            String consulta = "DELETE FROM TB_EXPERTOS WHERE CODIGO_EXPERTO = " + CODIGO_EXPERTO;
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.executeUpdate(); 
            Resp = 1;
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
    
    /*VER EXPERTO*/
    public ResultSet fncConsultaExperto(int CODIGO_EXPERTO){
        ResultSet rs = null;
        try{
            Connection Con = clsConexion.getConexion();  
            String consulta = "SELECT CODIGO_EXPERTO, NOMBRE, PELICULA, DIA, FROM TB_EXPERTO";
            if(CODIGO_EXPERTO != 0){
                consulta = consulta + " WHERE CODIGO_EXPERTO =" + CODIGO_EXPERTO;
            }
            PreparedStatement ps = Con.prepareStatement(consulta);
            rs = ps.executeQuery();
         }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        } 
         return rs;
    }
    
    /*AGREGAR CITA*/
    public int fncIngresoCita( String CODIGO_CITA, String NOMBRE_AFICIONADO, String DIA_DESEADO,String PERSONAJE, String EXPERTO){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();
            
            String consulta = "INSERT INTO TB_CITA (NOMBRE_AFICIONADO, DIA_DESEADO, PERSONAJE, EXPERTO, CODIGO_CITA) "
                            + " VALUES (?,?,?,?,?)";
            System.out.println(consulta);
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.setString(1, NOMBRE_AFICIONADO);
            ps.setString(2, DIA_DESEADO);
            ps.setString(3, PERSONAJE);
            ps.setString(4, EXPERTO);
            ps.setString(5,CODIGO_CITA);
            ps.executeUpdate();
            Resp = 1;
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
    
    /*AGREGAR PERSONAJE*/
    public int fncIngresoPersonaje( String NOMBRE_PERSONAJE, String PELICULA1, String PELICULA2,String PELICULA3,String PELICULA4,String PELICULA5,String PELICULA6,String PELICULA7,String PELICULA8,String CODIGO_PERSONAJE){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();
            
            String consulta = "INSERT INTO TB_PERSONAJES (NOMBRE_PERSONAJE,PELICULA1,PELICULA2,PELICULA3,PELICULA4,PELICULA5,PELICULA6,PELICULA7,PELICULA8,CODIGO_PERSONAJE) "
                            + " VALUES (?,?,?,?,?,?,?,?,?,?)";
            System.out.println(consulta);
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.setString(1, NOMBRE_PERSONAJE);
            ps.setString(2, PELICULA1);
            ps.setString(3, PELICULA2);
            ps.setString(4, PELICULA3);
            ps.setString(5,PELICULA4);
            ps.setString(6,PELICULA5);
            ps.setString(7,PELICULA6);
            ps.setString(8,PELICULA7);
            ps.setString(9,PELICULA8);
            ps.setString(10,CODIGO_PERSONAJE);
            ps.executeUpdate();
            Resp = 1;
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
    
    /*EDITAR PERSONAJE*/
    public int fncEditarPersonaje( clsGeneral objPersonaje){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();  
            String consulta = "UPDATE TB_PERSONAJES SET CODIGO_PERSONAJE = ?, NOMBRE_PERSONAJE= ?, "
                    + "PELICULA1 = ?, PELICULA2 = ?, PELICULA3 = ?, PELICULA4 = ?, PELICULA5 = ?, PELICULA6 = ?, PELICULA7 = 7, PELICULA8 = ? "
                    + "WHERE CODIGO_PERSONAJE = ?";
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.setString(1, objPersonaje.getCODIGO_PERSONAJE()); 
            ps.setString(2, objPersonaje.getNOMBRE_PERSONAJE());  
            ps.setString(3, objPersonaje.getPELICULA1());
            ps.setString(4, objPersonaje.getPELICULA2());
            ps.setString(5, objPersonaje.getPELICULA3());
            ps.setString(6, objPersonaje.getPELICULA4());
            ps.setString(7, objPersonaje.getPELICULA5());
            ps.setString(8, objPersonaje.getPELICULA6());
            ps.setString(9, objPersonaje.getPELICULA7());
            ps.setString(10, objPersonaje.getPELICULA8());
            ps.executeUpdate(); 
            Resp = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
    
    /*ELIMINAR PERSONAJE*/
    public int fncEliminarPersonaje(String CODIGO_PERSONAJE){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();  
            String consulta = "DELETE FROM TB_PERSONAJES WHERE CODIGO_PERSONAJE = " + CODIGO_PERSONAJE;
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.executeUpdate(); 
            Resp = 1;
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
    
    /*AGREGAR RECPCIONISTA*/
    public int fncIngresoRecepcionista( String NOMBRE_RECEPCIONISTA, String CONTRASEÑA){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();
            
            String consulta = "INSERT INTO TB_RECEPCIONISTA (NOMBRE_RECEPCIONISTA, CONTRASEÑA) "
                            + " VALUES (?,?)";
            System.out.println(consulta);
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.setString(1, NOMBRE_RECEPCIONISTA);
            ps.setString(2, CONTRASEÑA);
            ps.executeUpdate();
            Resp = 1;
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
    
    /*EDITAR RECEPCIONISTA*/
    public int fncEditarRecepcionista( clsGeneral objRecepcionista){
        int Resp=0; 
        try{
            Connection Con = clsConexion.getConexion();  
            String consulta = "UPDATE TB_RECEPCIONISTA SET NOMBRE_RECEPCIONISTA = ?, CONTRASEÑA= ?, "
                    + "WHERE NOMBRE_RECEPCIONISTA = ?";
            PreparedStatement ps = Con.prepareStatement(consulta);
            ps.setString(1, objRecepcionista.getNOMBRE_RECEPCIONISTA()); 
            ps.setString(2, objRecepcionista.getCONTRASEÑA());  
            ps.executeUpdate(); 
            Resp = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
}
