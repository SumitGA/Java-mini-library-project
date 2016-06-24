/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.common;

import java.sql.*;


/**
 *
 * @author SumitG
 */
public class DBConnection {
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarysystem","root","");
            
            return con;
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    
}
