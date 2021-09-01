/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp Beats Audio
 */
public class MySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/details?zeroDateTimeBehavior=convertToNull","root","");
           JOptionPane.showMessageDialog(null, "Connected to database");
           return conn;
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
         
        }
    }    
}
