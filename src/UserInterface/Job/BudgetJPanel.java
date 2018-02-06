package UserInterface.Job;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Mother.Mother;
import Business.Mother.MotherDirectory;
import Business.Organization.JobCentre.*;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class BudgetJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private Ecosystem business;
  private String motherName;
  
    public BudgetJPanel(JPanel userProcessContainer, Enterprise enterprise, String motherName,Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.motherName=motherName;
        // valueLabel.setText(business.getName());
      //  TxtMotherId.setEnabled(false);
        TxtName.setText(motherName);
     this.business=business;      
    }

    
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnCalculate = new javax.swing.JButton();
        TxtRent = new javax.swing.JTextField();
        txtPersonalExpenses = new javax.swing.JTextField();
        TxtMedicalExpenses = new javax.swing.JTextField();
        TxtTravellingExpenses = new javax.swing.JTextField();
        TxtPhoneWifi = new javax.swing.JTextField();
        TxtElec = new javax.swing.JTextField();
        TxtChildrenSchool = new javax.swing.JTextField();
        TxtGroceries = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        BtnContinue = new javax.swing.JButton();
        TxtSaving = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        TxtName = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Monthly Analyse Budget");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Amount spent on rent ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Amount spent on Groceries");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Amount on children's schools");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Electricity");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Phone & Wifi");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Travelling expenses");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Medical expenses");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Personal Expenses");

        BtnCalculate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCalculate.setText("Calculate");
        BtnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalculateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Mother Name :");

        BtnContinue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnContinue.setText("See Results!!");
        BtnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinueActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Savings");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        TxtName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtName.setText("Mother Name :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(backJButton)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtGroceries, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtChildrenSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtElec, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtRent, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPhoneWifi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTravellingExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtMedicalExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPersonalExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCalculate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(BtnContinue))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtName)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtName))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtGroceries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtChildrenSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtElec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtPhoneWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtTravellingExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(TxtSaving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCalculate)
                            .addComponent(backJButton)
                            .addComponent(BtnContinue)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtMedicalExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPersonalExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalculateActionPerformed

        /*
        take the value of personal exp/(TOTAL OF ALL INPUT fields) compare with 0.07
        new job amount =
         */
        try{
         for(Mother mother : business.getMotherDirectory().getMotherList()){
          if(mother.getName().equals(motherName)){    
       
       
         int index =business.getMotherDirectory().getMotherIndex(mother.getName());
         
        float rent = Float.parseFloat(TxtRent.getText());
        float groceries = Float.parseFloat(TxtGroceries.getText());
        float school =  Float.parseFloat(TxtChildrenSchool.getText());
        float electricity =  Float.parseFloat(TxtElec.getText());
        float phone = Float.parseFloat(TxtPhoneWifi.getText());
        float travelExpense = Float.parseFloat(TxtTravellingExpenses.getText());
        float medExpense =  Float.parseFloat(TxtMedicalExpenses.getText());
        float personalExpense= Float.parseFloat(txtPersonalExpenses.getText());
        float savings = Float.parseFloat(TxtSaving.getText());
         JOptionPane.showMessageDialog(null, "Calculated successfully!");
        float totalExpense = rent+groceries+school+electricity+phone+travelExpense+medExpense+personalExpense+savings;
        float dreamJobSal= (float) (1.3*totalExpense);
       business.getMotherDirectory().getMotherList().get(index).setDreamJobSal(dreamJobSal);
        
        
        if(rent>=600){
              business.getMotherDirectory().getMotherList().get(index).setRentAlert("You are exceeding your rent!");
                 }  else {
            business.getMotherDirectory().getMotherList().get(index).setRentAlert("You are NOT exceeding your rent!");
        }
        if(groceries>=100){
            business.getMotherDirectory().getMotherList().get(index).setGroceriesAlert("You are exceding your groceries! ");
        }
        else {
            business.getMotherDirectory().getMotherList().get(index).setRentAlert("You are NOT exceeding your groceries limit!");
        }
        
        if(phone>30){
           business.getMotherDirectory().getMotherList().get(index).setPhoneAlert("You are exceding your phone bills");
        }
        else {
            business.getMotherDirectory().getMotherList().get(index).setRentAlert("You are NOT exceeding your phone bills!");
        }
        
        if(personalExpense>100){
            business.getMotherDirectory().getMotherList().get(index).setPersonalExpenseAlert("You are exceding your personal Expenses");
          }
        else {
            business.getMotherDirectory().getMotherList().get(index).setRentAlert("You are NOT exceeding your personal expenses!");
        }
          if(savings/totalExpense<0.3){
             business.getMotherDirectory().getMotherList().get(index).setSavingsAlert("You need to increase your savings");
          }
          else {
            business.getMotherDirectory().getMotherList().get(index).setRentAlert("Great job!");
        }
          }
        }
         }
        catch(Exception e){
       JOptionPane.showMessageDialog(null,"Enter valid input");
       System.out.println(e);
        }
    }//GEN-LAST:event_BtnCalculateActionPerformed

    private void BtnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinueActionPerformed
        try {
            /*int id = Integer.parseInt(TxtCustID.getText());
            client = clientDir.addClient();
            mother = mDir.searchMotherByID(id);*/
            String name = TxtName.getText();
            DreamSalaryPanel dsjp = new DreamSalaryPanel(userProcessContainer, enterprise,motherName,business);
        userProcessContainer.add("DreamSalaryJPanel", dsjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
           // candidate = candidateDir.searchByName(name);
           // TxtMotherId.setText(String.valueOf(candidate.getMother().getMotherID()));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_BtnContinueActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalculate;
    private javax.swing.JButton BtnContinue;
    private javax.swing.JTextField TxtChildrenSchool;
    private javax.swing.JTextField TxtElec;
    private javax.swing.JTextField TxtGroceries;
    private javax.swing.JTextField TxtMedicalExpenses;
    private javax.swing.JLabel TxtName;
    private javax.swing.JTextField TxtPhoneWifi;
    private javax.swing.JTextField TxtRent;
    private javax.swing.JTextField TxtSaving;
    private javax.swing.JTextField TxtTravellingExpenses;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtPersonalExpenses;
    // End of variables declaration//GEN-END:variables
}
