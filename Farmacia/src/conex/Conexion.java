/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conex;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Familia
 */
public class Conexion {
    
    public static Connection getConexion() 
    {
        try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String myDB="jdbc:oracle:thin:@localhost:1521:XE";
                String usuario="farmaciaprueba";
                String password="farmaciaprueba";
                
                Connection conexion=DriverManager.getConnection(myDB,usuario,password);
           return conexion;     
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
