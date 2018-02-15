
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.17A86B41-5CC6-C896-725B-E9DD78E7A493]
// </editor-fold> 
public class Rendezvous implements java.io.Serializable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.471E4007-53B8-449A-F00C-048C254D24B9]
    // </editor-fold> 
    private java.util.Calendar randezvousDayTime;
    private Patient patient;
    private boolean completed;
    //Η κλάση για το ραντεβού περιλαμβάνει τον ασθενή και την ημερομηνία του ραντεβού
    //καθώς και την κατάστασή του  (ολοκληρωμένο ή όχι)
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0AC5847B-DDCD-BDBC-69F5-98D1027E2B4C]
    // </editor-fold> 
    public Rendezvous () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.84401666-69C0-C0CC-6BD6-88504281A20D]
    // </editor-fold> 
    public java.util.Calendar getRandezvousDayTime () {
        return randezvousDayTime;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5818ED21-DD63-2E21-8C0C-1F8C62FFB96C]
    // </editor-fold> 
    public void setRandezvousDayTime (java.util.Calendar val) {
        this.randezvousDayTime = val;
    }

    public Patient getPatient () {
        return patient;
    }

    public void setPatient (Patient val) {
        this.patient = val;
    }
    public boolean isCompleted () {
        return completed;
    }

    public void setCompleted (boolean  val) {
        this.completed = val;
    }
}

