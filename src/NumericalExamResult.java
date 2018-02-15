
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E7F49354-991E-8E27-24E5-D15BBBC5D1F6]
// </editor-fold> 
public class NumericalExamResult extends ExamResult implements java.io.Serializable {

    //Κλάση για τον χειρισμό αποτελεσμάτων εξετάσεων με αριθμητικά αποτελέσματα
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.50426ED9-98E9-D418-CD6F-BF127D557E21]
    // </editor-fold> 
    private double Result;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E2C598A5-A8D8-0C9B-7E62-E613A9CB76F5]
    // </editor-fold> 
    private double minNormalValue;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2B59C019-74F6-7C08-ED99-877A6976D3E0]
    // </editor-fold> 
    private double maxNormalValue;



    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BAF0D48D-E3D4-F552-85B4-9E6A0A091CE2]
    // </editor-fold> 
    public NumericalExamResult () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F39D96C6-E8E2-24FA-0080-B5CB88089C6D]
    // </editor-fold> 
    public double getResult () {
        return Result;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2FC07981-A0EE-1674-C6BC-B7CDA3C2361F]
    // </editor-fold> 
    public void setResult (double val) {
        this.Result = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.849BCA62-27AF-EC1C-A751-153F9C5B2CBB]
    // </editor-fold> 
    public double getMaxNormalValue () {
        return maxNormalValue;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.39044225-0E7D-DBCB-7644-1231F64A548B]
    // </editor-fold> 
    public void setMaxNormalValue (double val) {
        this.maxNormalValue = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.92DD84B8-AF24-2B99-D67B-853CE2CFBDCB]
    // </editor-fold> 
    public double getMinNormalValue () {
        return minNormalValue;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.75C11785-66E3-D73B-CCF0-2B52D4E2F3E3]
    // </editor-fold> 
    public void setMinNormalValue (double val) {
        this.minNormalValue = val;

    }
}


