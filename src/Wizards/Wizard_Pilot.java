/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wizards;

import DataObjects.Pilot;
import ParameterSelection.Capability;
import ParameterSelection.Preference;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Matt
 */
public class Wizard_Pilot extends Wizard {
    
    /**
     * Creates new form Wizard_Pilot
     */
    public Wizard_Pilot() {
        super();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windowLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        try {
            pilotRequiredPanel2 = new PilotRequiredPanel();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Wizard_Pilot.class.getName()).log(Level.SEVERE, null, ex);
        }
        pilotOptionalPanel2 = new PilotOptionalPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        windowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        windowLabel.setText("Pilot Data Entry Wizard");

        submitButton.setText("Submit");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitButtonMousePressed(evt);
            }
        });

        jTabbedPane1.addTab("Required Info", pilotRequiredPanel2);
        jTabbedPane1.addTab("Optional Info", pilotOptionalPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(windowLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(submitButton)))
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowLabel)
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addGap(16, 16, 16))
        );

        pack();
    }
    private void submitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMousePressed
        if(pilotRequiredPanel2.isComplete())
        {
            submitData();
        }
            
    }//GEN-LAST:event_submitButtonMousePressed

    protected void submitData(){
        String firstName = pilotRequiredPanel2.getPilotFirstName();
        String lastName = pilotRequiredPanel2.getPilotLastName();
        String middleName = pilotRequiredPanel2.getPilotMiddleName();
        int weight = 0;
        try {
            weight = (int) ((int) pilotRequiredPanel2.getWeight() * (1 / Configuration.UnitConversionRate.convertWeightUnitIndexToFactor(DatabaseUtilities.DatabaseUnitSelectionUtilities.getPilotWeightUnit())));
        } catch (ClassNotFoundException e1) {
            
        }
        String capability = Capability.convertCapabilityNumToString(pilotRequiredPanel2.getCapability());
        String preference = Preference.convertPreferenceNumToString(pilotRequiredPanel2.getPreference());
        
        Pilot newPilot = new Pilot(lastName, firstName, middleName, weight, capability, preference, "", "");
        try{
            DatabaseUtilities.DatabaseDataObjectUtilities.addPilotToDB(newPilot);
            JOptionPane.showMessageDialog(rootPane, "Submission successfully saved.");
            this.dispose();
        }catch(SQLException e1) {
            //TODO Report error
            if(e1.getErrorCode() == 30000) 
                JOptionPane.showMessageDialog(rootPane, "Sorry, but the pilot " + firstName + " " + lastName + " already exists in the database");
        }catch (ClassNotFoundException e2) {
            //TODO Report error
            JOptionPane.showMessageDialog(rootPane, "Error: No access to database currently. Please try again later.");
                    
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Wizard_Pilot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wizard_Pilot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wizard_Pilot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wizard_Pilot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wizard_Pilot().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private PilotOptionalPanel pilotOptionalPanel2;
    private PilotRequiredPanel pilotRequiredPanel2;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel windowLabel;
    // End of variables declaration//GEN-END:variables
}
