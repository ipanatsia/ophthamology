/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.io.Serializable;

public class Patient implements Serializable
{
    //Η κλαση ασθενής περιλαμβάνει τα προσωπικά στοιχεία του ασθενή καθώς και
    //το πλήρες ιστορικό του (ασθένεις και εξετάσεις)
    private String name, surname, Address, telephone, mobile, insurance, birthday;

    private DiseaseProgress [] diseases;
    private QualitiveExamResult [] qexamResults;
    private NumericalExamResult [] nexamResults;
    
    
    
    public DiseaseProgress [] getDiseases()
    {
        return diseases;
    }
    
    public void setDiseases(DiseaseProgress [] val)
    {
        diseases = val;
    }

    public QualitiveExamResult [] getQualitiveExamResults()
    {
        return qexamResults;
    }

    public void setQualitiveExamResults(QualitiveExamResult [] val)
    {
        qexamResults = val;
    }

    public NumericalExamResult [] getNumericalExamResults()
    {
        return nexamResults;
    }

    public void setNumericalExamResults(NumericalExamResult [] val)
    {
        nexamResults = val;
    }
            
            public Patient()
    {

    }
    public void setBirthday(String day)
    {
        this.birthday = day;
    }
    public void setName(String nam)
    {
        this.name = nam;
    }

    public void setSurname(String nam)
    {
        this.surname = nam;
    }

    public void setAddress(String nam)
    {
        this.Address = nam;
    }
     public void setTelephone(String nam)
    {
        this.telephone = nam;
    }

    public void setMobile(String nam)
    {
        this.mobile = nam;
    }

    public void setInsurance(String nam)
    {
        this.insurance = nam;
    }
    //////////
    public String getBirthday()
    {
        return this.birthday;
    }
    public String getName( )
    {
        return this.name;
    }

    public String getSurname()
    {
        return this.surname;
    }

    public String getAddress()
    {
        return this.Address ;
    }
     public String getTelephone()
    {
        return this.telephone;
    }

    public String getMobile()
    {
        return this.mobile;
    }

    public String getInsurance()
    {
        return this.insurance;
    }
}
