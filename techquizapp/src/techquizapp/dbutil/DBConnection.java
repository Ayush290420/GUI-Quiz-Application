/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AYUSH
 */
public class DBConnection {
    private static  Connection  conn;
    static{
    try{
           Class.forName("oracle.jdbc.OracleDriver");
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//AYUSH-PC:1521/XE","onlineexam","students");
           JOptionPane.showMessageDialog(null, "Connected to DB ", "Inserted", JOptionPane.INFORMATION_MESSAGE);
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Cannot Connect with DB", "Error!", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
           System.out.println(ex.getMessage());
           System.exit(1);
       }
}
    public static Connection getConn(){
    return conn;
}
    public static void closeConn(){
        try{
        conn.close();
        JOptionPane.showMessageDialog(null, "Connection Closed ", "Closed", JOptionPane.INFORMATION_MESSAGE);
    }
        catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "Cannot Close Connection", "Error!", JOptionPane.ERROR_MESSAGE);
           sqle.printStackTrace();
           System.out.println(sqle.getMessage());
        }
    }
}
