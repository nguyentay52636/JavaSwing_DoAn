package Layout.models.FrontEnd.MyButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImportExcelButton extends JButton {
    public ImportExcelButton() {
        this.setText("Nhập Excel");
        this.setIcon(new ImageIcon(this.getClass().getResource("/src/Layout/images/icons8_ms_excel_30px.png")));
    }
}
