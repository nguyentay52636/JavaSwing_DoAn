package Layout.models.FrontEnd.NavigationBar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavBarItem extends JPanel {
    protected JLabel lbLabel;
    protected Color bgDefault, colorDefault;
    protected int fontSize = 16;
    public String text;

    public NavBarItem(Rectangle rec, String text) {
        this.bgDefault = new Color(35, 35, 35);
        this.colorDefault = new Color(255, 255, 255);
        this.text = text;

        lbLabel = new JLabel(text);
        lbLabel.setForeground(colorDefault);
        lbLabel.setFont(new Font("Arial", Font.PLAIN, fontSize));
        add(lbLabel);

    }

    public JLabel getLbLabel() {
        return lbLabel;
    }

    public void setLbLabel(JLabel lbLabel) {
        this.lbLabel = lbLabel;
    }

    public Color getBgDefault() {
        return bgDefault;
    }

    public void setBgDefault(Color bgDefault) {
        this.bgDefault = bgDefault;
    }

    public Color getColorDefault() {
        return colorDefault;
    }

    public void setColorDefault(Color colorDefault) {
        this.colorDefault = colorDefault;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
