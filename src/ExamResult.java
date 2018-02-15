
import java.util.Calendar;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.770CF98A-5DCB-A08E-B741-02A5A36DE55E]
// </editor-fold> 
public class ExamResult  implements java.io.Serializable {
    //Γενική κλάση για την αποθήκευση αποτελέσματος εξετάσης
    //Διαθέτει τα απολύτως απαραίτητα, όνομα εξέτασης και ημερομηνία πραγματοποίησης
    private String examName;
    private Calendar examDate;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D4482CEF-A9E5-AB1E-2EAB-A7901A2A1CF4]
    // </editor-fold> 
    public ExamResult () {
    }
    public String getExamName () {
        return examName;
    }

    public void setExamName (String val) {
        this.examName = val;
    }

        public Calendar getExamDate () {
        return examDate;
    }

    public void setExamDate (Calendar val) {
        this.examDate = val;
    }

}

