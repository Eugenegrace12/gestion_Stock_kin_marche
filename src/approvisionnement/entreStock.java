 
package approvisionnement;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import approvisionnement.BonEntreeStockApp;

public class entreStock extends javax.swing.JFrame {
private int quantiteActuelle = 1; // Initialisez la quantité à 1 par défaut
     
    public entreStock() {
        initComponents();
        remplirComboboxProduit();
        // Écouteur pour le bouton "plus"
plus.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        quantiteActuelle++;
        quantite.setText(String.valueOf(quantiteActuelle));
    }
});

// Écouteur pour le bouton "moin"
moin.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (quantiteActuelle > 1) {
            quantiteActuelle--;
            quantite.setText(String.valueOf(quantiteActuelle));
        }
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
        mesproduits = new javax.swing.JComboBox<>();
        moin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantite = new app.bolivia.swing.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(mesproduits, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 20));

        moin.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        moin.setForeground(new java.awt.Color(204, 0, 51));
        moin.setText("-");
        moin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(moin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 20, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Produit");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, -1));

        quantite.setBackground(new java.awt.Color(102, 153, 255));
        quantite.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        quantite.setText("1");
        jPanel1.add(quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 130, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantité");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 110, -1));

        plus.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(204, 0, 51));
        plus.setText("+");
        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 20, 20));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(153, 0, 0));
        rSMaterialButtonCircle1.setText("bon de sortie");
        jPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 140, 60));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(153, 0, 0));
        rSMaterialButtonCircle2.setText("sortir");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 260));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("sortie en stock");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\cross.png")); // NOI18N
        jLabel5.setText(" ");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
     // Récupérez le produit sélectionné
    String produitSelectionne = mesproduits.getSelectedItem().toString();

    // Récupérez la quantité saisie
    int quantiteSortie = Integer.parseInt(quantite.getText());

    try {
        Connection conn = getConnection();

        // Requête SQL pour mettre à jour la quantité en stock
        String updateQuery = "UPDATE a " +
                            "SET a.quantite = a.quantite - ? " +
                            "FROM approvisionnement a " +
                            "INNER JOIN produit p ON a.produit_id = p.id " +
                            "WHERE p.nom_produit = ?";

        PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
        updateStmt.setInt(1, quantiteSortie);
        updateStmt.setString(2, produitSelectionne);

        int rowsUpdated = updateStmt.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, quantiteSortie + " unité(s) de " + produitSelectionne + " ont été retirées du stock.");

            // Demandez si l'utilisateur souhaite générer un bon de sortie
            int choix = JOptionPane.showConfirmDialog(null, "Voulez-vous générer un bon de sortie?", "Confirmation", JOptionPane.YES_NO_OPTION);
            
            if (choix == JOptionPane.YES_OPTION) {
                // Générez et affichez le bon de sortie
                genererBonSortie(produitSelectionne, quantiteSortie);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La mise à jour a échoué. Vérifiez le produit sélectionné et la quantité.");
        }

        conn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour du stock : " + ex.getMessage());
    }
}

private void genererBonSortie(String produit, int quantiteSortie) {
    // Créez une instance de BonSortieStockApp avec les informations pertinentes
    String bonSortieData = generateBonSortie(produit, quantiteSortie);
    BonSortieStockApp bonSortieApp = new BonSortieStockApp(bonSortieData);

    // Affichez la fenêtre du bon de sortie
    bonSortieApp.setVisible(true);
}

private String generateBonSortie(String produit, int quantiteSortie) {
    // Générez le contenu du bon de sortie ici en fonction des informations de la sortie
    // Vous pouvez formater le contenu selon vos besoins
    
    String bonSortie = "Bon de Sortie\n";
    bonSortie += "-------------------\n";
    bonSortie += "Produit: " + produit + "\n";
    bonSortie += "Quantité sortie: " + quantiteSortie + "\n";
    // Autres informations de sortie

    return bonSortie;

    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entreStock().setVisible(true);
            }
        });
    }
     private void remplirComboboxProduit() {
    try {
        Connection conn = getConnection();
        String query = "SELECT nom_produit FROM produit";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            String nomProduit = rs.getString("nom_produit");
            mesproduits.addItem(nomProduit); // Ajoutez le nom du produit au JComboBox
        }

        conn.close();
    } catch (SQLException e) {
        // Gérer les exceptions SQL ici
        e.printStackTrace();
    }
}
     



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mesproduits;
    private javax.swing.JLabel moin;
    private javax.swing.JLabel plus;
    private app.bolivia.swing.JCTextField quantite;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    // End of variables declaration//GEN-END:variables
}
