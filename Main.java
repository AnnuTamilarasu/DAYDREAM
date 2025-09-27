import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HomePg homePg = new HomePg();
        mainFrame.add(homePg);

        mainFrame.setVisible(true);
    }
}
