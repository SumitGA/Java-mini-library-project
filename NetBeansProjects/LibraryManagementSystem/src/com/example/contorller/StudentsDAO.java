/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.contorller;

import com.example.common.DBConnection;
import com.example.model.Students;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SumitG
 */
public class StudentsDAO {
        public void uploadImage(File myfile,String imagename){
         try{
            FileOutputStream fos=new FileOutputStream("d:/javaimagefiles/"+imagename);
            FileInputStream fin=new FileInputStream(myfile);
            int ch;
            while((ch=fin.read())!=-1){
                fos.write((byte)ch);
            }
            fin.close();
            fos.close();
            
        }catch(Exception ex){
            System.out.println(ex);
            
        }   
        }
    
    public void insertStudents(Students ob){
       try{
           Connection con=DBConnection.getConnection();
           String sql="insert into students (name,faculty,gender,email,imagename) values (?,?,?,?,?)";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1,ob.getName());
           pst.setString(2,ob.getFaculty());
           pst.setString(3,ob.getGender());
           pst.setString(4,ob.getEmail());
           pst.setString(5,ob.getImagename());
           pst.executeUpdate();
           javax.swing.JOptionPane.showMessageDialog(null,"Record Inserted");
           con.close();
       } catch(Exception ex){
           System.out.println(ex);
       }
    }
    
    public ArrayList<Students> viewStudents(){
      ArrayList<Students> list=new ArrayList();
      try{
          Connection con=DBConnection.getConnection();
          String sql="select * from students";
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery(sql);
          while(rs.next()){
              Students ob=new Students();
                ob.setId(rs.getInt("id"));
                ob.setName(rs.getString("name"));
                ob.setFaculty(rs.getString("faculty"));
                ob.setGender(rs.getString("gender"));
                ob.setEmail(rs.getString("email"));
                ob.setImagename(rs.getString("imagename"));
                list.add(ob);
          }
          
      }catch(Exception ex){
          
      }
      return list;
    }
    public void updateStudents(Students ob){
        try{
            Connection con=DBConnection.getConnection();
           String sql ="Update  students set name=?,faculty=?,gender=?,email=?,imagename=? where id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1,ob.getName());
            pst.setString(2,ob.getFaculty());
            pst.setString(3,ob.getGender());
            pst.setString(4,ob.getEmail());
            pst.setString(5,ob.getImagename());
            pst.setInt(6,ob.getId());
            
            pst.executeUpdate();
            con.close();
            javax.swing.JOptionPane.showMessageDialog(null,"Record Updated");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void deleteStudents(Students ob){
        try{
            Connection con=DBConnection.getConnection();
            String sql="Delete from students where id=?";
            PreparedStatement pst=con.prepareStatement(sql);
           
            pst.setInt(1,ob.getId());
             pst.executeUpdate();
            con.close();
            javax.swing.JOptionPane.showMessageDialog(null,"Record Deleted");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
  

