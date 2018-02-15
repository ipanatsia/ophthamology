
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4D95A2C2-13B5-91D8-FAD1-9415036C099D]
// </editor-fold> 
public class PrescriptionEyeContact extends PrescriptionEyesCorrection {
    //Η εξειδικευμένη κλάση για συνταγές φακών επαφής. Περιέχει μόνο τα στοιχεία
    // που δεν κληρονομούνται αι υλοποιεί την εκτύπωση της συνταγής (με κατάλληλες
    //κλησεις στις πατρικές συναρτήσεις
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E494F4AE-13FF-FC6D-1453-FB2D985C3BCD]
    // </editor-fold> 
    private int leftEyeCyrtosis;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D3D58351-CBAA-D517-95A0-FD9E8C6FF7EF]
    // </editor-fold> 
    private int rightEyeCyrtosis;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C816466-6878-A964-34C6-4CA28986C99C]
    // </editor-fold> 
    public PrescriptionEyeContact () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.13361B40-F697-66B6-E1AB-C8C4D9516050]
    // </editor-fold> 
    public int getLeftEyeCyrtosis () {
        return leftEyeCyrtosis;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.22DD1ADB-0F23-104D-5714-4C66E4CBDF5D]
    // </editor-fold> 
    public void setLeftEyeCyrtosis (int val) {
        this.leftEyeCyrtosis = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.90C75370-61FF-820F-026D-9FD30A7BC4B2]
    // </editor-fold> 
    public int getRightEyeCyrtosis () {
        return rightEyeCyrtosis;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9510081E-68C6-D80E-3DA5-A0A375D199A4]
    // </editor-fold> 
    public void setRightEyeCyrtosis (int val) {
        this.rightEyeCyrtosis = val;
    }
    public String writePrescription()
    {

        String pres = super.writePrescription();

        pres += "Κυρτότητα Δεξιού οφθαλμού:" + rightEyeCyrtosis;

        pres += "Κυρτότητα Αριστερού οφθαλμού: "+leftEyeCyrtosis;
        return pres;
    }
}

