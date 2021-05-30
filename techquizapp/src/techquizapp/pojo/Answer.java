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
// */
public class Answer {
    private String examId;
    private int qno;
    private String correctAns;
    private String chosenAns;
    private String subject;

    public Answer(String examId, int qno, String correctAns, String chosenAns, String subject) {
        this.examId = examId;
        this.qno = qno;
        this.correctAns = correctAns;
        this.chosenAns = chosenAns;
        this.subject = subject;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Answer other = (Answer) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.correctAns, other.correctAns)) {
            return false;
        }
        if (!Objects.equals(this.chosenAns, other.chosenAns)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Answer{" + "examId=" + examId + ", qno=" + qno + ", correctAns=" + correctAns + ", chosenAns=" + chosenAns + ", subject=" + subject + '}';
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public String getChosenAns() {
        return chosenAns;
    }

    public void setChosenAns(String chosenAns) {
        this.chosenAns = chosenAns;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
