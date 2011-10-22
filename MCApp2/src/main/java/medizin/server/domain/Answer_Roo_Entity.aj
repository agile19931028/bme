// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.Long;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import medizin.server.domain.Answer;

privileged aspect Answer_Roo_Entity {
    
    declare @type: Answer: @Entity;
    
    declare @type: Answer: @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS);
    
    public static long Answer.countAnswers() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Answer o", Long.class).getSingleResult();
    }
    
    public static List<Answer> Answer.findAllAnswers() {
        return entityManager().createQuery("SELECT o FROM Answer o", Answer.class).getResultList();
    }
    
    public static Answer Answer.findAnswer(Long id) {
        if (id == null) return null;
        return entityManager().find(Answer.class, id);
    }
    
    public static List<Answer> Answer.findAnswerEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Answer o", Answer.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
