
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clsConexion {
    public static Connection getConexion(){
         String Cadena="jdbc:sqlserver:"
                 +"//localhost:1433;"
                 + "databaseName=BD_StarWars;"
                 + "user=James; "
                 + "password=james123; "
                 + "loginTimeout=30;"
                 + "trustServerCertificate=true";
         
         
         try{
             Connection con = DriverManager.getConnection(Cadena);
             return con;
             
         }catch(SQLException ex){
             System.out.println("ERROR:" + ex.toString());
             return null;
         }
     }
}
