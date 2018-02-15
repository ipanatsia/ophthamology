
import java.util.Calendar;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.7ACB90BA-9D0B-F585-E111-0D0481994B8B]
// </editor-fold> 
public class DiseaseProgress  implements java.io.Serializable{

    //Η κλάση αυτή περιέχει το ιστορικό για ασθένειες. Κάθε αντικείμενο
    //περιλαμβάνει τις ιστορικές εξελίξεις (progress) στις ανάλογες ημέρομηνίες
    //(daysOfProgress) για την ασθένεια (disease)
    private Disease disease;
    private String [] progress;
    private Calendar [] dayOfProgress;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5C93AB60-AEC2-00A1-7F40-41A7E2004924]
    // </editor-fold> 
    public DiseaseProgress () {
    }

    public Disease getDisease()
    {
        return disease;
    }
    public void setDisease(Disease val)
    {
        disease= val;
    }

    public String [] getProgress()
    {
        return progress;
    }
    public void setProgress(String [] val)
    {
        progress= val;
    }
    public Calendar [] getDayOfProgress()
    {
        return dayOfProgress;
    }
    public void setDayOfProgress(Calendar [] val)
    {
        dayOfProgress= val;
    }
}

