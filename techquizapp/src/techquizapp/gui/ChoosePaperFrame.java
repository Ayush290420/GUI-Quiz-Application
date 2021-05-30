/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.ExamDAO;
import techquizapp.pojo.Exam;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author AYUSH
 */
public class ChoosePaperFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChoosePaperFrame
     */
    Color oldColor;
    String subjectName;
    public ChoosePaperFrame() {
        initComponents();
        setLocationRelativeTo(null);
       lbUserName.setText("Hello "+UserProfile.getUserName().toUpperCase());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lblogout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcLanguage = new javax.swing.JComboBox<>();
        jcExamId = new javax.swing.JComboBox<>();
        btnTakeTest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans\\TechQuizApp\\src\\Images\\docicon.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Paper Selection Panel");

        lbUserName.setBackground(new java.awt.Color(0, 0, 0));
        lbUserName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 102, 0));

        lblogout.setBackground(new java.awt.Color(0, 0, 0));
        lblogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblogout.setForeground(new java.awt.Color(255, 102, 0));
        lblogout.setText("Logout");
        lblogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblogoutMouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Choose the Subject");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Choose Exam ID");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fill the Paper Details");

        jcLanguage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Java", "C", "C++" }));
        jcLanguage.setBorder(null);
        jcLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcLanguageActionPerformed(evt);
            }
        });

        jcExamId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcExamId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        jcExamId.setBorder(null);

        btnTakeTest.setBackground(new java.awt.Color(51, 51, 51));
        btnTakeTest.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnTakeTest.setForeground(new java.awt.Color(255, 102, 0));
        btnTakeTest.setText("Take Test");
        btnTakeTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeTestActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 102, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblogout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(jLabel5))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)
                                                .addComponent(jcLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(217, 217, 217)
                                    .addComponent(jLabel3)
                                    .addGap(15, 15, 15)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(btnTakeTest)
                                .addGap(60, 60, 60)
                                .addComponent(btnBack))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel2)))
                        .addGap(0, 164, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblogout)
                    .addComponent(lbUserName))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jcLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jcExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTakeTest)
                    .addComponent(btnBack))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblogoutMouseClicked
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblogoutMouseClicked

    private void lblogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblogoutMouseEntered
        oldColor=lblogout.getForeground();
        lblogout.setForeground(Color.white);

    }//GEN-LAST:event_lblogoutMouseEntered

    private void lblogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblogoutMouseExited
        lblogout.setForeground(oldColor);
    }//GEN-LAST:event_lblogoutMouseExited

    private void btnTakeTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeTestActionPerformed
       if(!validateInput()){
             JOptionPane.showMessageDialog(null, "Please select a subject","Error",JOptionPane.ERROR_MESSAGE);
           return;
        }
       
       int count=jcExamId.getSelectedIndex();
//       if(count==null){
//        JOptionPane.showMessageDialog(null, "Please select a Exam","Error",JOptionPane.ERROR_MESSAGE);
//           return;   
//       }
       String examId=jcExamId.getSelectedItem().toString();
        int ans=JOptionPane.showConfirmDialog(null, "You have selected "+subjectName+" and "+examId+" paper\n Is this ok?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
       if(ans==JOptionPane.YES_OPTION){
        try{
           int qno=ExamDAO.getQuestionCountByExamId(examId);
           Exam exam=new Exam(examId,subjectName,qno);
           TakeTestFrame testFrame=new TakeTestFrame(exam);
           testFrame.setVisible(true);
           this.dispose();
       }
       catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "Error in Take Test","DB Error",JOptionPane.ERROR_MESSAGE);
             sqle.printStackTrace();
             System.out.println(sqle.getMessage());
       }
       }
    }//GEN-LAST:event_btnTakeTestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       StudentOptionFrame studentFrame= new StudentOptionFrame();
        studentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jcLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcLanguageActionPerformed
        jcExamId.removeAllItems();
       
        if(!validateInput()){
             JOptionPane.showMessageDialog(null, "Please select a subject","Error",JOptionPane.ERROR_MESSAGE);
           return;
        }
                try{
        
        
         if(ExamDAO.isPaperSet(subjectName)==false){
                JOptionPane.showMessageDialog(null, "Sorry! No exam set for subject "+subjectName,"Subject Required",JOptionPane.ERROR_MESSAGE);
                return;
            }
        ArrayList<String> examList=ExamDAO.getExamIdBySubject(subjectName,UserProfile.userName);
        if(examList.isEmpty()){
            JOptionPane.showMessageDialog(null, "You already appeared for all the exams of "+subjectName+" No paper left","All paer Attempted!",JOptionPane.ERROR_MESSAGE);
                return;
        }
        for(String s:examList){
            jcExamId.addItem(s);
        }
        
        }
        catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "Error in Take Test","DB Error",JOptionPane.ERROR_MESSAGE);
             sqle.printStackTrace();
             System.out.println(sqle.getMessage());
       }
    }//GEN-LAST:event_jcLanguageActionPerformed

    private boolean validateInput(){
        int selectedIndex=jcLanguage.getSelectedIndex();
        if(selectedIndex==0)
            return false;
        subjectName=jcLanguage.getSelectedItem().toString();
        return true;
    }
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
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosePaperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTakeTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcExamId;
    private javax.swing.JComboBox<String> jcLanguage;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JLabel lblogout;
    // End of variables declaration//GEN-END:variables
}