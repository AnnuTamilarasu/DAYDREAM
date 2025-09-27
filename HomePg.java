import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePg extends JFrame implements ActionListener {

    JButton play;
    JButton tutorial;
    JPanel homePanel;
    JLabel background;
    String bgImgPath = "Untitled_design-removebg-preview.png";

    public HomePg() {
        this.setSize(1200, 765);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        homePanel = new JPanel(null); // null layout for manual positioning
        this.add(homePanel);

        bg();           // add background first
        elements();     // then add buttons/label

        this.setVisible(true);
    }   
    
    public void elements() {
        play = new JButton("Play");
        setupButton(play, 100, 200);
        homePanel.add(play);

        tutorial = new JButton("Tutorial");
        setupButton(tutorial, 100, 400);
        homePanel.add(tutorial);

        JLabel label = new JLabel("Welcome to the Home Page");
        label.setBounds(100, 100, 300, 40);
        homePanel.add(label);
    }

    public void setupButton(JButton button, int xPos, int yPos) {
        button.setBounds(xPos, yPos, 200, 50);
        button.setBackground(new Color(222, 172, 159));
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.addActionListener(this);
    }

    public void bg() {
        ImageIcon bgImg = new ImageIcon(bgImgPath);
        background = new JLabel("", bgImg, JLabel.CENTER);
        background.setBounds(0, 0, 1200, 765);
        homePanel.add(background);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            this.setContentPane(new GamePg());
            this.revalidate();
            this.repaint();
        } else if (e.getSource() == tutorial) {
            new Tutorial();
        }
    }
}
