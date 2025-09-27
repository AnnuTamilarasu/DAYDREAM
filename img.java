public class img{
    private JLabel background;
    public img() {
        ImageIcon img = new ImageIcon("path/to/your/image.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 400, 300);
        this.add(background);
    }
        public void bg() {

        background = CreateImages.newLabel(CreateImages.icon(bgImgPath));
        background.setBounds(0,0, 1200, 765);
        add(background);
    }
}