/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;
import techquizapp.dao.QuestionDAO;
import techquizapp.pojo.Exam;
import techquizapp.pojo.Question;
import techquizapp.pojo.QuestionStore;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author AYUSH
 */
public class EditQuestionFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditQuestionFrame
     */
    private Exam editExam;
    private QuestionStore qstore; 
    Color oldColor;
   private int pos=0;
   HashMap<String,String> options;
   int qno;
   String question,option1,option2,option3,option4,correctOption;
   
    public EditQuestionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lbUserName.setText("Hello "+UserProfile.getUserName());
        qstore=new QuestionStore();
        options=new HashMap();
        options.put("Option1","Answer1");
        options.put("Option2","Answer2");
        options.put("Option3","Answer3");
        options.put("Option4","Answer4");
        qno=1;
        lbQno.setText(lbQno.getText()+qno);
        
    }
    public EditQuestionFrame(Exam editExam){
         this();
        this.editExam=editExam;
        lbTitle.setText("EDITING "+editExam.getLanguage().toUpperCase()+" PAPER");
        loadQuestion();
        showQuestion();
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
        lbUserName = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbOption3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbOption1 = new javax.swing.JLabel();
        lbOption4 = new javax.swing.JLabel();
        lbQuestionNo = new javax.swing.JLabel();
        lbOption2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        txtOption1 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        txtOption3 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        jcbCorrectAnswer = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        lbQno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lbUserName.setBackground(new java.awt.Color(0, 0, 0));
        lbUserName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 102, 0));

        lbLogout.setBackground(new java.awt.Color(0, 0, 0));
        lbLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 102, 0));
        lbLogout.setText("Logout");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLogoutMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Java NetBeans\\TechQuizApp\\src\\Images\\questionpaper4.jpg")); // NOI18N

        lbOption3.setBackground(new java.awt.Color(0, 0, 0));
        lbOption3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbOption3.setForeground(new java.awt.Color(255, 102, 0));
        lbOption3.setText("Option 3");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Correct Answer:");

        lbOption1.setBackground(new java.awt.Color(0, 0, 0));
        lbOption1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbOption1.setForeground(new java.awt.Color(255, 102, 0));
        lbOption1.setText("Option 1");

        lbOption4.setBackground(new java.awt.Color(0, 0, 0));
        lbOption4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbOption4.setForeground(new java.awt.Color(255, 102, 0));
        lbOption4.setText("Option 4");

        lbQuestionNo.setBackground(new java.awt.Color(0, 0, 0));
        lbQuestionNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQuestionNo.setForeground(new java.awt.Color(255, 102, 0));

        lbOption2.setBackground(new java.awt.Color(0, 0, 0));
        lbOption2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbOption2.setForeground(new java.awt.Color(255, 102, 0));
        lbOption2.setText("Option 2");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        txtOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption4ActionPerformed(evt);
            }
        });

        jcbCorrectAnswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbCorrectAnswer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option1", "Option2", "Option3", "Option4" }));

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 102, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 102, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 102, 0));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        lbTitle.setBackground(new java.awt.Color(0, 0, 0));
        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 102, 0));
        lbTitle.setText("Edting Java Paper");

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 102, 0));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        lbQno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbQno.setForeground(new java.awt.Color(255, 102, 0));
        lbQno.setText("Question No:");

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
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(lbLogout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbOption3)
                            .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOption1))
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOption4)
                            .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOption2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(lbQno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuestionNo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnNext)
                        .addGap(41, 41, 41)
                        .addComponent(btnPrevious)
                        .addGap(37, 37, 37)
                        .addComponent(btnCancel)
                        .addGap(32, 32, 32)
                        .addComponent(btnDone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbUserName)
                        .addComponent(lbLogout))
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbQno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOption1)
                            .addComponent(lbOption2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOption3)
                            .addComponent(lbOption4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNext)
                            .addComponent(btnCancel)
                            .addComponent(btnDone)
                            .addComponent(btnPrevious))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbQuestionNo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseEntered
        oldColor=lbLogout.getForeground();
        lbLogout.setForeground(Color.white);
    }//GEN-LAST:event_lbLogoutMouseEntered

    private void lbLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseExited
        lbLogout.setForeground(oldColor);
    }//GEN-LAST:event_lbLogoutMouseExited

    private void txtOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption4ActionPerformed

    }//GEN-LAST:event_txtOption4ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       if(!validateInput())
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields!","Error!",JOptionPane.ERROR_MESSAGE);
            return;            
        }
        String optionName=options.get(correctOption);
        Question obj=new Question(editExam.getExamId(),qno,question,optionName,editExam.getLanguage(),option1,option2,option3,option4);
        qstore.removeQuestion(pos);
        qstore.setQuestionAt(pos, obj);
        pos++;
        if(pos>=qstore.getCount())
        {
            JOptionPane.showMessageDialog(null,"Your questions have all been edited successfully.\nPress the DONE button to add them to the database","Exam Edited!",JOptionPane.INFORMATION_MESSAGE);
            System.out.println(qstore);
            pos=0;
        }
        showQuestion();
        qno++;
        if(qno>qstore.getCount())
        {
            qno=1;
        }
        lbQno.setText("Question no:"+qno);

    }//GEN-LAST:event_btnNextActionPerformed
private void loadQuestion(){
    try
        {
            ArrayList<Question>questionList=QuestionDAO.getQuestionByExamId(editExam.getExamId());
            for(Question q:questionList)
            {
                qstore.addQuestion(q);
            }
            System.out.println(qstore);
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,"DB Error","Edit Question Error!",JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
        }

}
private void showQuestion(){//
    Question q=qstore.getQuestion(pos);
        txtQuestion.setText(q.getQuestion());
        txtOption1.setText(q.getAnswer1());
        txtOption2.setText(q.getAnswer2());
        txtOption3.setText(q.getAnswer3());
        txtOption4.setText(q.getAnswer4());
        String correctAns=q.getCorrectAnswer();
        String correctOpt=getKeyFromValue(correctAns);
        jcbCorrectAnswer.setSelectedItem(correctOpt);
        
    }
private String getKeyFromValue(String value){
    
        Set <String> keys=options.keySet();
        for(String k:keys)
        {
            String v=options.get(k);
            
            if(v.equals(value))
                return k;
        }
        return null; // this is unreachable but for satisfying java it is requried.
}

     
 private boolean validateInput() {
        question=txtQuestion.getText().trim();
        option1=txtOption1.getText().trim();
        option2=txtOption2.getText().trim();
        option3=txtOption3.getText().trim();
        option4=txtOption4.getText().trim();
        correctOption=jcbCorrectAnswer.getSelectedItem().toString();
        if(question.isEmpty()||option1.isEmpty()||option2.isEmpty()||option3.isEmpty()||option4.isEmpty()||correctOption.isEmpty())
                return false;
        return true;

          }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       EditPaperFrame editPaper=new EditPaperFrame();
       editPaper.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
if(!validateInput())
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields!","Error!",JOptionPane.ERROR_MESSAGE);
            return;            
        }
     
    try{
        QuestionDAO.updateQuestion(qstore);
         JOptionPane.showMessageDialog(null,"Edited questions saved in DB","Question saved in DB!",JOptionPane.INFORMATION_MESSAGE);
         EditPaperFrame editPaper=new EditPaperFrame();
         editPaper.setVisible(true);
         this.dispose();
    }
     catch(SQLException sqle)
           {
                JOptionPane.showMessageDialog(null, "Database Error Cannot Save questions in DB","DB Error",JOptionPane.ERROR_MESSAGE);
             sqle.printStackTrace();
           }

       
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        if(!validateInput())
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields!","Error!",JOptionPane.ERROR_MESSAGE);
            return;            
        }
        String optionName=options.get(correctOption);
        Question obj=new Question(editExam.getExamId(),qno,question,optionName,editExam.getLanguage(),option1,option2,option3,option4);
        qstore.removeQuestion(pos);
        qstore.setQuestionAt(pos, obj);
        pos--;
        if(pos<0)
        {
            JOptionPane.showMessageDialog(null,"Your questions have all been edited successfully.\nPress the DONE button to add them to the database","Exam Edited!",JOptionPane.INFORMATION_MESSAGE);
            System.out.println(qstore);
            pos=qstore.getCount()-1;
        }
        showQuestion();
        qno--;
        if(qno<=0)
        {
            qno=qstore.getCount();
        }
        lbQno.setText("Question no:"+qno);

    }//GEN-LAST:event_btnPreviousActionPerformed

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
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCorrectAnswer;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbOption1;
    private javax.swing.JLabel lbOption2;
    private javax.swing.JLabel lbOption3;
    private javax.swing.JLabel lbOption4;
    private javax.swing.JLabel lbQno;
    private javax.swing.JLabel lbQuestionNo;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables


}
