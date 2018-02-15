
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExamsWindow.java
 *
 * Created on 30 Ιαν 2009, 5:01:30 μμ
 */

/**
 *
 * @author User
 */
public class ExamsWindow extends javax.swing.JInternalFrame {

    //Το παράθυρο που εμφανίζεται στον γιατρό κατα την πραγματοποίηση μιας εξέτασης
    //Χρησιμοποιούμε αναφορές στα στοιχεία των εξετάσεων και στα Panel τους
    //για τον αποτελεσματικότερο συγχρονισμού των στοιχείων αρχείο, όσο
    //και στο χρήστη)
    /** Creates new form ExamsWindow */
    private Vector<NumericalExamPanel> numericalTabs;
    private Vector<QualitiveExamPanel> qualitiveTabs;

    private Vector<NumericalExamResult> numericalExams;
    private Vector<QualitiveExamResult> qualitiveExams;

    private Patient patient;

    private Rendezvous rendevousWorking;

    public void setPatient(Patient p)
    {
        //Ανάθεση ασθενή με ταυτόχρονη ενημέρωση των στοιχείων που βλέπει ο χρήστης

        patient = p;
        lblPatientName.setText(p.getSurname()+", "+p.getName());
        this.setTitle(p.getSurname()+", "+p.getName());
        DiseaseProgress[] diseases = patient.getDiseases();
        if(diseases!=null)
        {
            for(int i = 0; i < diseases.length; i++)
            {
                DiseaseProgressPanel newPanel = new DiseaseProgressPanel();
                newPanel.setDiseaseProgress(diseases[i]);
                newPanel.setExamDay(examDay);
                tabbedPanelDiseases.addTab(diseases[i].getDisease().getDiseaseName(),
                        newPanel);
                newPanel.setVisible(true);


            }
        }
    }

    public Patient getPatient()
    {
        return patient;
    }


    MainApplicationWindow applicationParent;
    public ExamsWindow(MainApplicationWindow par) {
        applicationParent = par;
        initComponents();
        qualitiveExams = new Vector<QualitiveExamResult>();
        qualitiveTabs = new Vector<QualitiveExamPanel>();
        numericalExams = new Vector<NumericalExamResult>();
        numericalTabs = new Vector<NumericalExamPanel>();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPanelExams = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        tabbedPanelDiseases = new javax.swing.JTabbedPane();
        cmbExam = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tabbedPanelExams.setName("tabbedPanelExams"); // NOI18N
        tabbedPanelExams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedPanelExamsMouseClicked(evt);
            }
        });

        jButton1.setText("Προσθήκη Εξέτασης");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPatientName.setText("jLabel1");
        lblPatientName.setName("lblPatientName"); // NOI18N

        tabbedPanelDiseases.setName("tabbedPanelDiseases"); // NOI18N

        cmbExam.setMaximumRowCount(3);
        cmbExam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Βυθοσκόπηση", "Αυτόματη Περιμετρία", "Τονομέτρηση", "Γωνιοσκοπία", "Άλλη εξέταση με αριθμητικό αποτέλεσμα", "Άλλη εξέταση με ποιοτικό αποτέλεσμα" }));
        cmbExam.setName("cmbExam"); // NOI18N
        cmbExam.setOpaque(false);
        cmbExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamActionPerformed(evt);
            }
        });

        jButton2.setText("Προσθήκη Νέας Ασθένειας");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Αποθήκευση - Έξοδος");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Συνταγή");
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addGap(281, 281, 281))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addComponent(tabbedPanelExams, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addComponent(tabbedPanelDiseases, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addComponent(cmbExam, javax.swing.GroupLayout.Alignment.LEADING, 0, 474, Short.MAX_VALUE))
                            .addContainerGap()))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lblPatientName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPanelExams, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPanelDiseases, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:


        //Όταν ο χρήστης πατήσει το κουμπί Προσθήκη Νέας εξέτασεης
        //δημιουργούμε και εμφανίζουμε το ανάλογο tab
        switch (cmbExam.getSelectedIndex())
        {
            case 0:
                {   
                    QualitiveExamPanel newPanel = new QualitiveExamPanel();
                    VithoskopisiResult newExam = new VithoskopisiResult();
                    tabbedPanelExams.addTab("Βυθοσκόπηση", newPanel);
                    qualitiveTabs.addElement(newPanel);
                    qualitiveExams.addElement((QualitiveExamResult)newExam);
                }
                break;
            case 1:
                {   
                    NumericalExamPanel newPanel = new NumericalExamPanel();
                    PerimetriaResult newExam = new PerimetriaResult();
                    tabbedPanelExams.addTab("Αυτόματη Περιμετρία", newPanel);
                    numericalTabs.addElement(newPanel);
                    numericalExams.addElement((NumericalExamResult)newExam);
 }
                break;
            case 2:
                {   
                    NumericalExamPanel newPanel = new NumericalExamPanel();
                    PerimetriaResult newExam = new PerimetriaResult();
                    tabbedPanelExams.addTab("Τονομετρία", newPanel);
                    numericalTabs.addElement(newPanel);
                    numericalExams.addElement((NumericalExamResult)newExam);
  }
                break;
            case 3:
                {   
                    NumericalExamPanel newPanel = new NumericalExamPanel();
                    PerimetriaResult newExam = new PerimetriaResult();
                    tabbedPanelExams.addTab("Γωνιοσκοπία", newPanel);
                    numericalTabs.addElement(newPanel);
                    numericalExams.addElement((NumericalExamResult)newExam);
               }
                break;
            case 4:
                {   
                    String titl = JOptionPane.showInputDialog(this,"Παρακαλώ εισάγετε το όνομα της εξέτασης","Άγνωστη Εξέταση", JOptionPane.QUESTION_MESSAGE);
             
                    NumericalExamPanel newPanel = new NumericalExamPanel();
                    NumericalExamResult newExam = new NumericalExamResult();
                    tabbedPanelExams.addTab(titl, newPanel);
                    newExam.setExamName(titl);
                    numericalTabs.addElement(newPanel);
                    numericalExams.addElement(newExam);
              }
                break;

            case 5:
                {
                    String titl = JOptionPane.showInputDialog(this,"Παρακαλώ εισάγετε το όνομα της εξέτασης","Άγνωστη Εξέταση", JOptionPane.QUESTION_MESSAGE);

                    QualitiveExamPanel newPanel = new QualitiveExamPanel();
                    QualitiveExamResult newExam = new QualitiveExamResult();
                    newExam.setExamName(titl);
                    tabbedPanelExams.addTab(titl, newPanel);
                    qualitiveTabs.addElement(newPanel);
                    qualitiveExams.addElement(newExam);
                }
                break;

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cmbExamActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Οταν ο χρήστης πατήσει το κουμπί Αποθήκευση - Έξοδος
        //Ενημερώνουμε κατάλληλα όλες τις εγγραφές του ασθενή στο αρχείο.
        NumericalExamResult [] oldNumericalResults = patient.getNumericalExamResults();
        QualitiveExamResult [] oldQualitiveResults = patient.getQualitiveExamResults();
        int newNumericalExamsCount;
        if (oldNumericalResults==null)
            newNumericalExamsCount=numericalExams.size();
        else
            newNumericalExamsCount=oldNumericalResults.length + numericalExams.size();
        int newQualitiveExamsCount;
        if (oldQualitiveResults==null)
            newQualitiveExamsCount=qualitiveExams.size();
        else
            newQualitiveExamsCount=oldQualitiveResults.length + qualitiveExams.size();

        NumericalExamResult [] newNumericalResults = new NumericalExamResult[newNumericalExamsCount];
        QualitiveExamResult [] newQualitiveResults = new QualitiveExamResult[newQualitiveExamsCount];
        int i =0;
        if (oldNumericalResults != null) {
            for (i = 0; i < oldNumericalResults.length; i++) {
                newNumericalResults[i] = oldNumericalResults[i];
            }
        }
        for (int j = 0; j < numericalExams.size(); j++, i++) {
            newNumericalResults[i] = numericalExams.elementAt(j);
            numericalTabs.elementAt(j).getExamResult(newNumericalResults[i]);
            newNumericalResults[i].setExamDate(examDay);
        }
        i = 0;
        if (oldQualitiveResults != null) {
            for (i = 0; i < oldQualitiveResults.length; i++) {
                newQualitiveResults[i] = oldQualitiveResults[i];
            }
        }
        for (int j = 0; j < qualitiveExams.size(); j++, i++) {
            newQualitiveResults[i] = qualitiveExams.elementAt(j);
            qualitiveTabs.elementAt(j).getExamResult(newQualitiveResults[i]);
            newQualitiveResults[i].setExamDate(examDay);
        }
        rendevousWorking.setCompleted(true);
        patient.setNumericalExamResults(newNumericalResults);
        patient.setQualitiveExamResults(newQualitiveResults);
        //Disease progress
        DiseaseProgress [] newDiseaseProgress = new DiseaseProgress[tabbedPanelDiseases.getTabCount()];
        for(i=0; i < tabbedPanelDiseases.getTabCount(); ++i)
        {
            DiseaseProgressPanel currentPanel = (DiseaseProgressPanel) tabbedPanelDiseases.getComponentAt(i);
            newDiseaseProgress[i] = currentPanel.getDiseaseProgress();
        }
        patient.setDiseases(newDiseaseProgress);

        this.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabbedPanelExamsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPanelExamsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabbedPanelExamsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Προσθήκη νέας ασθένειας 
        //ζητάμε απο το γιατρό να καθορίσει το όνομά της

        String titl = JOptionPane.showInputDialog(this, "Πως ονομάζεται η ασθένεια που διαγνώστηκε;","Νέα Ασθένεια");
        DiseaseProgressPanel newPanel = new DiseaseProgressPanel();
        DiseaseProgress diseaseProgress= new DiseaseProgress();
        Disease disease = new Disease();
        disease.setDiseaseName(titl);
        diseaseProgress.setDisease(disease);
        newPanel.setExamDay(examDay);
        newPanel.setDiseaseProgress(diseaseProgress);
        tabbedPanelDiseases.addTab(titl, newPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Αν ο γιατρός το ζητήσει εμφανίζουμε το παράθυρο για μια νέα συνταγή
        PrescriptionFrame frame = new PrescriptionFrame();
        applicationParent.getMdiPanel().add(frame);
        frame.setPatient(patient);
        frame.setVisible(true);
     
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbExam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTabbedPane tabbedPanelDiseases;
    private javax.swing.JTabbedPane tabbedPanelExams;
    // End of variables declaration//GEN-END:variables
    public Calendar getExamDay( )
    {
        return examDay;
    }
    public void setExamDay(Calendar val)
    {
        examDay = val;
    }
    Calendar examDay;

    /**
     * @return the rendevousWorking
     */
    public Rendezvous getRendevousWorking() {
        return rendevousWorking;
    }

    /**
     * @param rendevousWorking the rendevousWorking to set
     */
    public void setRendevousWorking(Rendezvous rendevousWorking) {
        this.rendevousWorking = rendevousWorking;
    }
}