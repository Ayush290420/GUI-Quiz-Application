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
import techquizapp.pojo.Performance;
import techquizapp.pojo.StudentScore;

/**
 *
 * @author AYUSH
 */
public class PerformanceDAO {
    
    public static void addPerformance(Performance p)throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        ps.setString(1,p.getUserName());
        ps.setString(2,p.getExamid());
      ps.setInt(3,p.getRight());
      ps.setInt(4,p.getWrong());
      ps.setInt(5,p.getUnattempted());
      ps.setDouble(6,p.getPer());
      ps.setString(7,p.getLanguage());
      int ans=ps.executeUpdate();
      
    }
    
    public static ArrayList<String> getExamIdByUserName(String username)throws SQLException{
        Connection conn=DBConnection.getConn();
        ArrayList<String> examList=new ArrayList();
        PreparedStatement ps=conn.prepareStatement("Select examid from performance where userid=? ");
        ps.setString(1, username);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            String exam=rs.getString(1);
            examList.add(exam);
        }
        return examList;
    }
    
    public static String getLanguageByExamId(String examid)throws SQLException{
         Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("select language from Performance where examid=?");
        ps.setString(1, examid);
        ResultSet rs=ps.executeQuery();
        rs.next();
        return rs.getString(1);
    }
    
    public static Double getPercentageByExamId(String examid)throws SQLException{
         Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("select per from Performance where examid=?");
        ps.setString(1, examid);
        ResultSet rs=ps.executeQuery();
        rs.next();
        return rs.getDouble(1);
    }
    
    public static ArrayList<Performance> getAllData()throws SQLException{
        Connection conn=DBConnection.getConn();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("Select * from Performance");
       ArrayList<Performance> perfList=new ArrayList<>();
       while(rs.next()){
         String userId=rs.getString(1);
         String examId=rs.getString(2);
         int right=rs.getInt(3);
         int wrong=rs.getInt(4);
         int unattempted=rs.getInt(5);
         double per=rs.getDouble(6);
         String language=rs.getString(7);
         Performance performance=new Performance(userId,examId,right,wrong,unattempted,per,language);
         perfList.add(performance);
       }
       return perfList;
    }
    public static ArrayList<String> getAllStudentId()throws SQLException{
        Connection conn=DBConnection.getConn();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("Select distinct userid from Performance");
       ArrayList<String> userList=new ArrayList<>();
       while(rs.next()){
           String username=rs.getString(1);
           userList.add(username);
       }
       return userList;
    }
    
    
    public static ArrayList<String> getAllExamId(String studentId)throws SQLException{
         Connection conn=DBConnection.getConn();
         ArrayList<String> examList=new ArrayList<>();
        PreparedStatement ps=conn.prepareStatement("select examid from performance where userid=?");
        ps.setString(1,studentId);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            String examid=rs.getString(1);
            examList.add(examid);
        }
        return examList;
    }
    
    public static StudentScore getStudentScore(String studentId, String examId)throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("select language ,per from performance where userid=? and examid=?");
        ps.setString(1,studentId);
        ps.setString(2,examId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        String language=rs.getString(1);
        double per=rs.getDouble(2);
        StudentScore sc=new StudentScore(language,per);
        return sc;
    
    }
}
