 
package approvisionnement;
import fourniseur.fourniseur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kinmarcher.login.dashboard.dashboad;
import approvisionnement.SituationProduits; 
public class approvisionnement extends javax.swing.JFrame {
    public approvisionnement() {
        initComponents();
        remplirComboboxProduit(); // Appel de la fonction pour remplir le combobox produit
        remplirComboboxFournisseur(); // Appel de la fonction pour remplir le combobox fournisseur
        chargerDonneesApprovisionnements();
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
        jLabel2 = new javax.swing.JLabel();
        id = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        quantite = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        prix = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        poduit = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bonEntrer = new rojerusan.RSMaterialButtonCircle();
        supprimer = new rojerusan.RSMaterialButtonCircle();
        enregistrer = new rojerusan.RSMaterialButtonCircle();
        mesure = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        fournisseur = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        date = new app.bolivia.swing.JCTextField();
        modifier1 = new rojerusan.RSMaterialButtonCircle();
        situationStock = new rojerusan.RSMaterialButtonCircle();
        redemarer = new javax.swing.JLabel();
        sortie = new rojerusan.RSMaterialButtonCircle();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 0)));
        jCTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jCTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 230, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\customer_3126647.png")); // NOI18N
        jLabel9.setText("Approvisionnement");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 260, -1));

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
                "id", "produit", "Quantité", "Fournisseur", "mesure", "prix", "date"
            }
        ));
        table1.setColorBackgoundHead(new java.awt.Color(0, 153, 204));
        table1.setColorBordeFilas(new java.awt.Color(102, 0, 51));
        table1.setColorBordeHead(new java.awt.Color(255, 255, 255));
        table1.setColorSelBackgound(new java.awt.Color(255, 0, 51));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 590, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 590, 580));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\toilet.png")); // NOI18N
        jLabel2.setText("Fournisseur");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 110, 20));

        id.setBackground(new java.awt.Color(102, 153, 255));
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\new-product (1).png")); // NOI18N
        jLabel5.setText("Produit");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, -1));

        quantite.setBackground(new java.awt.Color(102, 153, 255));
        quantite.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, 20));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\balance.png")); // NOI18N
        jLabel6.setText("Mésure");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 100, -1));

        prix.setBackground(new java.awt.Color(102, 153, 255));
        prix.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(prix, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 220, 20));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\calendar.png")); // NOI18N
        jLabel7.setText("prix");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 100, -1));

        poduit.setBackground(new java.awt.Color(102, 153, 255));
        poduit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(poduit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personalisation");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 170, -1));

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

        bonEntrer.setText("Bon D'entrée");
        bonEntrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonEntrerActionPerformed(evt);
            }
        });
        jPanel3.add(bonEntrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 190, 60));

        supprimer.setBackground(new java.awt.Color(204, 0, 51));
        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });
        jPanel3.add(supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 140, 50));

        enregistrer.setBackground(new java.awt.Color(204, 0, 51));
        enregistrer.setText("Enregistrer");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });
        jPanel3.add(enregistrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 140, 50));

        mesure.setBackground(new java.awt.Color(102, 153, 255));
        mesure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kgs", "Pièces" }));
        mesure.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(mesure, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 220, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\quantitative.png")); // NOI18N
        jLabel10.setText("Quantité");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, -1));

        fournisseur.setBackground(new java.awt.Color(102, 153, 255));
        fournisseur.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(fournisseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 220, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\calendar.png")); // NOI18N
        jLabel8.setText("Date");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 170, -1));

        date.setBackground(new java.awt.Color(102, 153, 255));
        date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 220, 20));

        modifier1.setBackground(new java.awt.Color(204, 0, 51));
        modifier1.setText("Modifier");
        modifier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier1ActionPerformed(evt);
            }
        });
        jPanel3.add(modifier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 140, 50));

        situationStock.setText("situation stock");
        situationStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                situationStockActionPerformed(evt);
            }
        });
        jPanel3.add(situationStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 180, 60));

        redemarer.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\restart.png")); // NOI18N
        redemarer.setText(" ");
        redemarer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redemarer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redemarerMouseClicked(evt);
            }
        });
        jPanel3.add(redemarer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 30, 30));

        sortie.setText("sortie en stock");
        sortie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortieActionPerformed(evt);
            }
        });
        jPanel3.add(sortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 180, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 600));

        jMenu3.setText("Menu aide");

        jMenuItem2.setText("Fournisseur");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem1.setText("Produit");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        dashboad dash = new dashboad();
        dash.setVisible(true);
        this.setAlwaysOnTop(false);

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
        // Récupérer les valeurs depuis les champs de texte et les combobox
    String nomProduit = poduit.getSelectedItem().toString();
    String quantiteApprovisionnement = quantite.getText();
    String nomFournisseur = fournisseur.getSelectedItem().toString();
    String mesureApprovisionnement = mesure.getSelectedItem().toString();
    String prixApprovisionnement = prix.getText();
    String dateApprovisionnement = date.getText();

    try {
        Connection conn = getConnection(); // Établir une connexion à la base de données

        // 1. Supposons que vous avez une méthode getProductIdByName pour obtenir l'ID du produit en fonction de son nom.
        int produitId = getProductIdByName(nomProduit);
        int fournisseurId = getFournisseurIdByName(nomFournisseur);

        // Requête SQL pour insérer un approvisionnement
        // Requête SQL pour insérer un approvisionnement
        String query = "INSERT INTO approvisionnement (produit_id, quantite, fournisseur_id, mesure, prix, date) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setInt(1, produitId);
        preparedStatement.setString(2, quantiteApprovisionnement);
        preparedStatement.setInt(3, fournisseurId); // Utilisez l'ID du fournisseur au lieu de son nom
        preparedStatement.setString(4, mesureApprovisionnement);
        preparedStatement.setString(5, prixApprovisionnement);
        preparedStatement.setString(6, dateApprovisionnement);

        int rowsInserted = preparedStatement.executeUpdate();

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Approvisionnement enregistré avec succès !");
            // Réinitialiser les champs après l'enregistrement
            quantite.setText("");
            prix.setText("");
            date.setText("");

            // Vous pouvez également mettre à jour votre table1 avec les nouvelles données ici
            chargerDonneesApprovisionnements();
        }

        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement de l'approvisionnement : " + e.getMessage());
    }
    }//GEN-LAST:event_enregistrerActionPerformed

    private void bonEntrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonEntrerActionPerformed
        // Récupérer l'index de la ligne sélectionnée dans table1
    int selectedRow = table1.getSelectedRow();

    // Vérifier si une ligne est sélectionnée
    if (selectedRow != -1) {
        // Récupérer les données de la ligne sélectionnée
        int idApprovisionnement = (int) table1.getValueAt(selectedRow, 0);
        String produit = table1.getValueAt(selectedRow, 1).toString();
        String quantite = table1.getValueAt(selectedRow, 2).toString();
        String fournisseur = table1.getValueAt(selectedRow, 3).toString();
        String mesure = table1.getValueAt(selectedRow, 4).toString();
        String prix = table1.getValueAt(selectedRow, 5).toString();
        String date = table1.getValueAt(selectedRow, 6).toString();

        // Générer le contenu du bon d'entrée avec les données de la ligne sélectionnée
        String bonEntreeData = generateBonEntree(idApprovisionnement, produit, quantite, fournisseur, mesure, prix, date);

        // Créer et afficher la fenêtre du bon d'entrée
        BonEntreeStockApp bonEntreeApp = new BonEntreeStockApp(bonEntreeData);
        bonEntreeApp.setLocationRelativeTo(null); // Centrer la fenêtre par rapport à l'écran
        bonEntreeApp.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Sélectionnez une ligne pour voir le bon d'entrée.");
    }
}                                             

private String generateBonEntree(int idApprovisionnement, String produit, String quantite, String fournisseur, String mesure, String prix, String date) {
     // Générer le contenu du bon d'entrée en utilisant les données de la ligne sélectionnée
    // Vous pouvez formater le contenu selon vos besoins
    String bonEntree = "Bon d'Entrée en Stock\n";
    bonEntree += "-------------------------------\n";
    bonEntree += "ID Approvisionnement: " + idApprovisionnement + "\n";
    bonEntree += "Date: " + date + "\n";
    bonEntree += "Fournisseur: " + fournisseur + "\n";
    bonEntree += "-------------------------------\n";
    bonEntree += "Produit: " + produit + "\n";
    bonEntree += "Quantité: " + quantite + " " + mesure + "\n";
    bonEntree += "Prix: " + prix + "\n";
    bonEntree += "-------------------------------\n";
    
    // Calcul du total en multipliant la quantité par le prix (assumant que le prix est un double)
    double quantiteDouble = Double.parseDouble(quantite);
    double prixDouble = Double.parseDouble(prix);
    double total = quantiteDouble * prixDouble;
    
    bonEntree += "Total: " + total + " Fc" + "\n"; // Affichage du total

    return bonEntree;
    }//GEN-LAST:event_bonEntrerActionPerformed

    private void situationStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situationStockActionPerformed
       // Créez une instance de la classe SituationProduits
    SituationProduits situationProduits = new SituationProduits();

    // Appelez la méthode pour afficher la situation de stock dans votre table actuelle
    situationProduits.afficherSituationProduits(table1); // Assurez-vous que table1 est la table que vous souhaitez mettre à jour
    }//GEN-LAST:event_situationStockActionPerformed

    private void modifier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier1ActionPerformed
        
    }//GEN-LAST:event_modifier1ActionPerformed

    private void redemarerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redemarerMouseClicked
        // TODO add your handling code here:
        approvisionnement apro = new approvisionnement();
        apro.setVisible(true);
        this.setVisible(false);
          
    }//GEN-LAST:event_redemarerMouseClicked

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
        // Récupérez la ligne sélectionnée dans la table
    int selectedRow = table1.getSelectedRow();

    // Assurez-vous qu'une ligne est sélectionnée
    if (selectedRow >= 0) {
        // Récupérez l'ID de l'approvisionnement à supprimer
        int idApprovisionnement = (int) table1.getValueAt(selectedRow, 0);

        int confirmation = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer cet approvisionnement ?", "Confirmation de suppression", JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                Connection conn = getConnection();

                // Requête SQL pour supprimer un approvisionnement en fonction de son ID
                String query = "DELETE FROM approvisionnement WHERE id=?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setInt(1, idApprovisionnement);

                int rowsDeleted = preparedStatement.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Approvisionnement supprimé avec succès !");
                    // Chargez à nouveau les données des approvisionnements après la suppression
                    chargerDonneesApprovisionnements();
                } else {
                    JOptionPane.showMessageDialog(null, "La suppression a échoué. Assurez-vous de sélectionner un approvisionnement.");
                }

                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erreur lors de la suppression de l'approvisionnement : " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner un approvisionnement à supprimer.");
    }
    }//GEN-LAST:event_supprimerActionPerformed

    private void sortieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortieActionPerformed
        entreStock entre = new entreStock();
        entre.setVisible(true);
    }//GEN-LAST:event_sortieActionPerformed
    private int getProductIdByName(String productName) {
    int productId = -1; // Valeur par défaut en cas de non correspondance

    try {
        Connection conn = getConnection(); // Établir une connexion à la base de données

        // Requête SQL pour rechercher l'ID du produit en fonction de son nom
        String query = "SELECT id FROM produit WHERE nom_produit = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, productName);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            productId = resultSet.getInt("id"); // Obtenir l'ID du produit
        }

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        // Gérer les exceptions SQL ici
    }

    return productId;
}
    
   // Dans la méthode chargerDonneesApprovisionnements
private void chargerDonneesApprovisionnements() {
    try {
        Connection conn = getConnection(); // Établir une connexion à la base de données
        String query = "SELECT a.id, p.nom_produit, a.quantite, f.nom AS nom_fournisseur, a.mesure, a.prix, a.date FROM approvisionnement a " +
                       "INNER JOIN produit p ON a.produit_id = p.id " +
                       "INNER JOIN fournisseur f ON a.fournisseur_id = f.id";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        // Créer un modèle de table pour stocker les données de la table1
        DefaultTableModel model = (DefaultTableModel) table1.getModel();

        // Effacer les données actuelles de la table1
        model.setRowCount(0);

        // Parcourir les résultats de la requête
        while (rs.next()) {
            int id = rs.getInt("id");
            String produit = rs.getString("nom_produit");
            String quantite = rs.getString("quantite");
            String fournisseur = rs.getString("nom_fournisseur");
            String mesure = rs.getString("mesure");
            String prix = rs.getString("prix");
            String date = rs.getString("date");

            // Ajouter une nouvelle ligne au modèle de table avec les données
            model.addRow(new Object[]{id, produit, quantite, fournisseur, mesure, prix, date});
        }

        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur lors du chargement des données : " + e.getMessage());
    }
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new approvisionnement().setVisible(true);
            }
        });
    }
    
    private void remplirComboboxFournisseur() {
    try {
        Connection conn = getConnection();
        String query = "SELECT nom FROM fournisseur"; // Remplacez "nom_fournisseur" par le nom de la colonne contenant les noms des fournisseurs dans votre table
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            String nomFournisseur = rs.getString("nom");
            fournisseur.addItem(nomFournisseur);
        }
        
        conn.close();
    } catch (SQLException e) {
        // Gérer les exceptions SQL ici
        e.printStackTrace();
    }
}
    private void remplirComboboxProduit() {
    try {
        Connection conn = getConnection();
        String query = "SELECT nom_produit FROM produit"; // Remplacez "nom_produit" par le nom de la colonne contenant les noms des produits dans votre table
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            String nomProduit = rs.getString("nom_produit");
            poduit.addItem(nomProduit);
        }
        
        conn.close();
    } catch (SQLException e) {
        // Gérer les exceptions SQL ici
        e.printStackTrace();
    }
}
private int getFournisseurIdByName(String fournisseurName) {
    int fournisseurId = -1; // Valeur par défaut en cas de non correspondance

    try {
        Connection conn = getConnection(); // Établir une connexion à la base de données

        // Requête SQL pour rechercher l'ID du fournisseur en fonction de son nom
        String query = "SELECT id FROM fournisseur WHERE nom = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, fournisseurName);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            fournisseurId = resultSet.getInt("id"); // Obtenir l'ID du fournisseur
        }

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        // Gérer les exceptions SQL ici
    }

    return fournisseurId;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle bonEntrer;
    private app.bolivia.swing.JCTextField date;
    private rojerusan.RSMaterialButtonCircle enregistrer;
    private javax.swing.JComboBox<String> fournisseur;
    private app.bolivia.swing.JCTextField id;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mesure;
    private rojerusan.RSMaterialButtonCircle modifier1;
    private javax.swing.JComboBox<String> poduit;
    private app.bolivia.swing.JCTextField prix;
    private app.bolivia.swing.JCTextField quantite;
    private javax.swing.JLabel redemarer;
    private rojerusan.RSMaterialButtonCircle situationStock;
    private rojerusan.RSMaterialButtonCircle sortie;
    private rojerusan.RSMaterialButtonCircle supprimer;
    private rojeru_san.complementos.RSTableMetro table1;
    // End of variables declaration//GEN-END:variables
}
