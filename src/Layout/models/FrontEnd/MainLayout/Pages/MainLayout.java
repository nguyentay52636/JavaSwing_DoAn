package Layout.models.FrontEnd.MainLayout.Pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Layout.models.FrontEnd.NavigationBar.NavBarButton;
import Layout.models.FrontEnd.NavigationBar.NavBarContrainer;
import Layout.models.FrontEnd.NavigationBar.NavBarSeperator;
import Layout.models.FrontEnd.NavigationBar.NavBarTitle;

public class MainLayout extends JFrame {
    final int WIDTH = 1400, HEIGHT = 800;
    JPanel plContent = new JPanel();

    int px, py;
    NavBarButton currentTab;
    NavBarContrainer menu, header;
    NavBarTitle headerTitle;

    public MainLayout() {
        initializeUI();
    }

    private void initializeUI() {
        setLayout(new BorderLayout());
        setSize(WIDTH, HEIGHT);
        setTitle("Quản Lý Điện Thoại");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLocationRelativeTo(null);

        ImageIcon logo = new ImageIcon(
                getClass().getResource("../../../../images/icons8_windows_phone_store_30px.png"));
        setIconImage(logo.getImage());
        createHeader();
        // addMouseListener(this);
        menu = new NavBarContrainer(new Rectangle(0, 0, WIDTH, HEIGHT));

        add(menu, BorderLayout.WEST);
        add(header, BorderLayout.NORTH);
        add(plContent, BorderLayout.CENTER);
        createMenu();

    }

    public void createMenu() {
        String[] navItemInfo = {
                "seperate", "2", "", "",
                "Bán hàng", "icons8_small_business_30px_3.png", "qlBanHang", "qlBanHang",
                "Nhập hàng", "icons8_downloads_30px.png", "qlNhapHang", "qlNhapHang",
                "seperate", "2", "", "",
                "Sản phẩm", "icons8_multiple_smartphones_30px.png", "xemSanPham", "qlSanPham",
                "Loại sản phẩm", "icons8_dossier_folder_30px.png", "xemLoaiSanPham", "qlLoaiSanPham",
                "Hóa đơn", "icons8_agreement_30px.png", "xemHoaDon", "qlHoaDon",
                "Phiếu nhập", "icons8_truck_30px.png", "xemPheuNhap", "qlPhieuNhap",
                "Khuyến mãi", "icons8_gift_30px.png", "xemKhuyenMai", "qlKhuyenMai",
                "seperate", "1", "", "",
                "Nhân viên", "icons8_assistant_30px.png", "xemNhanVien", "qlNhanVien",
                "Khách hàng", "icons8_user_30px.png", "xemKhachHang", "qlKhachHang",
                "Nhà cung cấp", "icons8_company_30px.png", "xemNCC", "qlNCC",
                "seperate", "1", "", "",
                "Tài khoản", "icons8_key_30px.png", "xemTaiKhoan", "qlTaiKhoan",
                "Quyền", "icons8_police_badge_30px.png", "xemQuyen", "qlQuyen",
                "seperate", "1", "", "",
                "Thống kê", "icons8_bar_chart_30px.png", "", "",
                "Công cụ", "icons8_maintenance_30px.png", "", "",
                "Cài đặt", "icons8_settings_30px.png", "", ""
        };
        int menuWidth = 300;
        int menuHeight = 0;
        menu = new NavBarContrainer(new Rectangle(0, 0, menuWidth, HEIGHT));
        for (int i = 0; i < navItemInfo.length; i += 4) {
            // Tạo phân cách cho menu
            if (navItemInfo[i].equals("seperate")) {
                NavBarSeperator s = new NavBarSeperator(new Rectangle(0, 0, 0, Integer.parseInt(navItemInfo[i + 1])));
                menu.addItem(s);
            } else {
                // Tạo nút cho menu
            }
        }
        JScrollPane scrollMenu = new JScrollPane(menu, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        menu.setAutoscrolls(true);
        menu.setPreferredSize(new Dimension(menuWidth, menuHeight + 100));
        scrollMenu.setPreferredSize(new Dimension(menuWidth, HEIGHT));
        scrollMenu.setBorder(BorderFactory.createEmptyBorder());
        scrollMenu.getVerticalScrollBar().setUnitIncrement(5);
        add(scrollMenu, BorderLayout.WEST);
    }

    public void createHeader() {
        int headerBg = 30;
        int headerH = 55;
        header = new NavBarContrainer(new Rectangle(0, 0, WIDTH, headerH));
        header.setBackground(new Color(headerBg, headerBg, headerBg));

        headerTitle = new NavBarTitle(new Rectangle((WIDTH - 400) / 2, 0, 400, headerH), "QUẢN LÝ CỬA HÀNG ĐIỆN THOẠI");
        headerTitle.setColorDefault(new Color(200, 200, 200));

        headerTitle.setBgDefault(new Color(headerBg, headerBg, headerBg));
        headerTitle.setFontSize(23);
        header.addItem(headerTitle, false);

        int btnWidth = 50;
        int iconSize = 30;
        NavBarButton btnClose = new NavBarButton(new Rectangle(WIDTH - btnWidth, 0, btnWidth, headerH), "",
                "icons8_shutdown_30px_1.png");
        btnClose.setIconLocation(
                new Rectangle((btnWidth - iconSize) / 2, (headerH - iconSize) / 2, iconSize, iconSize));
        btnClose.setBgDefault(new Color(headerBg, headerBg, headerBg));
        btnClose.setBgHover(new Color(190, 45, 45));
        btnClose.setToolTipText("Thoát");
        btnClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                int reply = JOptionPane.showConfirmDialog(getRootPane(),
                        "Bạn có chắc muốn thoát chương trình Quản Lý?", "Chú ý",
                        JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        header.addItem(btnClose, false);
        NavBarButton btnMinimize = new NavBarButton(new Rectangle(WIDTH - btnWidth * 2, 0, btnWidth, headerH), "",
                "icons8_angle_down_30px.png");
        btnMinimize.setIconLocation(
                new Rectangle((btnWidth - iconSize) / 2, (headerH - iconSize) / 2, iconSize, iconSize));
        btnMinimize.setBgDefault(new Color(headerBg, headerBg, headerBg));
        btnMinimize.setBgHover(new Color(49, 49, 49));
        btnMinimize.setToolTipText("Thu nhỏ");
        btnMinimize.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                setState(ICONIFIED);
            }
        });
        header.addItem(btnMinimize, false);
        add(header, BorderLayout.NORTH);
        header.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                px = me.getX();
                py = me.getY();
            }
        });
    }

    public void createContentPanel() {

    }

    public void doAction() {

    }

}
