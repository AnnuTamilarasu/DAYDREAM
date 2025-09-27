import java.awt.event.*;
import javax.swing.*;

public class HomePg extends JPanel implements ActionListener {

    JButton play;
    JButton tutorial;

    public HomePg() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));                                 
        
        play = new JButton("Click Me");
        play.addActionListener(this);   // use actionPerformed
        this.add(play);

        tutorial= new JButton("Another Button");
        tutorial.addActionListener(this);
        this.add(tutorial);
        
        JLabel label = new JLabel("Welcome to the Home Page");
        this.add(label);
        this.setSize(400, 300);
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.setContentPane(new GamePg()); 
            topFrame.revalidate();
        } else if (e.getSource() == tutorial) {
            new Tutorial(); // opens new window
        }
    }
}
