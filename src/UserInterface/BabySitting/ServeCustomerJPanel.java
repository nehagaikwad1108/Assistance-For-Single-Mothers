package UserInterface.BabySitting;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Mother.Mother;
import Business.BabySitting.BabySittersDirectory;
import Business.BabySitting.BabySittingClient;
import Business.BabySitting.Babysitter;
import Business.BabySitting.ClientDirectory;
import Business.Organization.BabySittingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIDDHI
 */
public class ServeCustomerJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    BabySittingOrganization babySittingOrganization;
    Organization organization;
    private ClientDirectory clientDir;
    private BabySittingClient client;
    private BabySittersDirectory babysitterDir;
    // private Babysitter babysitter;
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    private Ecosystem business;
  
    
    public ServeCustomerJPanel(JPanel userProcessContainer, Enterprise enterprise, BabySittingOrganization babySittingOrganization, Organization organization, Ecosystem business) {
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.babySittingOrganization = babySittingOrganization;
        this.enterprise = enterprise;
        this.organization = organization;
        this.clientDir = babySittingOrganization.getClientDirectory();
        this.babysitterDir = babySittingOrganization.getBc();
        
        initComponents();
        valueLabel.setText(enterprise.getName());
        populateComboBoxes();
       
    
    }

    public void populateComboBoxes() {
        ComboCustomerID.removeAllItems();
        ComboCustomerName.removeAllItems();
//        System.out.println(clientDir.getClientList().size());
        for (BabySittingClient c : clientDir.getClientList()) {
            ComboCustomerName.addItem((Mother) c.getMother());
            ComboCustomerID.addItem(c.getMother().getMotherID());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel53 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        TxtEmpStartDate = new javax.swing.JTextField();
        TxtEmpEndDate = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblBabysitters = new javax.swing.JTable();
        TxtCity = new javax.swing.JTextField();
        BtnSrchByName = new javax.swing.JButton();
        BtnSrchByAvailability = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        BtnProceedwithCustomer = new javax.swing.JButton();
        BtnAllotBabySitter1 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        ComboCustomerName = new javax.swing.JComboBox();
        ComboCustomerID = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        TxtCustomerId = new javax.swing.JTextField();
        TxtCustomerName = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        BtnGetTimings = new javax.swing.JButton();
        LabelTimings = new javax.swing.JLabel();

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel53.setText("Customer Name :");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel48.setText("Requirement Start Date:");

        TxtEmpStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmpStartDateActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel49.setText("Requirement End Date:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel50.setText("Allot Baby Sitter");

        TblBabysitters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Employee Age", "Gender", "Employee Id", "Address", "Start Date", "End Date", "wage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TblBabysitters);

        TxtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCityActionPerformed(evt);
            }
        });

        BtnSrchByName.setText("Search Babysitter by City");
        BtnSrchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSrchByNameActionPerformed(evt);
            }
        });

        BtnSrchByAvailability.setText("Show Available Babysitters");
        BtnSrchByAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSrchByAvailabilityActionPerformed(evt);
            }
        });

        backJButton2.setText("Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        BtnProceedwithCustomer.setText("Proceed");
        BtnProceedwithCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProceedwithCustomerActionPerformed(evt);
            }
        });

        BtnAllotBabySitter1.setText("Allot this babysitter");
        BtnAllotBabySitter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAllotBabySitter1ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel54.setText("Customer ID:");

        ComboCustomerName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCustomerNameActionPerformed(evt);
            }
        });

        ComboCustomerID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel55.setText("Customer Name :");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel56.setText("Customer ID:");

        TxtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerIdActionPerformed(evt);
            }
        });

        TxtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustomerNameActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        BtnGetTimings.setText("See Timings");
        BtnGetTimings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGetTimingsActionPerformed(evt);
            }
        });

        LabelTimings.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LabelTimings.setText("<Timings>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backJButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jLabel50))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel55)
                                    .addComponent(TxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnSrchByName))))
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel49)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(TxtEmpEndDate))
                            .addComponent(ComboCustomerID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnProceedwithCustomer, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSrchByAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtnGetTimings)
                .addGap(38, 38, 38)
                .addComponent(LabelTimings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAllotBabySitter1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLabel)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnSrchByAvailability))
                    .addComponent(backJButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(ComboCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(ComboCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(TxtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(TxtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(TxtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(TxtEmpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnProceedwithCustomer)
                    .addComponent(BtnSrchByName)
                    .addComponent(TxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGetTimings)
                    .addComponent(LabelTimings)
                    .addComponent(BtnAllotBabySitter1))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtEmpStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmpStartDateActionPerformed

    }//GEN-LAST:event_TxtEmpStartDateActionPerformed

    private void TxtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCityActionPerformed

    }//GEN-LAST:event_TxtCityActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BabySittingAdminJPanel ba = (BabySittingAdminJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void BtnSrchByAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSrchByAvailabilityActionPerformed
// populate all available babysitters
        DefaultTableModel dtm = (DefaultTableModel) TblBabysitters.getModel();
        dtm.setRowCount(0);
        for (Babysitter b : babysitterDir.getBabyitterList()) {
            if (b.isAvailability()) {
                Object row[] = new Object[8];  //Object of type row = Object[<no of columns>]
                row[0] = b;
                row[1] = String.valueOf(b.getAge());
                row[2] = b.getGender();
                row[3] = String.valueOf(b.getEmpID());
                row[4] = b.getAddress();
                row[5] = b.getAvailableSDate();
                row[6] = b.getAvailableEDate();
                row[7] = String.valueOf(b.getExpectedWage());
                dtm.addRow(row);
            }
        }

//write while booking babysitter
        /*  BabySittersDirectory bdir = new BabySittersDirectory();
            Date StrtDate = dateFormat.parse(TxtEmpStartDate.getText());
            Date EndDate = dateFormat.parse(TxtEmpEndDate.getText());

            for (Babysitter b : bdir.getBabyitterList()) {
                if (b.getEmployementEndDate() != null && b.getEmployementSrtDate() != null) {
                    if (StrtDate.after(b.getEmployementSrtDate()) && EndDate.before(b.getEmployementEndDate())) {
                        populateTable(b.);
                    }
                }
            }*/
    }//GEN-LAST:event_BtnSrchByAvailabilityActionPerformed

    private void BtnProceedwithCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProceedwithCustomerActionPerformed
        try {
            if (ComboCustomerID.getSelectedItem() != null || ComboCustomerName.getSelectedItem() != null) {
                if (ComboCustomerID.getSelectedItem() != null) {
                    //  client = (BabySittingClient) ComboCustomerID.getSelectedItem();
                }
                //if (ComboCustomerName.getSelectedItem() != null) {
                client = (BabySittingClient) ComboCustomerName.getSelectedItem();
                // }
                TxtCity.setText(client.getMother().getName());
                TxtCustomerId.setText(String.valueOf(client.getMother().getMotherID()));
                TxtEmpStartDate.setText(String.valueOf(client.getServiceSrtDate()));
                TxtEmpEndDate.setText(String.valueOf(client.getServiceEndDate()));
                TxtCustomerName.setEnabled(false);
                TxtCustomerId.setEnabled(false);
                TxtEmpStartDate.setEnabled(false);
                TxtEmpEndDate.setEnabled(false);

                //populate only for available  dates
                DefaultTableModel dtm = (DefaultTableModel) TblBabysitters.getModel();
                dtm.setRowCount(0);
                for (Babysitter b : babysitterDir.getBabyitterList()) {
                    if ((((client.getServiceSrtDate()).after(b.getAvailableSDate()))
                            && (client.getServiceEndDate()).before(b.getAvailableEDate()))) {
                        Object row[] = new Object[8];  //Object of type row = Object[<no of columns>]
                        row[0] = b;
                        row[1] = String.valueOf(b.getAge());
                        row[2] = b.getGender();
                        row[3] = String.valueOf(b.getEmpID());
                        row[4] = b.getAddress();
                        row[5] = b.getAvailableSDate();
                        row[6] = b.getAvailableEDate();
                        row[7] = String.valueOf(b.getExpectedWage());
                        dtm.addRow(row);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please select client details");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BtnProceedwithCustomerActionPerformed

    private void BtnAllotBabySitter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAllotBabySitter1ActionPerformed
        int selectedRow = TblBabysitters.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        } else {
            Babysitter babysitter = (Babysitter) TblBabysitters.getValueAt(selectedRow, 0);
            AllotBabySittersJPanel a = new AllotBabySittersJPanel(userProcessContainer, enterprise, babysitter, client, business);
            userProcessContainer.add("AllotBabySittersJPanel", a);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            client.getMother().setAllotedBabySitter(babysitter.getName());
        }
         
         
    }//GEN-LAST:event_BtnAllotBabySitter1ActionPerformed

    private void TxtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerIdActionPerformed

    private void TxtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustomerNameActionPerformed

    private void BtnSrchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSrchByNameActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) TblBabysitters.getModel();
        dtm.setRowCount(0);
        for (Babysitter b : babysitterDir.getBabyitterList()) {
            if (b.isAvailability() && b.getAddress().equalsIgnoreCase(TxtCity.getText())) {
                Object row[] = new Object[8];  //Object of type row = Object[<no of columns>]
                row[0] = b;
                row[1] = String.valueOf(b.getAge());
                row[2] = b.getGender();
                row[3] = String.valueOf(b.getEmpID());
                row[4] = b.getAddress();
                row[5] = b.getAvailableSDate();
                row[6] = b.getAvailableEDate();
                row[7] = String.valueOf(b.getExpectedWage());
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_BtnSrchByNameActionPerformed

    private void BtnGetTimingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGetTimingsActionPerformed
        int selectedRow = TblBabysitters.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
        } else {
            Babysitter B = (Babysitter) TblBabysitters.getValueAt(selectedRow, 0);
            LabelTimings.setText("Weekdays:" + B.getWeekDayTimings() + " Saturday:" + B.getSaturdayTimings()
                    + " Sunday:" + B.getSundayTimings());
        }

    }//GEN-LAST:event_BtnGetTimingsActionPerformed

    private void ComboCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCustomerNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAllotBabySitter1;
    private javax.swing.JButton BtnGetTimings;
    private javax.swing.JButton BtnProceedwithCustomer;
    private javax.swing.JButton BtnSrchByAvailability;
    private javax.swing.JButton BtnSrchByName;
    private javax.swing.JComboBox ComboCustomerID;
    private javax.swing.JComboBox ComboCustomerName;
    private javax.swing.JLabel LabelTimings;
    private javax.swing.JTable TblBabysitters;
    private javax.swing.JTextField TxtCity;
    private javax.swing.JTextField TxtCustomerId;
    private javax.swing.JTextField TxtCustomerName;
    private javax.swing.JTextField TxtEmpEndDate;
    private javax.swing.JTextField TxtEmpStartDate;
    private javax.swing.JButton backJButton2;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
