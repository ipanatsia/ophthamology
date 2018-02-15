
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.F64A39EE-83D0-4437-97A7-36828F8CCCDF]
// </editor-fold> 
public class PrescriptionMedicine extends Prescription {
    //Η εξειδικευμένη κλάση για συνταγές φαρμάκων. Περιέχει μόνο τα στοιχεία
    // που δεν κληρονομούνται και υλοποιεί την εκτύπωση της συνταγής (με κατάλληλες
    //κλησεις στην πατρική συναρτήση
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E4426E9A-3947-A7DA-39AF-5875B86DDA19]
    // </editor-fold> 
    private String Name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.705472D0-A63B-638E-57E7-C9130749920F]
    // </editor-fold> 
    private int quantity;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6EBA3C1B-A67F-65A3-9331-672C3242428F]
    // </editor-fold> 
    private int dosesPerDay;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.30D618FB-7017-DCF1-E261-879D546FD0BD]
    // </editor-fold> 
    private int dose;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B23A05AF-9851-5334-9132-4F80F5949B34]
    // </editor-fold> 
    public PrescriptionMedicine () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6AA43CE7-DE52-D265-2C30-1F8E7E8E40ED]
    // </editor-fold> 
    public String getName () {
        return Name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2E8BE345-89D7-11C2-DD5C-6253D3214B92]
    // </editor-fold> 
    public void setName (String val) {
        this.Name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C1FB983B-5931-4718-72F1-CD52428EF7D9]
    // </editor-fold> 
    public int getDose () {
        return dose;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.88F89FF5-F896-9E28-7CE4-0539F05A63D0]
    // </editor-fold> 
    public void setDose (int val) {
        this.dose = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.374E0117-8C4A-B245-D4D1-FD8313585CE4]
    // </editor-fold> 
    public int getDosesPerDay () {
        return dosesPerDay;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D2F7DB98-D22D-D848-BAC7-EDECBFF85336]
    // </editor-fold> 
    public void setDosesPerDay (int val) {
        this.dosesPerDay = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.66CF2055-ADF1-CBA0-953F-0195ADCBAD36]
    // </editor-fold> 
    public int getQuantity () {
        return quantity;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2A1E9C1A-D4BF-A5AC-7069-2019DC1845E0]
    // </editor-fold> 
    public void setQuantity (int val) {
        this.quantity = val;
    }

        public String writePrescription()
    {
        String pres = super.writePrescription();

        pres += "Φάρμακο:" + Name+"\n";
        pres += "Ποσότητα:" + quantity+"\n";
        pres += dose+" τεμάχια"+dosesPerDay+" φορα(ές) την ημέρα\n";

        return pres;
    }
}

