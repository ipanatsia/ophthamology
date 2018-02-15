/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Vector;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

public class Patients implements Serializable {
    //Υπερκλάση που περιλαμβάνει το σύνολο των ασθενών
    //Υλοποιούνται λειτουργίες ταξινόμησης κατ'όνομα
    protected Vector<Patient> thePatients;
    public Vector<Patient> getPatients() {return thePatients;}
    public void getPatients(Vector<Patient> oth) {thePatients = oth;}
    public Patients()
    {
        thePatients = new Vector<Patient>();
    }
     public void ArrangePatients()
    {
        Collections.sort(thePatients, new Comparer());
        
    }
     class Comparer implements Comparator
     {

        public int compare(Object o1, Object o2) {
            Patient p1 = (Patient)o1;
            Patient p2 = (Patient)o2;
            return p1.getSurname().compareTo(p2.getSurname());
        }

     }
}
