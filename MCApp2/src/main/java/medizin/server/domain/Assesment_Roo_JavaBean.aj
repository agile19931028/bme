// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import medizin.server.domain.Assesment;
import medizin.server.domain.Mc;

privileged aspect Assesment_Roo_JavaBean {
    
    public String Assesment.getName() {
        return this.name;
    }
    
    public void Assesment.setName(String name) {
        this.name = name;
    }
    
    public Date Assesment.getDateOfAssesment() {
        return this.dateOfAssesment;
    }
    
    public void Assesment.setDateOfAssesment(Date dateOfAssesment) {
        this.dateOfAssesment = dateOfAssesment;
    }
    
    public Date Assesment.getDateOpen() {
        return this.dateOpen;
    }
    
    public void Assesment.setDateOpen(Date dateOpen) {
        this.dateOpen = dateOpen;
    }
    
    public Date Assesment.getDateClosed() {
        return this.dateClosed;
    }
    
    public void Assesment.setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }
    
    public String Assesment.getPlace() {
        return this.place;
    }
    
    public void Assesment.setPlace(String place) {
        this.place = place;
    }
    
    public String Assesment.getLogo() {
        return this.logo;
    }
    
    public void Assesment.setLogo(String logo) {
        this.logo = logo;
    }
    
    public Boolean Assesment.getIsClosed() {
        return this.isClosed;
    }
    
    public void Assesment.setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }
    
    public Integer Assesment.getAssesmentVersion() {
        return this.assesmentVersion;
    }
    
    public void Assesment.setAssesmentVersion(Integer assesmentVersion) {
        this.assesmentVersion = assesmentVersion;
    }
    
    public Mc Assesment.getMc() {
        return this.mc;
    }
    
    public void Assesment.setMc(Mc mc) {
        this.mc = mc;
    }
    
    public Assesment Assesment.getRepeFor() {
        return this.repeFor;
    }
    
    public void Assesment.setRepeFor(Assesment repeFor) {
        this.repeFor = repeFor;
    }
    
    public Integer Assesment.getPercentSameQuestion() {
        return this.percentSameQuestion;
    }
    
    public void Assesment.setPercentSameQuestion(Integer percentSameQuestion) {
        this.percentSameQuestion = percentSameQuestion;
    }
    
}
