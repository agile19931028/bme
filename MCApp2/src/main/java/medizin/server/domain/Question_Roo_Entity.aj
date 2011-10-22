// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.Long;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import medizin.server.domain.Question;

privileged aspect Question_Roo_Entity {
    
    declare @type: Question: @Entity;
    
    declare @type: Question: @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS);
    
    public static long Question.countQuestions() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Question o", Long.class).getSingleResult();
    }
    
    public static List<Question> Question.findAllQuestions() {
        return entityManager().createQuery("SELECT o FROM Question o", Question.class).getResultList();
    }
    
    public static Question Question.findQuestion(Long id) {
        if (id == null) return null;
        return entityManager().find(Question.class, id);
    }
    
    public static List<Question> Question.findQuestionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Question o", Question.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
