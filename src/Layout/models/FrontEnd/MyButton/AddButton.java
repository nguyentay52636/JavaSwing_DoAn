package Layout.models.FrontEnd.MyButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AddButton extends JButton {
    public AddButton() {
        this.setText("Add");
        this.setIcon(new ImageIcon(this.getClass().getResource("/src/Layout/images/icons8_add_30px.png")));

    }
}
