package Frames.Panels;

import Classes.Main;
import Classes.Exam;
import GUI.ProfessorDashboard;
import java.awt.GridBagConstraints;

public class Exam_AddPanel extends javax.swing.JPanel {

    public Exam_AddPanel() {
        initComponents();
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
        jTextFieldExamName = new javax.swing.JTextField();
        jLabelSucessOrFail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDept = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCourseName = new javax.swing.JTextField();
        jButtonAddQuestion = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Exam ID");

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Exam Name");

        jTextFieldExamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldExamNameActionPerformed(evt);
            }
        });

        jLabelSucessOrFail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSucessOrFail.setText("Add new Exam");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Date");

        jTextFieldDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Department");

        jComboBoxDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "IS", "IT", "SW" }));
        jComboBoxDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDeptActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubmit.setText("Add Exam");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Course Name");

        jTextFieldCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCourseNameActionPerformed(evt);
            }
        });

        jButtonAddQuestion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddQuestion.setText("Add Question");
        jButtonAddQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddQuestionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldExamName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jTextFieldDate, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jButtonAddQuestion)))
                        .addGap(71, 71, 71)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldExamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(jButtonAddQuestion))
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldID.getText().equals("") && !jTextFieldExamName.getText().equals("") && !jTextFieldDate.getText().equals("") && !jTextFieldCourseName.getText().equals("")) {

            Exam x = new Exam();
            x.setEId(jTextFieldID.getText());
            x.setEName(jTextFieldExamName.getText());
            x.setEDate(Integer.parseInt(jTextFieldDate.getText()));
            x.setCourse(jTextFieldCourseName.getText());

            if (jComboBoxDept.getSelectedItem().equals("CS")) {
                x.setDept(Main.cs);
            } else if (jComboBoxDept.getSelectedItem().equals("IS")) {
                x.setDept(Main.is);
            } else if (jComboBoxDept.getSelectedItem().equals("IT")) {
                x.setDept(Main.it);
            } else if (jComboBoxDept.getSelectedItem().equals("SW")) {
                x.setDept(Main.sw);
            }

            if (x.addExam()) {
                jLabelSucessOrFail.setText("Added the new exam successfully");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Somethin went wrong. Please Try again!");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields. Please, complete them before submit.");
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jComboBoxDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDeptActionPerformed

    private void jTextFieldDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateActionPerformed

    private void jTextFieldExamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldExamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldExamNameActionPerformed

    private void jButtonAddQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddQuestionActionPerformed
        // TODO add your handling code here: 

    }//GEN-LAST:event_jButtonAddQuestionActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCourseNameActionPerformed

    protected void resetPanelData() {
        jTextFieldID.setText("");
        jTextFieldExamName.setText("");
        jTextFieldDate.setText("");
        jTextFieldCourseName.setText("");
        jComboBoxDept.setSelectedIndex(0);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButtonAddQuestion;
    private javax.swing.JComboBox<String> jComboBoxDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSucessOrFail;
    private javax.swing.JTextField jTextFieldCourseName;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldExamName;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
