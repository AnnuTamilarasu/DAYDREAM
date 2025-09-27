import javax.swing.*;

public class HomePg extends JPanel {
    public HomePg() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));                                 
        
        JButton play= new JButton("Click Me");
        button.addActionListener(e -> System.out.println("Button Clicked!"));
        this.add(play);

        JButton tutorial= new JButton("Another Button");
        tutorial.addActionListener(e -> System.out.println("Another Button Clicked!"));
        this.add(tutorial);
        
        JLabel label = new JLabel("Welcome to the Home Page");
        this.add(label);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}