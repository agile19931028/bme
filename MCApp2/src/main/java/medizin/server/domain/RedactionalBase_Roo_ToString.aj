// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package medizin.server.domain;

import java.lang.String;

privileged aspect RedactionalBase_Roo_ToString {
    
    public String RedactionalBase.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: ").append(getAutor()).append(", ");
        sb.append("DateAdded: ").append(getDateAdded()).append(", ");
        sb.append("DateChanged: ").append(getDateChanged()).append(", ");
        sb.append("Rewiewer: ").append(getRewiewer());
        return sb.toString();
    }
    
}
