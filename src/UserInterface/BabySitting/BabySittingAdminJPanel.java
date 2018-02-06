package UserInterface.BabySitting;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Mother.Mother;
import Business.Organization.BabySittingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.BabySitting.CreateEmpBSJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class BabySittingAdminJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    BabySittingOrganization babySittingOrganization;
    Ecosystem business;
    Organization organization;
    Mother mother;
    public BabySittingAdminJPanel(JPanel userProcessContainer, UserAccount account, BabySittingOrganization babySittingOrganization, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        this.business = business;
        this.babySittingOrganization = babySittingOrganization;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = business;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnMngBabySitters = new javax.swing.JButton();
        ServeCustomer = new javax.swing.JButton();
        BtnManageCustProfile = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        BtnMngBabySitters.setText("Manage Babysitters");
        BtnMngBabySitters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMngBabySittersActionPerformed(evt);
            }
        });

        ServeCustomer.setText("Serve Customers");
        ServeCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServeCustomerActionPerformed(evt);
            }
        });

        BtnManageCustProfile.setText("Manage Customers (Mothers)");
        BtnManageCustProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageCustProfileActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText(" Baby Sitting Org:");

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnManageCustProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ServeCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnMngBabySitters, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(BtnManageCustProfile)
                .addGap(36, 36, 36)
                .addComponent(BtnMngBabySitters)
                .addGap(36, 36, 36)
                .addComponent(ServeCustomer)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMngBabySittersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMngBabySittersActionPerformed
        CreateEmpBSJPanel c = new CreateEmpBSJPanel(userProcessContainer, enterprise, babySittingOrganization);
        userProcessContainer.add("CreateEmpBSJPanel", c);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnMngBabySittersActionPerformed

    private void ServeCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServeCustomerActionPerformed
        ServeCustomerJPanel o = new ServeCustomerJPanel(userProcessContainer, enterprise, babySittingOrganization, organization, business);
        userProcessContainer.add("ServeCustomerJPanel", o);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ServeCustomerActionPerformed

    private void BtnManageCustProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageCustProfileActionPerformed
        CustomerJPanel o = new CustomerJPanel(userProcessContainer, enterprise, babySittingOrganization, organization, business);
        userProcessContainer.add("CustomerJPanel", o);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnManageCustProfileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnManageCustProfile;
    private javax.swing.JButton BtnMngBabySitters;
    private javax.swing.JButton ServeCustomer;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
