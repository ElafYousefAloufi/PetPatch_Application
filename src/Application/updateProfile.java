package Application;

import static Application.OfferAdoptionForm.pic;
import cpit380practice.Picture;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeelan
 */
public class updateProfile extends javax.swing.JFrame {

    static String usernamee;
    static Picture picc;
    User uu;

    public updateProfile() {
        initComponents();
        uu = new User();
        UpdateButton.setBackground(new Color(254, 200, 145));
        pass.setText(Home.getUser().getPass());
        phonenum.setText(Home.getUser().getPhoneNum());
        usernmae.setText(Home.getUser().getUsername());
        email.setText(Home.getUser().getEmail());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        UpdatePhoto = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(280, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 209, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Email Address:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 284, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Phone Number:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 359, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 432, -1, -1));

        usernmae.setText("Salha");
        usernmae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernmaeActionPerformed(evt);
            }
        });
        jPanel1.add(usernmae, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 240, 270, -1));

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 524, 116, 45));

        email.setText("salbehairi@kau.edu.sa");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 315, 270, -1));

        phonenum.setText("+966 458 8374 60");
        phonenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumActionPerformed(evt);
            }
        });
        jPanel1.add(phonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 390, 270, -1));

        pass.setText("****************");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 463, 270, -1));

        UpdatePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/u.png"))); // NOI18N
        UpdatePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePhotoActionPerformed(evt);
            }
        });
        jPanel1.add(UpdatePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 59, 106, 105));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 613, 30, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static String fileName = "";
    private void UpdatePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePhotoActionPerformed
        fileName = cpit380practice.FileChooser.pickAFile();
        pic = new cpit380practice.Picture(fileName);
        picc = pic;
        UpdatePhoto.setIcon(new ImageIcon(pic.getImage().getScaledInstance(UpdatePhoto.getWidth(), UpdatePhoto.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_UpdatePhotoActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here
        uu.setProfilePic(picc);
        
        if(uu.getEmail()!=null){
            Home.user.setEmail(uu.getEmail());
        }
        if(uu.getPass()!=null){
             Home.user.setPass(uu.getPass());
        }
        
        if(uu.getPhoneNum()!=null){
              Home.user.setPhoneNum(uu.getPhoneNum());
        }
        
        if(uu.getProfilePic()!=null){
              Home.user.setProfilePic(picc);
        }
        if(uu.getUsername()!=null){
              Home.user.setUsername(uu.getUsername());
        }
        System.out.println(uu.getUsername());
        JOptionPane.showMessageDialog(this, "Your Profile Updated!");
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void usernmaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernmaeActionPerformed
        // TODO add your handling code here:
        uu.setUsername(usernmae.getText());
    }//GEN-LAST:event_usernmaeActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
        uu.setEmail(email.getText());
    }//GEN-LAST:event_emailActionPerformed

    private void phonenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumActionPerformed
        // TODO add your handling code here:
        uu.setPhoneNum(phonenum.getText());
    }//GEN-LAST:event_phonenumActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
        uu.setPass(pass.getText());
    }//GEN-LAST:event_passActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        OptionsForm o = new OptionsForm();
        o.setVisible(true);
        o.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        if (this.isVisible()) {
            this.toBack();
            setVisible(false);
            new Home().toFront();
            new Home().setVisible(true);
            new Home().setState(java.awt.Frame.NORMAL);
        }
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(updateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateProfile().setVisible(true);
            }
        });
    }

//    static void initializeUpdate() {
//        Home.getUser().setPass(pass.getText());
//        Home.getUser().setPhoneNum(phonenum.getText());
//        Home.getUser().setEmail(email.getText());
//        Home.getUser().setUsername(usernmae.toString());
//        Home.getUser().setProfilePic(new Picture(fileName));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton UpdatePhoto;
    private javax.swing.JButton backBtn;
    private final javax.swing.JTextField email = new javax.swing.JTextField();
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private final javax.swing.JTextField pass = new javax.swing.JTextField();
    private final javax.swing.JTextField phonenum = new javax.swing.JTextField();
    private final javax.swing.JTextField usernmae = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
