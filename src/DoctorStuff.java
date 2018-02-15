/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DoctorStuff implements java.io.Serializable{
    //Ο ρόλος αυτής της κλάσης είναι καθαρά πρακτικός
    //Χρησιμοποιείται μόνο για την αποθήκευση των στοιχείων
    //για 2 λόγους. Πρώτα από όλα για να υπάρχει ένα ενιαίο αρχείο
    //και δεύτερον για να μην δημιουργούνται προβλήματα με τις αναφορές
    //μεταξύ των αντικειμένων.
    public Patients patients;
    public DayBook daybook;
    public DoctorStuff()
    {
        patients = new Patients();
        daybook = new DayBook();
    }
}
