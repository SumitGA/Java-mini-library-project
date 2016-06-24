/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.contorller;

import com.example.common.DBConnection;
import com.example.model.Books;
import com.example.model.Librian;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SumitG
 */
public class BooksDAO {
    
    public void insertBooks(Books ob){
        try{
            Connection con=DBConnection.getConnection();
            String sql="insert into books (ISBN,title,author,publisher) values (?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,ob.getISBN());
            pst.setString(2,ob.getTitle());
            pst.setString(3,ob.getAuthor());
            pst.setString(4,ob.getPublisher());
            pst.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(null,"Record Inserted");
            con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
        
        public ArrayList<Books> viewBooks(){
          ArrayList<Books> list=new ArrayList();
          try{
              Connection con=DBConnection.getConnection();
              String sql="select * from books";
              Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
          while(rs.next()){
              Books ob=new Books();
                ob.setId(rs.getInt("id"));
                ob.setISBN(rs.getString("ISBN"));
                ob.setTitle(rs.getString("title"));
                ob.setAuthor(rs.getString("author"));
                ob.setPublisher(rs.getString("publisher"));
               
                list.add(ob);
          }
          }catch(Exception ex){
              System.out.println(ex);
          }
          return list;
        }
        
        
        public void updateBooks(Books ob){
            try{
                Connection con=DBConnection.getConnection();
                String sql="update books set ISBN=?, title=?, author=?,publisher=? where id=?";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1,ob.getISBN());
                pst.setString(2,ob.getTitle());
                pst.setString(3,ob.getAuthor());
                pst.setString(4,ob.getPublisher());
                pst.setInt(5,ob.getId());
                
                pst.executeUpdate();
                javax.swing.JOptionPane.showMessageDialog(null,"Record Updated");
                con.close();
                
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
    

