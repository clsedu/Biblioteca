/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAObiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author clsedu
 */
public class ConexaoDAO {
    
     public Connection conectaBD(){
        Connection conn = null;
        
        
        
        try {
            String url = "jdbc:mysql://localhost:3306/biblioteca?user=clsedu&password=Casa420*";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException error) {
            
            JOptionPane.showMessageDialog(null,"ConexaoDAO" +error.getMessage());
        }
        
        return conn;
    }
    
}
