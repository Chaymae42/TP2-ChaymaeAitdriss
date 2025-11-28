import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("TP2 - Java App");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel labelNom = new JLabel("Nom:");
        JTextField textNom = new JTextField(20);

        JLabel labelPrenom = new JLabel("Prénom:");
        JTextField textPrenom = new JTextField(20);

        JButton btnSave = new JButton("Enregistrer");
        JLabel result = new JLabel("");

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText("Nom : " + textNom.getText() +
                        " | Prénom : " + textPrenom.getText());
            }
        });

        frame.add(labelNom);
        frame.add(textNom);
        frame.add(labelPrenom);
        frame.add(textPrenom);
        frame.add(btnSave);
        frame.add(result);

        frame.setVisible(true);
    }
}
