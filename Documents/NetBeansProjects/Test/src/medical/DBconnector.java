/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class DBconnector {
    
     public static Connection getConnection() throws Exception
         
    {
          Class.forName("com.mysql.jdbc.Driver"); 
          Connection cn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/medical","root",""); 
      
       return cn;
    }
     
     
     
     
   
    
     
     
     
     
     
    
}
