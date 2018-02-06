package UserInterface.BabySitting;




import Business.Enterprise.Enterprise;
import Business.BabySitting.BabySittersDirectory;
import Business.BabySitting.Babysitter;
import Business.Organization.BabySittingOrganization;
import UserInterface.BabySitting.BabySittingAdminJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIDDHI
 */
public class CreateEmpBSJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    BabySittingOrganization babySittingOrganization;
    private BabySittersDirectory babySitterDir;
    private Babysitter babySitter;
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

    CreateEmpBSJPanel(JPanel userProcessContainer, Enterprise enterprise, BabySittingOrganization babySittingOrganization) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.babySittingOrganization = babySittingOrganization;
        this.babySitterDir = babySittingOrganization.getBc();
        initComponents();
        LabelEnterprize.setText(enterprise.getName());
        TxtEmpID.setEnabled(false);
        TxtCustomerID.setEnabled(false);
        TxtCustomerName.setEnabled(false);
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) TblBabysitters.getModel();
        dtm.setRowCount(0);
        for (Babysitter b : babySitterDir.getBabyitterList()) {
            if (b.isAvailability()) {
                Object row[] = new Object[9];  //Object of type row = Object[<no of columns>]
                row[0] = b;
                row[1] = String.valueOf(b.getAge());
                row[2] = b.getGender();
                row[3] = String.valueOf(b.getEmpID());
                row[4] = b.getAddress();
                row[5] = b.getAvailableSDate();
                row[6] = b.getAvailableEDate();
                row[7] = String.valueOf(b.getExpectedWage());
                row[8] = b.getAllotedCustomer();
                dtm.addRow(row);
            }
        }
    }

    public void ViewButtonCode() {
        try {
            //view
            int selectedrow = TblBabysitters.getSelectedRow();
            if (selectedrow >= 0) {
                Babysitter bs = (Babysitter) TblBabysitters.getValueAt(selectedrow, 0);

                bs.setAge(Integer.parseInt(TxtEmpAge.getText()));
                bs.setAddress(TxtAddress.getText());

                if (bs.isAvailability()) {
                    RadioAvailibility.setEnabled(true);
                } else {
                    RadioAvailibility.setVisible(false);
                }

                bs.setContactNo(TxtContactNo.getText());
                bs.setAvailableSDate(dateFormat.parse(TxtEmpStartDate.getText()));
                bs.setAvailableEDate(dateFormat.parse(TxtEmpEndDate.getText()));
                bs.setBackgrndCheckStatus("Pending");
                bs.setGender(TxtGender.getText());
                bs.setWeekDayTimings(TxtSatTiming.getText());
                bs.setSaturdayTimings(TxtSatTiming.getText());
                bs.setSundayTimings(TxtSunTiming.getText());
                bs.setAllotedCustomer(TxtCustomerName.getText());
                bs.setIDofAllotedCustomer(Integer.parseInt(TxtCustomerID.getText()));

            }
            populateTable();
        } catch (ParseException ex) {
            Logger.getLogger(CreateEmpBSJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtEmpStartDate = new javax.swing.JTextField();
        TxtEmpEndDate = new javax.swing.JTextField();
        backJButton2 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        TxtBabySitterName = new javax.swing.JTextField();
        TxtCustomerName = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblBabysitters = new javax.swing.JTable();
        BtnRefresh = new javax.swing.JButton();
        BtnCreate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        TxtEmpID = new javax.swing.JTextField();
        TxtCustomerID = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        RadioAvailibility = new javax.swing.JRadioButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        TxtWeekDaysTiming = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        TxtEmpAge = new javax.swing.JTextField();
        TxtGender = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        TxtContactNo = new javax.swing.JTextField();
        TxtAddress = new javax.swing.JTextField();
        TxtSatTiming = new javax.swing.JTextField();
        TxtSunTiming = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        TxtEmpEndDate1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        TxtBckgrndChkStatus = new javax.swing.JTextField();
        BtnView = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        LabelEnterprize = new javax.swing.JLabel();

        TxtEmpStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmpStartDateActionPerformed(evt);
            }
        });

        backJButton2.setText("Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel49.setText("End Date:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel50.setText(" Baby Sitting Employee Details");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel51.setText("Employee Name :");

        TxtBabySitterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBabySitterNameActionPerformed(evt);
            }
        });

        TxtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerNameActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel53.setText("Alloted Customer Name:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel48.setText("Start Date:");

        TblBabysitters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Employee Age", "Gender", "Employee Id", "Address", "Start Date", "End Date", "Expected Wage", "Alloted Customer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TblBabysitters);

        BtnRefresh.setText("Refresh");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel54.setText("Employee ID:");

        TxtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmpIDActionPerformed(evt);
            }
        });

        TxtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIDActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel55.setText("Alloted Customer ID:");

        RadioAvailibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAvailibilityActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel52.setText("Availibility :");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel56.setText("Availible Timings:");

        TxtWeekDaysTiming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtWeekDaysTimingActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel57.setText("Age :");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel58.setText("Gender :");

        TxtEmpAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmpAgeActionPerformed(evt);
            }
        });

        TxtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtGenderActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel59.setText("Contact Number :");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel60.setText("Address :");

        TxtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContactNoActionPerformed(evt);
            }
        });

        TxtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAddressActionPerformed(evt);
            }
        });

        TxtSatTiming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSatTimingActionPerformed(evt);
            }
        });

        TxtSunTiming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSunTimingActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel61.setText("Weekdays Timing:");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel62.setText("Sunday Timing:");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel64.setText("Saturday Timing:");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel65.setText("Expected Wage (/hr):");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel63.setText("Background Check Status :");

        BtnView.setText("View");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel66.setText(" Enterprize: ");

        LabelEnterprize.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LabelEnterprize.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel64)
                            .addComponent(jLabel62)
                            .addComponent(jLabel53)
                            .addComponent(jLabel48))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBabySitterName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtWeekDaysTiming, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtSatTiming, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtSunTiming, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnCreate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel54)
                            .addComponent(jLabel59)
                            .addComponent(jLabel49)
                            .addComponent(jLabel52)
                            .addComponent(jLabel65)
                            .addComponent(jLabel55)
                            .addComponent(jLabel63)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnUpdate)
                        .addGap(122, 122, 122)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtEmpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RadioAvailibility)
                                .addComponent(TxtBckgrndChkStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(TxtEmpID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(TxtEmpEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtCustomerID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton2)
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel50)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelEnterprize)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnView)
                .addGap(35, 35, 35)
                .addComponent(BtnRefresh)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(LabelEnterprize)
                    .addComponent(backJButton2)
                    .addComponent(BtnView)
                    .addComponent(BtnRefresh))
                .addGap(10, 10, 10)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(TxtBabySitterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(TxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(TxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmpAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(TxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(TxtEmpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel56)
                        .addComponent(jLabel52))
                    .addComponent(RadioAvailibility))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel63)
                        .addComponent(jLabel61)
                        .addComponent(TxtWeekDaysTiming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtBckgrndChkStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(TxtSatTiming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(TxtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEmpEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65)
                            .addComponent(TxtSunTiming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(TxtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreate)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnDelete))
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtEmpStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmpStartDateActionPerformed

    }//GEN-LAST:event_TxtEmpStartDateActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BabySittingAdminJPanel ba = (BabySittingAdminJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void TxtBabySitterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBabySitterNameActionPerformed

    }//GEN-LAST:event_TxtBabySitterNameActionPerformed

    private void TxtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerNameActionPerformed

    }//GEN-LAST:event_TxtCustomerNameActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed

        try {
//            babySitterDir = new BabySittersDirectory();
            babySitter = babySitterDir.addBabySitter(TxtBabySitterName.getText());
            babySitter.setAge(Integer.parseInt(TxtEmpAge.getText()));
            babySitter.setAddress(TxtAddress.getText());
            if (RadioAvailibility.isSelected()) {
                babySitter.setAvailability(true);
            }
            if (Pattern.matches("[0-9]{10}", TxtContactNo.getText())) {
                babySitter.setContactNo(TxtContactNo.getText());

            } else {
                JOptionPane.showMessageDialog(null, "Enter valid Phone No.!", "Warning", JOptionPane.WARNING_MESSAGE);
            }

            babySitter.setAvailableSDate(dateFormat.parse(TxtEmpStartDate.getText()));
            babySitter.setAvailableEDate(dateFormat.parse(TxtEmpEndDate.getText()));
            babySitter.setBackgrndCheckStatus("Pending");
            babySitter.setGender(TxtGender.getText());
            babySitter.setWeekDayTimings(TxtSatTiming.getText());
            babySitter.setSaturdayTimings(TxtSatTiming.getText());
            babySitter.setSundayTimings(TxtSunTiming.getText());

            JOptionPane.showMessageDialog(null, "BabySiting Employee created successfully!");
    }//GEN-LAST:event_BtnCreateActionPerformed
  catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter valid inputs");
            System.out.println(e);
        }
    }
    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        int selectedRow = TblBabysitters.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would u like to delete the row?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Babysitter b = (Babysitter) TblBabysitters.getValueAt(selectedRow, 0);
                babySitterDir.getBabyitterList().remove(b);
                //    populateTable();
            }
        }

    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        ViewButtonCode();
        try {
            //view & rewrite the same obj
            int selectedrow = TblBabysitters.getSelectedRow();
            if (selectedrow >= 0) {
                Babysitter bs = (Babysitter) TblBabysitters.getValueAt(selectedrow, 0);

                bs.setAge(Integer.parseInt(TxtEmpAge.getText()));
                bs.setAddress(TxtAddress.getText());
                if (RadioAvailibility.isSelected()) {
                    bs.setAvailability(true);
                }
                if (Pattern.matches("[0-9]{10}", TxtContactNo.getText())) {
                    bs.setContactNo(TxtContactNo.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Enter valid Phone No.!", "Warning", JOptionPane.WARNING_MESSAGE);
                }

                bs.setAvailableSDate(dateFormat.parse(TxtEmpStartDate.getText()));
                bs.setAvailableEDate(dateFormat.parse(TxtEmpEndDate.getText()));
                bs.setBackgrndCheckStatus("Pending");
                bs.setGender(TxtGender.getText());
                bs.setWeekDayTimings(TxtSatTiming.getText());
                bs.setSaturdayTimings(TxtSatTiming.getText());
                bs.setSundayTimings(TxtSunTiming.getText());
                bs.setAllotedCustomer(TxtCustomerName.getText());
                bs.setIDofAllotedCustomer(Integer.parseInt(TxtCustomerID.getText()));
            }
            JOptionPane.showMessageDialog(null, "BabySiting Employee updated successfully!");
        } catch (ParseException ex) {
            Logger.getLogger(CreateEmpBSJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void TxtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmpIDActionPerformed

    private void TxtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIDActionPerformed

    private void TxtWeekDaysTimingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtWeekDaysTimingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtWeekDaysTimingActionPerformed

    private void RadioAvailibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAvailibilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioAvailibilityActionPerformed

    private void TxtEmpAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmpAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmpAgeActionPerformed

    private void TxtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtGenderActionPerformed

    private void TxtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContactNoActionPerformed

    private void TxtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddressActionPerformed

    private void TxtSatTimingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSatTimingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSatTimingActionPerformed

    private void TxtSunTimingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSunTimingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSunTimingActionPerformed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        TxtEmpID.setEnabled(true);
        TxtCustomerID.setEnabled(true);
        TxtCustomerName.setEnabled(true);
        ViewButtonCode();
    }//GEN-LAST:event_BtnViewActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton BtnView;
    private javax.swing.JLabel LabelEnterprize;
    private javax.swing.JRadioButton RadioAvailibility;
    private javax.swing.JTable TblBabysitters;
    private javax.swing.JTextField TxtAddress;
    private javax.swing.JTextField TxtBabySitterName;
    private javax.swing.JTextField TxtBckgrndChkStatus;
    private javax.swing.JTextField TxtContactNo;
    private javax.swing.JTextField TxtCustomerID;
    private javax.swing.JTextField TxtCustomerName;
    private javax.swing.JTextField TxtEmpAge;
    private javax.swing.JTextField TxtEmpEndDate;
    private javax.swing.JTextField TxtEmpEndDate1;
    private javax.swing.JTextField TxtEmpID;
    private javax.swing.JTextField TxtEmpStartDate;
    private javax.swing.JTextField TxtGender;
    private javax.swing.JTextField TxtSatTiming;
    private javax.swing.JTextField TxtSunTiming;
    private javax.swing.JTextField TxtWeekDaysTiming;
    private javax.swing.JButton backJButton2;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
