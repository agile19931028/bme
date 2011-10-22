// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.Long;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import medizin.server.domain.AssesmentQuestion;

privileged aspect AssesmentQuestion_Roo_Entity {
    
    declare @type: AssesmentQuestion: @Entity;
    
    declare @type: AssesmentQuestion: @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS);
    
    public static long AssesmentQuestion.countAssesmentQuestions() {
        return entityManager().createQuery("SELECT COUNT(o) FROM AssesmentQuestion o", Long.class).getSingleResult();
    }
    
    public static List<AssesmentQuestion> AssesmentQuestion.findAllAssesmentQuestions() {
        return entityManager().createQuery("SELECT o FROM AssesmentQuestion o", AssesmentQuestion.class).getResultList();
    }
    
    public static AssesmentQuestion AssesmentQuestion.findAssesmentQuestion(Long id) {
        if (id == null) return null;
        return entityManager().find(AssesmentQuestion.class, id);
    }
    
    public static List<AssesmentQuestion> AssesmentQuestion.findAssesmentQuestionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM AssesmentQuestion o", AssesmentQuestion.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
