/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import HealthClub.DocVisit;
import HealthClub.Patient;
import HealthClub.VitalSigns;
import HealthClub.HealthSystem;


/**
 *
 * @author ruthwiksoudry
 */
public class CreatePatient extends javax.swing.JPanel {
    
    HealthSystem system;
    
    public CreatePatient(HealthSystem system) {
        initComponents();
        this.system =  system;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        lblPatient = new javax.swing.JLabel();
        txtHouseNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtheartRate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        lblHeartRate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtResp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblNameERR = new javax.swing.JLabel();
        lblLastERR = new javax.swing.JLabel();
        lblDOBERR = new javax.swing.JLabel();
        lblHouseErr = new javax.swing.JLabel();
        lblCommERR = new javax.swing.JLabel();
        lblCityErr = new javax.swing.JLabel();
        lblBPErr = new javax.swing.JLabel();
        lblweightErr = new javax.swing.JLabel();
        lblHrErr1 = new javax.swing.JLabel();
        lblrrErr1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(218, 223, 225));

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Date of Birth :");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Community :");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("City :");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("House Number :");

        txtFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFnameKeyPressed(evt);
            }
        });

        txtLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLnameKeyPressed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        txtDOB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDOBKeyPressed(evt);
            }
        });

        lblPatient.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblPatient.setText("Create Patient");

        txtHouseNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHouseNumKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("First Name :");

        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCommunityKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Last Name :");

        txtheartRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtheartRateKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Blood Pressure :");

        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBPKeyPressed(evt);
            }
        });

        lblHeartRate.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblHeartRate.setText("Heart Rate :");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Respiratory Rate:");

        txtResp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRespKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("Weight :");

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWeightKeyPressed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSave.setText("SUBMIT");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(lblHeartRate)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtheartRate)
                                    .addComponent(txtResp)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFname)
                            .addComponent(txtLname)
                            .addComponent(txtDOB)
                            .addComponent(txtHouseNum)
                            .addComponent(txtCommunity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNameERR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLastERR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDOBERR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHouseErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCommERR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBPErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCityErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblweightErr, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(lblHrErr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(lblrrErr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameERR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastERR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDOBERR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtHouseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseErr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommERR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCityErr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lblBPErr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHrErr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtheartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHeartRate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblrrErr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblweightErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(84, 84, 84)
                .addComponent(btnSave)
                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
             if(txtHouseNum.getText().equals("") || txtFname.getText().equals("") || txtDOB.getText().equals("")
                || txtLname.getText().equals("") || txtCommunity.getText().equals("") || txtCity.getText().equals("")
                || txtBP.getText().equals("") || txtWeight.getText().equals("") || txtResp.getText().equals("")
                || txtheartRate.getText().equals("")) 
            {
              
             JOptionPane.showMessageDialog(this, "Please Enter all the fields");
              return;
            }    
            

            String community = txtCommunity.getText();
            String city = txtCity.getText();
            String firstName = txtFname.getText();
            String lastName = txtLname.getText();
            String houseNumber = txtHouseNum.getText();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate dateOfBirth = LocalDate.parse(txtDOB.getText(), dateFormatter);
            LocalDate dateFormat = dateOfBirth;           
            Patient patient = new Patient(firstName, lastName, dateFormat, houseNumber, community, city, system.getPatientDirectory().size(), system.getPersonDirectory().size());
            
            system.addPatient(patient);
            JOptionPane.showMessageDialog(this, "Added patient to the record !!");
            
         txtFname.setText("");
         txtLname.setText("");
         txtCommunity.setText("");
         txtCity.setText("");
         txtHouseNum.setText("");
         txtDOB.setText("");
         txtBP.setText("");
         txtWeight.setText("");
         txtResp.setText("");
         txtheartRate.setText("");
        
         
                    
        DocVisit docEncounter = null;
        VitalSigns vitals = new VitalSigns();
        vitals.setbloodPressure(Integer.parseInt(txtBP.getText()));
        vitals.setHeartRate(Integer.parseInt(txtheartRate.getText()));
        vitals.setWeightInKilos(Float.parseFloat(txtWeight.getText()));
        vitals.setRespiratoryRate(Integer.parseInt(txtResp.getText()));
        docEncounter = new DocVisit(vitals);
         patient.getEncounterHistory().storedEncounters(docEncounter);

        system.addPatient(patient);
        JOptionPane.showMessageDialog(this, "New patient Record Added !!");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameKeyPressed

    private void txtLnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtLnameKeyPressed

    private void txtDOBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDOBKeyPressed

        // TODO add your handling code here:
        
        //adding date valid date check
        char dateEntered = evt.getKeyChar();
        if(Character.isAlphabetic(dateEntered)){
            txtDOB.setEditable(false);
            lblDOBERR.setText("Please enter a valid date format (mm/dd/yyyy) !!");
        }
        else {
            txtDOB.setEditable(true);
            lblDOBERR.setText("");
        }
    }//GEN-LAST:event_txtDOBKeyPressed

    private void txtHouseNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHouseNumKeyPressed
        // TODO add your handling code here:
        
        char houseEntered = evt.getKeyChar();
        if(Character.isAlphabetic(houseEntered)){
            txtHouseNum.setEditable(false);
            lblHouseErr.setText("Please enter only numerical values !!");
        }
        else {
            txtHouseNum.setEditable(true);
            lblHouseErr.setText("");
        }
    }//GEN-LAST:event_txtHouseNumKeyPressed

    private void txtCommunityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityKeyPressed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityKeyPressed

    private void txtBPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyPressed
        // TODO add your handling code here:
        
         //adding only numerical value check
        char BPEntered = evt.getKeyChar();
        if(Character.isAlphabetic(BPEntered)){
            txtBP.setEditable(false);
            lblBPErr.setText("Please enter only numerical values !!");
        }
        else {
            txtBP.setEditable(true);
            lblBPErr.setText("");
        }
    }//GEN-LAST:event_txtBPKeyPressed

    private void txtheartRateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtheartRateKeyPressed
        // TODO add your handling code here:
        
        //adding only numerical value check
        char HREntered = evt.getKeyChar();
        if(Character.isAlphabetic(HREntered)){
            txtheartRate.setEditable(false);
            lblHrErr1.setText("Please enter only numerical values !!");
        }
        else {
            txtheartRate.setEditable(true);
            lblHrErr1.setText("");
        }
    }//GEN-LAST:event_txtheartRateKeyPressed

    private void txtRespKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespKeyPressed
        // TODO add your handling code here:
        
        //adding only numerical value check
        char RREntered = evt.getKeyChar();
        if(Character.isAlphabetic(RREntered)){
            txtResp.setEditable(false);
            lblrrErr1.setText("Please enter only numerical values !!");
        }
        else {
            txtResp.setEditable(true);
            lblrrErr1.setText("");
        }
    }//GEN-LAST:event_txtRespKeyPressed

    private void txtWeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyPressed
        // TODO add your handling code here:
        
        //adding only numerical value check
        char WeightPressed = evt.getKeyChar();
        if(Character.isAlphabetic(WeightPressed)){
            txtWeight.setEditable(false);
            lblweightErr.setText("Please enter only numerical values !!");
        }
        else {
            txtWeight.setEditable(true);
            lblweightErr.setText("");
        }
        
    }//GEN-LAST:event_txtWeightKeyPressed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBPErr;
    private javax.swing.JLabel lblCityErr;
    private javax.swing.JLabel lblCommERR;
    private javax.swing.JLabel lblDOBERR;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHouseErr;
    private javax.swing.JLabel lblHrErr1;
    private javax.swing.JLabel lblLastERR;
    private javax.swing.JLabel lblNameERR;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblrrErr1;
    private javax.swing.JLabel lblweightErr;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHouseNum;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtResp;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtheartRate;
    // End of variables declaration//GEN-END:variables
}