import javax.swing.*;

public class Tutorial extends JPanel {
    String bgImgPath = "Untitled_design-removebg-preview.png";

    public Tutorial() {
        this.setLayout(null);

        JPanel bgPanel = new JPanel(null);
        bgPanel.setBounds(0, 0, 1500, 750);
        this.add(bgPanel);

        Img.bg(bgPanel, bgImgPath); // use Img class only
    }
}