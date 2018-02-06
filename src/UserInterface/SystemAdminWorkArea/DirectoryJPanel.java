package UserInterface.SystemAdminWorkArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Mother.Mother;
import Business.Mother.MotherDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class DirectoryJPanel extends javax.swing.JPanel {

    private Ecosystem business;
    private JPanel userProcessContainer;
    private Mother mother;
    private MotherDirectory neWmDir;

    public DirectoryJPanel(JPanel userProcessContainer, Ecosystem business) {
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        initComponents();
        populateComboBox();
    }

    private void populateComboBox() {
        ComboCustName.removeAllItems();

        for (Mother m : business.getMotherDirectory().getMotherList()) {
            ComboCustName.addItem(m);
            System.out.println(business.getMotherDirectory().getMotherList().size());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel84 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        BtnRefresh = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        backJButton3 = new javax.swing.JButton();
        BtnDoc = new javax.swing.JButton();
        ComboCustName = new javax.swing.JComboBox();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        TxtChilidD = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        lblCriminalDetails = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lblPastAddictions = new javax.swing.JLabel();
        TxtBabysitter = new javax.swing.JTextField();
        Txt = new javax.swing.JTextField();
        TxtMedHis = new javax.swing.JTextField();
        TxtAge = new javax.swing.JLabel();
        TxtName = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JLabel();
        TxtAddress = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        lblBailDetails = new javax.swing.JLabel();
        lblParole = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lblPresent = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        BtnNext = new javax.swing.JButton();

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel84.setText("Criminal Details:");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel66.setText("Baby Sitter :");

        BtnRefresh.setText("Refresh");
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel67.setText("Email:");

        backJButton3.setText("Back");
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });

        BtnDoc.setText("Proceed");
        BtnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDocActionPerformed(evt);
            }
        });

        ComboCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCustNameActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel68.setText("Mother :");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel69.setText("Address :");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel70.setText("Child Details:");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel71.setText("Mother Age:");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel72.setText("Mother Name:");

        TxtChilidD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtChilidDActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel73.setText("Medical History:");

        lblCriminalDetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCriminalDetails.setText("Criminal Details:");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel76.setText("Dietician Status:");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel77.setText("Contact Number:");

        lblPastAddictions.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPastAddictions.setText("Past Addictions:");

        TxtBabysitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBabysitterActionPerformed(evt);
            }
        });

        Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtActionPerformed(evt);
            }
        });

        TxtMedHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMedHisActionPerformed(evt);
            }
        });

        TxtAge.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TxtAge.setText("<Age>");

        TxtName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TxtName.setText("<Mother Name>");

        TxtEmail.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TxtEmail.setText("<Email>");

        TxtAddress.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TxtAddress.setText("                <Address>");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel80.setText("Bail Details ");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel81.setText("Parole Details ");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel82.setText("Criminal Details:");

        lblBailDetails.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblBailDetails.setText("Bail Details:");

        lblParole.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblParole.setText("Parole Details:");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel86.setText("Past Addictions:");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel87.setText("Present Addictions:");

        lblPresent.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPresent.setText("Present Addictions:");

        lblContact.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblContact.setText("Contact Number:");

        BtnNext.setText("Next");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRefresh)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72)
                            .addComponent(jLabel68)
                            .addComponent(jLabel73)
                            .addComponent(jLabel70))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtMedHis, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(TxtChilidD)
                            .addComponent(TxtAge)
                            .addComponent(TxtName)
                            .addComponent(TxtEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtBabysitter)
                                .addGap(28, 28, 28))
                            .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblContact)
                                .addGap(363, 363, 363))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel69)
                                        .addGap(132, 132, 132)
                                        .addComponent(TxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel80)
                                            .addComponent(jLabel81)
                                            .addComponent(jLabel82)
                                            .addComponent(jLabel86)
                                            .addComponent(jLabel87))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCriminalDetails)
                                            .addComponent(lblBailDetails)
                                            .addComponent(lblParole)
                                            .addComponent(lblPastAddictions)
                                            .addComponent(lblPresent)
                                            .addComponent(BtnNext))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(BtnDoc)
                        .addGap(613, 613, 613))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnDoc)
                        .addComponent(BtnNext))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backJButton3)
                        .addComponent(BtnRefresh)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel68)
                        .addComponent(ComboCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(jLabel69)
                            .addComponent(TxtName)
                            .addComponent(TxtAddress))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(TxtAge))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(TxtEmail)))
                    .addComponent(lblContact))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCriminalDetails)
                    .addComponent(jLabel82))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtMedHis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel80)
                        .addComponent(lblBailDetails)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtChilidD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(TxtBabysitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(lblParole))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPastAddictions)
                            .addComponent(jLabel86))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(lblPresent))))
                .addGap(230, 230, 230))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefreshActionPerformed
        // populateTable();
    }//GEN-LAST:event_BtnRefreshActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel ba = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton3ActionPerformed

    private void BtnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDocActionPerformed
        mother = (Mother) ComboCustName.getSelectedItem();
        TxtName.setText(mother.getName());
        //TxtContact.setText(mother.getContactNo());
        TxtAge.setText(String.valueOf(mother.getAge()));
        TxtEmail.setText(mother.getEmailID());
        TxtAddress.setText(mother.getAddress());
        TxtChilidD.setText(mother.getMedicalHistory());
        Txt.setText(mother.getDieticienStatus() + " Alloted Date :" + mother.getDieticianEndDate());
        lblBailDetails.setText(mother.getBailDetails()); 
        lblParole.setText(mother.getParoleDetails());
        lblCriminalDetails.setText(mother.getCriminalHistory());
        lblPresent.setText(mother.getPresentAddictionHistory());
        lblPastAddictions.setText(mother.getPastAddictionHistory());
        lblContact.setText(mother.getContactNo());
        TxtBabysitter.setText(mother.getAllotedBabySitter());
                
      //  TxtBaby.setText(mother.get);
        

    }//GEN-LAST:event_BtnDocActionPerformed

    private void ComboCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCustNameActionPerformed

    private void TxtChilidDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChilidDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChilidDActionPerformed

    private void TxtBabysitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBabysitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBabysitterActionPerformed

    private void TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtActionPerformed

    private void TxtMedHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMedHisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMedHisActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        mother = (Mother) ComboCustName.getSelectedItem(); 
        NextDirectoryJPanel m = new NextDirectoryJPanel(userProcessContainer, business,mother);
        Component manageEnterpriseAdminJPanel;
        userProcessContainer.add("m", m);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnNextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDoc;
    private javax.swing.JButton BtnNext;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JComboBox ComboCustName;
    private javax.swing.JTextField Txt;
    private javax.swing.JLabel TxtAddress;
    private javax.swing.JLabel TxtAge;
    private javax.swing.JTextField TxtBabysitter;
    private javax.swing.JTextField TxtChilidD;
    private javax.swing.JLabel TxtEmail;
    private javax.swing.JTextField TxtMedHis;
    private javax.swing.JLabel TxtName;
    private javax.swing.JButton backJButton3;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel lblBailDetails;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblCriminalDetails;
    private javax.swing.JLabel lblParole;
    private javax.swing.JLabel lblPastAddictions;
    private javax.swing.JLabel lblPresent;
    // End of variables declaration//GEN-END:variables
}
