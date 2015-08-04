/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estudiantes;
import java.sql.*;
/**
 *
 * @author GOMEZ
 */
public class Conexion {
     Connection con;
    
    
    public Connection conectar(){
    
    String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		
		try {
                    
                 con = DriverManager.getConnection(dbURL, username, password);
			
		if (con != null) {
                System.out.println("Connected");
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
        return con;
	
    }
}

    


