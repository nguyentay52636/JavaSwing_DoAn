package Layout.models.FrontEnd.ButtonHandler;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Layout.models.BackEnd.BUS.ManagerTypeProductBUS;
import Layout.models.BackEnd.DTO.TypeProductDTO;
import Layout.models.FrontEnd.GUI.ManagerTypeProductGUI;

public class ButtonHandlerTypeProduct extends JFrame {
    private String title;
    private String maLoai;
    private ManagerTypeProductGUI formTypeProduct;

    String type;
    ManagerTypeProductBUS qllspBUS = new ManagerTypeProductBUS();
    TypeProductDTO lspSua;

    JTextField txMalsp = new JTextField(15);
    JTextField txTenlsp = new JTextField(15);
    JTextArea txMota = new JTextArea(3, 15);

    JButton btnThem = new JButton("Thêm");
    JButton btnSua = new JButton("Sửa");
    JButton btnHuy = new JButton("Hủy");

    public ButtonHandlerTypeProduct(String title, String maLoai, ManagerTypeProductGUI formTypeProduct) {
        this.title = title;
        this.maLoai = maLoai;
        this.formTypeProduct = formTypeProduct;
        initComponents();
    }

    public void initComponents() {
        this.setLayout(new BorderLayout());
        this.setSize(450, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.type = this.title;

        // inputs
        txMalsp.setBorder(BorderFactory.createTitledBorder("Mã loại"));
        txTenlsp.setBorder(BorderFactory.createTitledBorder("Tên loại"));
        txMota.setBorder(BorderFactory.createTitledBorder("Mô tả"));

        JPanel plInput = new JPanel();
        plInput.add(txMalsp);
        plInput.add(txTenlsp);
        plInput.add(txMota);

        // panel buttons
        JPanel plButton = new JPanel();

        // 2 case Thêm - Sửa
        if (this.type.equals("Thêm")) {
            this.setTitle("Thêm loại sản phẩm");
            txMalsp.setText(qllspBUS.getNextID());

            btnThem.setIcon(new ImageIcon(this.getClass().getResource("/Layout/images/icons8_add_30px.png")));
            plButton.add(btnThem);

        } else {
            this.setTitle("Sửa loại sản phẩm");
            for (TypeProductDTO lsp : qllspBUS.getDslsp()) {
                if (lsp.getMaLoaiSanPham().equals(this.maLoai)) {
                    this.lspSua = lsp;
                }
            }
            if (this.lspSua == null) {
                JOptionPane.showMessageDialog(null, "Lỗi, không tìm thấy loại sản phẩm");
                this.dispose();
            }

            txMalsp.setText(this.lspSua.getMaLoaiSanPham());
            txTenlsp.setText(this.lspSua.getTenLoaiSanPham());
            txMota.setText(this.lspSua.getMoTa());

            txMalsp.setEditable(false);

            btnSua.setIcon(new ImageIcon(this.getClass().getResource("/Layout/images/icons8_support_30px.png")));
            plButton.add(btnSua);
        }

        btnHuy.setIcon(new ImageIcon(this.getClass().getResource("/Layout/images/icons8_cancel_30px_1.png")));
        plButton.add(btnHuy);

        this.add(plInput, BorderLayout.CENTER);
        this.add(plButton, BorderLayout.SOUTH);

        // mouse listener
        btnThem.addActionListener((ae) -> {
            btnThemMouseClicked();
        });
        btnSua.addActionListener((ae) -> {
            btnSuaMouseClicked();
        });
        btnHuy.addActionListener((ae) -> {
            this.dispose();
        });

        this.setVisible(true);
    }

    private void btnThemMouseClicked() {
        if (checkEmpty()) {
            String malsp = txMalsp.getText();
            String tenlsp = txTenlsp.getText();
            String mota = txMota.getText();

            JOptionPane.showMessageDialog(this, "Thêm " + tenlsp + " thành công!");

            if (qllspBUS.add(malsp, tenlsp, mota)) {
//                JOptionPane.showMessageDialog(this, "Thêm " + tenlsp + " thành công!");
            }
        }
        formTypeProduct.refresh();
    }

    private void btnSuaMouseClicked() {
        if (checkEmpty()) {
            String malsp = txMalsp.getText();
            String tenlsp = txTenlsp.getText();
            String mota = txMota.getText();

            if (qllspBUS.update(malsp, tenlsp, mota)) {
                JOptionPane.showMessageDialog(this, "Sửa " + malsp + " thành công!");
                this.dispose();
            }
        }
        formTypeProduct.refresh();
    }

    private Boolean checkEmpty() {
        String malsp = txMalsp.getText();
        String tenlsp = txTenlsp.getText();
        String mota = txMota.getText();

        if (malsp.trim().equals("")) {
            return showErrorTx(txMalsp, "Mã loại sản phẩm không được để trống");

        } else if (tenlsp.trim().equals("")) {
            return showErrorTx(txTenlsp, "Tên loại sản phẩm không được để trống");

        } else if (mota.trim().equals("")) {
            return showErrorTx(txMota, "Mô tả không được để trống");
        }

        return true;
    }

    private Boolean showErrorTx(JTextField tx, String errorInfo) {
        JOptionPane.showMessageDialog(tx, errorInfo);
        tx.requestFocus();
        return false;
    }

    private Boolean showErrorTx(JTextArea tx, String errorInfo) {
        JOptionPane.showMessageDialog(tx, errorInfo);
        tx.requestFocus();
        return false;
    }
}
