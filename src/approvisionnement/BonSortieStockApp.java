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

public class BonSortieStockApp extends JFrame {
    
    private JTextArea bonSortieTextArea;
    private JButton imprimerButton;

    public BonSortieStockApp() {
        initComponents();
        // Centrer la fenêtre au milieu de l'écran
        setLocationRelativeTo(null);
    }

    public BonSortieStockApp(String bonSortieData) {
        initComponents();
        bonSortieTextArea.setText(bonSortieData);
    }

    private void initComponents() {
        setTitle("Bon de Sortie en Stock");
        setSize(250, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        bonSortieTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(bonSortieTextArea);
        add(scrollPane, BorderLayout.CENTER);

        imprimerButton = new JButton("Imprimer");
        imprimerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(imprimerButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void imprimerBonSortie() {
        try {
            boolean complete = bonSortieTextArea.print();
            if (complete) {
                System.out.println("Impression réussie.");
            } else {
                System.out.println("Impression annulée.");
            }
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BonSortieStockApp().setVisible(true);
            }
        });
    }
}
