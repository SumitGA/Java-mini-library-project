/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.view;

import com.example.contorller.LibrianDAO;
import com.example.contorller.StudentsDAO;
import com.example.model.Librian;
import com.example.model.Students;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SumitG
 */
public class ShowStudentsReports extends javax.swing.JFrame {

    /**
     * Creates new form ShowStudentsReports
     */
    File myfile;
    DefaultTableModel model;
    public ShowStudentsReports() {
        initComponents();
        model=new DefaultTableModel(null,new String[]{"Id","Name","Gender","Faulty","Email","Imagename"});
        jTable1.setModel(model);
        buttonGroup1.add(jRadioButton_Male);
        buttonGroup1.add(jRadioButton_Female);
    }
    
      private void ClearModel(){
        int rowCount=model.getRowCount();
        for(int i=0;i<rowCount;i++)
        {
           model.removeRow(0);
        }
    }
      
    private void LoadData(){
        ClearModel();
       StudentsDAO stDAO=new StudentsDAO();
       ArrayList<Students> list=stDAO.viewStudents();
        for(int i=0;i<list.size();i++){
        model.addRow(new Object[]{list.get(i).getId(),
        list.get(i).getName(),list.get(i).getFaculty(),
        list.get(i).getGender(),list.get(i).getEmail(),
        list.get(i).getImagename()});
        }  
    }
    
    public void clearAll(){
        jTextField_Id.setText("");
        jTextField_Name.setText("");
        jTextField_Email.setText("");
        jLabel_Image.setIcon(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_LoadData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_Faculty = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show Students Reports");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_LoadData.setText("Load Data");
        jButton_LoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoadDataActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Faculty");

        jComboBox_Faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bsc CSIT", "BIM", "BSW" }));

        jLabel4.setText("Gender");

        jRadioButton_Male.setText("Male");

        jRadioButton_Female.setText("Female");

        jLabel5.setText("Email");

        jLabel6.setText("Image");

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton_LoadData)
                .addGap(308, 308, 308)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton_Delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(0, 155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Id)
                            .addComponent(jTextField_Name)
                            .addComponent(jComboBox_Faculty, 0, 128, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Male)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton_Female))
                            .addComponent(jTextField_Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Back))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_LoadData))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton_Male)
                                .addComponent(jRadioButton_Female)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(12, 12, 12))
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton_Delete)))
                    .addComponent(jButton_Back))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoadDataActionPerformed
            LoadData();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LoadDataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          int row=jTable1.getSelectedRow();
        jTextField_Id.setText(jTable1.getValueAt(row,0).toString());
        jTextField_Name.setText(jTable1.getValueAt(row,1).toString());
        jComboBox_Faculty.setSelectedItem(jTable1.getValueAt(row,2).toString());
        String gender=jTable1.getValueAt(row,3).toString();
        if(gender.equalsIgnoreCase("male"))
            jRadioButton_Male.setSelected(true);
            
        else
            jRadioButton_Female.setSelected(true);
        
       
        
        jTextField_Email.setText(jTable1.getValueAt(row, 4).toString());
       
        String imgname=jTable1.getValueAt(row,5).toString();
        File myfile=new File("d:/javaimagefiles/"+imgname);
        ImageIcon img=new ImageIcon(myfile.toString());
        Image newimg=img.getImage().getScaledInstance(100,100,BufferedImage.SCALE_DEFAULT);
        jLabel_Image.setIcon(new ImageIcon(newimg));
        
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            clearAll();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int id=Integer.parseInt(jTextField_Id.getText());
        String name=jTextField_Name.getText();
        String faculty=jComboBox_Faculty.getSelectedItem().toString();
        String gender="";
        if(jRadioButton_Male.isSelected())
            gender="male";
        else
            gender="female";
        String email=jTextField_Email.getText();
        String imagename=jLabel_Image.getText();
        Random rd=new Random();
        int nn=rd.nextInt();
        String  picname=nn+"";
        //to get the extension of the image
        int pos=myfile.toString().lastIndexOf(".");
        String ext=myfile.toString().substring(pos);
        
        Students ob=new Students();
        ob.setId(id);
        ob.setName(name);
        ob.setFaculty(faculty);
        ob.setGender(gender);
        ob.setEmail(email);
        ob.setImagename(picname+ext);
        
        
        StudentsDAO stDAO=new StudentsDAO();
        stDAO.updateStudents(ob);
        stDAO.uploadImage(myfile,picname+ext);
        clearAll();
        LoadData();
        
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel_Image.setIcon(null);
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        myfile =fc.getSelectedFile();
        ImageIcon img=new ImageIcon(myfile.toString());
        Image newimg=img.getImage().getScaledInstance(100,100,BufferedImage.SCALE_DEFAULT);
        jLabel_Image.setIcon(new ImageIcon(newimg));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        try{
            int id=Integer.parseInt(jTextField_Id.getText());
            Students ob=new Students();
            ob.setId(id);
        
            
            StudentsDAO stdDAO =new StudentsDAO();
            stdDAO.deleteStudents(ob);
            LoadData();
            clearAll();
            }catch(Exception ex){
            System.out.println(ex);
            
       
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
             dispose();
        MainFrame mf=new MainFrame();
        mf.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BackActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowStudentsReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowStudentsReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowStudentsReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowStudentsReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowStudentsReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_LoadData;
    private javax.swing.JComboBox<String> jComboBox_Faculty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}
