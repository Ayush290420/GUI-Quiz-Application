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
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.User;
/**
 *
 * @author AYUSH
 */
public class UserDAO {
    public static boolean validateUser(User u)throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("Select * from users where userid=? and password=? and userType=? ");
        ps.setString(1, u.getUserId());
        ps.setString(2,u.getPassword());
        ps.setString(3,u.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    public static boolean addStudents(User u) throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1,u.getUserId());
        ps.setString(2,u.getPassword());
        ps.setString(3,u.getUserType());
        int ans;
        ans=ps.executeUpdate();
        if(ans==0)
            return false;
        return true;
    }
    public static boolean updatePassword(String password, String UserName)throws SQLException{
        Connection conn=DBConnection.getConn();
        PreparedStatement ps=conn.prepareStatement("Update users set password=? where userid=?");
        ps.setString(1,password);
        ps.setString(2, UserName);
        int ans;
        ans=ps.executeUpdate();
        if(ans==0)
            return false;
        return true;
    }
}
