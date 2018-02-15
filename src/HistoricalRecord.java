/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HistoricalRecord.java
 *
 * Created on 31 Ιαν 2009, 2:05:38 πμ
 */

/**
 *
 * @author User
 */
public class HistoricalRecord extends javax.swing.JInternalFrame {

    /** Creates new form HistoricalRecord */
    Patient patient;
    //Η κλάση αυτή εμφανίζει το ιστορικό του ασθενούς στην΄οθόνη
    public HistoricalRecord(Patient pt) {
        initComponents();
        patient = pt;
        DiseaseProgress [] diseases = pt.getDiseases();
        NumericalExamResult[] nresults = pt.getNumericalExamResults();
        QualitiveExamResult[] qresults = pt.getQualitiveExamResults();
        //Για κάθε εξέταση που έχει πραγματοποιηθεί, προσθέτουμε το
        //Ανάλογο tab
        if (nresults != null) {
            for (int i = 0; i < nresults.length; ++i) {
                NumericalExamPanel newPanel = new NumericalExamPanel();
                newPanel.setId(-i - 1);
                newPanel.setExamResult(nresults[i]);
                jTabbedPane1.addTab(nresults[i].getExamName(), newPanel);
            }
        }


        if (qresults != null) {
            for (int i = 0; i < qresults.length; ++i) {
                QualitiveExamPanel newPanel = new QualitiveExamPanel();
                newPanel.setId(-i - 1);
                newPanel.setExamResult(qresults[i]);
                jTabbedPane1.addTab(qresults[i].getExamName(), newPanel);
                newPanel.setVisible(true);
            }
        }
        //To ίδιο και για κάθε ασθένεια που έχει διαγνωσθεί
        if(diseases != null)
            for(int i = 0; i < diseases.length; ++i)
            {
                DiseaseProgressPanel newPanel = new DiseaseProgressPanel();
                newPanel.setMode(1);
                newPanel.setDiseaseProgress(diseases[i]);
                jTabbedPane2.addTab(diseases[i].getDisease().getDiseaseName(), newPanel);
            }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jTabbedPane2.setName("jTabbedPane2"); // NOI18N

        jButton1.setText("Αποδοχή");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ακύρωση");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane2)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTabbedPane1, jTabbedPane2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        NumericalExamResult[] nresults = patient.getNumericalExamResults();
        for(int i = 0; i < nresults.length; ++i)
        {
            NumericalExamPanel newPanel = (NumericalExamPanel) jTabbedPane1.getComponentAt(i);
            newPanel.getExamResult(nresults[i]);

        }
        QualitiveExamResult[] qresults = patient.getQualitiveExamResults();
        for(int i = 0; i < qresults.length; ++i)
        {
            QualitiveExamPanel newPanel = (QualitiveExamPanel) jTabbedPane1.getComponentAt(i+nresults.length);
            newPanel.getExamResult(qresults[i]);
        }
        DiseaseProgress [] progress = patient.getDiseases();
        for (int i = 0; i < progress.length; i++) {
            DiseaseProgressPanel newPanel = (DiseaseProgressPanel)jTabbedPane2.getComponentAt(i);
            progress[i] = newPanel.getDiseaseProgress();

        }

        patient.setNumericalExamResults(nresults);
        patient.setQualitiveExamResults(qresults);
        patient.setDiseases(progress);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables

}