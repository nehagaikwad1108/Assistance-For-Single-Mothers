/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Job;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.JobWorkQueue.JobCounsellorWorkRequest;
import Business.JobWorkQueue.JobFinderWorkRequest;
import Business.JobWorkQueue.JobTrainerWorkRequest;
import Business.Mother.Mother;
import Business.Network.Network;
import Business.Organization.JobFinderOrganization;
import Business.Organization.JobTrainerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIDDHI
 */
public class JobTrainerJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    JobTrainerOrganization jobTrainerOrganization;
    Ecosystem business;
    Organization organization;

    public JobTrainerJPanel(JPanel userProcessContainer, UserAccount account, JobTrainerOrganization jobTrainerOrganization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;

        this.enterprise = enterprise;
        this.business = business;
        this.jobTrainerOrganization = jobTrainerOrganization;
        populateResponseTable1();
        valueLabel.setText(business.getName());
        populateMothersTable();
    }

    /*public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (JobTrainerWorkRequest request : account.getJobWorkQueue().getTrainerWorkRequestList()) {
            if (request instanceof JobFinderWorkRequest) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getMotherName();
                row[2] = request.getSender().getEmployee().getName();
                row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
               row[4] = request.getStatus();
                row[5] = ((JobFinderWorkRequest) request).getResult();

                model.addRow(row);
            }
        }
    }*/

    public void populateResponseTable1() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();

        model.setRowCount(0);

        for (JobCounsellorWorkRequest request : jobTrainerOrganization.getJobWorkQueue().getCouncellorWorkRequestList()) {

            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getMotherName();

            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            row[5] = ((JobTrainerWorkRequest) request).getResult();
            model.addRow(row);

        }
    }
    public void populateMothersTable() {
        DefaultTableModel model = (DefaultTableModel) tblMother1.getModel();
        model.setRowCount(0);

        
                    for (Mother mother :business.getMotherDirectory().getMotherList()) {
                        Object[] row = new Object[2];

                        row[0] = mother;
                        row[1] = mother.getAge();
                        
                        model.addRow(row);
                    }
                }

            

        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        tblMother = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        refreshTestJButton1 = new javax.swing.JButton();
        BtnMotherProfile = new javax.swing.JButton();
        BtnResponseToCounselor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        ManageCandidate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMother1 = new javax.swing.JTable();

        tblMother.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mother Name", "Age", "Parole"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMother);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valueLabel.setText("<value>");

        refreshTestJButton1.setText("Refresh");
        refreshTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButton1ActionPerformed(evt);
            }
        });

        BtnMotherProfile.setText("Candidate(Mother) profile");
        BtnMotherProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMotherProfileActionPerformed(evt);
            }
        });

        BtnResponseToCounselor.setText("Respond to Job Counselor");
        BtnResponseToCounselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponseToCounselorActionPerformed(evt);
            }
        });

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Name", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable1);

        ManageCandidate.setText("Manage Candidate (Mother)");
        ManageCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCandidateActionPerformed(evt);
            }
        });

        jButton1.setText("Add Courses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Select Courses");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblMother1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mother Name", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblMother1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ManageCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnMotherProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnResponseToCounselor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(76, 76, 76)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshTestJButton1)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel))
                .addGap(150, 150, 150)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtnResponseToCounselor)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(ManageCandidate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(9, 9, 9)
                .addComponent(BtnMotherProfile)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButton1ActionPerformed

        //   populateRequestTable1();
    }//GEN-LAST:event_refreshTestJButton1ActionPerformed

    private void BtnMotherProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMotherProfileActionPerformed
        MotherProfileJPanel jp = new MotherProfileJPanel(userProcessContainer, account,organization, enterprise, business);
        userProcessContainer.add("MotherProfileJPanel", jp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnMotherProfileActionPerformed

    private void BtnResponseToCounselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponseToCounselorActionPerformed

        int selectedRow = workRequestJTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select row!");
            return;
        }

        JobTrainerWorkRequest request = (JobTrainerWorkRequest) workRequestJTable1.getValueAt(selectedRow, 0);

        request.setStatus("Processing");
        request.setReceiver(account);
        ProcessCouncellorJPanel processCouncellorJPanel = new ProcessCouncellorJPanel(userProcessContainer, request, business);
        userProcessContainer.add("ProcessCouncellorJPanel", processCouncellorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_BtnResponseToCounselorActionPerformed

    private void ManageCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCandidateActionPerformed
        // TODO add your handling code here:
        populateMothersTable();
    }//GEN-LAST:event_ManageCandidateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddCoursesJPanel addCoursesJPanel = new AddCoursesJPanel(userProcessContainer, account,enterprise,business,jobTrainerOrganization);
        userProcessContainer.add("addCoursesJPanel", addCoursesJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select work request you want to process!");
            return;
        }
         JobTrainerWorkRequest request = (JobTrainerWorkRequest) workRequestJTable1.getValueAt(selectedRow, 0);

       
        CoursesJPanel coursesJPanel = new CoursesJPanel(userProcessContainer, account,enterprise,business,jobTrainerOrganization,request);
        userProcessContainer.add("CoursesJPanel", coursesJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMotherProfile;
    private javax.swing.JButton BtnResponseToCounselor;
    private javax.swing.JButton ManageCandidate;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton refreshTestJButton1;
    private javax.swing.JTable tblMother;
    private javax.swing.JTable tblMother1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
