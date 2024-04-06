package Layout.models.FrontEnd.MainLayout.Pages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class navbar {

    private JFrame frame;
    private JTextField textField;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    navbar window = new navbar();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public navbar() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1076, 626);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Navbar panel
        JPanel navbarPanel = new JPanel();
        navbarPanel.setBackground(new Color(0, 0, 0));
        navbarPanel.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
        navbarPanel.setBounds(0, 0, 1076, 34);
        frame.getContentPane().add(navbarPanel);
        navbarPanel.setLayout(null);

        // Exit button
        JButton exitButton = new JButton("");
        exitButton.setBackground(new Color(0, 0, 0));
        exitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        exitButton.setIcon(new ImageIcon(navbar.class.getResource("../../../../images/icons8_exit_30px.png")));
        exitButton.setForeground(new Color(251, 252, 255));
        exitButton.setBounds(6, 5, 32, 29);
        navbarPanel.add(exitButton);

        // Settings button
        JButton settingsButton = new JButton("");
        settingsButton.setBackground(new Color(0, 0, 0));
        settingsButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        settingsButton.setForeground(new Color(242, 244, 244));
        settingsButton
                .setIcon(new ImageIcon(navbar.class.getResource("../../../../images/icons8_settings_30px_1.png")));
        settingsButton.setBounds(118, 5, 42, 29);
        settingsButton.setHorizontalAlignment(SwingConstants.LEFT);
        navbarPanel.add(settingsButton);

        // Title label
        JLabel titleLabel = new JLabel("Sản phẩm");
        titleLabel.setForeground(new Color(253, 255, 253));
        titleLabel.setBackground(new Color(255, 255, 255));
        titleLabel.setBounds(442, 4, 125, 23);
        titleLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
        navbarPanel.add(titleLabel);

        // Name label
        JLabel nameLabel = new JLabel("Tây đẹp trai");
        nameLabel.setForeground(new Color(251, 252, 255));
        nameLabel.setBounds(38, 10, 90, 16);
        navbarPanel.add(nameLabel);

        // Sidebar panel
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBackground(new Color(0, 0, 0));
        sidebarPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        sidebarPanel.setBounds(0, 34, 161, 558);
        frame.getContentPane().add(sidebarPanel);
        sidebarPanel.setLayout(new GridLayout(10, 1, 0, 0));

        // Navbar label
        JLabel navbarLabel = new JLabel("Navbar");
        navbarLabel.setForeground(new Color(247, 249, 255));
        navbarLabel.setBackground(new Color(0, 0, 0));
        navbarLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
        navbarLabel.setHorizontalAlignment(SwingConstants.CENTER);
        sidebarPanel.add(navbarLabel);

        // Buttons for navigation
        String[] navItems = { "Sản phẩm", "Loại sản phẩm", "Phiếu nhập", "Khuyến mãi", "Hoá đơn", "Khách hàng",
                "Nhân viên", "Nhà cung cấp", "Đăng xuất" };
        for (String item : navItems) {
            JButton navButton = new JButton(item);
            navButton.setHorizontalAlignment(SwingConstants.LEFT);
            navButton.setBackground(Color.WHITE);
            navButton.setForeground(new Color(0, 0, 0));
            sidebarPanel.add(navButton);
        }

        // Main content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setBounds(151, 36, 919, 556);
        frame.getContentPane().add(contentPanel);
        contentPanel.setLayout(null);

        // Search panel
        JPanel searchPanel = new JPanel();
        searchPanel.setBounds(0, 0, 924, 104);
        contentPanel.add(searchPanel);
        searchPanel.setLayout(null);

        // Table panel
        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(10, 116, 914, 450);
        contentPanel.add(tablePanel);
        tablePanel.setLayout(null);

        // Create table with sample data
        Object[][] data = { { "1", "001", "Laptop", "1000", "10", "laptop.jpg", "Active" },
                { "2", "002", "Smartphone", "800", "20", "phone.jpg", "Active" },
                { "3", "001", "Tablet", "500", "15", "tablet.jpg", "Inactive" },
                { "4", "003", "Smartwatch", "300", "25", "watch.jpg", "Active" },
                { "5", "004", "Desktop", "1200", "8", "desktop.jpg", "Active" } };
        String[] columnNames = { "ID", "Product Code", "Product Name", "Price", "Quantity", "Image", "Status" };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(80);
        table.getColumnModel().getColumn(4).setPreferredWidth(80);
        table.getColumnModel().getColumn(5).setPreferredWidth(120);
        table.getColumnModel().getColumn(6).setPreferredWidth(80);
        JTableHeader header = table.getTableHeader();
        header.setPreferredSize(new Dimension(header.getWidth(), 30));
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) table.getTableHeader()
                .getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        headerRenderer.setBackground(Color.BLUE);
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        DefaultTableCellRenderer headerRenderer1 = new DefaultTableCellRenderer();
        headerRenderer1.setBackground(Color.BLACK);
        headerRenderer1.setForeground(Color.WHITE);
        headerRenderer1.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer1);
        }
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 6, 915, 438);
        tablePanel.add(scrollPane);
        scrollPane.setViewportView(table);
    }
}
