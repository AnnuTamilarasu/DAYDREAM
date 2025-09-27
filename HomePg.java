import javax.swing.*;

public class HomePg extends JPanel {
    public HomePg() {
        JLabel label = new JLabel("Welcome to the Home Page");
        this.add(label);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}