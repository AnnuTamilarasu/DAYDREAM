import java.awt.event.ActionListener;
import javax.swing.*;

public class HomePg extends JPanel implements ActionListener {

    JButton play;
    JButton tutorial;

    public HomePg() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));                                 
        
        play = new JButton("Click Me");
        //play.addActionListener(e -> System.out.println("Button Clicked!"));
        this.add(play);

        tutorial= new JButton("Another Button");
        //tutorial.addActionListener(e -> System.out.println("Another Button Clicked!"));
        this.add(tutorial);
        
        JLabel label = new JLabel("Welcome to the Home Page");
        this.add(label);
        this.setSize(400, 300);
    }   
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == play) {
            //this.add(new GamePg());
            System.out.println("Play button clicked!");
        } else if (e.getSource() == tutorial) {
            //new Tutorial();
            System.out.println("Tutorial button clicked!");
        }
    }
            
}