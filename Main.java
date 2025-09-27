import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
    public Main(){
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setVisible(true);
        HomePg homePg = new HomePg();
        this.add(homePg);
        this.setVisible(true);
    }
}