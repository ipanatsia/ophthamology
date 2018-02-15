
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D0A384C0-E392-EB4F-9BAF-CCE039DBC10D]
// </editor-fold> 
public class Disease  implements java.io.Serializable{

    //Η κλάση περιέχει το όνομα της ασθένειας και στην παρούσα μορφή
    //θα μπορούσε να αποτελεί απλώς ένα πεδίο στις κλασεις που την
    //χρησιμοποιούν
    //Καθώς όμως, οι γνώσεις μας πάνω στην οφθαλμολογία είναι περισσότερο εμπειρικές
    //και, προφανώς καθόλου εμπεριστατωμένες, ο γιατρός, για κάθε ασθένεια
    //μπορεί να θέλει να αποθηκεύει και επιπλέον χαρακτηριστικά, πέρα απο το
    //όνομα.
    private String diseaseName;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5A3BD1F8-ECB3-9347-76C9-5FDA434ABCA3]
    // </editor-fold> 
    public Disease () {
    }

    public void setDiseaseName(String val)
    {
        diseaseName = val;
    }
    public String getDiseaseName()
    {
        return diseaseName;
    }
}

