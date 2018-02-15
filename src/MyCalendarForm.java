
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MyCalendarForm.java
 *
 * Created on 29 Ιαν 2009, 4:09:31 μμ
 */

/**
 *
 * @author User
 */

public class MyCalendarForm extends javax.swing.JInternalFrame {

    /** Creates new form MyCalendarForm */
    //Η φόρμα του ημερολογίου
    MainApplicationWindow parent;
    public MyCalendarForm(MainApplicationWindow p) {
        //Αρχικοποιούμε τα αντικείμενα.
        parent = p;
        initComponents();
        GregorianCalendar cl = (GregorianCalendar) GregorianCalendar.getInstance();
        jComboBox1.setSelectedIndex(cl.get(Calendar.MONTH));
        selectedYear = (cl.get(Calendar.YEAR));
        lblYear.setText(Integer.toString(selectedYear));
        selectedMonth = cl.get(Calendar.MONTH);
        selectedDay = cl.get(Calendar.DAY_OF_MONTH);

        this.UpdateCalendar();

        mycalendar = parent.doctorsRecords.daybook;
        UpdateDiary();

        thedays.getColumnModel().getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                
                UpdateCalendar();UpdateDiary();
            }
        });

        thedays.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {

               
                UpdateCalendar(); UpdateDiary();
            }
        }
                );
    }

    //Η συνάρτηση αυτή ανανεώνει το πινακάκι με τις ημερομηνίες
    private void UpdateCalendar()
    {
        java.util.GregorianCalendar cl = new java.util.GregorianCalendar();
        int yr = Integer.parseInt(lblYear.getText());
        cl.set(yr, jComboBox1.getSelectedIndex(),1);
        javax.swing.table.DefaultTableModel tblModel = (DefaultTableModel) thedays.getModel();
        int offset = (int)cl.get(Calendar.DAY_OF_WEEK)-1, i,j,el=1-offset, maxElement, mnt = cl.get(Calendar.MONTH);
        if(mnt == 0 || mnt == 2 || mnt == 4 || mnt==6 || mnt==7 || mnt==9 || mnt==11) maxElement =31;
        else if( mnt==3 || mnt ==5 || mnt==8 || mnt==10) maxElement =30;
        else if (yr %4 != 0)
        {
            maxElement = 28;
        }
        else
        {
            if(yr%100 !=0 || yr % 400 ==0)
            {
                maxElement = 29;
            }
            else
                maxElement = 28;

        }

        for(i = 0; i< 6;i++)
        {
            for(j = 0; j < 7; j++, el++)
            {
                if(el > 0 && el <= maxElement)
                {
                   tblModel.setValueAt(Integer.toString(el), i,j);
                }
                else
                {
                   tblModel.setValueAt("", i,j);

                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        lblYear = new javax.swing.JLabel();
        btnYearLower = new javax.swing.JButton();
        btnYearHigher = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        thedays = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDiary = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Ημερολόγιο");
        setToolTipText("Το ημερολόγιο");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName("jPanel1"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ιανουάριος", "Φεβρουάριος", "Μάρτιος", "Απρίλιος", "Μάιος", "Ιούνιος", "Ιούλιος", "Αύγουστος", "Σεπτέμβριος", "Οκτώβριος", "Νοέμβριος", "Δεκέμβριος" }));
        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblYear.setBackground(new java.awt.Color(255, 255, 255));
        lblYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYear.setText("2009");
        lblYear.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleBackground")));
        lblYear.setDoubleBuffered(true);
        lblYear.setName("lblYear"); // NOI18N
        lblYear.setOpaque(true);

        btnYearLower.setText("<");
        btnYearLower.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnYearLower.setName("btnYearLower\n"); // NOI18N
        btnYearLower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearLowerActionPerformed(evt);
            }
        });

        btnYearHigher.setText(">");
        btnYearHigher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnYearHigher.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnYearHigher.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnYearHigher.setName("btnYearHigher"); // NOI18N
        btnYearHigher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearHigherActionPerformed(evt);
            }
        });

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        thedays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Κυ", "Δε", "Τρ", "Τε", "Πε", "Πα", "Σα"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        thedays.setColumnSelectionAllowed(true);
        thedays.setName("thedays"); // NOI18N
        thedays.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        thedays.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(thedays);
        thedays.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnYearLower)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnYearHigher))
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYearLower)
                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYearHigher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tblDiary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"9.00", null},
                {"9.30", null},
                {"10.00", null},
                {"10.30", null},
                {"11.00", null},
                {"11.30", null},
                {"12.00", null},
                {"12.30", null},
                {"13.00", null},
                {"13.30", null},
                {"17.00", null},
                {"17.30", null},
                {"18.00", null},
                {"18.30", null},
                {"19.00", null},
                {"19.30", null},
                {"20.00", null},
                {"20.30", null},
                {"21.00", null},
                {"21.30", null}
            },
            new String [] {
                "Ώρα", "Ασθενής"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDiary.setName("tblDiary"); // NOI18N
        tblDiary.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblDiary);
        tblDiary.getColumnModel().getColumn(0).setResizable(false);
        tblDiary.getColumnModel().getColumn(0).setPreferredWidth(1);
        tblDiary.getColumnModel().getColumn(1).setResizable(false);

        jButton1.setText("Εισαγωγή");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Διαγραφή");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Κλείσιμο");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYearLowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearLowerActionPerformed
        //οταν ο χρήστης μειώσει το έτος κατα 1
        selectedYear--;
        lblYear.setText(Integer.toString(selectedYear));
        this.UpdateCalendar();
        UpdateDiary();

}//GEN-LAST:event_btnYearLowerActionPerformed

    private void btnYearHigherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearHigherActionPerformed
        //οταν ο χρήστης αυξήσει το έτος κατα 1
        selectedYear++;
        lblYear.setText(Integer.toString(selectedYear));
        UpdateDiary();
        this.UpdateCalendar();
        
        
    }//GEN-LAST:event_btnYearHigherActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Ο χρήστης ακυρώνει ένα προγραμματισμένο ραντεβού
        String str = (String)tblDiary.getModel().getValueAt(tblDiary.getSelectedRow(), tblDiary.getSelectedColumn());
        if(str ==null || str.compareTo("")==0)
        {
            return;
        }
        int min = 30 * (tblDiary.getSelectedRow()%2);
        int hour = (tblDiary.getSelectedRow()-tblDiary.getSelectedRow()%2)/2+9;
        if (hour >13) hour +=3;
        GregorianCalendar randevouToDelete = new GregorianCalendar(selectedYear, selectedMonth, selectedDay);
        randevouToDelete.set(Calendar.HOUR_OF_DAY, hour);
        randevouToDelete.set(Calendar.MINUTE, min);
        long timeInMillisToDelete = randevouToDelete.getTimeInMillis();
        Enumeration<Rendezvous> rand = mycalendar.getRendezvous().elements();
        int currentElement = 0;
        while (rand.hasMoreElements()) {
            Rendezvous currentRendezvous = rand.nextElement();
            long diff = currentRendezvous.getRandezvousDayTime().getTimeInMillis() - timeInMillisToDelete;
            if(diff > -600000 && diff < 600000 && currentRendezvous.isCompleted()==false)
            {
                mycalendar.getRendezvous().remove(currentElement);
                break;
            }
            currentElement ++;
        }
        mycalendar.ArrangeDayBook();
        SaveState();
        UpdateDiary();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //Ο χρήστης αλλάζει τον ενεργό μήνα
        selectedMonth = jComboBox1.getSelectedIndex();
        UpdateDiary();
        UpdateCalendar();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
                // TODO add your handling code here:
        SaveState();
    }//GEN-LAST:event_formInternalFrameClosing

    private void SaveState()
    {
        hndl.DynamicMenu();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Ο χρήστης ζητάει νέο ραντεβού
        //εμφανίζεται ένα customized dialog που δείχνει τις διαθέσιμες ώρες
        //και τους ασθενείς. Επιλέγοντας τον επιθυμητό συνδυασμό κανονίζεται
        //το ραντεβού
        RantevouDialog dlg = new RantevouDialog();
        Patients pt;
        pt = parent.getAllPatients();
        String [] names = new String [pt.getPatients().size()];
        Enumeration<Patient> ptEnum = pt.getPatients().elements();
        int elementCount = 0;
        while (ptEnum.hasMoreElements()) {
            Patient ptElem = ptEnum.nextElement();
            names[elementCount] = ptElem.getSurname()+" " + ptElem.getName();
            elementCount++;
        }
        Vector<String> availableTimes = new Vector<String>();
        Vector<GregorianCalendar> availableTimesCal = new Vector<GregorianCalendar>();
        elementCount=0;
        for(int i = 0; i < 20; ++i )
        {
            String cellElement = (String) tblDiary.getModel().getValueAt(i, 1);
            int mins = 30*(i%2);
            int hours = (i-i%2)/2+9;
            if (hours>13) hours+= 3;
            if (cellElement==null || cellElement.compareTo("")==0)
            {
                availableTimes.add((String) tblDiary.getModel().getValueAt(i, 0));
                GregorianCalendar ft = new GregorianCalendar();//selectedYear, selectedMonth, selectedDay, hours, mins);
                ft.set(Calendar.YEAR, selectedYear);
                ft.set(Calendar.MONTH, selectedMonth);
                ft.set(Calendar.DAY_OF_MONTH, selectedDay);
                ft.set(Calendar.HOUR_OF_DAY, hours);
                ft.set(Calendar.MINUTE, mins);
                availableTimesCal.add(ft);
               
                elementCount++;
            }
        }
        int [] selectedElements = new int[2];
        String [] avt = new String[availableTimesCal.size()];
        for(int i = 0; i < availableTimesCal.size(); ++i)
        {
            avt[i] = availableTimes.elementAt(i);
        }
        boolean decicion = dlg.showDialog(avt, names, selectedElements);
        if(decicion == true)
        {
            Rendezvous rd = new Rendezvous();
            rd.setPatient(pt.getPatients().elementAt(selectedElements[1]));
            rd.setRandezvousDayTime(availableTimesCal.elementAt(selectedElements[0]));
            mycalendar.getRendezvous().add(rd);
        }
        mycalendar.ArrangeDayBook();
        SaveState();
        UpdateDiary();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        setComponentZOrder(this, 0);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
        setComponentZOrder(this, 10);
    }//GEN-LAST:event_formFocusLost
    private void UpdateDiary()
    {
        //Ανανεώνονται τα ραντεβού που φαίνονται στην οθόνη
        //Καλείται όταν αλλάξει η ενεργή ημερομηνία
        //ή οταν αλλάξουν τα ραντεβού (προσθήκη - διαγραφή)
        if (mycalendar == null)
            return;
        //selectedDay =
        int row = thedays.getSelectedRow();
        int col = thedays.getSelectedColumn();
        int val;
        if(row <0 || col <0 || thedays.getModel().getValueAt(row, col) == null)
            val = 0;
        else
        {
            String str = (String)thedays.getModel().getValueAt(row, col);
            if (str.compareTo("")==0)
                val = 0;
            else
                val = Integer.parseInt(str);
        }
        if (val == 0)
        {
            //select the old day
            GregorianCalendar ft =  new GregorianCalendar();
            ft.set(selectedYear, selectedMonth,1);
            int valOfs = selectedDay + ft.get(Calendar.DAY_OF_WEEK)-2;
            int c1 = valOfs % 7;
            int r1 = (valOfs - c1  )/7;
            thedays.changeSelection(r1, c1, false, false);
        }
        else
        {
            selectedDay = val;
        }
        //System.out.println(selectedDay+ "-"+selectedMonth +"-"+selectedYear);
        for (int i = 0; i < 20; i++) {
            tblDiary.getModel().setValueAt("", i, 1);
            
        }
        Enumeration<Rendezvous> e = mycalendar.getRendezvous().elements();
        while (e.hasMoreElements()) {
            Rendezvous r = e.nextElement();
            if(r.getRandezvousDayTime().get(Calendar.YEAR)==selectedYear &&
                   r.getRandezvousDayTime().get(Calendar.MONTH)==selectedMonth &&
                   r.getRandezvousDayTime().get(Calendar.DAY_OF_MONTH)==selectedDay)
            {
                int hr = r.getRandezvousDayTime().get(Calendar.HOUR_OF_DAY);
                int mn = r.getRandezvousDayTime().get(Calendar.MINUTE);
                int line = hr -9;
                if (line > 4) line-=3;
                line *=2;
                if(mn >20 )
                    line ++;
                if (mn > 40)
                    line ++;
                if(r.isCompleted()==false)
                    tblDiary.getModel().setValueAt(r.getPatient().getSurname() + ", "
                        +r.getPatient().getName(), line, 1);
                else
                    tblDiary.getModel().setValueAt(r.getPatient().getSurname() + ", "
                        +r.getPatient().getName()+"[ολοκληρώθηκε]", line, 1);

            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnYearHigher;
    private javax.swing.JButton btnYearLower;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTable tblDiary;
    private javax.swing.JTable thedays;
    // End of variables declaration//GEN-END:variables
    private DayBook mycalendar;
    public int selectedDay, selectedMonth, selectedYear;
    private MainApplicationWindow hndl;
    public void setParentWindow(MainApplicationWindow parent)
    {
        hndl = parent;
    }
}
