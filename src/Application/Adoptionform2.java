package Application;


import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class Adoptionform2 extends javax.swing.JFrame {

    static int value;

    public Adoptionform2() {
        initComponents();
        Home.initilaizePets();
        initializeForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        adopt = new javax.swing.JButton();
        petImgPanel = new javax.swing.JPanel();
        Petimg = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 204));

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("________________________________________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 278, 312, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Pet Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Sex:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Age:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Weight:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        sexLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sexLabel.setText("cxxc");
        jPanel1.add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 132, 30));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel.setText("cxcx");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 132, 32));

        weightLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        weightLabel.setText("xcxc");
        jPanel1.add(weightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 132, 32));

        ageLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ageLabel.setText("xcxc");
        jPanel1.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 132, 37));

        adopt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adopt.setText("Adopt");
        adopt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptActionPerformed(evt);
            }
        });
        jPanel1.add(adopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 107, 30));

        javax.swing.GroupLayout petImgPanelLayout = new javax.swing.GroupLayout(petImgPanel);
        petImgPanel.setLayout(petImgPanelLayout);
        petImgPanelLayout.setHorizontalGroup(
            petImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Petimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        petImgPanelLayout.setVerticalGroup(
            petImgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Petimg, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        jPanel1.add(petImgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 200, 230));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 30, 30));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adoptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptActionPerformed
        // TODO add your handling code here:
        String acc = "Accept";
        String dec = "Decline";
        Object Array[] = {acc, dec};
        value = JOptionPane.showOptionDialog(this, "You will have to be able to pick your pet \n within 3 days from the shop", "Select an Option",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Array, Array[1]);

        if(value ==0){
            this.dispose();
            adoptingConfirm p = new adoptingConfirm();
            p.setVisible(true);
            p.toFront();

         }

    }//GEN-LAST:event_adoptActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        if (this.isVisible()) {
            this.toBack();
            setVisible(false);
            Home h = new Home();
            h.setVisible(true);
            h.toFront();
        }
  
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        AdoptionForm a = new AdoptionForm();
        a.setVisible(true);
        a.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Adoptionform2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adoptionform2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adoptionform2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adoptionform2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adoptionform2().setVisible(true);

            }
        });

    }

    static void initializeForm() {
        if (!AdoptionForm.getPetChoosen().equalsIgnoreCase("")) {
            if (Home.getPets().get(AdoptionForm.getPetChoosen()) != null) {
                Pet p = Home.getPets().get(AdoptionForm.getPetChoosen());
                nameLabel.setText(p.getName());
                ageLabel.setText(p.getAge());
                sexLabel.setText(p.getSex());
                weightLabel.setText(p.getWeight());
                Petimg.setIcon(new ImageIcon(p.getPic().getImage().getScaledInstance(petImgPanel.getWidth(), petImgPanel.getHeight(), Image.SCALE_SMOOTH)));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Petimg;
    private javax.swing.JButton adopt;
    private static javax.swing.JLabel ageLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel nameLabel;
    private static javax.swing.JPanel petImgPanel;
    private static javax.swing.JLabel sexLabel;
    private static javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
