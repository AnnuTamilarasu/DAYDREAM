import javax.swing.*;

public class HomePg extends JPanel {

    private JButton play;
    private JButton tutorial;

    public HomePg() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));                                 
        
        play = new JButton("Click Me");
        play.addActionListener(e -> System.out.println("Button Clicked!"));
        this.add(play);

        tutorial= new JButton("Another Button");
        tutorial.addActionListener(e -> System.out.println("Another Button Clicked!"));
        this.add(tutorial);
        
        JLabel label = new JLabel("Welcome to the Home Page");
        this.add(label);
        this.setSize(400, 300);
    }   
}