// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.Integer;
import java.util.Set;
import medizin.server.domain.Assesment;
import medizin.server.domain.QuestionType;

privileged aspect QuestionTypeCountPerExam_Roo_JavaBean {
    
    public Set<QuestionType> QuestionTypeCountPerExam.getQuestionTypesAssigned() {
        return this.questionTypesAssigned;
    }
    
    public void QuestionTypeCountPerExam.setQuestionTypesAssigned(Set<QuestionType> questionTypesAssigned) {
        this.questionTypesAssigned = questionTypesAssigned;
    }
    
    public Assesment QuestionTypeCountPerExam.getAssesment() {
        return this.assesment;
    }
    
    public void QuestionTypeCountPerExam.setAssesment(Assesment assesment) {
        this.assesment = assesment;
    }
    
    public Integer QuestionTypeCountPerExam.getQuestionTypeCount() {
        return this.questionTypeCount;
    }
    
    public void QuestionTypeCountPerExam.setQuestionTypeCount(Integer questionTypeCount) {
        this.questionTypeCount = questionTypeCount;
    }
    
    public Integer QuestionTypeCountPerExam.getSort_order() {
        return this.sort_order;
    }
    
    public void QuestionTypeCountPerExam.setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }
    
}
