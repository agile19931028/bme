// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.String;

privileged aspect QuestionSumPerPerson_Roo_ToString {
    
    public String QuestionSumPerPerson.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assesment: ").append(getAssesment()).append(", ");
        sb.append("QuestionEvent: ").append(getQuestionEvent()).append(", ");
        sb.append("QuestionSum: ").append(getQuestionSum()).append(", ");
        sb.append("ResponsiblePerson: ").append(getResponsiblePerson()).append(", ");
        sb.append("Sort_order: ").append(getSort_order());
        return sb.toString();
    }
    
}
