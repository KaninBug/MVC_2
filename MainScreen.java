import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainScreen {
    private JFrame mainJFrame;
    private JButton start;
    private JLabel title;

    public MainScreen() {
        // Setting "mainJFrame" JFrame
        mainJFrame = new JFrame("Magical Aminals");
        mainJFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Complements of this JFrame
        complements();

        // Setting "mainJFrame" JFrame
        mainJFrame.setLayout(null);
        mainJFrame.setVisible(true);
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void complements() {
        // Set "title" JLabel
        title = new JLabel("Magical Animals in School");
        title.setBounds(650, 300, 800, 100);
        title.setFont(new Font(null, Font.BOLD, 50));
        mainJFrame.add(title);

        // Set "start" JButton
        start = new JButton("Start");
        start.setBounds(850,500,200,100);
        start.setFont(new Font(null, Font.BOLD, 30));
        start.setFocusPainted(false);
        mainJFrame.add(start);

        buttonAction();
    }

    // Buttom process
    private void buttonAction() {
        MyActionListener listener = new MyActionListener();
        start.addActionListener(listener);
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();

            // "start"
            if(source == start) {
                ClassifyScreen cs = new ClassifyScreen();
                mainJFrame.dispose();
            }
        }
    }

    public static void main(String[] args) {
        MainScreen m = new MainScreen();
    }
}