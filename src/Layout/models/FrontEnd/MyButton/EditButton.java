package Layout.models.FrontEnd.MyButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class EditButton extends JButton {
    public EditButton() {
        this.setText("Edit");
        this.setIcon(new ImageIcon(this.getClass().getResource("/src/Layout/images/icons8_support_30px.png")));
    }
}
