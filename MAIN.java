import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        HomePg homePg = new HomePg();
        homePg.setVisible(true);
    }
}