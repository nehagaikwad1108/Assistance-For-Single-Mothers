/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Housing;

import UserInterface.Housing.*;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Housing.HousingNames;
import Business.JobWorkQueue.HousingWorkRequest;
import Business.JobWorkQueue.TrackerWorkRequest;

import Business.Organization.HousingOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEHA
 */
public class HousingWorkAreaJPanel extends javax.swing.JPanel {
    /**
     * Creates new form HousingWorkAreaWorkJPanel
     */
   JPanel userProcessContainer; UserAccount account; HousingOrganization housingOrganization; Enterprise enterprise; Ecosystem business;

    public HousingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HousingOrganization housingOrganization, Enterprise enterprise, Ecosystem business) {
         initComponents();
    this.userProcessContainer=userProcessContainer;
    this.account=account;
    this.business=business;
    this.enterprise=enterprise;
    this.housingOrganization=housingOrganization;
    populateHousingResponseTable();
    }
      public void populateHousingResponseTable() {
        DefaultTableModel model = (DefaultTableModel) housingTable.getModel();

        model.setRowCount(0);

        for (TrackerWorkRequest request : housingOrganization.getJobWorkQueue().getTrackerWorkRequestList()) {
          
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getMotherName();
                row[2]=request.getJobSalary();
                row[3] = request.getSender().getEmployee().getName();
                row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[5] = request.getStatus();
                row[6] = ((HousingWorkRequest) request).getResult();
                model.addRow(row);
            
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

        btnProcess = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        housingTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnAddTransport = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnBUY = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHouse = new javax.swing.JTable();

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        housingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(housingTable);

        btnAssign.setText("Assign To me ");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnAddTransport.setText("Add Housing ");
        btnAddTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransportActionPerformed(evt);
            }
        });

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnBUY.setText("BUY");
        btnBUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUYActionPerformed(evt);
            }
        });

        tblHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Housing Name", "Housing Price", "Housing Type", "Housing ID", "Location"
            }
        ));
        jScrollPane1.setViewportView(tblHouse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddTransport)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProcess)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCheck)
                                        .addGap(62, 62, 62)
                                        .addComponent(btnBUY))
                                    .addComponent(btnAssign)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnAssign))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTransport)
                    .addComponent(btnCheck)
                    .addComponent(btnBUY))
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = housingTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row!");
            return;

        }

        HousingWorkRequest request = (HousingWorkRequest) housingTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ProcessHousingRequestJPanel processHousingRequestJPanel = new ProcessHousingRequestJPanel(userProcessContainer, request,business);
        userProcessContainer.add("processHousingRequestJPanel", processHousingRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = housingTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row!");
            return;
        }

        TrackerWorkRequest request = (TrackerWorkRequest) housingTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateHousingResponseTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnAddTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransportActionPerformed
        // TODO add your handling code here:
        AddHousing addHousing = new AddHousing(userProcessContainer, housingOrganization,enterprise,business);
        userProcessContainer.add("addHousing", addHousing);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddTransportActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        int selectedRow = housingTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row of request Table!");
            return;

        }
        HousingWorkRequest request = (HousingWorkRequest) housingTable.getValueAt(selectedRow, 0);

        DefaultTableModel model = (DefaultTableModel) tblHouse.getModel();
        model.setRowCount(0);
        for(HousingNames housingNames : housingOrganization.getHousingNamesDirectory().getHousingNames()){
            if(housingNames.getPrice()<=request.getJobSalary()){
                Object[] row = new Object[5];
                row[0] = housingNames;
                row[1] = housingNames.getPrice();
                row[2] = housingNames.getHousingID();
                row[3] = housingNames.getLocation();
                row[4] = housingNames.getHousingType();

                model.addRow(row);
            }
            else{
                JOptionPane.showMessageDialog(null,"None Available! Try another price range!Inform Tracker!");
                break;
            }

        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnBUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUYActionPerformed
        // TODO add your handling code here:
        int selectedRow = housingTable.getSelectedRow();
        HousingWorkRequest request = (HousingWorkRequest) housingTable.getValueAt(selectedRow, 0);
        BuyHousingJPanel processHousingRequestJPanel = new BuyHousingJPanel(userProcessContainer, housingOrganization,enterprise,request,business);
        userProcessContainer.add("BuyHousingJPanel", processHousingRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBUYActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTransport;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBUY;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnProcess;
    private javax.swing.JTable housingTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblHouse;
    // End of variables declaration//GEN-END:variables
}
