/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.ihm;

import de.esic.dao.ConnexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marye
 */
public class Ajouter_objectif extends javax.swing.JFrame {

    /**
     * Creates new form Ajouter_objectif
     */
    public Ajouter_objectif() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_acceeuil = new javax.swing.JButton();
        btn_valider_regime = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_nbre_kg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        com_box_type = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txt_nbre_heure = new javax.swing.JTextField();
        btn_quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_acceeuil.setBackground(new java.awt.Color(255, 168, 138));
        btn_acceeuil.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_acceeuil.setForeground(new java.awt.Color(255, 255, 255));
        btn_acceeuil.setText("Acceuil");
        btn_acceeuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acceeuilActionPerformed(evt);
            }
        });
        jPanel1.add(btn_acceeuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        btn_valider_regime.setBackground(new java.awt.Color(0, 58, 111));
        btn_valider_regime.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_valider_regime.setForeground(new java.awt.Color(255, 255, 255));
        btn_valider_regime.setText("Valider Régime");
        btn_valider_regime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valider_regimeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_valider_regime, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 220, 40));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 58, 111));
        jLabel2.setText("Nombre de  Kilogramme a parcourir :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 50));

        txt_nbre_kg.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_nbre_kg.setForeground(new java.awt.Color(0, 58, 111));
        jPanel1.add(txt_nbre_kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, 50));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 58, 111));
        jLabel6.setText("Type d'activité : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 140, 40));

        com_box_type.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        com_box_type.setForeground(new java.awt.Color(0, 58, 111));
        com_box_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marche", "Course" }));
        com_box_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_box_typeActionPerformed(evt);
            }
        });
        jPanel1.add(com_box_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 140, 40));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 58, 111));
        jLabel7.setText("Nombre des Heures :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 150, 40));

        txt_nbre_heure.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_nbre_heure.setForeground(new java.awt.Color(0, 58, 111));
        jPanel1.add(txt_nbre_heure, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 140, 40));

        btn_quitter.setBackground(new java.awt.Color(255, 0, 0));
        btn_quitter.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_quitter.setForeground(new java.awt.Color(255, 255, 255));
        btn_quitter.setText("Deconnexion");
        btn_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acceeuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acceeuilActionPerformed
        Fenetre_de_demarage fn =new Fenetre_de_demarage();
        fn.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_acceeuilActionPerformed

    private void btn_valider_regimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valider_regimeActionPerformed

        int nbre_kilo=Integer.parseInt(txt_nbre_kg.getText());
       // int periode=Integer.parseInt(txt_periode_regime.getText());
       // double poids_initial=Double.parseDouble(txt_poids_actuel.getText());
        //double poids_souhaite=Double.parseDouble(txt_poids_souhaité.getText());
       // String cadence=combox_cadence.  getSelectedItem().toString();
        int nbre_heure=Integer.parseInt(txt_nbre_heure.getText());
        String type_activité=com_box_type.  getSelectedItem().toString();

     ///   btn_commencer_regime.setEnabled(true);
      //  btn_commencer_regime1.setEnabled(true);
        String sql ="insert into regime_perdre_poids (nbre_kilo,periode,poids_initial,poids_souhaite,cadence,nbre_heure,type_activité) values(?,?,?,?,?,?,?)";

        try {
            Connection connexion=ConnexionBd.getConnection();
            PreparedStatement prepare;
            prepare = connexion.prepareCall(sql);
            prepare.setInt(1, nbre_kilo);
          //  prepare.setInt(2, periode);
           // prepare.setDouble(3, poids_initial);
           // prepare.setDouble(4, poids_souhaite);
           // prepare.setString(5, cadence);
            prepare.setInt(6, nbre_heure);
            prepare.setString(7, type_activité);
            prepare.execute();
            JOptionPane.showMessageDialog(rootPane, "Régime Ajouté avec succés!!");

        } catch (SQLException ex) {
            Logger.getLogger(Fenetre_IMC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_valider_regimeActionPerformed

    private void com_box_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_box_typeActionPerformed

    }//GEN-LAST:event_com_box_typeActionPerformed

    private void btn_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitterActionPerformed
        Connexion cnx=new Connexion();
        cnx.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_quitterActionPerformed

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
            java.util.logging.Logger.getLogger(Ajouter_objectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajouter_objectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajouter_objectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajouter_objectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajouter_objectif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acceeuil;
    private javax.swing.JButton btn_quitter;
    private javax.swing.JButton btn_valider_regime;
    private javax.swing.JComboBox com_box_type;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_nbre_heure;
    private javax.swing.JTextField txt_nbre_kg;
    // End of variables declaration//GEN-END:variables
}