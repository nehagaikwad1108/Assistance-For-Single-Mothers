package UserInterface.SystemAdminWorkArea;

import Business.Ecosystem;
import Business.Mother.Mother;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author RIDDHI
 */
public class NextDirectoryJPanel extends javax.swing.JPanel {

    private Ecosystem business;
    private JPanel userProcessContainer;
    private Mother mother;

    public NextDirectoryJPanel(JPanel userProcessContainer, Ecosystem business, Mother mother) {
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.mother = mother;

        initComponents();

        TxtJ.setText(mother.getJobStatus());
        Txtcou.setText(mother.getJobCounsellingStatus());
        Txtt.setText(mother.getJobTrainingStatus());
        Wx.setText(mother.getWorkExperience());
        lblCourseName.setText(mother.getCourseName()); lblCourseStatus.setText(mother.getCourseStatus());
  /*     TxtEdu.setText("Education level:" + mother.getEducationLevel() + "\n" + mother.getSchoolEducation()
                + " " + mother.getEducation()
                + "\n" + mother.getProfessionalDegree()
                + "\n" + mother.getVocationalCertificates() + "\n" + mother.getCertificates());*/

       
        TxtHTF.setText(" " + mother.getHouseName() + "\n House Price:" + mother.getHousePrice());
        transportStatus.setText(mother.getTransportStatus());
        housingStatus.setText(mother.getHouseStatus());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton3 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        TxtJ = new javax.swing.JLabel();
        Txtcou = new javax.swing.JLabel();
        Txtt = new javax.swing.JLabel();
        Wx = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        Wx2 = new javax.swing.JLabel();
        lblCourseStatus = new javax.swing.JLabel();
        Wx3 = new javax.swing.JLabel();
        lblFOI = new javax.swing.JLabel();
        Wx4 = new javax.swing.JLabel();
        lblDreamSalary = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lblApt = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        lblStart = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        Wx5 = new javax.swing.JLabel();
        Wx6 = new javax.swing.JLabel();
        Wx7 = new javax.swing.JLabel();
        Wx8 = new javax.swing.JLabel();
        TxtHTF = new javax.swing.JLabel();
        housingStatus = new javax.swing.JLabel();
        transportStatus = new javax.swing.JLabel();

        backJButton3.setText("Back");
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel67.setText("Job Details :");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel68.setText("Job status:");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel69.setText("Job Details :");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel72.setText("Housing , Transport & Food :");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel73.setText("Councelling Status:");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel74.setText("Training Status:");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel75.setText("Work Experience :");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel76.setText("Course Name:");

        TxtJ.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TxtJ.setText("<Job status>");

        Txtcou.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Txtcou.setText("<Councelling Status>");

        Txtt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Txtt.setText("<Training Status>");

        Wx.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wx.setText("<Training Status>");

        lblCourseName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCourseName.setText("<Course Name>");

        Wx2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wx2.setText("Course Status");

        lblCourseStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCourseStatus.setText("<Course Status>");

        Wx3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        lblFOI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblFOI.setText("<Field of Interest>");

        Wx4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wx4.setText("Expected Salary");

        lblDreamSalary.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDreamSalary.setText("<Dream Salary>");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel71.setText("Job Salary:");

        lblSalary.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSalary.setText("<Job Salary>");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel77.setText("Aptitude Test Result:");

        lblApt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblApt.setText("<Aptitude Test Result>");

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel78.setText("Course Start Date");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        lblStart.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblStart.setText("<Course Start Date>");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel81.setText("Course End Date");

        lblEnd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEnd.setText("<Course  End Date>");

        Wx5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wx5.setText("Field of Interest ");

        Wx6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wx6.setText("housing status ");

        Wx7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wx7.setText("transport status:");

        Wx8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wx8.setText("hose name & price ");

        TxtHTF.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TxtHTF.setText("<Dream Salary>");

        housingStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        housingStatus.setText("<Dream Salary>");

        transportStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        transportStatus.setText("<Dream Salary>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel73)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76)
                            .addComponent(Wx2)
                            .addComponent(Wx4)
                            .addComponent(Wx5))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtJ)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel71))
                                    .addComponent(lblCourseName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Txtt)
                                            .addComponent(Txtcou))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel77)
                                            .addComponent(jLabel81)
                                            .addComponent(jLabel78)))
                                    .addComponent(Wx))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79)
                                    .addComponent(lblApt)
                                    .addComponent(lblSalary)
                                    .addComponent(lblStart)
                                    .addComponent(lblEnd))
                                .addContainerGap(198, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFOI)
                                    .addComponent(lblCourseStatus)
                                    .addComponent(lblDreamSalary))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton3)
                                .addGap(315, 315, 315)
                                .addComponent(jLabel69))
                            .addComponent(jLabel67)
                            .addComponent(jLabel72)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Wx8)
                                .addGap(26, 26, 26)
                                .addComponent(TxtHTF))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Wx7)
                                    .addComponent(Wx6))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(housingStatus)
                                    .addComponent(transportStatus))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Wx3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton3)
                    .addComponent(jLabel69))
                .addGap(36, 36, 36)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(TxtJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(Txtcou))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(Txtt)
                            .addComponent(jLabel78))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Wx)
                                .addComponent(jLabel81)
                                .addComponent(lblEnd)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCourseName)
                                .addComponent(jLabel79)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Wx2)
                            .addComponent(lblCourseStatus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFOI)
                            .addComponent(Wx5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(lblApt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStart)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Wx4)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Wx7)
                            .addComponent(transportStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Wx6)
                            .addComponent(housingStatus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Wx8)
                            .addComponent(TxtHTF))
                        .addGap(18, 18, 18)
                        .addComponent(Wx3)
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDreamSalary)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel ba = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxtHTF;
    private javax.swing.JLabel TxtJ;
    private javax.swing.JLabel Txtcou;
    private javax.swing.JLabel Txtt;
    private javax.swing.JLabel Wx;
    private javax.swing.JLabel Wx2;
    private javax.swing.JLabel Wx3;
    private javax.swing.JLabel Wx4;
    private javax.swing.JLabel Wx5;
    private javax.swing.JLabel Wx6;
    private javax.swing.JLabel Wx7;
    private javax.swing.JLabel Wx8;
    private javax.swing.JButton backJButton3;
    private javax.swing.JLabel housingStatus;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel lblApt;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCourseStatus;
    private javax.swing.JLabel lblDreamSalary;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblFOI;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel transportStatus;
    // End of variables declaration//GEN-END:variables
}
