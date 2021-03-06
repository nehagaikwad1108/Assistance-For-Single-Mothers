/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Food;

import Business.Ecosystem;
import UserInterface.Food.*;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodEnterprise;
import Business.Enterprise.JobCentreEnterprise;
import Business.Mother.Mother;
import Business.Organization.FoodOrganization;
import Business.Organization.FoodOrganization;
import Business.Food.Food;
import Business.JobWorkQueue.FoodWorkRequest;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nupur
 */
public class BuyFoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BuyFoodJPanel
     */
    
JPanel userProcessContainer; FoodOrganization foodOrganization; Enterprise enterprise;FoodWorkRequest foodWorkRequest;Ecosystem business;
    BuyFoodJPanel(JPanel userProcessContainer, FoodOrganization foodOrganization, Enterprise enterprise,FoodWorkRequest foodWorkRequest,Ecosystem business) {
       initComponents();
       this.enterprise=enterprise;
       this.userProcessContainer=userProcessContainer;
       this.foodOrganization=foodOrganization;
       this.foodWorkRequest=foodWorkRequest;
       this.business=business;
       populateMotherTable();
       populateFoodTable();
       txtMotherName.setText(foodWorkRequest.getMotherName());
       
    }

   
        
    public void populateMotherTable(){
        DefaultTableModel model = (DefaultTableModel) tblMother.getModel();

        model.setRowCount(0);
            for(Mother mother : business.getMotherDirectory().getMotherList()){
            Object[] row = new Object[2];
            row[0] = mother;
              row[1] = mother.getAge();
              //row[2] = mother.getMotherStatus();
               model.addRow(row);
        }
    }
      public void populateFoodTable(){
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
       } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMother = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        txtIngredients = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtFoodName = new javax.swing.JTextField();
        btnBuy = new javax.swing.JButton();
        btnSelectMother = new javax.swing.JButton();
        btnTransport = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFood = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        tblMother.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age"
            }
        ));
        jScrollPane2.setViewportView(tblMother);

        jLabel1.setText("Client Name: ");

        jLabel2.setText("Food Name:");

        jLabel3.setText("Ingredients");

        jLabel4.setText("Discount");

        jLabel5.setText("Price");

        txtClientName.setEditable(false);

        txtIngredients.setEditable(false);

        txtDiscount.setEditable(false);
        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });

        txtPrice.setEditable(false);

        txtFoodName.setEditable(false);

        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnSelectMother.setText("SelectMother");
        btnSelectMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectMotherActionPerformed(evt);
            }
        });

        btnTransport.setText("Select Food");
        btnTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportActionPerformed(evt);
            }
        });

        tblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FoodName", "FoodPrice", "Ingredients", "Discount"
            }
        ));
        jScrollPane4.setViewportView(tblFood);

        jLabel6.setText("Mother Name :");

        txtMotherName.setEditable(false);

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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnBuy)
                                .addGap(187, 187, 187)
                                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransport)
                            .addComponent(btnSelectMother))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnSelectMother)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIngredients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBuy)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack1)
                        .addGap(32, 32, 32))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectMotherActionPerformed
        // TODO add your handling code here:
     int selectedRow = tblMother.getSelectedRow();
     
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row!");
            return;
           
        }
    Mother mother = (Mother) tblMother.getValueAt(selectedRow, 0);
     txtClientName.setText(mother.getName());
    }//GEN-LAST:event_btnSelectMotherActionPerformed

    private void btnTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblFood.getSelectedRow();
     
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select row!");
            return;
           
        }
        Food food = (Food) tblFood.getValueAt(selectedRow, 0);
       txtFoodName.setText(food.getFoodName());
       txtDiscount.setText(String.valueOf(food.getDiscount()));
       txtIngredients.setText(food.getIngredients());
       txtPrice.setText(String.valueOf(food.getMoney()));
    }//GEN-LAST:event_btnTransportActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here: int selectedRow = foodTable.getSelectedRow();
    
        int index = business.getMotherDirectory().getMotherIndex(txtClientName.getText());
        business.getMotherDirectory().getMotherList().get(index).setFoodName(txtFoodName.getText());
         business.getMotherDirectory().getMotherList().get(index).setFoodPrice(txtPrice.getText());
          business.getMotherDirectory().getMotherList().get(index).setFoodStatus("Bought");
             
                 int index1 = business.getMotherDirectory().getMotherIndex(txtMotherName.getText());
                    business.getMotherDirectory().getMotherList().get(index1).setFoodName(txtFoodName.getText());
         business.getMotherDirectory().getMotherList().get(index1).setFoodPrice(txtPrice.getText());
          business.getMotherDirectory().getMotherList().get(index1).setFoodStatus("Bought"); 
                
           
               
      
        
    }//GEN-LAST:event_btnBuyActionPerformed

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnSelectMother;
    private javax.swing.JButton btnTransport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tblFood;
    private javax.swing.JTable tblMother;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtIngredients;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
