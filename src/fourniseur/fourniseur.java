 
package fourniseur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kinmarcher.login.dashboard.dashboad;

/**
 *
 * @author EugenePc
 */
public class fourniseur extends javax.swing.JFrame {

    /**
     * Creates new form fourniseur
     */
    public fourniseur() {
        initComponents();
        chargerDonneesFournisseurs();
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        supprimerMouseClicked(evt);
    }
});

        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        modifierMouseClicked(evt);
    }
    
    
});
         
    }
    private Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-INKBQQ3\\SA:1433;databaseName=examen;user=tp;password=1234;";
        return DriverManager.getConnection(url);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new rojeru_san.complementos.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        adressemail = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        id = new app.bolivia.swing.JCTextField();
        nom = new app.bolivia.swing.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        prenom = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        adresse = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        numerotelephone = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sexe = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        modifier = new rojerusan.RSMaterialButtonCircle();
        supprimer = new rojerusan.RSMaterialButtonCircle();
        enregistrer = new rojerusan.RSMaterialButtonCircle();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 0)));
        jCTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jCTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 230, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\customer_3126647.png")); // NOI18N
        jLabel9.setText("  Gestion Fourniseur ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\cross.png")); // NOI18N
        jLabel3.setText(" ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 40, 40));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "prenom", "Adresse", "numero téléphone", "adresse mail", "sexe"
            }
        ));
        table1.setColorBackgoundHead(new java.awt.Color(0, 153, 204));
        table1.setColorBordeFilas(new java.awt.Color(102, 0, 51));
        table1.setColorBordeHead(new java.awt.Color(255, 255, 255));
        table1.setColorSelBackgound(new java.awt.Color(255, 0, 51));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 740, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 740, 580));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adressemail.setBackground(new java.awt.Color(102, 153, 255));
        adressemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(adressemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 220, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\toilet.png")); // NOI18N
        jLabel2.setText("Sexe");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 140, 20));

        id.setBackground(new java.awt.Color(102, 153, 255));
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 20));

        nom.setBackground(new java.awt.Color(102, 153, 255));
        nom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\id-card.png")); // NOI18N
        jLabel4.setText("Nom");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 30));

        prenom.setBackground(new java.awt.Color(102, 153, 255));
        prenom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\signature.png")); // NOI18N
        jLabel5.setText("Prenom");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, -1));

        adresse.setBackground(new java.awt.Color(102, 153, 255));
        adresse.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, 20));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\adress.png")); // NOI18N
        jLabel6.setText("Adresse");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 90, -1));

        numerotelephone.setBackground(new java.awt.Color(102, 153, 255));
        numerotelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(numerotelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 220, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\telephone-call.png")); // NOI18N
        jLabel7.setText("Numero Téléphone");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 170, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\mail.png")); // NOI18N
        jLabel8.setText("Adresse Mail");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 140, -1));

        sexe.setBackground(new java.awt.Color(102, 153, 255));
        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        sexe.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(sexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 220, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identification");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\face-id.png")); // NOI18N
        jLabel11.setText("ID");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\back (1).png")); // NOI18N
        jLabel12.setText(" ");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        modifier.setBackground(new java.awt.Color(204, 0, 51));
        modifier.setText("Modifier");
        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierMouseClicked(evt);
            }
        });
        jPanel3.add(modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 140, 50));

        supprimer.setBackground(new java.awt.Color(204, 0, 51));
        supprimer.setText("Supprimer");
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerMouseClicked(evt);
            }
        });
        jPanel3.add(supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 140, 50));

        enregistrer.setBackground(new java.awt.Color(204, 0, 51));
        enregistrer.setText("Enregistrer");
        enregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enregistrerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enregistrerMouseEntered(evt);
            }
        });
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });
        jPanel3.add(enregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 140, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        dashboad dash= new dashboad();
        dash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void enregistrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrerMouseClicked
        // TODO add your handling code here:
    String nomFournisseur = nom.getText();
    String prenomFournisseur = prenom.getText();
    String adresseFournisseur = adresse.getText();
    String numeroTelephoneFournisseur = numerotelephone.getText();
    String adresseMailFournisseur = adressemail.getText();
    String sexeFournisseur = (String) sexe.getSelectedItem();

    try {
        Connection conn = getConnection();

        // Requête SQL pour insérer un fournisseur
        String query = "INSERT INTO Fournisseur (nom, prenom, adresse, numero_telephone, adresse_mail, sexe) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, nomFournisseur);
        preparedStatement.setString(2, prenomFournisseur);
        preparedStatement.setString(3, adresseFournisseur);
        preparedStatement.setString(4, numeroTelephoneFournisseur);
        preparedStatement.setString(5, adresseMailFournisseur);
        preparedStatement.setString(6, sexeFournisseur);

       int rowsInserted = preparedStatement.executeUpdate();
    if (rowsInserted > 0) {
        JOptionPane.showMessageDialog(null, "Fournisseur enregistré avec succès !");
        // Réinitialiser les champs après l'enregistrement
        nom.setText("");
        prenom.setText("");
        adresse.setText("");
        numerotelephone.setText("");
        adressemail.setText("");

        // Charger à nouveau les données des fournisseurs après l'enregistrement
        chargerDonneesFournisseurs();
    }

    conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement du fournisseur : " + e.getMessage());
    }
        
    }//GEN-LAST:event_enregistrerMouseClicked

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked
        // Récupérez la ligne sélectionnée dans la table
    int selectedRow = table1.getSelectedRow();

    // Assurez-vous qu'une ligne est sélectionnée
    if (selectedRow >= 0) {
        // Récupérez les données du fournisseur sélectionné dans la table
        String idFournisseur = table1.getValueAt(selectedRow, 0).toString();

        // Récupérez les nouvelles valeurs des champs d'édition
        String nouveauNom = nom.getText();
        String nouveauPrenom = prenom.getText();
        String nouvelleAdresse = adresse.getText();
        String nouveauNumeroTelephone = numerotelephone.getText();
        String nouvelleAdresseMail = adressemail.getText();
        String nouveauSexe = (String) sexe.getSelectedItem();

        try {
            Connection conn = getConnection();

            // Requête SQL pour mettre à jour les informations du fournisseur
            String query = "UPDATE Fournisseur SET nom=?, prenom=?, adresse=?, numero_telephone=?, adresse_mail=?, sexe=? WHERE id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, nouveauNom);
            preparedStatement.setString(2, nouveauPrenom);
            preparedStatement.setString(3, nouvelleAdresse);
            preparedStatement.setString(4, nouveauNumeroTelephone);
            preparedStatement.setString(5, nouvelleAdresseMail);
            preparedStatement.setString(6, nouveauSexe);
            preparedStatement.setString(7, idFournisseur);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Fournisseur modifié avec succès !");
                // Réinitialisez les champs après la modification
                nom.setText("");
                prenom.setText("");
                adresse.setText("");
                numerotelephone.setText("");
                adressemail.setText("");

                // Chargez à nouveau les données des fournisseurs après la modification
                chargerDonneesFournisseurs();
            } else {
                JOptionPane.showMessageDialog(null, "La modification a échoué. Assurez-vous de sélectionner un fournisseur.");
            }

            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la modification du fournisseur : " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner un fournisseur à modifier.");
    }
    }//GEN-LAST:event_modifierMouseClicked

    private void supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMouseClicked
        // TODO add your handling code here:
         // Récupérez la ligne sélectionnée dans la table
    int selectedRow = table1.getSelectedRow();

    // Assurez-vous qu'une ligne est sélectionnée
    if (selectedRow >= 0) {
        // Récupérez l'ID du fournisseur sélectionné dans la table
        String idFournisseur = table1.getValueAt(selectedRow, 0).toString();

        int confirmation = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer ce fournisseur ?", "Confirmation de suppression", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                Connection conn = getConnection();

                // Requête SQL pour supprimer un fournisseur en fonction de son ID
                String query = "DELETE FROM Fournisseur WHERE id=?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, idFournisseur);

                int rowsDeleted = preparedStatement.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Fournisseur supprimé avec succès !");
                    // Chargez à nouveau les données des fournisseurs après la suppression
                    chargerDonneesFournisseurs();
                } else {
                    JOptionPane.showMessageDialog(null, "La suppression a échoué. Assurez-vous de sélectionner un fournisseur.");
                }

                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erreur lors de la suppression du fournisseur : " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner un fournisseur à supprimer.");
    }
    }//GEN-LAST:event_supprimerMouseClicked

    private void enregistrerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_enregistrerMouseEntered

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_enregistrerActionPerformed

    private void chargerDonneesFournisseurs() {
    try {
        Connection conn = getConnection();

        // Requête SQL pour récupérer les données des fournisseurs
        String query = "SELECT * FROM Fournisseur";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0); // Effacer toutes les lignes actuelles de la table

        while (resultSet.next()) {
            // Récupérer les données de chaque colonne de la table Fournisseur
            String idFournisseur = resultSet.getString("id");
            String nomFournisseur = resultSet.getString("nom");
            String prenomFournisseur = resultSet.getString("prenom");
            String adresseFournisseur = resultSet.getString("adresse");
            String numeroTelephoneFournisseur = resultSet.getString("numero_telephone");
            String adresseMailFournisseur = resultSet.getString("adresse_mail");
            String sexeFournisseur = resultSet.getString("sexe");

            // Ajouter les données à la table
            model.addRow(new Object[]{
                idFournisseur,
                nomFournisseur,
                prenomFournisseur,
                adresseFournisseur,
                numeroTelephoneFournisseur,
                adresseMailFournisseur,
                sexeFournisseur
            });
        }

        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur lors du chargement des données des fournisseurs : " + e.getMessage());
    }
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
            java.util.logging.Logger.getLogger(fourniseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fourniseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fourniseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fourniseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fourniseur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField adresse;
    private app.bolivia.swing.JCTextField adressemail;
    private rojerusan.RSMaterialButtonCircle enregistrer;
    private app.bolivia.swing.JCTextField id;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMaterialButtonCircle modifier;
    private app.bolivia.swing.JCTextField nom;
    private app.bolivia.swing.JCTextField numerotelephone;
    private app.bolivia.swing.JCTextField prenom;
    private javax.swing.JComboBox<String> sexe;
    private rojerusan.RSMaterialButtonCircle supprimer;
    private rojeru_san.complementos.RSTableMetro table1;
    // End of variables declaration//GEN-END:variables
}
