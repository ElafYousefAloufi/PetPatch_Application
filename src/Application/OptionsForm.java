package Application;

import java.awt.Image;
import javax.swing.ImageIcon;

public class OptionsForm extends javax.swing.JFrame {

    public OptionsForm() {
        initComponents();
        ProfilePicture.setIcon(new ImageIcon(Home.user.getProfilePic().getImage().getScaledInstance(ProfilePicture.getWidth(), ProfilePicture.getHeight(), Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProfilePicture = new javax.swing.JLabel();
        Profile = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Favorites = new javax.swing.JButton();
        Settings = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 240));

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProfilePicture.setText("jLabel1");
        jPanel1.add(ProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 90, 90));

        Profile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Profile.setText("Update Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });
        jPanel1.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 190, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("My Activities");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 190, 40));

        Favorites.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Favorites.setText("Favorites");
        jPanel1.add(Favorites, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 190, 40));

        Settings.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Settings.setText("Settings");
        jPanel1.add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 190, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 40, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new Home().toFront();
        new Home().setVisible(true);
        new Home().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        updateProfile p = new updateProfile();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_ProfileActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if (this.isVisible()) {
            this.toBack();
            setVisible(false);
            new Home().toFront();
            new Home().setVisible(true);
            new Home().setState(java.awt.Frame.NORMAL);
        }
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Favorites;
    private javax.swing.JButton Profile;
    private javax.swing.JLabel ProfilePicture;
    private javax.swing.JButton Settings;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
