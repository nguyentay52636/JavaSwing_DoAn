package Layout.models.FrontEnd.FormManager;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormBegin extends JPanel {
    JLabel lbInfo;

    public FormBegin() {
        setLayout(new GridBagLayout());
        lbInfo = new JLabel();
        lbInfo.setFont(new Font("Arial", Font.BOLD, 40));
        lbInfo.setIcon(new ImageIcon(this.getClass().getResource("../../../images/icons8_thumb_up_99px.png")));
        add(lbInfo);
    }

    public void setLabelText(String text) {
        lbInfo.setText(text);
    }
}
