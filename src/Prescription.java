
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4EBCDB26-648C-2D9E-40E7-A7C59A1A65F0]
// </editor-fold> 
public class Prescription {
    //Η γενική κλάση για τις συνταγές. Περιέχει μόνο τα στοιχεία για τον ασθενή
    //και υλοποιεί την εκτύπωση του header της συνταγής
    Patient patient;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0AFFA3EA-31EB-275F-FF1C-680D09757E1D]
    // </editor-fold> 
    public Prescription () {
    }
    public Patient getPatient () {
        return patient;
    }

    public void setPatient (Patient val) {
        this.patient = val;
    }
    public String writePrescription()
    {
        String txt = "ΟΦΘΑΛΜΙΑΤΡΕΙΟ \"Πίνοντας Java\"\n\nΣΥΝΤΑΓΗ για τον ασθενή\n";
        txt += patient.getSurname() + " " + patient.getName();
        txt += "\n\nΤΑΜΕΙΟ ΑΣΦΑΛΙΣΜΕΝΟΥ: "+patient.getInsurance() +"\n\n";
        return txt;
    }
}

