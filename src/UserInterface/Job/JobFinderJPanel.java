package UserInterface.Job;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.JobWorkQueue.JobCounsellorWorkRequest;
import Business.JobWorkQueue.JobFinderWorkRequest;
import Business.JobWorkQueue.JobTrainerWorkRequest;
import Business.JobWorkQueue.TrackerWorkRequest;
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
public class JobFinderJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    JobFinderOrganization jobFinderOrganization;
    Ecosystem business;
    Organization organization;

    public JobFinderJPanel(JPanel userProcessContainer, UserAccount account, JobFinderOrganization jobFinderOrganization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.jobFinderOrganization = jobFinderOrganization;
        this.enterprise = enterprise;
        this.business = business;
         valueLabel.setText(business.getName());
     populateTable1();  
    }

  public void populateTable1() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (JobTrainerWorkRequest request : jobFinderOrganization.getJobWorkQueue().getTrainerWorkRequestList()) {
            //if (request instanceof JobFinderWorkRequest) {
                Object[] row = new Object[9];
                row[0] = request;
                row[1] = request.getMotherNmae();
                row[2] = request.getCourseTaken();
                row[3] = request.getMotherStatus();
                row[4] =  request.getCourseGrades();
                row[5] = request.getSender().getEmployee().getName();
                row[6] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[7] = request.getStatus();
                row[8] = ((JobFinderWorkRequest) request).getResult();

                model.addRow(row);
            //}
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        refreshTestJButton1 = new javax.swing.JButton();
        BtnResponseToTrainer = new javax.swing.JButton();
        btnAddJob = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        refreshTestJButton1.setText("Refresh");
        refreshTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButton1ActionPerformed(evt);
            }
        });

        BtnResponseToTrainer.setText("Respond to Job Trainer");
        BtnResponseToTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResponseToTrainerActionPerformed(evt);
            }
        });

        btnAddJob.setText("Add A Job!!");
        btnAddJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJobActionPerformed(evt);
            }
        });

        jButton2.setText("Find A Job!!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Name", "Course Taken", "Status of Course", "Course Grades", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 583, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddJob)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtnResponseToTrainer)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshTestJButton1)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnResponseToTrainer)
                .addGap(173, 173, 173)
                .addComponent(jButton2)
                .addGap(28, 28, 28)
                .addComponent(btnAddJob)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButton1ActionPerformed

        //   populateRequestTable1();
    }//GEN-LAST:event_refreshTestJButton1ActionPerformed

    private void BtnResponseToTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResponseToTrainerActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select row!");
            return;
        }

        JobFinderWorkRequest request = (JobFinderWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setResult("Request Recieved !!!!");
        request.setStatus("Processing");
        request.setReceiver(account);
        ProcessTrainerJPanel processTrainerJPanel = new ProcessTrainerJPanel(userProcessContainer, request,business);
        userProcessContainer.add("processTrainerJPanel", processTrainerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_BtnResponseToTrainerActionPerformed

    private void btnAddJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJobActionPerformed
        // TODO add your handling code here:
         AddingJobJPanel processTrainerJPanel = new AddingJobJPanel(userProcessContainer, account, jobFinderOrganization, enterprise, business );
        userProcessContainer.add("addingJobJPanel", processTrainerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddJobActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //finding job container
         int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select row!");
            return;
        }

        JobFinderWorkRequest request = (JobFinderWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
         FindingJob processTrainerJPanel = new FindingJob(userProcessContainer, account, jobFinderOrganization, enterprise, business,request );
        userProcessContainer.add("FindingJobJ", processTrainerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnResponseToTrainer;
    private javax.swing.JButton btnAddJob;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
