package cws.staff;

import cws.DBC.DBConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudhir Kushwaha
 */
public class AddPatient extends javax.swing.JFrame {

    public AddPatient() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtidnumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combopatientid = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        appointmentDate = new com.toedter.calendar.JDateChooser();
        txtemail = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 78, 135));
        jLabel2.setText("Patient  Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 290, 30));

        txtidnumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtidnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 290, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 78, 135));
        jLabel3.setText("Patient  ID Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, -1));

        combopatientid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        combopatientid.setForeground(new java.awt.Color(39, 78, 135));
        combopatientid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "AADHAR CARD", "PAN CARD" }));
        jPanel1.add(combopatientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 290, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(39, 78, 135));
        jLabel4.setText("Identity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 100, -1));

        jPanel3.setBackground(new java.awt.Color(39, 78, 135));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cancel  ");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Add Patient Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 557, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(39, 78, 135));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 60, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(39, 78, 135));
        jLabel7.setText("Schedule Appointment");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 200, 29));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(39, 78, 135));
        jLabel5.setText("Mobile Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(39, 78, 135));
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 80, 28));

        txtmobile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmobileKeyTyped(evt);
            }
        });
        jPanel1.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 290, 30));

        txtaddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 290, 30));
        jPanel1.add(appointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 290, 30));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 290, -1));

        btnsave.setBackground(new java.awt.Color(39, 78, 135));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save Patient Details");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 240, 33));

        btnclear.setBackground(new java.awt.Color(39, 78, 135));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 180, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Staff().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtmobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyTyped

        if (txtmobile.getText().length() > 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmobileKeyTyped

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        if (txtname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name is required!", "Error", JOptionPane.ERROR_MESSAGE);
            txtname.requestFocus();
        } else if (combopatientid.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Patient ID is required!", "Error", JOptionPane.ERROR_MESSAGE);
            combopatientid.requestFocus();
        } else if (txtidnumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Number is required!", "Error", JOptionPane.ERROR_MESSAGE);
            txtidnumber.requestFocus();
        } else if (txtmobile.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mobile number is required!", "Error", JOptionPane.ERROR_MESSAGE);
            txtmobile.requestFocus();
        } else if (txtemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email is required!", "Error", JOptionPane.ERROR_MESSAGE);
            txtemail.requestFocus();

        } else if (txtaddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address is required!", "Error", JOptionPane.ERROR_MESSAGE);
            txtaddress.requestFocus();
        } else if (appointmentDate.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Date is required!", "Error", JOptionPane.ERROR_MESSAGE);
            appointmentDate.requestFocus();
        } else {
            Connection connection = DBConnection.getDBConnection(); // Get the database connection
            String query = "INSERT INTO PATIENT(NAME, P_ID, ID_NUMBER, MOBILE, EMAIL, ADDRESS, APPOINTMENT_DATE) VALUES(?,?,?,?,?,?,?)";
            try {
                // Prepare the SQL query
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                // Set values from the form fields to the prepared statement
                preparedStatement.setString(1, txtname.getText()); // Name
                preparedStatement.setString(2, combopatientid.getSelectedItem().toString()); // Patient ID
                preparedStatement.setString(3, txtidnumber.getText()); // ID Number
                preparedStatement.setString(4, txtmobile.getText()); // Mobile
                preparedStatement.setString(5, txtemail.getText()); // Email
                preparedStatement.setString(6, txtaddress.getText()); // Address
                // Convert appointment date from JDateChooser to java.sql.Date
                preparedStatement.setDate(7, new java.sql.Date(appointmentDate.getDate().getTime())); // Appointment Date
                int rowsAffected = preparedStatement.executeUpdate();
                // Check if the insert was successful
                if (rowsAffected > 0) {
                    // Success message if data is inserted successfully
                    JOptionPane.showMessageDialog(null, "Patient record inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                } else {
                    // If no rows were affected, show an error message
                    JOptionPane.showMessageDialog(null, "Failed to insert the record.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                // Handle SQL exceptions
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnsaveActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser appointmentDate;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> combopatientid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
        combopatientid.setSelectedIndex(0);
        appointmentDate.setDate(null);
    }
}
