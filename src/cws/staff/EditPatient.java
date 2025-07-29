package cws.staff;

import cws.DBC.DBConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudhir Kushwaha
 */
public class EditPatient extends javax.swing.JFrame {

    ResultSet resultSet = null;
    Connection connection = null;

    public EditPatient() {
        initComponents();
        showPatientIDs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidnumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboPatientDocument = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combopatientid = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 78, 135));
        jLabel2.setText("Patient  Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 130, -1));

        txtidnumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtidnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 300, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 78, 135));
        jLabel3.setText("Patient  ID Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 170, -1));

        comboPatientDocument.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboPatientDocument.setForeground(new java.awt.Color(39, 78, 135));
        comboPatientDocument.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AADHAR CARD", "PAN CARD" }));
        jPanel1.add(comboPatientDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 300, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(39, 78, 135));
        jLabel4.setText("  Identity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 80, -1));

        jPanel3.setBackground(new java.awt.Color(39, 78, 135));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cancel");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Edit Patient Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(39, 78, 135));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 60, -1));

        combopatientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopatientidActionPerformed(evt);
            }
        });
        jPanel1.add(combopatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 300, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(39, 78, 135));
        jLabel5.setText("Mobile Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(39, 78, 135));
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 80, 28));

        txtaddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 300, 30));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 300, 30));

        txtmobile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmobileKeyTyped(evt);
            }
        });
        jPanel1.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 300, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 78, 135));
        jLabel1.setText("Patient ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 90, 30));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 300, -1));

        btnupdate.setBackground(new java.awt.Color(39, 78, 135));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update Patient Details");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 240, 33));

        btnclear.setBackground(new java.awt.Color(39, 78, 135));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 180, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Staff().setVisible(true);
        dispose();    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtmobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyTyped

        if (txtmobile.getText().length() > 11) {
            evt.consume();


        }    }//GEN-LAST:event_txtmobileKeyTyped

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clear();

    }//GEN-LAST:event_btnclearActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        // Retrieve the selected patient ID from the combo box
        String selectedPatientID = (String) combopatientid.getSelectedItem();

        // Check if the user has selected a valid patient ID
        if (selectedPatientID == null || selectedPatientID.equals("Select Patient ID")) {
            JOptionPane.showMessageDialog(null, "Please select a valid patient ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve the updated data from the form
        String updatedName = txtname.getText();
        String updatedAddress = txtaddress.getText();
        String updatedEmail = txtemail.getText();
        String updatedIdNumber = txtidnumber.getText();
        String updatedMobile = txtmobile.getText();

        // Check if any of the fields are empty or invalid
        if (updatedName.isEmpty() || updatedAddress.isEmpty() || updatedEmail.isEmpty()
                || updatedIdNumber.isEmpty() || updatedMobile.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit if any field is missing
        }

        // Confirm the update with the user
        int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to update the patient details?", "Confirm Update", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.NO_OPTION) {
            return; // Exit if the user chooses not to update
        }

        // SQL query to update patient details in the database
        String updateQuery = "UPDATE PATIENT SET NAME = ?, ADDRESS = ?, EMAIL = ?, ID_NUMBER = ?, MOBILE = ?, P_ID=? WHERE ID = ?";

        // Update the database
        try (Connection connection = DBConnection.getDBConnection(); PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

            // Set the parameters for the prepared statement
            preparedStatement.setString(1, updatedName);
            preparedStatement.setString(2, updatedAddress);
            preparedStatement.setString(3, updatedEmail);
            preparedStatement.setString(4, updatedIdNumber);
            preparedStatement.setString(5, updatedMobile);
            preparedStatement.setString(6, comboPatientDocument.getSelectedItem().toString());
            preparedStatement.setString(7, selectedPatientID);

            // Execute the update query
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the update was successful
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Patient details updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No patient found with the selected ID. Update failed.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating patient details: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void combopatientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopatientidActionPerformed

        if (combopatientid.getSelectedIndex() == 0) {
            clear();
        }
        // Ensure that the user has selected an actual item (not the default prompt)
        String selectedItem = (String) combopatientid.getSelectedItem();

        if (selectedItem != null && !selectedItem.equals("Select Patient ID")) {
            try {
                // Establish connection to the database
                connection = DBConnection.getDBConnection();

                // SQL query to get the patient's name and appointment date based on the selected ID
                String query = "SELECT * FROM PATIENT WHERE ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, selectedItem); // Set the patient ID parameter

                // Execute the query and get the result set
                resultSet = preparedStatement.executeQuery();

                // Check if the result set contains any data
                if (resultSet.next()) {
                    txtname.setText(resultSet.getString("NAME"));
                    txtaddress.setText(resultSet.getString("ADDRESS"));
                    txtemail.setText(resultSet.getString("EMAIL"));
                    txtidnumber.setText(resultSet.getString("ID_NUMBER"));
                    txtmobile.setText(resultSet.getString("MOBILE"));
                    if (resultSet.getString("P_ID").equals("AADHAR CARD")) {
                        comboPatientDocument.setSelectedIndex(0);
                    } else {
                        comboPatientDocument.setSelectedIndex(1);
                    }
                }

            } catch (SQLException e) {
                // Handle SQL exceptions
                JOptionPane.showMessageDialog(null, "Error fetching patient details", e.getMessage(), JOptionPane.ERROR_MESSAGE);
            } finally {
                // Close the resources to avoid memory leaks
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error closing database resources", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_combopatientidActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> comboPatientDocument;
    private javax.swing.JComboBox<String> combopatientid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidnumber;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
  private void clear() {
        txtname.setText("");
        txtaddress.setText("");
        txtemail.setText("");
        txtidnumber.setText("");
        txtmobile.setText("");
        comboPatientDocument.setSelectedIndex(0);
        combopatientid.setSelectedIndex(0);
    }

    private void showPatientIDs() {

        try {
            // Establish connection to the database (change your database connection details)
            connection = DBConnection.getDBConnection();
            String query = "SELECT ID FROM PATIENT";  // Query to select ID and Name
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            // Clear existing items in the combo box to avoid duplicates
            combopatientid.removeAllItems();

            // Add a default prompt item
            combopatientid.addItem("Select Patient ID");

            // Iterate over the result set and add the items to the combo box
            while (resultSet.next()) {
                System.out.println(resultSet.getString("ID"));
                combopatientid.addItem(resultSet.getString("ID"));  // Add to the combo box
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching patient IDs", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close the resources
            try {
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error fetching patient IDs", e.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
