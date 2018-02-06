package UserInterface.Job;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.JobWorkQueue.JobCounsellorWorkRequest;
import Business.JobWorkQueue.JobTrainerWorkRequest;
import Business.Mother.Mother;
import Business.Organization.*;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIDDHI
 */
public class JobCounselorJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    JobCounselorOrganization jobCounselorOrganization;
    Ecosystem business;
    Organization organization;

    public JobCounselorJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, JobCounselorOrganization jobCounselorOrganization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.jobCounselorOrganization = jobCounselorOrganization;
        this.enterprise = enterprise;
        this.business = business;
        populateTable2();
         valueLabel.setText(business.getName());
         populateMothersTable();
        
    }
 public void populateMothersTable() {
        DefaultTableModel model = (DefaultTableModel) tblMother.getModel();
        model.setRowCount(0);

     for (Mother mother :business.getMotherDirectory().getMotherList()) {
                        Object[] row = new Object[2];

                        row[0] = mother;
                        row[1] = mother.getAge();
                      
                        model.addRow(row);
                    }
                }

            
    public void populateTable2() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (JobCounsellorWorkRequest request : account.getJobWorkQueue().getCouncellorWorkRequestList()) {
            if (request instanceof JobTrainerWorkRequest) {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        refreshTestJButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        BtnMotherProfile = new javax.swing.JButton();
        BtnRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtMessage = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMother = new javax.swing.JTable();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        refreshTestJButton1.setText("Refresh");
        refreshTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButton1ActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        BtnMotherProfile.setText("Manage Candidate(Mother) profile");
        BtnMotherProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMotherProfileActionPerformed(evt);
            }
        });

        BtnRequest.setText("Send to Job Trainer");
        BtnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequestActionPerformed(evt);
            }
        });

        jLabel1.setText("Message :");

        TxtMessage.setColumns(20);
        TxtMessage.setRows(5);
        jScrollPane1.setViewportView(TxtMessage);

        tblMother.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tblMother);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnMotherProfile)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BtnRequest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshTestJButton1)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(BtnRequest)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(BtnMotherProfile)
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButton1ActionPerformed

        //   populateRequestTable1();
    }//GEN-LAST:event_refreshTestJButton1ActionPerformed

    private void BtnMotherProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMotherProfileActionPerformed
         int selectedRow = tblMother.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select row!");
            return;
        }

        Mother mother = (Mother) tblMother.getValueAt(selectedRow, 0);
        
        CandidateProfileJPanel jp = new CandidateProfileJPanel(userProcessContainer, account, organization, enterprise, business,mother);
        userProcessContainer.add("CandidateProfileJPanel", jp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnMotherProfileActionPerformed

    private void BtnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRequestActionPerformed

 int selectedRow = tblMother.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select Mother name!");
            return;
        }

        Mother mother = (Mother) tblMother.getValueAt(selectedRow, 0);
        JobTrainerWorkRequest wr = new JobTrainerWorkRequest();
        wr.setMotherName(mother.getName());
        wr.setMessage(TxtMessage.getText());
        wr.setSender(account);
        wr.setStatus("Sent");

        Organization org = null;

        for (Organization organization :enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof JobTrainerOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getJobWorkQueue().getCouncellorWorkRequestList().add(wr);
            account.getJobWorkQueue().getCouncellorWorkRequestList().add(wr);
        }

        populateTable2();

    }//GEN-LAST:event_BtnRequestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMotherProfile;
    private javax.swing.JButton BtnRequest;
    private javax.swing.JTextArea TxtMessage;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton refreshTestJButton1;
    private javax.swing.JTable tblMother;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
