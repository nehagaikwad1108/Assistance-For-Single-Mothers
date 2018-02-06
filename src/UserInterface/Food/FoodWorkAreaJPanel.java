/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Food;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Food.Food;
import Business.Food.FoodDirectory;
import Business.JobWorkQueue.FoodWorkRequest;
import Business.JobWorkQueue.TrackerWorkRequest;
import Business.Organization.FoodOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEHA
 */
public class FoodWorkAreaJPanel extends javax.swing.JPanel {
    /**
     * Creates new form FoodWorkAreaWorkJPanel
     */
   JPanel userProcessContainer; UserAccount account; FoodOrganization foodOrganization; Enterprise enterprise; Ecosystem business;

    public FoodWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FoodOrganization foodOrganization, Enterprise enterprise, Ecosystem business) {
         initComponents();
    this.userProcessContainer=userProcessContainer;
    this.account=account;
    this.business=business;
    this.enterprise=enterprise;
    this.foodOrganization=foodOrganization;
    populateFoodResponseTable();
   //populateFoodTable();
    }
      public void populateFoodResponseTable() {
        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();

        model.setRowCount(0);

        for (TrackerWorkRequest request : foodOrganization.getJobWorkQueue().getTrackerWorkRequestList()) {
          
                Object[] row = new Object[8];
                row[0] = request;
                row[1] = request.getMotherName();
                row[2] = request.getJobSalary();
                row[3] = request.getSender().getEmployee().getName();
                row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[5] = request.getStatus();
                row[6] = ((FoodWorkRequest) request).getResult();
                row[7] = request.getPrice();   
                model.addRow(row);
            
        }
    }
       /*public void populateFoodTable(){
           DefaultTableModel model = (DefaultTableModel) tblFood.getModel();

        model.setRowCount(0);
            for(Food food : foodOrganization.getFoodDirectory().getFoodList()){
            Object[] row = new Object[4];
            row[0] = food;
            row[1] = food.getMoney();
             row[2] = food.getIngredients();
              row[3] = food.getDiscount();
               model.addRow(row);
        }
       }* 
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcess = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnAddTransport = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnBUY = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFood = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign To me ");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnAddTransport.setText("Add Food");
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

        tblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FoodName", "FoodPrice", "Ingredients", "Discount"
            }
        ));
        jScrollPane1.setViewportView(tblFood);

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
        jScrollPane3.setViewportView(foodTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(0, 178, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
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
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
          int selectedRow = foodTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row!");
            return;
           
        }

        FoodWorkRequest request = (FoodWorkRequest) foodTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ProcessFoodRequestJPanel processFoodRequestJPanel = new ProcessFoodRequestJPanel(userProcessContainer, request,business);
        userProcessContainer.add("processFoodRequestJPanel", processFoodRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
             int selectedRow = foodTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row!");
            return;
        }

        TrackerWorkRequest request = (TrackerWorkRequest) foodTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateFoodResponseTable();

    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnAddTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransportActionPerformed
        // TODO add your handling code here:
        AddFoodJPanel addFood = new AddFoodJPanel(userProcessContainer, foodOrganization,enterprise,business);
        userProcessContainer.add("addFoodJPanel", addFood);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddTransportActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        int selectedRow = foodTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row of request Table!");
            return;

        }
        FoodWorkRequest request = (FoodWorkRequest) foodTable.getValueAt(selectedRow, 0);

        DefaultTableModel model = (DefaultTableModel) tblFood.getModel();
        model.setRowCount(0);
        for(Food foodNames : foodOrganization.getFoodDirectory().getFoodList()){
            if(foodNames.getMoney()<=request.getJobSalary()){
                Object[] row = new Object[4];
                row[0] = foodNames;
                row[1] = foodNames.getMoney();
                row[2] = foodNames.getIngredients();
                row[3] = foodNames.getDiscount();
               
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
          int selectedRow = foodTable.getSelectedRow();
          FoodWorkRequest request = (FoodWorkRequest) foodTable.getValueAt(selectedRow, 0);
        BuyFoodJPanel processFoodRequestJPanel = new BuyFoodJPanel(userProcessContainer, foodOrganization,enterprise,request,business);
        userProcessContainer.add("BuyFoodJPanel", processFoodRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBUYActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTransport;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBUY;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnProcess;
    private javax.swing.JTable foodTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblFood;
    // End of variables declaration//GEN-END:variables
}