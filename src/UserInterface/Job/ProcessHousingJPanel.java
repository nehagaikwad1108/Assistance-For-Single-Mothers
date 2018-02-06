/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Job;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HousingEnterprise;
import Business.JobWorkQueue.HousingWorkRequest;
import Business.JobWorkQueue.JobFinderWorkRequest;
import Business.JobWorkQueue.TrackerWorkRequest;
import Business.Network.Network;
import Business.Organization.HousingOrganization;
import Business.Organization.Organization;

import Business.Organization.TrackerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nupur
 */
public class ProcessHousingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessHousingJPanel
     */
      JPanel userProcessContainer; UserAccount account; TrackerOrganization trackerOrganization; Enterprise enterprise; Ecosystem business;JobFinderWorkRequest jobFinderWorkRequest;
    ProcessHousingJPanel(JPanel userProcessContainer, UserAccount account, TrackerOrganization trackerOrganization, Enterprise enterprise, Ecosystem business,JobFinderWorkRequest jobFinderWorkRequest) {
        initComponents();
          this.userProcessContainer= userProcessContainer;
        this.account=account;
        this.trackerOrganization=trackerOrganization;
        this.enterprise=enterprise;
        this.business=business;
        this.jobFinderWorkRequest=jobFinderWorkRequest;
         populateHousingRequestTable();
         txtMessage.setText(String.valueOf(jobFinderWorkRequest.getJobSalary()));
    }
      public void   populateHousingRequestTable(){
        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();

        model.setRowCount(0);

        for (TrackerWorkRequest request : account.getJobWorkQueue().getTrackerWorkRequestList()) {
            if (request instanceof HousingWorkRequest) {
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getMotherName();
               row[2]=request.getJobSalary();
                row[3] = request.getSender().getEmployee().getName();
                row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[5] = request.getStatus();
                row[6] = (( HousingWorkRequest) request).getResult();
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnHousingRequest = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Name", "Salary", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(foodTable);

        jLabel1.setText("Salary");

        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });

        btnHousingRequest.setText("Send To Housing");
        btnHousingRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHousingRequestActionPerformed(evt);
            }
        });

        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnHousingRequest)
                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnHousingRequest)
                .addGap(36, 36, 36)
                .addComponent(btnBack1)
                .addContainerGap(289, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void btnHousingRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHousingRequestActionPerformed
        // TODO add your handling code here:
        HousingWorkRequest fwr = new  HousingWorkRequest();
        fwr.setJobSalary(Float.parseFloat(txtMessage.getText()));
        fwr.setMotherName(jobFinderWorkRequest.getMotherName());
        fwr.setSender(account);
        fwr.setStatus("Sent");
        fwr.setMessage("Send house results!");
        Organization org = null;
        for (Network net :business.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent instanceof HousingEnterprise) {
                    for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof HousingOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }
        }

        if (org != null) {
            org.getJobWorkQueue().getTrackerWorkRequestList().add(fwr);
            account.getJobWorkQueue().getTrackerWorkRequestList().add(fwr);
        }

       populateHousingRequestTable();
    }//GEN-LAST:event_btnHousingRequestActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnHousingRequest;
    private javax.swing.JTable foodTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
