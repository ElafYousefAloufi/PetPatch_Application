package Application;

import Application.Adoptionform2;
import java.awt.Color;

public class DogsForm extends javax.swing.JFrame {

    public DogsForm() {
        initComponents();
        Home.initilaizePets();

        Pet2.setBackground(new Color(254, 200, 145));
        Pet4.setBackground(new Color(254, 200, 145));
        Pet6.setBackground(new Color(254, 200, 145));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cats = new javax.swing.JButton();
        Dogs = new javax.swing.JButton();
        Birds = new javax.swing.JButton();
        Rabbits = new javax.swing.JButton();
        Turtles = new javax.swing.JButton();
        Pet2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pet4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Pet6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cats.setText("Cats");
        Cats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatsActionPerformed(evt);
            }
        });
        jPanel1.add(Cats, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        Dogs.setText("Dogs");
        jPanel1.add(Dogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        Birds.setText("Birds");
        Birds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirdsActionPerformed(evt);
            }
        });
        jPanel1.add(Birds, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        Rabbits.setText("Rabbits");
        jPanel1.add(Rabbits, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        Turtles.setText("Turtles");
        jPanel1.add(Turtles, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        Pet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dog1.png"))); // NOI18N
        Pet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet2ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 107, -1));

        jLabel3.setText("Dog");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        jLabel4.setText("Charlie");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        Pet4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dog2.png"))); // NOI18N
        Pet4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet4ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel6.setText("Dog");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 31, -1));

        jLabel10.setText("Walter");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        Pet6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dog3.png"))); // NOI18N
        Pet6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet6ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 106, 93));

        jLabel8.setText("Dog");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 35, -1));

        jLabel12.setText("Teddy");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 30, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatsActionPerformed
        // TODO add your handling code here:
        CatsForm c = new CatsForm();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_CatsActionPerformed

    private void Pet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet2ActionPerformed
        // TODO add your handling code here:
        AdoptionForm.petChoosen = "Charlie";
        System.out.println("pet1 Action done");
        this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_Pet2ActionPerformed

    private void Pet4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet4ActionPerformed
        // TODO add your handling code here:
        AdoptionForm.petChoosen = "Walter";
        System.out.println("pet1 Action done");
        this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_Pet4ActionPerformed

    private void Pet6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet6ActionPerformed
        // TODO add your handling code here:
        AdoptionForm.petChoosen = "Teddy";
        System.out.println("pet1 Action done");
        this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_Pet6ActionPerformed

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

    private void BirdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirdsActionPerformed
        // TODO add your handling code here:
        BirdsForm b = new BirdsForm();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_BirdsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        AdoptionForm a = new AdoptionForm();
        a.setVisible(true);
        a.toFront();
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
            java.util.logging.Logger.getLogger(DogsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DogsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DogsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DogsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DogsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Birds;
    private javax.swing.JButton Cats;
    private javax.swing.JButton Dogs;
    private javax.swing.JButton Pet2;
    private javax.swing.JButton Pet4;
    private javax.swing.JButton Pet6;
    private javax.swing.JButton Rabbits;
    private javax.swing.JButton Turtles;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
