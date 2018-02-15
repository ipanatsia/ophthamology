
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.908F83A2-8BB5-8F87-1385-28FA6D802BCF]
// </editor-fold> 
public class PrescriptionEyesCorrection extends Prescription {
    //Η λιγότερο εξειδικευμένη κλάση για συνταγές που αφορούν διόρθωση όρασης
    //Περιέχει μόνο τα στοιχεία που δεν κληρονομούνται και είναι κοινά για τα
    //γυαλιά και τους φακούς και
    //και υλοποιεί την εκτύπωση της συνταγής (με κατάλληλες
    //κλησεις στις πατρικές συναρτήσεις)
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BCB0AA59-90A4-2B7E-0ABE-7A753C137122]
    // </editor-fold> 
    private double leftEyeSpherical;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CC71A61E-B134-2588-088A-28CCF908F8AB]
    // </editor-fold> 
    private double rightEyeSpherical;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2A2F17B6-732C-1F6B-0364-9A6BE874F903]
    // </editor-fold> 
    private double leftEyeCylindrical;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8CD641B4-14CA-9394-4976-B448F243B0A6]
    // </editor-fold> 
    private double rightEyeCylindrical;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F7F27CF9-F7E5-1840-7AC6-7D3A52CA9097]
    // </editor-fold> 
    private double leftEyeAxis;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D88E7A0D-B4A2-F997-A162-6987A8433537]
    // </editor-fold> 
    private double rightEyeAxis;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.14F3A608-E58C-3144-EF7C-830428A38FD8]
    // </editor-fold> 
    public PrescriptionEyesCorrection () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.76BA7810-67E1-6681-0FD1-72CE51941A86]
    // </editor-fold> 
    public double getLeftEyeAxis () {
        return leftEyeAxis;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.85EDB73E-A9FC-5752-E292-BB3309331A86]
    // </editor-fold> 
    public void setLeftEyeAxis (double val) {
        this.leftEyeAxis = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.523CF25B-4928-2324-F663-FBF0F25BB9E7]
    // </editor-fold> 
    public double getLeftEyeCylindrical () {
        return leftEyeCylindrical;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.91FE0568-3AC1-BE1E-BB83-1BFEFBC889F7]
    // </editor-fold> 
    public void setLeftEyeCylindrical (double val) {
        this.leftEyeCylindrical = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.70829F41-575C-638B-3325-884B810D23E7]
    // </editor-fold> 
    public double getLeftEyeSpherical () {
        return leftEyeSpherical;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0886A84F-972E-AF6B-994F-F968DEBB3F27]
    // </editor-fold> 
    public void setLeftEyeSpherical (double val) {
        this.leftEyeSpherical = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8FAE5967-3A01-9C0D-E661-8DFB14175EC4]
    // </editor-fold> 
    public double getRightEyeAxis () {
        return rightEyeAxis;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB5E17A8-54BD-5FB9-BFD8-A61AFDE81371]
    // </editor-fold> 
    public void setRightEyeAxis (double val) {
        this.rightEyeAxis = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.30C94292-9CCA-E0BF-222A-D11F1B320D5A]
    // </editor-fold> 
    public double getRightEyeCylindrical () {
        return rightEyeCylindrical;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4FDA9037-72B6-1443-F517-F5F715BB614D]
    // </editor-fold> 
    public void setRightEyeCylindrical (double val) {
        this.rightEyeCylindrical = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BDBF96ED-FB5A-AA27-2051-56A43DBB9A58]
    // </editor-fold> 
    public double getRightEyeSpherical () {
        return rightEyeSpherical;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7EB1B529-7A59-CF3D-5715-7C74700C49A5]
    // </editor-fold> 
    public void setRightEyeSpherical (double val) {
        this.rightEyeSpherical = val;
    }

    @Override
    public String writePrescription()
    {
        String pres = super.writePrescription();
        pres += "Δεξιός Οφθαλμός\n------------------------------\n";
        pres += "Σφαιρική Διόρθωση: "+rightEyeSpherical + "\n";
        pres += "Κυλινδρική Διόρθωση: "+rightEyeCylindrical + "\n";
        pres += "Άξονας Κυλινδρικής Διόρθωσης:" + rightEyeAxis + "\n\n";

        pres += "Αριστερός Οφθαλμός\n--------------------------- \n";
        pres += "Σφαιρική Διόρθωση: "+leftEyeSpherical + "\n";
        pres += "Κυλινδρική Διόρθωση: "+leftEyeCylindrical + "\n";
        pres += "Άξονας Κυλινδρικής Διόρθωσης:" + leftEyeAxis + "\n\n";
        return pres;
    }
}

