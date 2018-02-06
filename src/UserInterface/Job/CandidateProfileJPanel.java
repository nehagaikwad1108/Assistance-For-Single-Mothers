package UserInterface.Job;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Mother.Mother;
import Business.Mother.MotherDirectory;
import Business.Network.Network;
import Business.Organization.JobCentre.*;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIDDHI
 */
public class CandidateProfileJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private Ecosystem business;
    private Mother mother1;
    //private Candidate mother;
    //private CandidateDirectory motherDir;

   

    CandidateProfileJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business,Mother mother1) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.mother1 = mother1;   
        // valueLabel.setText(business.getName());
        //populateComboBoxes();
        //motherDir = new CandidateDirectory();
        //mother = new Candidate();
        
        

        RadioSemiskilled.setSelected(false);
        RadioUnSkilled.setSelected(false);
        RadioMiddleSchool.setSelected(false);
        RadioHighSchool.setSelected(false);
        RadioCollege1styr.setSelected(false);
        RadioCollege2ndyr.setSelected(false);
        RadioCrime.setSelected(false);

        ButtonGroupSkills.add(RadioSemiskilled);
        ButtonGroupSkills.add(RadioUnSkilled);
        ButtonGroupEducation.add(RadioMiddleSchool);
        ButtonGroupEducation.add(RadioHighSchool);
        ButtonGroupEducation.add(RadioCollege1styr);
        ButtonGroupEducation.add(RadioCollege2ndyr);
        txtMotherName.setText(mother1.getName());
       // populateMothersTable();
    }
   /*  public void populateMothersTable() {
        DefaultTableModel model = (DefaultTableModel) tblMother.getModel();
        model.setRowCount(0);

     for (Mother mother :business.getMotherDirectory().getMotherList()) {
                        Object[] row = new Object[3];

                        row[0] = mother;
                        row[1] = mother.getAge();
                        row[2] = mother.getParoleDetails();
                        model.addRow(row);
                    }
                }
*/
            
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroupEducation = new javax.swing.ButtonGroup();
        ButtonGroupSkills = new javax.swing.ButtonGroup();
        jLabel50 = new javax.swing.JLabel();
        TxtParoleOff = new javax.swing.JTextField();
        BtnCreateProfile = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtUndergrad = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtEmpHistory = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtSchooling = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        RadioParole = new javax.swing.JRadioButton();
        RadioBail = new javax.swing.JRadioButton();
        RadioCrime = new javax.swing.JRadioButton();
        TxtBailCompany = new javax.swing.JTextField();
        TxtBailCrime = new javax.swing.JTextField();
        RadioPasttDrugAddict = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        RadioPresentDrugAddict = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        TxtPastDrugAddict = new javax.swing.JTextField();
        TxtPresentDrugAddict = new javax.swing.JTextField();
        RadioSemiskilled = new javax.swing.JRadioButton();
        RadioUnSkilled = new javax.swing.JRadioButton();
        RadioCollege1styr = new javax.swing.JRadioButton();
        RadioMiddleSchool = new javax.swing.JRadioButton();
        RadioHighSchool = new javax.swing.JRadioButton();
        RadioCollege2ndyr = new javax.swing.JRadioButton();
        BtnAptitudeTest = new javax.swing.JButton();
        TxtProfessionalCources = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtCertificates1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbFOI = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel50.setText("Candidate Details");

        TxtParoleOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtParoleOffActionPerformed(evt);
            }
        });

        BtnCreateProfile.setText("Create Customer Profile");
        BtnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateProfileActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel52.setText("Education :");

        jLabel54.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel54.setText("Undergraduation:");

        jLabel56.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel56.setText("Schooling:");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setText("Employment History");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setText("If yes write in detail the sentencing of your felony:");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setText("Are you currently on bail?:");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setText("Have you been drug/acohol addict:");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setText("Specify:");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setText("If yes write name of Parole Officer:");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setText("Skills");

        TxtUndergrad.setColumns(20);
        TxtUndergrad.setRows(5);
        jScrollPane1.setViewportView(TxtUndergrad);

        TxtEmpHistory.setColumns(20);
        TxtEmpHistory.setRows(5);
        jScrollPane2.setViewportView(TxtEmpHistory);

        TxtSchooling.setColumns(20);
        TxtSchooling.setRows(5);
        jScrollPane3.setViewportView(TxtSchooling);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel14.setText("Are you currently on parole:");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel15.setText("If yes write name of Bail's bond company:");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel16.setText("Have you ever been convicted of a crime?:");

        TxtBailCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBailCompanyActionPerformed(evt);
            }
        });

        TxtBailCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBailCrimeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel12.setText("Are you been drug/acohol addict:");

        RadioPresentDrugAddict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioPresentDrugAddictActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel17.setText("Specify:");

        TxtPastDrugAddict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPastDrugAddictActionPerformed(evt);
            }
        });

        TxtPresentDrugAddict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPresentDrugAddictActionPerformed(evt);
            }
        });

        RadioSemiskilled.setText("Semi-Skilled");

        RadioUnSkilled.setText("Un-Skilled");
        RadioUnSkilled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioUnSkilledActionPerformed(evt);
            }
        });

        RadioCollege1styr.setText("College 1st yr");
        RadioCollege1styr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCollege1styrActionPerformed(evt);
            }
        });

        RadioMiddleSchool.setText("MiddleSchool");
        RadioMiddleSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMiddleSchoolActionPerformed(evt);
            }
        });

        RadioHighSchool.setText("HighSchool");
        RadioHighSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioHighSchoolActionPerformed(evt);
            }
        });

        RadioCollege2ndyr.setText("College 2nd yr");
        RadioCollege2ndyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCollege2ndyrActionPerformed(evt);
            }
        });

        BtnAptitudeTest.setText("Go for Aptitude Test");
        BtnAptitudeTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAptitudeTestActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setText("Certificates:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setText("professional Cources Taken:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel4.setText("Mother Name:");

        txtMotherName.setEditable(false);
        txtMotherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotherNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("FIELD OF INTEREST");

        cbFOI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cbFOI.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hospitality", "Finance", "Retail", "Technology", "Medicine", "Management" }));
        cbFOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFOIActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadioSemiskilled)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtCertificates1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(TxtProfessionalCources, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(458, 458, 458))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel52)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(211, 211, 211)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(317, 317, 317)
                                .addComponent(jLabel54))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RadioMiddleSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(RadioHighSchool))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(186, 186, 186)
                                        .addComponent(RadioUnSkilled))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RadioCollege1styr)
                                        .addGap(79, 79, 79)
                                        .addComponent(RadioCollege2ndyr))
                                    .addComponent(jLabel50)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPresentDrugAddict, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnCreateProfile)
                                        .addGap(180, 180, 180)
                                        .addComponent(BtnAptitudeTest))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RadioPresentDrugAddict)
                                        .addComponent(RadioBail)
                                        .addComponent(TxtBailCrime)
                                        .addComponent(TxtBailCompany)
                                        .addComponent(TxtParoleOff)
                                        .addComponent(RadioCrime)
                                        .addComponent(RadioParole)
                                        .addComponent(RadioPasttDrugAddict)
                                        .addComponent(TxtPastDrugAddict, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(572, 572, 572))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbFOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioCollege1styr)
                    .addComponent(RadioHighSchool)
                    .addComponent(RadioMiddleSchool)
                    .addComponent(RadioCollege2ndyr))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54)
                        .addComponent(jLabel56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RadioSemiskilled)
                        .addComponent(RadioUnSkilled))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtProfessionalCources, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCertificates1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioParole)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(TxtParoleOff, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7))
                    .addComponent(RadioBail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TxtBailCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RadioCrime)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBailCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(RadioPasttDrugAddict))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtPastDrugAddict, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioPresentDrugAddict)
                        .addGap(8, 8, 8)
                        .addComponent(TxtPresentDrugAddict, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCreateProfile)
                            .addComponent(BtnAptitudeTest)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backJButton)))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtParoleOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtParoleOffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtParoleOffActionPerformed

    private void BtnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateProfileActionPerformed
       
        //int id = Integer.parseInt(TxtID.getText());
        String motherName = txtMotherName.getText();
       
       for(Mother mother :business.getMotherDirectory().getMotherList()){
       if(mother.getName().equals(motherName)){    
       
        //mother = motherDir.addCandidate();
        //for(Mother mother :business.getMotherDirectory().getMotherList()){
        //    if()
        //}
         //Mother mother =business.getMotherDirectory().searchMotherByID(id);
         int index =business.getMotherDirectory().getMotherIndex(motherName);
        System.out.println(index);
       // mother.setMother(mother);
         String foi = (String) cbFOI.getSelectedItem();
        business.getMotherDirectory().getMotherList().get(index).setFieldOfInterest(foi);
        if (RadioUnSkilled.isSelected()) {
          business.getMotherDirectory().getMotherList().get(index).setSkillType("Unskilled");
        } else if (RadioSemiskilled.isSelected()) {
          business.getMotherDirectory().getMotherList().get(index).setSkillType("Semi-skilled");
        
        } else {
            JOptionPane.showMessageDialog(null, "Please select skill type");
        }
        

        if (RadioMiddleSchool.isSelected()) {
           
           business.getMotherDirectory().getMotherList().get(index).setEducationLevel("Middle School");
        } else if (RadioHighSchool.isSelected()) {
            mother.setEducationLevel("High School");
        } else if (RadioCollege1styr.isSelected()) {
            mother.setEducationLevel("College 1st year");
        } else if (RadioCollege2ndyr.isSelected()) {
            mother.setEducationLevel("College 2nd year");
        } else {
            JOptionPane.showMessageDialog(null, "Please select Education level");
        }//Schooling ends

        if (RadioParole.isSelected()) {
            if (TxtParoleOff.getText().equalsIgnoreCase(null)) {
                JOptionPane.showMessageDialog(null, "Please specify details");
            } else {
               business.getMotherDirectory().getMotherList().get(index).setParole(true);
                mother.setParole(true);
            business.getMotherDirectory().getMotherList().get(index).setParoleDetails(TxtParoleOff.getText());
            }
        }
        if (RadioBail.isSelected()) {
            if (TxtBailCompany.getText().equalsIgnoreCase(null)) {
                JOptionPane.showMessageDialog(null, "Please specify details");
            } else {
              business.getMotherDirectory().getMotherList().get(index).setBail(true);
              business.getMotherDirectory().getMotherList().get(index).setBailDetails(TxtBailCompany.getText());
            }
        }
        if (RadioCrime.isSelected()) {
            if (TxtParoleOff.getText().equalsIgnoreCase(null)) {
                JOptionPane.showMessageDialog(null, "Please specify details");
            } else {
               business.getMotherDirectory().getMotherList().get(index).setCiminalHistory(true);
               business.getMotherDirectory().getMotherList().get(index).setCriminalHistory(TxtBailCrime.getText());
            }
        }
        if (RadioPresentDrugAddict.isSelected()) {
            if (TxtPresentDrugAddict.getText().equalsIgnoreCase(null)) {
                JOptionPane.showMessageDialog(null, "Please specify details");
            } else {
               business.getMotherDirectory().getMotherList().get(index).setPresentAddiction(true);
               business.getMotherDirectory().getMotherList().get(index).setPresentAddictionHistory(TxtPresentDrugAddict.getText());
            }
        }
        if (RadioPasttDrugAddict.isSelected()) {
            if (TxtPastDrugAddict.getText().equalsIgnoreCase(null)) {
                JOptionPane.showMessageDialog(null, "Please specify details");
            } else {
               business.getMotherDirectory().getMotherList().get(index).setPastAddiction(true);
               business.getMotherDirectory().getMotherList().get(index).setPastAddictionHistory(TxtPastDrugAddict.getText());
            }
        } //Criminal histories end

       business.getMotherDirectory().getMotherList().get(index).setWorkExperience(TxtEmpHistory.getText());
       business.getMotherDirectory().getMotherList().get(index).setSchoolEducation(TxtSchooling.getText());
        business.getMotherDirectory().getMotherList().get(index).setCollegeEducation(TxtUndergrad.getText());
        business.getMotherDirectory().getMotherList().get(index).setProfessionalCources(TxtProfessionalCources.getText());
        business.getMotherDirectory().getMotherList().get(index).setCertificates(TxtCertificates1.getText());

        
        JOptionPane.showMessageDialog(null,"Profile created succesfully!!");
        //mother.setMother(mother);
        //motherDir.addCandidate(mother);
      //  populateMothersTable();
       } 
       }
        
    }//GEN-LAST:event_BtnCreateProfileActionPerformed

    private void TxtBailCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBailCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBailCompanyActionPerformed

    private void TxtBailCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBailCrimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBailCrimeActionPerformed

    private void TxtPastDrugAddictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPastDrugAddictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPastDrugAddictActionPerformed

    private void TxtPresentDrugAddictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPresentDrugAddictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPresentDrugAddictActionPerformed

    private void RadioPresentDrugAddictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioPresentDrugAddictActionPerformed

    }//GEN-LAST:event_RadioPresentDrugAddictActionPerformed

    private void RadioUnSkilledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioUnSkilledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioUnSkilledActionPerformed

    private void RadioCollege1styrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCollege1styrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioCollege1styrActionPerformed

    private void RadioMiddleSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMiddleSchoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioMiddleSchoolActionPerformed

    private void RadioHighSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioHighSchoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioHighSchoolActionPerformed

    private void RadioCollege2ndyrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCollege2ndyrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioCollege2ndyrActionPerformed

    private void BtnAptitudeTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAptitudeTestActionPerformed
          String motherName = txtMotherName.getText();

        AptitudeTestJPanel jp = new AptitudeTestJPanel(userProcessContainer, enterprise,motherName,business);
        userProcessContainer.add("AptitudeTestJPanel", jp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
          
    }//GEN-LAST:event_BtnAptitudeTestActionPerformed

    private void txtMotherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotherNameActionPerformed

    private void cbFOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFOIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFOIActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAptitudeTest;
    private javax.swing.JButton BtnCreateProfile;
    private javax.swing.ButtonGroup ButtonGroupEducation;
    private javax.swing.ButtonGroup ButtonGroupSkills;
    private javax.swing.JRadioButton RadioBail;
    private javax.swing.JRadioButton RadioCollege1styr;
    private javax.swing.JRadioButton RadioCollege2ndyr;
    private javax.swing.JRadioButton RadioCrime;
    private javax.swing.JRadioButton RadioHighSchool;
    private javax.swing.JRadioButton RadioMiddleSchool;
    private javax.swing.JRadioButton RadioParole;
    private javax.swing.JRadioButton RadioPasttDrugAddict;
    private javax.swing.JRadioButton RadioPresentDrugAddict;
    private javax.swing.JRadioButton RadioSemiskilled;
    private javax.swing.JRadioButton RadioUnSkilled;
    private javax.swing.JTextField TxtBailCompany;
    private javax.swing.JTextField TxtBailCrime;
    private javax.swing.JTextField TxtCertificates1;
    private javax.swing.JTextArea TxtEmpHistory;
    private javax.swing.JTextField TxtParoleOff;
    private javax.swing.JTextField TxtPastDrugAddict;
    private javax.swing.JTextField TxtPresentDrugAddict;
    private javax.swing.JTextField TxtProfessionalCources;
    private javax.swing.JTextArea TxtSchooling;
    private javax.swing.JTextArea TxtUndergrad;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cbFOI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtMotherName;
    // End of variables declaration//GEN-END:variables
}
