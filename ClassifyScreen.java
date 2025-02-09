import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClassifyScreen {
    private JFrame classifyJFrame;
    private JButton confirm;
    private JLabel title;

    private JLabel labelPetID;
    private JTextField textPetID;

    private JLabel labelPetType;
    private JTextField textPetType;
    private JButton buttonPetType;

    public ClassifyScreen() {
        // Setting "classifyJFrame" JFrame
        classifyJFrame = new JFrame("Classify process");
        classifyJFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Complements of this JFrame
        complements();

        // Setting "classifyJFrame" JFrame
        classifyJFrame.setLayout(null);
        classifyJFrame.setVisible(true);
        classifyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void complements() {
        // Set "title" JLabel
        title = new JLabel("Classify Pet");
        title.setBounds(800, 50, 800, 100);
        title.setFont(new Font(null, Font.BOLD, 50));
        classifyJFrame.add(title);


        // Set "PetID" Part
        labelPetID = new JLabel("Food ID : ");
        labelPetID.setBounds(600, 200, 800, 100);
        labelPetID.setFont(new Font(null, Font.PLAIN, 25));
        classifyJFrame.add(labelPetID);

        textPetID = new JTextField();
        textPetID.setBounds(720, 225, 250, 50);
        textPetID.setFont(new Font(null, Font.PLAIN, 25));
        classifyJFrame.add(textPetID);


        // Set "PetType" Part
        labelPetType = new JLabel("Pet Type : ");
        labelPetType.setBounds(600, 300, 800, 100);
        labelPetType.setFont(new Font(null, Font.PLAIN, 25));
        classifyJFrame.add(labelPetType);

        textPetType = new JTextField();
        textPetType.setBounds(720, 325, 250, 50);
        textPetType.setFont(new Font(null, Font.PLAIN, 25));
        classifyJFrame.add(textPetType);

        buttonPetType = new JButton("Type");
        buttonPetType.setBounds(970, 325, 100, 50);
        buttonPetType.setFont(new Font(null, Font.PLAIN, 25));
        buttonPetType.setFocusPainted(false);
        classifyJFrame.add(buttonPetType);


        // Set "confirm" JButton
        confirm = new JButton("Confirm");
        confirm.setBounds(850,800,200,100);
        confirm.setFont(new Font(null, Font.BOLD, 30));
        confirm.setFocusPainted(false);
        classifyJFrame.add(confirm);
    }

    // Buttom process
    private void buttonAction() {
        MyActionListener listener = new MyActionListener();
        buttonPetType.addActionListener(listener);
        confirm.addActionListener(listener);
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();

            // "buttonPetType"
            if(source == buttonPetType) {
                textPetType.setText("A");
            }
        }
    }

    public static void main(String[] args) {
        ClassifyScreen c = new ClassifyScreen();
    }
}
