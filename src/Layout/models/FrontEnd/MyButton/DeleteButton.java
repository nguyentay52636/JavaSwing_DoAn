package Layout.models.FrontEnd.MyButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DeleteButton extends JButton {
    public DeleteButton() {
        this.setText("Delete");
        this.setIcon(new ImageIcon(this.getClass().getResource("/src/Layout/images/icons8_delete_forever_30px_1.png")));

    }
}
