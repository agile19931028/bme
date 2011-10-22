// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import medizin.server.domain.QuestionEvent;
import org.springframework.transaction.annotation.Transactional;

privileged aspect QuestionEvent_Roo_Entity {
    
    declare @type: QuestionEvent: @Entity;
    
    @PersistenceContext
    transient EntityManager QuestionEvent.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long QuestionEvent.id;
    
    @Version
    @Column(name = "version")
    private Integer QuestionEvent.version;
    
    public Long QuestionEvent.getId() {
        return this.id;
    }
    
    public void QuestionEvent.setId(Long id) {
        this.id = id;
    }
    
    public Integer QuestionEvent.getVersion() {
        return this.version;
    }
    
    public void QuestionEvent.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void QuestionEvent.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void QuestionEvent.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            QuestionEvent attached = QuestionEvent.findQuestionEvent(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void QuestionEvent.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void QuestionEvent.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public QuestionEvent QuestionEvent.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        QuestionEvent merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager QuestionEvent.entityManager() {
        EntityManager em = new QuestionEvent().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long QuestionEvent.countQuestionEvents() {
        return entityManager().createQuery("SELECT COUNT(o) FROM QuestionEvent o", Long.class).getSingleResult();
    }
    
    public static List<QuestionEvent> QuestionEvent.findAllQuestionEvents() {
        return entityManager().createQuery("SELECT o FROM QuestionEvent o", QuestionEvent.class).getResultList();
    }
    
    public static QuestionEvent QuestionEvent.findQuestionEvent(Long id) {
        if (id == null) return null;
        return entityManager().find(QuestionEvent.class, id);
    }
    
    public static List<QuestionEvent> QuestionEvent.findQuestionEventEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM QuestionEvent o", QuestionEvent.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
