package approvisionnement;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 


public class BonEntreeStockApp extends JFrame {

    private JTextArea bonEntreeTextArea;
    private JButton imprimerButton;
   

    

    public BonEntreeStockApp() {
        initComponents();
         
    }

    public BonEntreeStockApp(String bonEntreeData) {
    initComponents();
    bonEntreeTextArea.setText(bonEntreeData);
}

      

    private void initComponents() {
        setTitle("Bon d'Entrée en Stock");
        setSize(400, 300);
         setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

        bonEntreeTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(bonEntreeTextArea);
        add(scrollPane, BorderLayout.CENTER);
        imprimerButton = new JButton("Imprimer");
        imprimerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            printBonEntree(); // Appeler la méthode d'impression
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(imprimerButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }  
   private void imprimerBonEntree(int idApprovisionnement, String produit, String quantite, String fournisseur, String mesure, String prix, String date) {
    String contenuBonEntree = generateBonEntree(idApprovisionnement, produit, quantite, fournisseur, mesure, prix, date);

    bonEntreeTextArea.setText(contenuBonEntree);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    try {
        bonEntreeTextArea.print();
    } catch (PrinterException ex) {
        ex.printStackTrace();
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
    
    bonEntree += "Total: " + total + "\n"; // Affichage du total

    return bonEntree;
}
   
   private void printBonEntree() {
    try {
        boolean complete = bonEntreeTextArea.print();
        if (complete) {
            // Impression réussie
            System.out.println("Impression réussie.");
        } else {
            // Impression annulée
            System.out.println("Impression annulée.");
        }
    } catch (PrinterException ex) {
        // Gérer les erreurs d'impression
        ex.printStackTrace();
    }
}


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BonEntreeStockApp().setVisible(true);
            }
        });
    }
}



