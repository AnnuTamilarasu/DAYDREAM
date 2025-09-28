import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class HomePg extends JFrame implements ActionListener {

    JButton play;
    JButton tutorial;
    JPanel homePanel;
    JLabel background;
    final String HomePath = "hivpw"; // Replace with actual image path

    public HomePg() {
        // Set up the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1500, 800);
        this.setResizable(false);

        // Create the main content panel with null layout for absolute positioning
        homePanel = new JPanel(null);

        // Set up background if image path is valid
        // bg(); // Uncomment when you have a valid image path

        // Add elements to the panel
        elements(homePanel);

        // Add the panel to the frame's content pane
        this.setContentPane(homePanel);

        // Make the frame visible
        this.setVisible(true);
    }

    public void elements(JPanel panel) {
        // Create and position the Start Game button
        play = new JButton("Start Game");
        play.setBounds(560, 300, 200, 60); // Centered horizontally
        play.setFont(new Font("Arial", Font.BOLD, 18));
        play.addActionListener(this);
        play.setFocusPainted(false);
        panel.add(play);

        // Create and position the Tutorial button
        tutorial = new JButton("Tutorial");
        tutorial.setBounds(560, 380, 200, 60); // Below the start button
        tutorial.setFont(new Font("Arial", Font.BOLD, 18));
        tutorial.addActionListener(this);
        tutorial.setFocusPainted(false);
        panel.add(tutorial);

        // Create and position the welcome label
        JLabel label = new JLabel("Welcome to Sudoku", JLabel.CENTER);
        label.setBounds(500, 200, 300, 50); // Above the buttons
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.DARK_GRAY);
        panel.add(label);
    }

    public void setupButton(JButton button, int xPos, int yPos) {
        button.setBounds(xPos, yPos, 380, 150);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.addActionListener(this);
        button.setContentAreaFilled(true);

        if (background != null) {
            background.add(button);
        } else {
            homePanel.add(button);
        }
    }

    public void bg() {
        // Only use this if you have a valid image path
        try {
            background = Img.bg(homePanel, HomePath);
            background.setBounds(0, 0, 1500, 800);
            homePanel.add(background);
            homePanel.setComponentZOrder(background, homePanel.getComponentCount() - 1);
        } catch (Exception e) {
            System.err.println("Could not load background image: " + e.getMessage());
            // Continue without background image
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            GamePg gamePanel = new GamePg();
            this.setContentPane(gamePanel);
            this.revalidate();
            this.repaint();
            gamePanel.startTimerAndMistakes();

        } else if (e.getSource() == tutorial) {
            Tutorial tutorialPanel = new Tutorial();
            this.setContentPane(tutorialPanel);
            this.revalidate();
            this.repaint();
        }
    }
}