 
package client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kinmarcher.login.dashboard.dashboad;

public class client extends javax.swing.JFrame {
  
    public client() {
         
  
        initComponents();
        chargerDonneesDansTable1();
        modifier = new rojerusan.RSMaterialButtonCircle();
modifier.setBackground(new java.awt.Color(204, 0, 51));
modifier.setText("Modifier");
modifier.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        modifierActionPerformed(evt);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 0)));
        jCTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jCTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 230, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\customer_3126647.png")); // NOI18N
        jLabel9.setText("  Gestion Client");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 220, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\cross.png")); // NOI18N
        jLabel3.setText(" ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 40, 40));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nom", "prenom", "adresse", "numero tel", "adresse mail", "sexe"
            }
        ));
        table1.setColorBackgoundHead(new java.awt.Color(0, 153, 204));
        table1.setColorBordeFilas(new java.awt.Color(102, 0, 51));
        table1.setColorBordeHead(new java.awt.Color(255, 255, 255));
        table1.setColorSelBackgound(new java.awt.Color(255, 0, 51));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 600, 480));

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
        jLabel1.setText("Identification du client");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, -1));

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
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });
        jPanel3.add(modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 140, 50));

        supprimer.setBackground(new java.awt.Color(204, 0, 51));
        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });
        jPanel3.add(supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 140, 50));

        enregistrer.setBackground(new java.awt.Color(204, 0, 51));
        enregistrer.setText("Enregistrer");
        enregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enregistrerMouseClicked(evt);
            }
        });
        jPanel3.add(enregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
        // Récupérez les données depuis les champs de texte
    String idClient = id.getText();
    String nomClient = nom.getText();
    String prenomClient = prenom.getText();
    String adresseClient = adresse.getText();
    String numeroTelephone = numerotelephone.getText();
    String adresseMail = adressemail.getText();
    String sexeClient = (String) sexe.getSelectedItem(); // Récupérez la valeur sélectionnée dans la liste déroulante

    // Effectuez la connexion à la base de données et insérez les données dans la table client
    try {
        Connection connection = getConnection();
        String query = "INSERT INTO client (nom, prenom, adresse, numero_telephone, adresse_mail, sexe) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nomClient);
        preparedStatement.setString(2, prenomClient);
        preparedStatement.setString(3, adresseClient);
        preparedStatement.setString(4, numeroTelephone);
        preparedStatement.setString(5, adresseMail);
        preparedStatement.setString(6, sexeClient);
        
        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Enregistrement réussi !");
            
            // Maintenant, mettez à jour la table1 dans votre design avec les données de la base de données
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.addRow(new Object[]{idClient, nomClient, prenomClient, adresseClient, numeroTelephone, adresseMail, sexeClient});
            
            // Effacez les champs de texte après l'enregistrement
            id.setText("");
            nom.setText("");
            prenom.setText("");
            adresse.setText("");
            numerotelephone.setText("");
            adressemail.setText("");
            sexe.setSelectedIndex(0); // Sélectionnez la première valeur par défaut
        }
        
        preparedStatement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de l'enregistrement : " + e.getMessage());
    }
    }//GEN-LAST:event_enregistrerMouseClicked

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
      // Obtenez l'index de la ligne sélectionnée dans la table1
    int selectedRow = table1.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner un client à supprimer.", "Avertissement", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Récupérez l'ID du client à partir de la première colonne (colonne 0) de la ligne sélectionnée
    int idClientSelectionne = (int) table1.getValueAt(selectedRow, 0);

    // Effectuez la connexion à la base de données et supprimez l'enregistrement du client
    try {
        Connection connection = getConnection();
        String query = "DELETE FROM client WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, idClientSelectionne);

        int rowsDeleted = preparedStatement.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Client supprimé avec succès !");
            
            // Supprimez la ligne de la table1 après la suppression
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.removeRow(selectedRow);
            
            // Effacez les champs de texte après la suppression
            id.setText("");
            nom.setText("");
            prenom.setText("");
            adresse.setText("");
            numerotelephone.setText("");
            adressemail.setText("");
            sexe.setSelectedIndex(0); // Sélectionnez la première valeur par défaut
        }

        preparedStatement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la suppression du client : " + e.getMessage());
    }
    }//GEN-LAST:event_supprimerActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
        // Obtenez l'index de la ligne sélectionnée dans la table1
    int selectedRow = table1.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner un client à modifier.", "Avertissement", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Récupérez les valeurs des champs de texte et de la liste déroulante
    String idClient = id.getText();
    String nomClient = nom.getText();
    String prenomClient = prenom.getText();
    String adresseClient = adresse.getText();
    String numeroTelephone = numerotelephone.getText();
    String adresseMail = adressemail.getText();
    String sexeClient = (String) sexe.getSelectedItem();

    // Récupérez l'ID du client à partir de la première colonne (colonne 0) de la ligne sélectionnée
    int idClientSelectionne = (int) table1.getValueAt(selectedRow, 0);

    // Mettez à jour l'enregistrement de la base de données
    try {
        Connection connection = getConnection();
        String query = "UPDATE client SET nom = ?, prenom = ?, adresse = ?, numero_telephone = ?, adresse_mail = ?, sexe = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nomClient);
        preparedStatement.setString(2, prenomClient);
        preparedStatement.setString(3, adresseClient);
        preparedStatement.setString(4, numeroTelephone);
        preparedStatement.setString(5, adresseMail);
        preparedStatement.setString(6, sexeClient);
        preparedStatement.setInt(7, idClientSelectionne);

        int rowsUpdated = preparedStatement.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Client modifié avec succès !");
            
            // Mettez à jour la table1 après la modification
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.setValueAt(nomClient, selectedRow, 1);
            model.setValueAt(prenomClient, selectedRow, 2);
            model.setValueAt(adresseClient, selectedRow, 3);
            model.setValueAt(numeroTelephone, selectedRow, 4);
            model.setValueAt(adresseMail, selectedRow, 5);
            model.setValueAt(sexeClient, selectedRow, 6);
        }

        preparedStatement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la modification du client : " + e.getMessage());
    }
    }//GEN-LAST:event_modifierActionPerformed
    private void chargerDonneesDansTable1() {
    DefaultTableModel model = (DefaultTableModel) table1.getModel();
    model.setRowCount(0); // Efface toutes les lignes actuelles de la table1

    try {
        Connection connection = getConnection();
        String query = "SELECT id, nom, prenom, adresse, numero_telephone, adresse_mail, sexe FROM client";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int idClient = resultSet.getInt("id");
            String nomClient = resultSet.getString("nom");
            String prenomClient = resultSet.getString("prenom");
            String adresseClient = resultSet.getString("adresse");
            String numeroTelephone = resultSet.getString("numero_telephone");
            String adresseMail = resultSet.getString("adresse_mail");
            String sexeClient = resultSet.getString("sexe");

            // Ajoutez chaque enregistrement à la table1
            model.addRow(new Object[]{idClient, nomClient, prenomClient, adresseClient, numeroTelephone, adresseMail, sexeClient});
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du chargement des données : " + e.getMessage());
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
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
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
