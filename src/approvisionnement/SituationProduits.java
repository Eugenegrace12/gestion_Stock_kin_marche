package approvisionnement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SituationProduits {

  private Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-INKBQQ3\\SA:1433;databaseName=examen;user=tp;password=1234;";
        return DriverManager.getConnection(url);
    }

    public DefaultTableModel getSituationProduits() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nom du Produit");
        model.addColumn("Quantité Totale");

        try (Connection conn = getConnection()) {
            String query = "SELECT p.nom_produit, SUM(a.quantite) AS quantite_totale "
                         + "FROM produit p "
                         + "INNER JOIN approvisionnement a ON p.id = a.produit_id "
                         + "GROUP BY p.nom_produit";

            try (PreparedStatement pstmt = conn.prepareStatement(query);
                 ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    String nomProduit = rs.getString("nom_produit");
                    int quantiteTotale = rs.getInt("quantite_totale");
                    model.addRow(new Object[]{nomProduit, quantiteTotale});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur lors du chargement des données : " + e.getMessage());
        }

        return model;
    }

    public void afficherSituationProduits(JTable table) {
        DefaultTableModel model = getSituationProduits();
        table.setModel(model);
    }

    public static void main(String[] args) {
        SituationProduits situationProduits = new SituationProduits();
        // Remplacez "votreTable" par le composant de votre interface où vous souhaitez afficher les données
        JTable votreTable = new JTable();
        situationProduits.afficherSituationProduits(votreTable);
    }
}