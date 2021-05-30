/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.Exam;

/**
 *
 * @author AYUSH
 */
public class ExamDAO {
    
    public static String getExamId()throws SQLException{
        Connection conn=DBConnection.getConn();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select count(*) from exam");
        rs.next();
        int count=rs.getInt(1);
        String newId="EX-"+(count+1);
        return newId;
    }
    public static boolean addExam(Exam e)throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("Insert into exam values(?,?,?)");
        ps.setString(1, e.getExamId());
        ps.setString(2, e.getLanguage());
        ps.setInt(3, e.getTotalQuestion());
        int ans=ps.executeUpdate();
        return ans==1;
    }
    public static ArrayList<String> getExamIdBySubject(String Subject)throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("select examId from exam where language=?");
        ps.setString(1, Subject);
       ArrayList<String> ids=new ArrayList<>();
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
           ids.add(rs.getString(1));
        }
        return ids;
    }
    public static int getQuestionCountByExamId(String examid)throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("select total_question from exam where examid=?");
        ps.setString(1, examid);
       ResultSet rs=ps.executeQuery();
        rs.next();
          return rs.getInt(1);
      
    }
    
    public static boolean isPaperSet(String subject)throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("Select examId from Exam where language=?");
        ps.setString(1,subject);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    
    public static ArrayList<String> getExamIdBySubject(String subject,String username)throws SQLException{
        Connection conn=DBConnection.getConn();
        String qry="Select examid from exam where language=? minus select examid from performance where userid=?";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,subject);
        ps.setString(2,username);
        ResultSet rs=ps.executeQuery();
        ArrayList<String> examList=new ArrayList<>();
        while(rs.next()){
            String examid=rs.getString(1);
            examList.add(examid);
        }
        return examList;
    }
}
