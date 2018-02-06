package UserInterface.BabySitting;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Mother.Mother;
import Business.Mother.MotherDirectory;
import Business.BabySitting.BabySittingClient;
import Business.BabySitting.ClientDirectory;
import Business.Organization.BabySittingOrganization;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class CustomerJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    private Ecosystem business;
    private ClientDirectory clientDir;
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    //private Mother mother;
    BabySittingOrganization babySittingOrganization;
    Organization organization;
     MotherDirectory neWmDir;
    
    //BabySittingClient client;

    public CustomerJPanel(JPanel userProcessContainer, Enterprise enterprise, BabySittingOrganization babySittingOrganization, Organization organization, Ecosystem business) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.babySittingOrganization = babySittingOrganization;
        this.organization = organization;
        // valueLabel.setText(enterprise.getName());
        //populateComboBoxes();
        this.clientDir = babySittingOrganization.getClientDirectory();

        //mother = new Mother();
        populateComboBox();
    }

    private void populateComboBox() {
        ComboCustName.removeAllItems();

        for (Mother m : business.getMotherDirectory().getMotherList()) {
            ComboCustName.addItem(m);
//            System.out.println(clientDir.getClientList().size());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel48 = new javax.swing.JLabel();
        TxtEmpStartDate = new javax.swing.JTextField();
        TxtEmpEndDate = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        TxtCustID = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        BtnCreateProfile = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        CBMonSlot1b = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        CBMonSlot1a = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CBSatSlot1b = new javax.swing.JComboBox<>();
        CBSatSlot1a = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CBSunSlot1a = new javax.swing.JComboBox<>();
        CBSunSlot1b = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        CBMonSlot3a = new javax.swing.JComboBox<>();
        CBMonSlot3b = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        CBMonSlot2a = new javax.swing.JComboBox<>();
        CBMonSlot2b = new javax.swing.JComboBox<>();
        CBSatSlot2a = new javax.swing.JComboBox<>();
        CBSatSlot3a = new javax.swing.JComboBox<>();
        CBSatSlot3b = new javax.swing.JComboBox<>();
        CBSatSlot2b = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        CBSunSlot2b = new javax.swing.JComboBox<>();
        CBSunSlot2a = new javax.swing.JComboBox<>();
        CBSunSlot3b = new javax.swing.JComboBox<>();
        CBSunSlot3a = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        TxtOtherRequirements = new javax.swing.JTextField();
        BtnProceed = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        ComboCustName = new javax.swing.JComboBox();

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel48.setText("Start Date:");

        TxtEmpStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmpStartDateActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel49.setText("End Date:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel50.setText("Cutomer Details");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel51.setText("CustomerID");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel53.setText("Customer Name :");

        TxtCustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCustIDActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel54.setText("Baby Sitting Requirement Details : ");

        BtnCreateProfile.setText("Create Customer Profile");
        BtnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateProfileActionPerformed(evt);
            }
        });

        backJButton2.setText("Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setText(" -");

        CBMonSlot1b.setMaximumRowCount(45);
        CBMonSlot1b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Week days :");

        CBMonSlot1a.setMaximumRowCount(45);
        CBMonSlot1a.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Time slots:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel46.setText("Days");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Slot 1 :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Slot 3 :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Slot 2 :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Saturday :");

        CBSatSlot1b.setMaximumRowCount(45);
        CBSatSlot1b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot1a.setMaximumRowCount(45);
        CBSatSlot1a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText(" -");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Sunday :");

        CBSunSlot1a.setMaximumRowCount(45);
        CBSunSlot1a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSunSlot1b.setMaximumRowCount(45);
        CBSunSlot1b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setText(" -");

        CBMonSlot3a.setMaximumRowCount(45);
        CBMonSlot3a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));
        CBMonSlot3a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMonSlot3aActionPerformed(evt);
            }
        });

        CBMonSlot3b.setMaximumRowCount(45);
        CBMonSlot3b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText(" -");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText(" -");

        CBMonSlot2a.setMaximumRowCount(45);
        CBMonSlot2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBMonSlot2b.setMaximumRowCount(45);
        CBMonSlot2b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot2a.setMaximumRowCount(45);
        CBSatSlot2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot3a.setMaximumRowCount(45);
        CBSatSlot3a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot3b.setMaximumRowCount(45);
        CBSatSlot3b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot2b.setMaximumRowCount(45);
        CBSatSlot2b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText(" -");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText(" -");

        CBSunSlot2b.setMaximumRowCount(45);
        CBSunSlot2b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSunSlot2a.setMaximumRowCount(45);
        CBSunSlot2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSunSlot3b.setMaximumRowCount(45);
        CBSunSlot3b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));
        CBSunSlot3b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSunSlot3bActionPerformed(evt);
            }
        });

        CBSunSlot3a.setMaximumRowCount(45);
        CBSunSlot3a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText(" -");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setText(" -");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel52.setText("Other Requirements :");

        TxtOtherRequirements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOtherRequirementsActionPerformed(evt);
            }
        });

        BtnProceed.setText("Proceed");
        BtnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProceedActionPerformed(evt);
            }
        });

        BtnRefresh.setText("Refresh");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        ComboCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCustNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBMonSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CBMonSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBSatSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CBSatSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBSunSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CBSunSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(BtnCreateProfile)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(52, 52, 52)
                                .addComponent(CBSunSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBSunSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBMonSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel47)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBMonSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBSatSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel43)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBSatSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBSunSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBSunSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBSatSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBMonSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBMonSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBSatSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel49))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtEmpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnRefresh)
                                            .addComponent(BtnProceed))
                                        .addContainerGap(51, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addComponent(TxtOtherRequirements))
                                .addGap(348, 348, 348))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel50)
                                .addGap(219, 219, 219))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel6)
                                .addGap(166, 166, 166)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)))
                        .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backJButton2)
                            .addComponent(BtnRefresh)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel51)
                    .addComponent(BtnProceed)
                    .addComponent(ComboCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel54)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(TxtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(TxtEmpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(TxtOtherRequirements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(CBMonSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(CBMonSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(CBMonSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(CBSatSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(CBSatSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBSatSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBSatSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(CBSatSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(CBSatSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(CBSunSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBSunSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(CBSunSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(CBSunSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBSunSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(CBSunSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(BtnCreateProfile)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtEmpStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmpStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmpStartDateActionPerformed

    private void TxtCustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCustIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCustIDActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BabySittingAdminJPanel ba = (BabySittingAdminJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void CBMonSlot3aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMonSlot3aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBMonSlot3aActionPerformed

    private void CBSunSlot3bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSunSlot3bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBSunSlot3bActionPerformed

    private void BtnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateProfileActionPerformed
        try {
            BabySittingClient client = clientDir.addClient();
            client.setMother((Mother) ComboCustName.getSelectedItem());
            client.setServiceSrtDate(dateFormat.parse(TxtEmpStartDate.getText()));
            client.setServiceEndDate(dateFormat.parse(TxtEmpEndDate.getText()));

            //calculating working hrs
            Date d11a = timeFormat.parse((String) CBMonSlot1a.getSelectedItem());
            Date d11b = timeFormat.parse((String) CBMonSlot1b.getSelectedItem());
            Date d12a = timeFormat.parse((String) CBMonSlot2a.getSelectedItem());
            Date d12b = timeFormat.parse((String) CBMonSlot2b.getSelectedItem());
            Date d13a = timeFormat.parse((String) CBMonSlot3a.getSelectedItem());
            Date d13b = timeFormat.parse((String) CBMonSlot3b.getSelectedItem());
            long MonAllSlots = ((d11b.getTime() - d11a.getTime()) + (d12b.getTime() - d12a.getTime()) + (d13b.getTime() - d13a.getTime()));

            Date d21a = timeFormat.parse((String) CBSatSlot1a.getSelectedItem());
            Date d21b = timeFormat.parse((String) CBSatSlot1b.getSelectedItem());
            Date d22a = timeFormat.parse((String) CBSatSlot2a.getSelectedItem());
            Date d22b = timeFormat.parse((String) CBSatSlot2b.getSelectedItem());
            Date d23a = timeFormat.parse((String) CBSatSlot3a.getSelectedItem());
            Date d23b = timeFormat.parse((String) CBSatSlot3b.getSelectedItem());
            long SatAllSlots = ((d21b.getTime() - d21a.getTime()) + (d22b.getTime() - d22a.getTime()) + (d23b.getTime() - d23a.getTime()));

            Date d31a = timeFormat.parse((String) CBSunSlot1a.getSelectedItem());
            Date d31b = timeFormat.parse((String) CBSunSlot1b.getSelectedItem());
            Date d32a = timeFormat.parse((String) CBSunSlot2a.getSelectedItem());
            Date d32b = timeFormat.parse((String) CBSunSlot2b.getSelectedItem());
            Date d33a = timeFormat.parse((String) CBSunSlot3a.getSelectedItem());
            Date d33b = timeFormat.parse((String) CBSunSlot3b.getSelectedItem());
            long SunAllSlots = ((d31b.getTime() - d31a.getTime()) + (d32b.getTime() - d32a.getTime()) + (d33b.getTime() - d33a.getTime()));
            //time in hrs
            client.setSaturdayHrs(SatAllSlots);
            client.setSundayHrs(SunAllSlots);
            client.setWeekDaysHrs(MonAllSlots);
            client.setRequirement(TxtOtherRequirements.getText());
            //updating Mother Directory
            JOptionPane.showMessageDialog(null, "Created successfully");
            System.out.println("Aya" + clientDir.getClientList().size());
        } catch (ParseException ex) {
            Logger.getLogger(CustomerJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCreateProfileActionPerformed

    private void TxtOtherRequirementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOtherRequirementsActionPerformed

    }//GEN-LAST:event_TxtOtherRequirementsActionPerformed

    private void BtnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProceedActionPerformed

        Mother mother = (Mother) ComboCustName.getSelectedItem();
        //got mother obj

        //clientDir.addClient();
        TxtCustID.setText(String.valueOf(mother.getMotherID()));

        /*  if (!(TxtCustomerName.getText()).equalsIgnoreCase(null)) {
            ///search for mother name in mother directory
            String name = TxtCustomerName.getText();
            BabySittingClient client;
            client = clientDir.addClient();
            mother = mDir.searchMotherByName(name);
            TxtCustID.setText(String.valueOf(mother.getMotherID()));
            TxtCustID.setEnabled(false);
        } else if (!(TxtCustID.getText()).equalsIgnoreCase(null)) {
            ///search for mother name in mother directory
            int id = Integer.parseInt(TxtCustID.getText());

            client = clientDir.addClient();
            mother = mDir.searchMotherByID(id);
            TxtCustomerName.setText(mother.getName());
            TxtCustomerName.setEnabled(false);
        }*/
    }//GEN-LAST:event_BtnProceedActionPerformed

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed

        TxtCustID.setText(" ");
        TxtCustID.setEnabled(true);
        populateComboBox();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void ComboCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCustNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreateProfile;
    private javax.swing.JButton BtnProceed;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JComboBox CBMonSlot1a;
    private javax.swing.JComboBox<String> CBMonSlot1b;
    private javax.swing.JComboBox<String> CBMonSlot2a;
    private javax.swing.JComboBox<String> CBMonSlot2b;
    private javax.swing.JComboBox<String> CBMonSlot3a;
    private javax.swing.JComboBox<String> CBMonSlot3b;
    private javax.swing.JComboBox<String> CBSatSlot1a;
    private javax.swing.JComboBox<String> CBSatSlot1b;
    private javax.swing.JComboBox<String> CBSatSlot2a;
    private javax.swing.JComboBox<String> CBSatSlot2b;
    private javax.swing.JComboBox<String> CBSatSlot3a;
    private javax.swing.JComboBox<String> CBSatSlot3b;
    private javax.swing.JComboBox<String> CBSunSlot1a;
    private javax.swing.JComboBox<String> CBSunSlot1b;
    private javax.swing.JComboBox<String> CBSunSlot2a;
    private javax.swing.JComboBox<String> CBSunSlot2b;
    private javax.swing.JComboBox<String> CBSunSlot3a;
    private javax.swing.JComboBox<String> CBSunSlot3b;
    private javax.swing.JComboBox ComboCustName;
    private javax.swing.JTextField TxtCustID;
    private javax.swing.JTextField TxtEmpEndDate;
    private javax.swing.JTextField TxtEmpStartDate;
    private javax.swing.JTextField TxtOtherRequirements;
    private javax.swing.JButton backJButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
