/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import static Application.AdoptionForm.petChoosen;
import java.awt.Color;


public class BirdsForm extends javax.swing.JFrame {
    public BirdsForm() {
        initComponents();
                Home.initilaizePets();

        pet7.setBackground(new Color(254, 200, 145));
        pet8.setBackground(new Color(254, 200, 145));
        pet9.setBackground(new Color(254, 200, 145));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Cats = new javax.swing.JButton();
        Dogs = new javax.swing.JButton();
        Birds = new javax.swing.JButton();
        Rabbits = new javax.swing.JButton();
        Turtles = new javax.swing.JButton();
        pet7 = new javax.swing.JButton();
        pet8 = new javax.swing.JButton();
        pet9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

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
        Dogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogsActionPerformed(evt);
            }
        });
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
        jPanel1.add(Turtles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        pet7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bird1.png"))); // NOI18N
        pet7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pet7ActionPerformed(evt);
            }
        });
        jPanel1.add(pet7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 101, 95));

        pet8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bird2.png"))); // NOI18N
        pet8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pet8ActionPerformed(evt);
            }
        });
        jPanel1.add(pet8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 101, 96));

        pet9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bird3.png"))); // NOI18N
        pet9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pet9ActionPerformed(evt);
            }
        });
        jPanel1.add(pet9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 99, 95));

        jLabel1.setText("Bird");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 36, -1));

        jLabel2.setText("Bird");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 36, -1));

        jLabel3.setText("Bird");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 36, -1));

        jLabel4.setText("Scruffy");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 48, -1));

        jLabel5.setText("Zazu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 36, -1));

        jLabel6.setText("Moony");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatsActionPerformed
        // TODO add your handling code here:
        CatsForm c = new CatsForm();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_CatsActionPerformed

    private void DogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogsActionPerformed
        // TODO add your handling code here:
        DogsForm d = new DogsForm();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_DogsActionPerformed

    private void pet7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pet7ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        AdoptionForm.petChoosen = "Scruffy";
        System.out.println("pet7 Action done");
        this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_pet7ActionPerformed

    private void pet9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pet9ActionPerformed
        // TODO add your handling code here:
        AdoptionForm.petChoosen = "Zazu";
        System.out.println("pet9 Action done");
        this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_pet9ActionPerformed

    private void pet8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pet8ActionPerformed
        // TODO add your handling code here:
        AdoptionForm.petChoosen = "Moony";
        System.out.println("pet8 Action done");
        this.toBack();
        setVisible(false);
        Adoptionform2 p = new Adoptionform2();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_pet8ActionPerformed

    private void BirdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirdsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirdsActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        AdoptionForm a = new AdoptionForm();
        a.setVisible(true);
        a.toFront();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BirdsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BirdsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BirdsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BirdsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BirdsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Birds;
    private javax.swing.JButton Cats;
    private javax.swing.JButton Dogs;
    private javax.swing.JButton Rabbits;
    private javax.swing.JButton Turtles;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pet7;
    private javax.swing.JButton pet8;
    private javax.swing.JButton pet9;
    // End of variables declaration//GEN-END:variables
}
