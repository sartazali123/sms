/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

/**
 *
 * @author Asus
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import javax.swing.table.DefaultTableModel;

public class DBUpdater {

     
    String conString = "jdbc:derby://localhost:1527/medical";
    String username = "medical";
    String password = "medical";

    //INSERT INTO DB
    public Boolean add(String company, String name, String quantity,String price, String mrp) {
        //SQL STATEMENT
        String sql = "INSERT INTO stock(company,name,quantity,price,mrp) VALUES('" + company + "','" + name + "','" + quantity + "','" + price + "','" + mrp + "')";

        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //RETRIEVE DATA
    public DefaultTableModel getData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("COMPANY");
         dm.addColumn("NAME");
        dm.addColumn("QUANTITY");
        dm.addColumn("PRICE");
        dm.addColumn("MRP");
        
        //SQL STATEMENT
        String sql = "SELECT * FROM stock";

        try {
            Connection con = DriverManager.getConnection(conString, username, password);

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String id = rs.getString(1);
                String company = rs.getString(2);
                String name = rs.getString(3);
                String quantity = rs.getString(4);
                String price= rs.getString(5);
                String mrp= rs.getString(6);

                dm.addRow(new String[]{id,company,name,quantity,price,mrp});
            }

            return dm;

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;

    }

    //UPDATE DATA
    public Boolean update(String id,String company, String name, String quantity,String price, String mrp) {
        //SQL STMT
        //String sql = "update stock set company ='" + company + "',name ='" + name + "',quantity='" + quantity + "',price='" + price + "',mrp='" + mrp + "' WHERE s_id='" +id+ "'";
        //String sql="update stock set company =?,name =?,quantity=?,price=?,mrp=? WHERE s_id=?";
             
     //   update students set name=?, fees=?,dob=? where id=?";
        try {
            //GET COONECTION
            Connection con = DriverManager.getConnection(conString, username, password);
           String sql="update stock set company =?,name =?,quantity=?,price=?,mrp=? WHERE s_id=?";
           System.out.println(sql);
            //STATEMENT
            PreparedStatement s = con.prepareStatement(sql);
             s.setString(1,id);
             s.setString(2,company);
             s.setString(3,name);
             s.setString(4,quantity);
             s.setString(5,price);
             s.setString(6,mrp);
             
            //EXECUTE
            s.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    //DELETE DATA
    public Boolean delete(String id)
    {
        //SQL STMT
        String sql="DELETE FROM stock WHERE s_id ='"+id+"'";

        try
        {
            //GET COONECTION
            Connection con=DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

}

