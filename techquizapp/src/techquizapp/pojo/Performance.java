/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

import java.util.Objects;

/**
 *
 * @author AYUSH
 */
public class Performance {
    private String userName;
    private String examid;
    private int right;

    public Performance(String userName, String examid, int right, int wrong, int unattempted, double per, String language) {
        this.userName = userName;
        this.examid = examid;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
        this.language = language;
    }
    private int wrong;
       private int unattempted;
    private double per;
    private String language;

    @Override
    public String toString() {
        return "Performance{" + "userName=" + userName + ", examid=" + examid + ", right=" + right + ", wrong=" + wrong + ", unattempted=" + unattempted + ", per=" + per + ", language=" + language + '}';
    }
 
   
         public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
