/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

import java.util.ArrayList;

/**
 *
 * @author AYUSH
 */
public class AnswerStore {
    ArrayList<Answer> answerList;
    public AnswerStore(){
    answerList=new ArrayList<>();
}
    public void addAnswer(Answer a){
        answerList.add(a);
    }
    public Answer getAnswer(int pos){
    return  answerList.get(pos);
    }
    public void removeAnswer(int pos){
        answerList.remove(pos);
    }
    public void setAnswerAt(int pos, Answer a){
        answerList.add(pos, a);
    }
    public ArrayList<Answer> getAllAnswer(){
        return answerList;
    }
    public int getCount(){
       return answerList.size();
    }
    public Answer getAnswerByQno(int qno){
        for(Answer a:answerList){
            if(a.getQno()==qno)
                return a;
        }
        return null;
    }
    public int removeAnswer(Answer a){
        int pos=answerList.indexOf(a);
        answerList.remove(pos);
        return pos;
    }
}
