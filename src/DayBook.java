
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.25944906-EB43-3232-1376-BA3A80E2DD53]
// </editor-fold> 
public class DayBook implements Serializable  {

    //Κλάση για το ημερολόγιο, αποτελείτε απο πολλά ραντεβού
    private Vector<Rendezvous> rantevou = new Vector<Rendezvous>();
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.71AA60BB-0569-6B84-6130-818AF7DD2867]
    // </editor-fold> 
    public DayBook () {
    }
    //ανάθεση και ανάκτηση της τιμής των ραντεβού
    public void setRendezvous(Vector<Rendezvous> ran)
    {
        rantevou = ran;

    }
    public Vector<Rendezvous> getRendezvous()
    {
        return rantevou;
    }
    //Ταξινόμηση των ραντεβού, ανάλογα με την ημερομηνία + ώρα εξέτασης
    public void ArrangeDayBook()
    {
        Collections.sort(rantevou, new Comparer());
    }
    class Comparer implements Comparator
    {
        //χρησιμοποιούμε τα Millis που έχουν περάσει απο 0 σαν μέτρο σύγκρισης
        //για να αποφύγουμε περιπλοκες και χρονοβόρες συγκρίσεις
        public int compare(Object o1, Object o2) {
            Rendezvous _o1 = (Rendezvous)o1, _o2 = (Rendezvous)o2;
            return (int)(_o1.getRandezvousDayTime().getTimeInMillis()- _o2.getRandezvousDayTime().getTimeInMillis());
        }

    }
}

