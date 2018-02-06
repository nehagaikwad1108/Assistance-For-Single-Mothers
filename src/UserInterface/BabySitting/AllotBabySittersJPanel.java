package UserInterface.BabySitting;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.BabySitting.BabySittingClient;
import Business.BabySitting.Babysitter;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class AllotBabySittersJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    private Babysitter babysitter;
    private BabySittingClient client;
    SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    Ecosystem business;

    public AllotBabySittersJPanel(JPanel userProcessContainer, Enterprise enterprise, Babysitter babysitter, BabySittingClient client, Ecosystem business) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        //valueLabel.setText(enterprise.getName());
        this.babysitter = babysitter;
        this.client = client;

        TxtClientName.setText(client.getMother().getName());
        //client of babysitter
        TxtClientID.setText(String.valueOf(client.getMother().getMotherID()));
        TxtEmpName.setText(babysitter.getName());
        TxtEmpID.setText(String.valueOf(babysitter.getEmpID()));
        TxtEmpStartDate.setText(String.valueOf(client.getServiceSrtDate()));
        TxtEmpEndDate.setText(String.valueOf(client.getServiceEndDate()));
        TxtClientName.setEnabled(false);
        TxtClientID.setEnabled(false);
        TxtEmpName.setEnabled(false);
        TxtEmpID.setEnabled(false);

        //populateTable();
        //populateCombo();
    }
    //Date date = dateFormat.parse("12/31/2006");

    /*  private void populateCombo() {
        CBMonSlot1a.removeAllItems();
        for (Type type : Organization.Type.values()) {
            if (!type.getValue().equals(Type.Admin.getValue())) {

                if (!(enterprise instanceof Provider)) {
                    if (!type.getValue().equals(Type.Clinic.getValue())) {
                        organizationJComboBox.addItem(type);

                    }

                } else {
                    organizationJComboBox.addItem(type);
                }

            }
        }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBMonSlot1b = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CBMonSlot2a = new javax.swing.JComboBox<>();
        CBMonSlot2b = new javax.swing.JComboBox<>();
        CBMonSlot1a = new javax.swing.JComboBox<>();
        CBMonSlot3a = new javax.swing.JComboBox<>();
        CBMonSlot3b = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CBSatSlot1b = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        CBSatSlot1a = new javax.swing.JComboBox<>();
        CBSatSlot2a = new javax.swing.JComboBox<>();
        CBSatSlot2b = new javax.swing.JComboBox<>();
        CBSunSlot1a = new javax.swing.JComboBox<>();
        CBSunSlot1b = new javax.swing.JComboBox<>();
        CBSunSlot2b = new javax.swing.JComboBox<>();
        CBSatSlot3b = new javax.swing.JComboBox<>();
        CBSunSlot2a = new javax.swing.JComboBox<>();
        CBSatSlot3a = new javax.swing.JComboBox<>();
        CBSunSlot3b = new javax.swing.JComboBox<>();
        CBSunSlot3a = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        TxtEmpStartDate = new javax.swing.JTextField();
        TxtEmpEndDate = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        TxtEmpName = new javax.swing.JTextField();
        TxtEmpID = new javax.swing.JTextField();
        TxtClientID = new javax.swing.JTextField();
        TxtClientName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnConfirm = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();

        CBMonSlot1b.setMaximumRowCount(48);
        CBMonSlot1b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Slot 1 :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Slot 3 :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Slot 2 :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Week days :");

        CBMonSlot2a.setMaximumRowCount(45);
        CBMonSlot2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBMonSlot2b.setMaximumRowCount(45);
        CBMonSlot2b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBMonSlot1a.setMaximumRowCount(45);
        CBMonSlot1a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBMonSlot3a.setMaximumRowCount(45);
        CBMonSlot3a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));
        CBMonSlot3a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMonSlot3aActionPerformed(evt);
            }
        });

        CBMonSlot3b.setMaximumRowCount(45);
        CBMonSlot3b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Saturday :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Sunday :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText(" -");

        CBSatSlot1b.setMaximumRowCount(45);
        CBSatSlot1b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText(" -");

        CBSatSlot1a.setMaximumRowCount(45);
        CBSatSlot1a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot2a.setMaximumRowCount(45);
        CBSatSlot2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot2b.setMaximumRowCount(45);
        CBSatSlot2b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSunSlot1a.setMaximumRowCount(45);
        CBSunSlot1a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSunSlot1b.setMaximumRowCount(45);
        CBSunSlot1b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSunSlot2b.setMaximumRowCount(45);
        CBSunSlot2b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot3b.setMaximumRowCount(45);
        CBSatSlot3b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSunSlot2a.setMaximumRowCount(45);
        CBSunSlot2a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSatSlot3a.setMaximumRowCount(45);
        CBSatSlot3a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        CBSunSlot3b.setMaximumRowCount(45);
        CBSunSlot3b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));
        CBSunSlot3b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSunSlot3bActionPerformed(evt);
            }
        });

        CBSunSlot3a.setMaximumRowCount(45);
        CBSunSlot3a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00" }));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText(" -");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setText(" -");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText(" -");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText(" -");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText(" -");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setText(" -");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel46.setText("Days");

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
        jLabel50.setText("Employment Details");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel51.setText("Employee Name :");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel52.setText("Employee ID:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel53.setText("Client Name :");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel54.setText("Client ID :");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setText(" -");

        TxtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmpNameActionPerformed(evt);
            }
        });

        TxtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmpIDActionPerformed(evt);
            }
        });

        TxtClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtClientIDActionPerformed(evt);
            }
        });

        TxtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtClientNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Time slots:");

        BtnConfirm.setText("Confirm");
        BtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmActionPerformed(evt);
            }
        });

        backJButton2.setText("Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel48)
                            .addComponent(jLabel53))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBSatSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBMonSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBSunSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel43)
                                                .addGap(19, 19, 19))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel41)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CBSunSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CBSatSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CBMonSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(TxtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(TxtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel46)
                        .addGap(149, 149, 149)
                        .addComponent(jLabel6)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBMonSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBSatSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBSunSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnConfirm))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel44))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBSunSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CBSatSlot2b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(CBMonSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(222, 222, 222))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel54))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtEmpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBMonSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBMonSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBSatSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel38)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBSatSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBSunSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel45)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBSunSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(31, 31, 31))
                            .addComponent(backJButton2))
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel50)))
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(336, 336, 336)
                    .addComponent(jLabel2)
                    .addContainerGap(400, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(backJButton2))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54))
                    .addComponent(TxtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(TxtEmpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel46))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CBMonSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMonSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel29)
                    .addComponent(jLabel47))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(CBSatSlot1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBSatSlot1b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(CBSatSlot2a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBSatSlot2b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(CBSatSlot3a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(CBSatSlot3b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
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
                .addGap(35, 35, 35)
                .addComponent(BtnConfirm)
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(274, 274, 274)
                    .addComponent(jLabel2)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CBMonSlot3aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMonSlot3aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBMonSlot3aActionPerformed

    private void TxtEmpStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmpStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmpStartDateActionPerformed

    private void TxtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmpNameActionPerformed

    private void TxtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmpIDActionPerformed

    private void TxtClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtClientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtClientIDActionPerformed

    private void TxtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtClientNameActionPerformed

    private void CBSunSlot3bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSunSlot3bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBSunSlot3bActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BabySittingAdminJPanel ba = (BabySittingAdminJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void BtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmActionPerformed
        try {
            babysitter.setAvailability(false);
            Date SDate = dateFormat.parse(TxtEmpStartDate.getText());
            Date EDate = dateFormat.parse(TxtEmpEndDate.getText());
            babysitter.setEmployementSrtDate(SDate);
            babysitter.setEmployementEndDate(EDate);
            //setting next available date for  babysitter
            if ((babysitter.getAvailableEDate()).after(EDate)) {
                babysitter.setAvailableSDate(EDate);
            }
            //current working schedule
            babysitter.setWeekDayWrkTimings(CBMonSlot1a.getSelectedItem() + "-" + CBMonSlot1b.getSelectedItem() + "," + CBMonSlot2a.getSelectedItem() + "-" + CBMonSlot2b.getSelectedItem() + "," + CBMonSlot3a.getSelectedItem() + "-" + CBMonSlot3b.getSelectedItem());
            babysitter.setSaturdaywrkTimings(CBSatSlot1a.getSelectedItem() + "-" + CBSatSlot1b.getSelectedItem() + "," + CBSatSlot2a.getSelectedItem() + "-" + CBSatSlot2b.getSelectedItem() + "," + CBSatSlot3a.getSelectedItem() + "-" + CBSatSlot3b.getSelectedItem());
            babysitter.setSundayWrkTimings(CBSunSlot1a.getSelectedItem() + "-" + CBSunSlot1b.getSelectedItem() + "," + CBSunSlot2a.getSelectedItem() + "-" + CBSunSlot2b.getSelectedItem() + "," + CBSunSlot3a.getSelectedItem() + "-" + CBSunSlot3b.getSelectedItem());

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
            babysitter.setWeekDaysHrs(MonAllSlots);
            babysitter.setSaturdayHrs(SatAllSlots);
            babysitter.setSundayHrs(SunAllSlots);

            babysitter.setAllotedCustomer(client.getMother().getName());
            babysitter.setIDofAllotedCustomer(client.getMother().getMotherID());

            client.setIDofAllotedBabySitter(babysitter.getEmpID());
            /*Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
            String name = nameJTextField.getText();
            organization.getEmployeeDirectory().createEmployee(name);*/

//updating mother directory
            /*mother = mDir.searchMotherByID(id);
            for (Mother m : mDir.getMotherList());*/
        } catch (ParseException ex) {
            Logger.getLogger(AllotBabySittersJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirm;
    private javax.swing.JComboBox<String> CBMonSlot1a;
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
    private javax.swing.JTextField TxtClientID;
    private javax.swing.JTextField TxtClientName;
    private javax.swing.JTextField TxtEmpEndDate;
    private javax.swing.JTextField TxtEmpID;
    private javax.swing.JTextField TxtEmpName;
    private javax.swing.JTextField TxtEmpStartDate;
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
