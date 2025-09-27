import javax.swing.*;
public class img{
    JLabel background;
    JLabel imgICON;
    public img(JPanel b, String path){ {
        ImageIcon img = new ImageIcon(path);
        imgICON = new JLabel("", img, JLabel.CENTER);
        imgICON.setBounds(0, 0, 400, 300);
        b.add(imgICON);
    }
        public void bg(JPanel b, String path) {
        ImageIcon img = new ImageIcon(path);
        background = CreateImages.newLabel(CreateImages.icon(bgImgPath));
        background.setBounds(0,0, 1200, 765);
        add(background);
    }
}