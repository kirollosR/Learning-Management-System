/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Panels;

import Classes.Main;
import Classes.Professor;

import javax.swing.*;

public class Prof_UpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form Prof_AddPanel
     */
    public Prof_UpdatePanel() {
        initComponents();
        jTextFieldID.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFname = new javax.swing.JTextField();
        jLabelSucessOrFail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDept = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldOfficeHours = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jTextFieldSearchKey = new javax.swing.JTextField();
        jTextFieldSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBoxBlocked = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("First name");

        jLabelSucessOrFail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSucessOrFail.setForeground(new java.awt.Color(255, 255, 51));
        jLabelSucessOrFail.setText("Write Prof's ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Last name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Confirm Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Age");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Department");

        jComboBoxDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "IS", "IT", "SW" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Office Hours");

        btnUpdate.setBackground(new java.awt.Color(102, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(102, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loupe.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Salary");

        jCheckBoxBlocked.setBackground(new java.awt.Color(0, 153, 153));
        jCheckBoxBlocked.setText("Blocked");
        jCheckBoxBlocked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBlockedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSearchKey)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPasswordField2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnUpdate)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(28, 28, 28)
                                            .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDelete)
                                        .addComponent(jCheckBoxBlocked)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldOfficeHours))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(23, 23, 23)
                                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(56, 56, 56)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 116, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jTextFieldSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldOfficeHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxBlocked))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldID.getText().equals("") && !jTextFieldFname.getText().equals("") && !jTextFieldLname.getText().equals("") && !jTextFieldUserName.getText().equals("") && !jPasswordField1.getText().equals("") && !jPasswordField2.getText().equals("") && !jTextFieldAge.getText().equals("") && !jTextFieldOfficeHours.getText().equals("") && !jTextFieldSalary.getText().equals("")) {

            Professor x = new Professor();
            x.setID(Integer.parseInt(jTextFieldID.getText()));
            x.setFName(jTextFieldFname.getText());
            x.setLName(jTextFieldLname.getText());
            x.setUsername(jTextFieldUserName.getText());
            if(jPasswordField1.getText().equals(jPasswordField2.getText()))
                x.setPassword(jPasswordField1.getText());
            else {
                String pass = jPasswordField2.getText();
                do {
                    pass = JOptionPane.showInputDialog("Please enter again \"repeat password\": ");
                    if (!jPasswordField1.getText().equals(pass)) {
                        JOptionPane.showMessageDialog(null, "Password didn't match repeat password :(");
                    }
                } while (!jPasswordField1.getText().equals(pass));
                x.setPassword(jPasswordField1.getText());
            }

            x.setAge(Integer.parseInt(jTextFieldAge.getText()));

            if (jComboBoxDept.getSelectedItem().equals("CS")) {
                x.setDept(Main.cs);
            } else if (jComboBoxDept.getSelectedItem().equals("IS")) {
                x.setDept(Main.is);
            } else if (jComboBoxDept.getSelectedItem().equals("IT")) {
                x.setDept(Main.it);
            } else if (jComboBoxDept.getSelectedItem().equals("SW")) {
                x.setDept(Main.sw);
            }

            x.setOfficeHours(jTextFieldOfficeHours.getText());
            x.setSalary(Double.parseDouble(jTextFieldSalary.getText()));

            if(jCheckBoxBlocked.isSelected())
                x.setBlocked1("true");

            if (x.updateProf(x.getID(),x)) {
                jLabelSucessOrFail.setText("Updated Successfully ... !");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to Update ... !");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldSearchKey.getText().equals("")) {
            Professor x = new Professor();
            Professor returned = x.searchProfById(Integer.parseInt(jTextFieldSearchKey.getText()));
            if (returned.getID() > 0) {
                setPanelData(returned);
            } else {
                jLabelSucessOrFail.setText("Not Found ...!");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldSearchKey.getText().equals("")) {
            Professor x = new Professor();
            if (x.deleteProf(Integer.parseInt(jTextFieldSearchKey.getText()))) {
                jLabelSucessOrFail.setText("Deleted Successfully ... !");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to delete ... !");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jCheckBoxBlockedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBlockedActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBoxBlockedActionPerformed

    protected void resetPanelData() {
        jTextFieldID.setText("");
        jTextFieldFname.setText("");
        jTextFieldLname.setText("");
        jTextFieldUserName.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jTextFieldAge.setText("");
        jTextFieldOfficeHours.setText("");
        jTextFieldSalary.setText("");
        jComboBoxDept.setSelectedIndex(0);
        jCheckBoxBlocked.setSelected(false);

    }

    protected void setPanelData(Professor x) {
        jTextFieldID.setText("" + x.getID());
        jTextFieldFname.setText("" + x.getFName());
        jTextFieldLname.setText("" + x.getLName());
        jTextFieldUserName.setText("" + x.getUsername());
        jPasswordField1.setText("" + x.getPassword());
        jPasswordField2.setText("" + x.getPassword());
        jTextFieldAge.setText("" + x.getAge());
        jTextFieldOfficeHours.setText("" + x.getOfficeHours());

        if (x.myDept.getDeptName().equals("CS")) {
            jComboBoxDept.setSelectedIndex(0);
        } else if (x.myDept.getDeptName().equals("IS")) {
            jComboBoxDept.setSelectedIndex(1);
        } else if (x.myDept.getDeptName().equals("IT")) {
            jComboBoxDept.setSelectedIndex(2);
        } else if (x.myDept.getDeptName().equals("SW")) {
            jComboBoxDept.setSelectedIndex(3);
        }
        jTextFieldSalary.setText("" + x.getSalary());
        if(x.isBlocked1() == "true")
            jCheckBoxBlocked.setSelected(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox jCheckBoxBlocked;
    private javax.swing.JComboBox<String> jComboBoxDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSucessOrFail;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldOfficeHours;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JTextField jTextFieldSearchKey;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
