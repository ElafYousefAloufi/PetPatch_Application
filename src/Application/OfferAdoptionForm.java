package Application;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OfferAdoptionForm extends javax.swing.JFrame {

    /**
     * Creates new form OfferAdoptionForm
     */
    public OfferAdoptionForm() {
        initComponents();
        UploadPhoto.setBackground(new Color(254, 200, 145));
        Submit.setBackground(new Color(254, 200, 145));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        petNameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UploadPhoto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        petNameField.setToolTipText("");
        petNameField.setInheritsPopupMenu(true);
        petNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                petNameFieldKeyPressed(evt);
            }
        });
        jPanel1.add(petNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 202, 259, -1));
        jPanel1.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 266, 259, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 330, 259, -1));

        phoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneFieldKeyPressed(evt);
            }
        });
        jPanel1.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 452, 259, -1));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 516, 259, -1));

        jLabel1.setText("Pet Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 173, -1, -1));

        jLabel2.setText("Age:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 237, -1, -1));

        jLabel3.setText("Type:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 301, -1, -1));

        jLabel4.setText("Phone Number:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 423, -1, -1));

        jLabel5.setText("Email: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 487, -1, -1));

        UploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadPhotoActionPerformed(evt);
            }
        });
        jPanel1.add(UploadPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 47, 110, 85));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel6.setText("Contact Information");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 385, 190, 30));

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 560, 90, 37));

        jLabel7.setText("Upload a Photo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 30, 30));

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static cpit380practice.Picture pic;
    public static cpit380practice.Picture picture2;
    String fileName = "";
    private void UploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadPhotoActionPerformed
        // TODO add your handling code here:
        fileName = cpit380practice.FileChooser.pickAFile();
        pic = new cpit380practice.Picture(fileName);
        UploadPhoto.setIcon(new ImageIcon(pic.getImage().getScaledInstance(UploadPhoto.getWidth(), UploadPhoto.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_UploadPhotoActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        if (petNameField.getText().isEmpty()
                || ageField.getText().isEmpty()
                || emailField.getText().isEmpty()
                || jTextField3.getText().isEmpty()
                || phoneField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "All fields most be full");
        } else {
            this.toBack();
            setVisible(false);
            offeradoptionpage p = new offeradoptionpage();
            p.setVisible(true);
            p.toFront();
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new Home().toFront();
        new Home().setVisible(true);
        new Home().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_backBtnActionPerformed

    private void petNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petNameFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            jLabel8.setText("*Please enter only String");
        } else {
            jLabel8.setText("");
        }
    }//GEN-LAST:event_petNameFieldKeyPressed

    private void phoneFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            jLabel10.setText("*Please enter only digits");
        } else {
            jLabel10.setText("");
        }
    }//GEN-LAST:event_phoneFieldKeyPressed

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
            java.util.logging.Logger.getLogger(OfferAdoptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfferAdoptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfferAdoptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfferAdoptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfferAdoptionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton UploadPhoto;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField petNameField;
    private javax.swing.JTextField phoneField;
    // End of variables declaration//GEN-END:variables
}
