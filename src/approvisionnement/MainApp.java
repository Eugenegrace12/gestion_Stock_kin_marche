package approvisionnement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainApp {
    public static void main(String[] args) {
        try {
            // Définir le look and feel Nimbus
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Créer une fenêtre Swing
        JFrame frame = new JFrame("Situation de Stock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Centrer la fenêtre sur l'écran
        frame.setLocationRelativeTo(null);

        // Créer une JTable pour afficher les données
        JTable table = new JTable();

        // Créer l'instance de la classe SituationProduits
        SituationProduits situationProduits = new SituationProduits();

        // Appeler la méthode pour afficher la situation de stock dans la JTable
        situationProduits.afficherSituationProduits(table);

        // Ajouter la JTable à la fenêtre Swing
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Afficher la fenêtre Swing
        frame.setVisible(true);
    }
}

