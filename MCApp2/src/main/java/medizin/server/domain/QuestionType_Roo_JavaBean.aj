// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

privileged aspect QuestionType_Roo_JavaBean {
    
    public String QuestionType.getQuestionTypeName() {
        return this.questionTypeName;
    }
    
    public void QuestionType.setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName;
    }
    
    public Boolean QuestionType.getIsWeil() {
        return this.isWeil;
    }
    
    public void QuestionType.setIsWeil(Boolean isWeil) {
        this.isWeil = isWeil;
    }
    
    public Integer QuestionType.getTrueAnswers() {
        return this.trueAnswers;
    }
    
    public void QuestionType.setTrueAnswers(Integer trueAnswers) {
        this.trueAnswers = trueAnswers;
    }
    
    public Integer QuestionType.getFalseAnswers() {
        return this.falseAnswers;
    }
    
    public void QuestionType.setFalseAnswers(Integer falseAnswers) {
        this.falseAnswers = falseAnswers;
    }
    
    public Integer QuestionType.getSumAnswers() {
        return this.sumAnswers;
    }
    
    public void QuestionType.setSumAnswers(Integer sumAnswers) {
        this.sumAnswers = sumAnswers;
    }
    
    public Integer QuestionType.getMaxLetters() {
        return this.maxLetters;
    }
    
    public void QuestionType.setMaxLetters(Integer maxLetters) {
        this.maxLetters = maxLetters;
    }
    
}
