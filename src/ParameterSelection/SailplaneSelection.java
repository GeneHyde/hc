/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ParameterSelection;

import DataObjects.Sailplane;
import DatabaseUtilities.DatabaseDataObjectUtilities;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

/**
 *
 * @author garreola-gutierrez
 */
public class SailplaneSelection extends javax.swing.JPanel {

    /**
     * Creates new form SailplaneSelection
     */
    // Mdl that is first displayed
    DefaultListModel<Sailplane> mdl = new DefaultListModel();
    
    // Array list of Sailplane objects
    Sailplane [] gliderNewList = new Sailplane[3];
    public SailplaneSelection() {
        initComponents();
        
        // For loop to create airfield objects
        /*for(int i = 0; i < gliderNewList.length; i++){
            gliderNewList[i] = new Sailplane();
            gliderNewList[i].setNumber("number"+ i);
            gliderNewList[i].setType("type" +i);
            gliderNewList[i].setOwner("owner" + i);
            gliderNewList[i].setContactInformation("contact"+i);
            gliderNewList[i].setMaximumGrossWeight(i);
            gliderNewList[i].setEmptyWeight(i);
            gliderNewList[i].setIndicatedStallSpeed(i);
            gliderNewList[i].setMaximumWinchingSpeed(i);
            gliderNewList[i].setMaximumAllowableWeakLinkStrength(i);
            gliderNewList[i].setMaximumTension(i);
           
            // Adds new created objects to defaultListModel
            mdl.addElement(gliderNewList[i]);
        }*/
        try {
            for(Sailplane s: DatabaseDataObjectUtilities.getSailplanes())
                mdl.addElement(s);
        } catch(SQLException e) {
            //TODO add handling for exception
            System.out.println("SQLError: " + e.getMessage());
        } catch(ClassNotFoundException e2) {
            //TODO add handling for exception
        }
        // Sets defaultListModel to be the model for jlist 
        sailplaneJList.setModel(mdl);
       
        // Make textfields uneditable
        nNumberTextField.setEditable(false);
        maximumGrossWeightTextField.setEditable(false);
        maximumTensionTextField.setEditable(false);
        maximumAllowableWeakLinkStrengthTextField.setEditable(false);
        emptyWeightTextField.setEditable(false);
        typeTextField.setEditable(false);
        indicatedStallSpeedTextField.setEditable(false);
        maximumWinchingSpeedTextField.setEditable(false);
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        choice3 = new java.awt.Choice();
        jMenuItem1 = new javax.swing.JMenuItem();
        popupMenu1 = new java.awt.PopupMenu();
        gliderInputLabel = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        sailplaneJList = new javax.swing.JList();
        nNumberTextField = new javax.swing.JTextField();
        typeTextField = new javax.swing.JTextField();
        indicatedStallSpeedTextField = new javax.swing.JTextField();
        maximumGrossWeightTextField = new javax.swing.JTextField();
        emptyWeightTextField = new javax.swing.JTextField();
        maximumWinchingSpeedTextField = new javax.swing.JTextField();
        maximumTensionTextField = new javax.swing.JTextField();
        maximumAllowableWeakLinkStrengthTextField = new javax.swing.JTextField();
        ballastOnboardTextField = new javax.swing.JTextField();
        passengersWeightTextField = new javax.swing.JTextField();
        maximumGrossWeightLabel = new javax.swing.JLabel();
        nNumberLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        maximumGrossWeightLabel1 = new javax.swing.JLabel();
        maximumWinchingSpeedLabel = new javax.swing.JLabel();
        maximumTensionLabel = new javax.swing.JLabel();
        maximumAllowableWeakLinkStrengthLabel = new javax.swing.JLabel();
        indicatedStallSpeed = new javax.swing.JLabel();
        sailplaneInputTextField = new javax.swing.JTextField();
        ballastOnboardLabel = new javax.swing.JLabel();
        passengersWeightLabel = new javax.swing.JLabel();

        textField1.setText("textField1");

        jMenuItem1.setText("jMenuItem1");

        popupMenu1.setLabel("popupMenu1");

        gliderInputLabel.setText("Plane N-Number :");

        sailplaneJList.setModel(mdl);
        sailplaneJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sailplaneJListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sailplaneJList);

        nNumberTextField.setEditable(false);
        nNumberTextField.setBackground(new java.awt.Color(255, 105, 105));

        typeTextField.setEditable(false);
        typeTextField.setBackground(new java.awt.Color(255, 105, 105));
        typeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTextFieldActionPerformed(evt);
            }
        });

        indicatedStallSpeedTextField.setEditable(false);
        indicatedStallSpeedTextField.setBackground(new java.awt.Color(255, 105, 105));

        maximumGrossWeightTextField.setEditable(false);
        maximumGrossWeightTextField.setBackground(new java.awt.Color(255, 105, 105));
        maximumGrossWeightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximumGrossWeightTextFieldActionPerformed(evt);
            }
        });

        emptyWeightTextField.setEditable(false);
        emptyWeightTextField.setBackground(new java.awt.Color(255, 105, 105));
        emptyWeightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyWeightTextFieldActionPerformed(evt);
            }
        });

        maximumWinchingSpeedTextField.setEditable(false);
        maximumWinchingSpeedTextField.setBackground(new java.awt.Color(255, 105, 105));
        maximumWinchingSpeedTextField.setText(" ");

        maximumTensionTextField.setEditable(false);
        maximumTensionTextField.setBackground(new java.awt.Color(255, 105, 105));
        maximumTensionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximumTensionTextFieldActionPerformed(evt);
            }
        });

        maximumAllowableWeakLinkStrengthTextField.setEditable(false);
        maximumAllowableWeakLinkStrengthTextField.setBackground(new java.awt.Color(255, 105, 105));

        ballastOnboardTextField.setEditable(false);
        ballastOnboardTextField.setBackground(new java.awt.Color(245, 240, 100));
        ballastOnboardTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ballastOnboardTextFieldKeyReleased(evt);
            }
        });

        passengersWeightTextField.setEditable(false);
        passengersWeightTextField.setBackground(new java.awt.Color(245, 240, 100));
        passengersWeightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersWeightTextFieldActionPerformed(evt);
            }
        });
        passengersWeightTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passengersWeightTextFieldKeyReleased(evt);
            }
        });

        maximumGrossWeightLabel.setText("<html>Empty<br/>Weight</html>");

        nNumberLabel.setText("N-Number");

        typeLabel.setText("Type");

        maximumGrossWeightLabel1.setText("<html>Max Gross <br/>Weight<html>");

        maximumWinchingSpeedLabel.setText("<html>Max Winching <br/>Speed</html>");

        maximumTensionLabel.setText("<html>Maximum <br/>Tension</html>");

        maximumAllowableWeakLinkStrengthLabel.setText("<html>Max Weak <br/>  Link Strenght</html>");

        indicatedStallSpeed.setText("<html>Indicated <br/>Stall Speed</html>");

        sailplaneInputTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sailplaneInputTextFieldKeyReleased(evt);
            }
        });

        ballastOnboardLabel.setText("Ballast");

        passengersWeightLabel.setText("<html>Total <br/>Passenger <br/>Weight</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(gliderInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(sailplaneInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(nNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(maximumTensionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(maximumTensionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(maximumAllowableWeakLinkStrengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(maximumAllowableWeakLinkStrengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(maximumWinchingSpeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(maximumWinchingSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passengersWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(passengersWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maximumGrossWeightLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(maximumGrossWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maximumGrossWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emptyWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ballastOnboardLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ballastOnboardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(indicatedStallSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(indicatedStallSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gliderInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sailplaneInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximumTensionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nNumberLabel)
                            .addComponent(maximumTensionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximumAllowableWeakLinkStrengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeLabel)
                            .addComponent(maximumAllowableWeakLinkStrengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maximumGrossWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicatedStallSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maximumGrossWeightLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indicatedStallSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(emptyWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ballastOnboardLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(maximumGrossWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ballastOnboardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maximumWinchingSpeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengersWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maximumWinchingSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passengersWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sailplaneJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sailplaneJListMouseClicked
        // TODO add your handling code here:
         try {
            // do stuff
            // Gets the object is that selected when the button is pushed
            // fills the parts of the object to the right jtextfields
            if(mdl.getSize() > 0){
                Sailplane value = (Sailplane) sailplaneJList.getSelectedValue();
                nNumberTextField.setText(value.getNumber());
                typeTextField.setText(value.getType());
                maximumGrossWeightTextField.setText(String.valueOf(value.getMaximumGrossWeight()));
                emptyWeightTextField.setText(String.valueOf(value.getEmptyWeight()));
                maximumWinchingSpeedTextField.setText(String.valueOf(value.getMaximumWinchingSpeed()));
                maximumTensionTextField.setText(String.valueOf(value.getMaximumTension()));
                maximumAllowableWeakLinkStrengthTextField.setText(String.valueOf(value.getMaximumAllowableWeakLinkStrength()));
                indicatedStallSpeedTextField.setText(String.valueOf(value.getIndicatedStallSpeed()));
            }
                
            // Checks if jTextfields are empty and changes background 
            // of jtextfield if filled
            if(!(nNumberTextField.getText().equals(""))){
                nNumberTextField.setBackground(new Color(142, 250, 127));       
            }

            if(!(typeTextField.getText().equals(""))){
                typeTextField.setBackground(new Color(142, 250, 127));  
            }
            if(!(indicatedStallSpeedTextField.getText().equals(""))){
                indicatedStallSpeedTextField.setBackground(new Color(142, 250, 127));
            }

            if(!(maximumGrossWeightTextField.getText().equals(""))){
                maximumGrossWeightTextField.setBackground(new Color(142, 250, 127));       
            }
            if(!(emptyWeightTextField.getText().equals(""))){
                emptyWeightTextField.setBackground(new Color(142, 250, 127)); 
            }
            if(!(maximumWinchingSpeedTextField.getText().equals(""))){
                maximumWinchingSpeedTextField.setBackground(new Color(142, 250, 127));
            }
            if(!(maximumTensionTextField.getText().equals(""))){
                maximumTensionTextField.setBackground(new Color(142, 250, 127));
            }
            if(!(maximumAllowableWeakLinkStrengthTextField.getText().equals(""))){
                maximumAllowableWeakLinkStrengthTextField.setBackground(new Color(142, 250, 127));
         
            }
            
            passengersWeightTextField.setEditable(true);
            ballastOnboardTextField.setEditable(true);
        }
        catch (Exception e) {
            //TODO add logic for what 
        }
    }//GEN-LAST:event_sailplaneJListMouseClicked

    private void passengersWeightTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengersWeightTextFieldKeyReleased
        // TODO add your handling code here:
        try{
            int numPassengers = Integer.parseInt(passengersWeightTextField.getText());
            if(numPassengers > 0) {
                passengersWeightLabel.setVisible(true);
                passengersWeightTextField.setVisible(true);
                passengersWeightTextField.setBackground(new Color(142, 250, 127));
            }
            passengersWeightTextField.setBackground(new Color(142, 250, 127));
        }catch(NumberFormatException e) {
            passengersWeightTextField.setBackground(new Color(142, 250, 127));
            passengersWeightLabel.setVisible(false);
            passengersWeightTextField.setVisible(false);
        }
    }//GEN-LAST:event_passengersWeightTextFieldKeyReleased

    private void ballastOnboardTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ballastOnboardTextFieldKeyReleased
        // TODO add your handling code here:
        try {
            int passengersWeight = Integer.parseInt(ballastOnboardTextField.getText());
            ballastOnboardTextField.setBackground(new Color(142, 250, 127));
        }catch(NumberFormatException e) {
            ballastOnboardTextField.setBackground(new Color(245, 240, 100));
        }
    }//GEN-LAST:event_ballastOnboardTextFieldKeyReleased

    private void sailplaneInputTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sailplaneInputTextFieldKeyReleased
        // TODO add your handling code here:
        String matchString = sailplaneInputTextField.getText();
        DefaultListModel<Sailplane> tempModel = new DefaultListModel<>();
        
        for(Sailplane s : gliderNewList) {
            if(s.getNumber().startsWith(matchString))
                tempModel.addElement(s);
        }
        
        sailplaneJList.setModel(tempModel);
    }//GEN-LAST:event_sailplaneInputTextFieldKeyReleased

    private void typeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeTextFieldActionPerformed

    private void maximumGrossWeightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximumGrossWeightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maximumGrossWeightTextFieldActionPerformed

    private void emptyWeightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyWeightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emptyWeightTextFieldActionPerformed

    private void passengersWeightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersWeightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengersWeightTextFieldActionPerformed

    private void maximumTensionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximumTensionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maximumTensionTextFieldActionPerformed

public Sailplane getSelectedPlane() {
    if(sailplaneJList.getSelectedIndex() >= 0)
        return gliderNewList[sailplaneJList.getSelectedIndex()];
    return null;
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ballastOnboardLabel;
    private javax.swing.JTextField ballastOnboardTextField;
    private java.awt.Choice choice3;
    private javax.swing.JTextField emptyWeightTextField;
    private java.awt.Label gliderInputLabel;
    private javax.swing.JLabel indicatedStallSpeed;
    private javax.swing.JTextField indicatedStallSpeedTextField;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maximumAllowableWeakLinkStrengthLabel;
    private javax.swing.JTextField maximumAllowableWeakLinkStrengthTextField;
    private javax.swing.JLabel maximumGrossWeightLabel;
    private javax.swing.JLabel maximumGrossWeightLabel1;
    private javax.swing.JTextField maximumGrossWeightTextField;
    private javax.swing.JLabel maximumTensionLabel;
    private javax.swing.JTextField maximumTensionTextField;
    private javax.swing.JLabel maximumWinchingSpeedLabel;
    private javax.swing.JTextField maximumWinchingSpeedTextField;
    private javax.swing.JLabel nNumberLabel;
    private javax.swing.JTextField nNumberTextField;
    private javax.swing.JLabel passengersWeightLabel;
    private javax.swing.JTextField passengersWeightTextField;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField sailplaneInputTextField;
    private javax.swing.JList sailplaneJList;
    private java.awt.TextField textField1;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField typeTextField;
    // End of variables declaration//GEN-END:variables
}
