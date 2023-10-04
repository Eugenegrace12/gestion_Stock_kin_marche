 
package kinmarcher.login.dashboard;

import approvisionnement.approvisionnement;
import client.client;
import fourniseur.fourniseur;
import kinmarcher.login.login;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.Timer;
import produit.produit;



public class dashboad extends javax.swing.JFrame {

    
    public dashboad() {
        initComponents();
      
         // Ajoutez un ActionListener à jLabel4
    jLabel4.addMouseListener(new MouseAdapter() {
        boolean menuVisible = true; // Variable pour suivre l'état du menu

        public void mouseClicked(MouseEvent e) {
            if (menuVisible) {
                // Masquez le menu
                menu.setVisible(false);
                menuVisible = false;
            } else {
                // Affichez le menu
                menu.setVisible(true);
                menuVisible = true;
            }
        }
    });
         // Ajoutez un ActionListener à votre combobox
    combo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String selectedOption = (String) combo.getSelectedItem();
            if (selectedOption.equals("nuit")) {
                // Changez les couleurs pour le mode "nuit"
                entete.setBackground(Color.BLACK);
                panelprincipale.setBackground(Color.gray);
                menu.setBackground(Color.DARK_GRAY);
                jTable1.setBackground(Color.black);
               
                // Ajoutez d'autres changements de couleur au besoin
            } else if (selectedOption.equals("normale")) {
                // Remettez les couleurs par défaut pour le mode "normal"
                entete.setBackground(new Color(255, 0, 102)); // Couleur par défaut
                panelprincipale.setBackground(Color.WHITE); // Couleur par défaut
                menu.setBackground(new Color(51, 51, 51)); // Couleur par défaut
                // Rétablissez les couleurs par défaut pour d'autres composants si nécessaire
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

        rSCalendarBeanInfo1 = new rojeru_san.componentes.RSCalendarBeanInfo();
        verticalLabelIUI1 = new necesario.VerticalLabelIUI();
        entete = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        combo = new rojerusan.RSComboMetro();
        jLabel29 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelprincipale = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        noproduit = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entete.setBackground(new java.awt.Color(255, 0, 102));
        entete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Videos\\icons\\male_user_50px.png")); // NOI18N
        jLabel1.setText("  Bonjour Admnin");
        entete.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("|");
        entete.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kin Marché");
        entete.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Videos\\icons\\icons8_menu_48px_1.png")); // NOI18N
        jLabel4.setText(" ");
        entete.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel5.setText("|");
        entete.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Videos\\icons\\search_26px.png")); // NOI18N
        jLabel6.setText(" ");
        entete.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 30, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel7.setText("|");
        entete.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Videos\\icons\\group_message_26px.png")); // NOI18N
        jLabel8.setText(" ");
        entete.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 30, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Videos\\icons\\bell_26px.png")); // NOI18N
        jLabel9.setText(" ");
        entete.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 30, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 25)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Gestion Stock");
        entete.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        getContentPane().add(entete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 70));

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\agreement.png")); // NOI18N
        jLabel23.setText("Fourniseur");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        menu.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 50));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("autres");
        menu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\logout.png")); // NOI18N
        jLabel12.setText("Deconnexion");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        menu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 150, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Videos\\icons\\template_26px.png")); // NOI18N
        jLabel14.setText("disposition");
        menu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 130, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\stock-market.png")); // NOI18N
        jLabel15.setText("approvisionnement");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        menu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, -1));

        jLabel26.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\client.png")); // NOI18N
        jLabel26.setText("client");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        menu.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "normale", "nuit" }));
        combo.setColorArrow(new java.awt.Color(255, 255, 255));
        combo.setColorBorde(new java.awt.Color(0, 0, 0));
        combo.setColorFondo(new java.awt.Color(102, 102, 102));
        menu.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 120, 30));

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Thème");
        menu.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\new-product (2).png")); // NOI18N
        jLabel10.setText("Produit");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        menu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, -1));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 570));

        panelprincipale.setBackground(new java.awt.Color(255, 255, 255));
        panelprincipale.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\new-product (2).png")); // NOI18N
        jLabel20.setText(" ");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 40, 40));

        noproduit.setBackground(new java.awt.Color(91, 91, 91));
        noproduit.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        noproduit.setForeground(new java.awt.Color(255, 255, 255));
        noproduit.setText("20");
        jPanel6.add(noproduit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        panelprincipale.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 230, 190));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 260, 190));

        jPanel11.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\agreement.png")); // NOI18N
        jLabel19.setText(" ");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 40, -1));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("46");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        panelprincipale.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 230, 190));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\EugenePc\\Downloads\\client.png")); // NOI18N
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("30");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        panelprincipale.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 260, 190));

        jLabel13.setBackground(new java.awt.Color(0, 51, 153));
        jLabel13.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 153));
        jLabel13.setText("N0 stockage");
        panelprincipale.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 110, -1));

        jLabel22.setBackground(new java.awt.Color(0, 51, 153));
        jLabel22.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 153));
        jLabel22.setText("N0 Produit");
        panelprincipale.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 130, -1));

        jLabel25.setBackground(new java.awt.Color(0, 51, 153));
        jLabel25.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 0, 153));
        jLabel25.setText("N0 Fournisseur");
        panelprincipale.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 130, -1));

        jTable1.setForeground(new java.awt.Color(102, 0, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelprincipale.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 700, 170));

        getContentPane().add(panelprincipale, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 1010, 640));

        setSize(new java.awt.Dimension(1255, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        login log= new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        fourniseur four = new fourniseur();
        four.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        produit prod = new produit();
        prod.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
         client cli = new client();
         cli.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        approvisionnement apro = new approvisionnement();
        apro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked
   
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSComboMetro combo;
    private javax.swing.JPanel entete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel noproduit;
    private javax.swing.JPanel panelprincipale;
    private rojeru_san.componentes.RSCalendarBeanInfo rSCalendarBeanInfo1;
    private necesario.VerticalLabelIUI verticalLabelIUI1;
    // End of variables declaration//GEN-END:variables
}
