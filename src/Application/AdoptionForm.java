package Application;

import java.awt.Color;

public class AdoptionForm extends javax.swing.JFrame {

    public static String petChoosen;

    public AdoptionForm() {
        initComponents();
        Pet1.setBackground(new Color(254, 200, 145));
        Pet2.setBackground(new Color(254, 200, 145));
        Pet3.setBackground(new Color(254, 200, 145));
        Pet4.setBackground(new Color(254, 200, 145));
        Pet5.setBackground(new Color(254, 200, 145));
        Pet6.setBackground(new Color(254, 200, 145));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Birds = new javax.swing.JButton();
        Dogs = new javax.swing.JButton();
        Cats = new javax.swing.JButton();
        Rabbits = new javax.swing.JButton();
        Turtles = new javax.swing.JButton();
        Pet2 = new javax.swing.JButton();
        Pet1 = new javax.swing.JButton();
        Pet4 = new javax.swing.JButton();
        Pet3 = new javax.swing.JButton();
        Pet6 = new javax.swing.JButton();
        Pet5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Birds.setText("Birds");
        Birds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirdsActionPerformed(evt);
            }
        });
        jPanel1.add(Birds, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        Dogs.setText("Dogs");
        Dogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogsActionPerformed(evt);
            }
        });
        jPanel1.add(Dogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        Cats.setText("Cats");
        Cats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatsActionPerformed(evt);
            }
        });
        jPanel1.add(Cats, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        Rabbits.setText("Rabbits");
        jPanel1.add(Rabbits, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        Turtles.setText("Turtles");
        jPanel1.add(Turtles, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        Pet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dog1.png"))); // NOI18N
        Pet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet2ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 107, -1));

        Pet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cat1.png"))); // NOI18N
        Pet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet1ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 105, 91));

        Pet4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dog2.png"))); // NOI18N
        Pet4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet4ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        Pet3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cat2.png"))); // NOI18N
        Pet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet3ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 91));

        Pet6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dog3.png"))); // NOI18N
        Pet6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet6ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 106, 93));

        Pet5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cat3.png"))); // NOI18N
        Pet5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet5ActionPerformed(evt);
            }
        });
        jPanel1.add(Pet5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 105, -1));

        jLabel1.setText("Cat");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 51, -1));

        jLabel2.setText("Fabiolus");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel3.setText("Dog");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jLabel4.setText("Charlie");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jLabel5.setText("Cat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 37, -1));

        jLabel6.setText("Dog");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 31, -1));

        jLabel7.setText("Cat");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 46, -1));

        jLabel8.setText("Dog");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 35, -1));

        jLabel9.setText("Bella");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel10.setText("Walter");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, -1));

        jLabel11.setText("Milo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        jLabel12.setText("Teddy");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 635, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatsActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        CatsForm p = new CatsForm();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_CatsActionPerformed

    private void Pet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet2ActionPerformed
        // TODO add your handling code here:
        petChoosen = "Charlie";
         this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_Pet2ActionPerformed

    private void Pet5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet5ActionPerformed
        // TODO add your handling code here:
        petChoosen = "Milo";
          this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_Pet5ActionPerformed

    private void Pet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet1ActionPerformed
        // TODO add your handling code here:
        petChoosen = "Fabiolus";
        this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_Pet1ActionPerformed

    private void Pet3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet3ActionPerformed
        // TODO add your handling code here:
        petChoosen = "Bella";
          this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_Pet3ActionPerformed

    private void Pet4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet4ActionPerformed
        // TODO add your handling code here:
        petChoosen = "Walter";
          this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_Pet4ActionPerformed

    private void Pet6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet6ActionPerformed
        // TODO add your handling code here:
        petChoosen = "Teddy";
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

    private void DogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogsActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        DogsForm p = new DogsForm();
        p.setVisible(true);
        p.toFront();
        
    }//GEN-LAST:event_DogsActionPerformed

    private void BirdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirdsActionPerformed
        // TODO add your handling code here:
          this.toBack();
        setVisible(false);
        BirdsForm p = new BirdsForm();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_BirdsActionPerformed

    public static String getPetChoosen() {
        return petChoosen;
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
            java.util.logging.Logger.getLogger(AdoptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdoptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdoptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdoptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdoptionForm().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Birds;
    private javax.swing.JButton Cats;
    private javax.swing.JButton Dogs;
    private javax.swing.JButton Pet1;
    private javax.swing.JButton Pet2;
    private javax.swing.JButton Pet3;
    private javax.swing.JButton Pet4;
    private javax.swing.JButton Pet5;
    private javax.swing.JButton Pet6;
    private javax.swing.JButton Rabbits;
    private javax.swing.JButton Turtles;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
