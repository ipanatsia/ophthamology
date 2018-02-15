
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C8B42B8B-0FEF-E541-17B0-9436F48716DD]
// </editor-fold> 
public class PrescriptionGlass extends PrescriptionEyesCorrection {
    //Η εξειδικευμένη κλάση για συνταγές γυαλιών. Περιέχει μόνο τα στοιχεία
    // που δεν κληρονομούνται και υλοποιεί την εκτύπωση της συνταγής (με κατάλληλες
    //κλησεις στις πατρικές συναρτήσεις
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.99ABA246-28AA-4925-CB85-24BBDFB2CD39]
    // </editor-fold> 
    private double distanceBetweenEyes;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.902747FC-628E-A0E1-1F73-74EEA963B165]
    // </editor-fold> 
    public PrescriptionGlass () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AD9E82BC-F19D-528C-C2AC-0101A404E799]
    // </editor-fold> 
    public double getDistanceBetweenEyes () {
        return distanceBetweenEyes;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.84213028-4852-A921-FCCB-5C4CD08794E6]
    // </editor-fold> 
    public void setDistanceBetweenEyes (double val) {
        this.distanceBetweenEyes = val;
    }

    @Override
    public String writePrescription()
    {
        String pres = super.writePrescription();

        pres += "Απόσταση οφθαλμών:" + distanceBetweenEyes;


        return pres;
    }
}

