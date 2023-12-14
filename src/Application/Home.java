package Application;

import java.awt.Image;
import javax.swing.ImageIcon;
import cpit380practice.*;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    static HashMap<String, Pet> pets = new HashMap();
    static User user = new User("Salha", "salbehairi@kau.edu.sa", "+966 458 8374 60", "**************", new Picture("src\\img\\Picture1.jpg"));

    public static User getUser() {
        return user;
    }

    static HashMap<String, Pet> getPets() {
        return pets;
    }

    public Home() {
        initComponents();
        initilaizePets();
        adoptionBtn2.setBackground(new Color(254, 200, 145));
        suppliesBtn.setBackground(new Color(254, 200, 145));
        offerAdoptionBtn.setBackground(new Color(254, 200, 145));
        reportBtn.setBackground(new Color(254, 200, 145));
        welcomePhrase.setText(user.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabell = new javax.swing.JLabel();
        offerAdoptionBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        suppliesBtn = new javax.swing.JButton();
        adoptionBtn2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        welcomePhrase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabell.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jlabell.setText("Welcome,");
        jPanel1.add(jlabell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, -1));

        offerAdoptionBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        offerAdoptionBtn.setText("Offer Adoption");
        offerAdoptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offerAdoptionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(offerAdoptionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 160, 70));

        reportBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reportBtn.setText("Report");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });
        jPanel1.add(reportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 160, 70));

        suppliesBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suppliesBtn.setText("Supplies");
        suppliesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(suppliesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 70));

        adoptionBtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adoptionBtn2.setText("Adoption");
        adoptionBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptionBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(adoptionBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 160, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-removebg-preview.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 120, 120));

        welcomePhrase.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        welcomePhrase.setText("Username");
        jPanel1.add(welcomePhrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void offerAdoptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offerAdoptionBtnActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        OfferAdoptionForm p = new OfferAdoptionForm();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_offerAdoptionBtnActionPerformed

    private void suppliesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliesBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "NOT available NOW");

    }//GEN-LAST:event_suppliesBtnActionPerformed

    private void adoptionBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptionBtn2ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        AdoptionForm p = new AdoptionForm();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_adoptionBtn2ActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        ReportForm p = new ReportForm();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_reportBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        OptionsForm p = new OptionsForm();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    static void initilaizePets() {
        pets.put("Fabiolus", new Pet("Fabiolus", "3 months", "2 kg", "Female", new Picture("src\\img\\cat1home.jpg")));
        pets.put("Charlie", new Pet("Charlie", "1 year", "6 kg", "Male", new Picture("src\\img\\dog1home.jpg")));
        pets.put("Walter", new Pet("Walter", "2 years", "6 kg", "Male", new Picture("src\\img\\dog2home.jpg")));
        pets.put("Teddy", new Pet("Teddy", "2 years", "3 kg", "Male", new Picture("src\\img\\dog3home.jpg")));
        pets.put("Bella", new Pet("Bella", "5 months", "3 kg", "Female", new Picture("src\\img\\cat2home.jpg")));
        pets.put("Milo", new Pet("Milo", "4 year", "2 kg", "Male", new Picture("src\\img\\cat3home.jpg")));
        pets.put("Scruffy", new Pet("Scruffy", "2 months", "1 kg", "Male", new Picture("src\\img\\bird1home.jpg")));
        pets.put("Moony", new Pet("Moony", "1 year", "2 kg", "Female", new Picture("src\\img\\bird2home.png")));
        pets.put("Zazu", new Pet("Zazu", "1 year", "1 kg", "Male", new Picture("src\\img\\bird3home.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton adoptionBtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel jlabell;
    private javax.swing.JButton offerAdoptionBtn;
    private javax.swing.JButton reportBtn;
    private javax.swing.JButton suppliesBtn;
    private javax.swing.JLabel welcomePhrase;
    // End of variables declaration//GEN-END:variables
}
