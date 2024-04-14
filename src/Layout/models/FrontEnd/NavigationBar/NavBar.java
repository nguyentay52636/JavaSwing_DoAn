package Layout.models.FrontEnd.NavigationBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class NavBar extends JPanel {
    public NavBar() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
         // Generated using JFormDesigner Evaluation license - Master
         panel2 = new JPanel();
         panel3 = new JPanel();
         button3 = new JButton();
         label1 = new JLabel();
         button4 = new JButton();
         scrollPane1 = new JScrollPane();
         panel10 = new JPanel();
         panel11 = new JPanel();
         button21 = new JButton();
         button22 = new JButton();
         panel12 = new JPanel();
         button31 = new JButton();
         button32 = new JButton();
         button33 = new JButton();
         button34 = new JButton();
         button35 = new JButton();
         panel13 = new JPanel();
         button36 = new JButton();
         button37 = new JButton();
         button38 = new JButton();
         panel14 = new JPanel();
         button39 = new JButton();
         button40 = new JButton();
         panel15 = new JPanel();
         button41 = new JButton();
         button42 = new JButton();
         button43 = new JButton();
 
         //======== this ========
         setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
         javax.swing.border.EmptyBorder(0,0,0,0), "",javax
         .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
         .awt.Font("Dialog",java.awt.Font.BOLD,12),java.awt
         .Color.red), getBorder())); addPropertyChangeListener(new java.beans.
         PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".
         equals(e.getPropertyName()))throw new RuntimeException();}});
         setLayout(new BorderLayout());
 
         //======== panel2 ========
         {
             panel2.setLayout(new BorderLayout());
 
             //======== panel3 ========
             {
                 panel3.setLayout(new GridBagLayout());
                 ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                 ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
                 ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
                 ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};
 
                 //---- button3 ----
                 button3.setText("");
                 button3.setBorder(null);
                 panel3.add(button3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                     GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                     new Insets(0, 0, 0, 0), 0, 0));
 
                 //---- label1 ----
                 label1.setText("user name");
                 panel3.add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                     GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                     new Insets(0, 0, 0, 0), 0, 0));
 
                 //---- button4 ----
                 button4.setText("");
                 button4.setBorder(null);
                 panel3.add(button4, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                     GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                     new Insets(0, 0, 0, 0), 0, 0));
 
                 Dimension panelSize = new Dimension(100, 50);
                 panel3.setPreferredSize(panelSize);
             }
             panel2.add(panel3, BorderLayout.NORTH);
 
             //======== scrollPane1 ========
             {
 
                 //======== panel10 ========
                 {
                     panel10.setLayout(new GridBagLayout());
                     ((GridBagLayout)panel10.getLayout()).columnWidths = new int[] {0, 0};
                     ((GridBagLayout)panel10.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
                     ((GridBagLayout)panel10.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                     ((GridBagLayout)panel10.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
 
                     //======== panel11 ========
                     {
                         panel11.setLayout(new GridBagLayout());
                         ((GridBagLayout)panel11.getLayout()).columnWidths = new int[] {0, 0};
                         ((GridBagLayout)panel11.getLayout()).rowHeights = new int[] {0, 0, 0};
                         ((GridBagLayout)panel11.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                         ((GridBagLayout)panel11.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0E-4};
 
                         //---- button21 ----
                         button21.setText("B\u00e1n h\u00e0ng ");
                         button21.setBorder(null);
                         panel11.add(button21, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button22 ----
                         button22.setText("Nh\u1eadp h\u00e0ng ");
                         button22.setBorder(null);
                         panel11.add(button22, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
                     }
                     panel10.add(panel11, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                         GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                         new Insets(0, 0, 0, 0), 0, 0));
 
                     //======== panel12 ========
                     {
                         panel12.setLayout(new GridBagLayout());
                         ((GridBagLayout)panel12.getLayout()).columnWidths = new int[] {0, 0};
                         ((GridBagLayout)panel12.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
                         ((GridBagLayout)panel12.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                         ((GridBagLayout)panel12.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
 
                         //---- button31 ----
                         button31.setText("S\u1ea3n ph\u1ea9m ");
                         button31.setBorder(null);
                         panel12.add(button31, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button32 ----
                         button32.setText("Lo\u1ea1i s\u1ea3n ph\u1ea9m ");
                         button32.setBorder(null);
                         panel12.add(button32, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button33 ----
                         button33.setText("H\u00f3a \u0111\u01a1n ");
                         button33.setBorder(null);
                         panel12.add(button33, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button34 ----
                         button34.setText("Phi\u1ebfu nh\u1eadp ");
                         button34.setBorder(null);
                         panel12.add(button34, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button35 ----
                         button35.setText("Khuy\u1ebfn m\u00e3i ");
                         button35.setBorder(null);
                         panel12.add(button35, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
                     }
                     panel10.add(panel12, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                         GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                         new Insets(0, 0, 0, 0), 0, 0));
 
                     //======== panel13 ========
                     {
                         panel13.setLayout(new GridBagLayout());
                         ((GridBagLayout)panel13.getLayout()).columnWidths = new int[] {0, 0};
                         ((GridBagLayout)panel13.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                         ((GridBagLayout)panel13.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                         ((GridBagLayout)panel13.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
 
                         //---- button36 ----
                         button36.setText("Nh\u00e2n vi\u00ean ");
                         button36.setBorder(null);
                         panel13.add(button36, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button37 ----
                         button37.setText("Kh\u00e1ch h\u00e0ng ");
                         button37.setBorder(null);
                         panel13.add(button37, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button38 ----
                         button38.setText("Nh\u00e0 cung c\u1ea5p ");
                         button38.setBorder(null);
                         panel13.add(button38, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
                     }
                     panel10.add(panel13, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                         GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                         new Insets(0, 0, 0, 0), 0, 0));
 
                     //======== panel14 ========
                     {
                         panel14.setLayout(new GridBagLayout());
                         ((GridBagLayout)panel14.getLayout()).columnWidths = new int[] {0, 0};
                         ((GridBagLayout)panel14.getLayout()).rowHeights = new int[] {0, 0, 0};
                         ((GridBagLayout)panel14.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                         ((GridBagLayout)panel14.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0E-4};
 
                         //---- button39 ----
                         button39.setText("T\u00e0i kho\u1ea3n ");
                         button39.setBorder(null);
                         panel14.add(button39, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button40 ----
                         button40.setText("Quy\u1ec1n ");
                         button40.setBorder(null);
                         panel14.add(button40, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
                     }
                     panel10.add(panel14, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                         GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                         new Insets(0, 0, 0, 0), 0, 0));
 
                     //======== panel15 ========
                     {
                         panel15.setLayout(new GridBagLayout());
                         ((GridBagLayout)panel15.getLayout()).columnWidths = new int[] {0, 0};
                         ((GridBagLayout)panel15.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                         ((GridBagLayout)panel15.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                         ((GridBagLayout)panel15.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};
 
                         //---- button41 ----
                         button41.setText("Th\u1ed1ng k\u00ea ");
                         button41.setBorder(null);
                         panel15.add(button41, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button42 ----
                         button42.setText("C\u00f4ng c\u1ee5 ");
                         button42.setBorder(null);
                         panel15.add(button42, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
 
                         //---- button43 ----
                         button43.setText("C\u00e0i \u0111\u1eb7t ");
                         button43.setBorder(null);
                         panel15.add(button43, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                             new Insets(0, 0, 0, 0), 0, 0));
                     }
                     panel10.add(panel15, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                         GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                         new Insets(0, 0, 0, 0), 0, 0));
                 }
                 scrollPane1.setViewportView(panel10);
             }
             panel2.add(scrollPane1, BorderLayout.CENTER);
         }
         add(panel2, BorderLayout.WEST);
         // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

        // set size the text
        Font buttonFont = new Font("Arial", Font.BOLD, 14);

        button21.setFont(buttonFont);
        button22.setFont(buttonFont);
        button31.setFont(buttonFont);
        button32.setFont(buttonFont);
        button33.setFont(buttonFont);
        button34.setFont(buttonFont);
        button35.setFont(buttonFont);
        button36.setFont(buttonFont);
        button37.setFont(buttonFont);
        button38.setFont(buttonFont);
        button39.setFont(buttonFont);
        button40.setFont(buttonFont);
        button41.setFont(buttonFont);
        button42.setFont(buttonFont);
        button43.setFont(buttonFont);

        Color mainColor = new Color(35, 35, 35);
        Color defaultColor = new Color(150, 150, 150);
        Color whiteColor = new Color(255, 255, 255);

        // set size for button
        Dimension buttonSize = new Dimension(100, 50);

        button21.setPreferredSize(buttonSize);
        button22.setPreferredSize(buttonSize);
        button31.setPreferredSize(buttonSize);
        button32.setPreferredSize(buttonSize);
        button33.setPreferredSize(buttonSize);
        button34.setPreferredSize(buttonSize);
        button35.setPreferredSize(buttonSize);
        button36.setPreferredSize(buttonSize);
        button37.setPreferredSize(buttonSize);
        button38.setPreferredSize(buttonSize);
        button39.setPreferredSize(buttonSize);
        button40.setPreferredSize(buttonSize);
        button41.setPreferredSize(buttonSize);
        button42.setPreferredSize(buttonSize);
        button43.setPreferredSize(buttonSize);

        // set backgroud for button
        // Color colorButton = new Color(35, 35, 35);
        button3.setBackground(mainColor);
        button4.setBackground(mainColor);
        button21.setBackground(mainColor);
        button22.setBackground(mainColor);
        button31.setBackground(mainColor);
        button32.setBackground(mainColor);
        button33.setBackground(mainColor);
        button34.setBackground(mainColor);
        button35.setBackground(mainColor);
        button36.setBackground(mainColor);
        button37.setBackground(mainColor);
        button38.setBackground(mainColor);
        button39.setBackground(mainColor);
        button40.setBackground(mainColor);
        button41.setBackground(mainColor);
        button42.setBackground(mainColor);
        button43.setBackground(mainColor);

        // background and text color for label
        label1.setOpaque(true);
        label1.setForeground(defaultColor);
        label1.setBackground(mainColor);

        // setFoureground
        // Color colorText = new Color(150, 150, 150);
        button21.setForeground(defaultColor);
        button22.setForeground(defaultColor);
        button31.setForeground(defaultColor);
        button32.setForeground(defaultColor);
        button33.setForeground(defaultColor);
        button34.setForeground(defaultColor);
        button35.setForeground(defaultColor);
        button36.setForeground(defaultColor);
        button37.setForeground(defaultColor);
        button38.setForeground(defaultColor);
        button39.setForeground(defaultColor);
        button40.setForeground(defaultColor);
        button41.setForeground(defaultColor);
        button42.setForeground(defaultColor);
        button43.setForeground(defaultColor);

        // set icon for the button
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/Layout/images/icons8_exit_30px.png"));
        ImageIcon iconSetting = new ImageIcon(getClass().getResource("/Layout/images/icons8_settings_30px_1.png"));
        ImageIcon iconBanHang = new ImageIcon(
                getClass().getResource("/Layout/images/icons8_small_business_30px_3.png"));
        ImageIcon iconNhapHang = new ImageIcon(getClass().getResource("/Layout/images/icons8_downloads_30px.png"));
        ImageIcon iconSanPham = new ImageIcon(
                getClass().getResource("/Layout/images/icons8_multiple_smartphones_30px.png"));
        ImageIcon iconLoaiSanPham = new ImageIcon(
                getClass().getResource("/Layout/images/icons8_dossier_folder_30px.png"));
        ImageIcon iconHoaDon = new ImageIcon(getClass().getResource("/Layout/images/icons8_agreement_30px.png"));
        ImageIcon iconPhieuNhap = new ImageIcon(getClass().getResource("/Layout/images/icons8_truck_30px.png"));
        ImageIcon iconKhuyenMai = new ImageIcon(getClass().getResource("/Layout/images/icons8_gift_30px.png"));
        ImageIcon iconNhanVien = new ImageIcon(getClass().getResource("/Layout/images/icons8_assistant_30px.png"));
        ImageIcon iconKhachHang = new ImageIcon(getClass().getResource("/Layout/images/icons8_user_30px.png"));
        ImageIcon iconNhaCungCap = new ImageIcon(getClass().getResource("/Layout/images/icons8_company_30px.png"));
        ImageIcon iconTaiKhoan = new ImageIcon(getClass().getResource("/Layout/images/icons8_key_30px.png"));
        ImageIcon iconQuyen = new ImageIcon(getClass().getResource("/Layout/images/icons8_police_badge_30px.png"));
        ImageIcon iconThongKe = new ImageIcon(getClass().getResource("/Layout/images/icons8_bar_chart_30px.png"));
        ImageIcon iconCongCu = new ImageIcon(getClass().getResource("/Layout/images/icons8_maintenance_30px.png"));
        ImageIcon iconCaiDat = new ImageIcon(getClass().getResource("/Layout/images/icons8_settings_30px.png"));

        button3.setIcon(iconLogout);
        button4.setIcon(iconSetting);
        button21.setIcon(iconBanHang);
        button22.setIcon(iconNhapHang);
        button31.setIcon(iconSanPham);
        button32.setIcon(iconLoaiSanPham);
        button33.setIcon(iconHoaDon);
        button34.setIcon(iconPhieuNhap);
        button35.setIcon(iconKhuyenMai);
        button36.setIcon(iconNhanVien);
        button37.setIcon(iconKhachHang);
        button38.setIcon(iconNhaCungCap);
        button39.setIcon(iconTaiKhoan);
        button40.setIcon(iconQuyen);
        button41.setIcon(iconThongKe);
        button42.setIcon(iconCongCu);
        button43.setIcon(iconCaiDat);

        // set text for the button
        button21.setHorizontalAlignment(SwingConstants.LEFT);
        button22.setHorizontalAlignment(SwingConstants.LEFT);
        button31.setHorizontalAlignment(SwingConstants.LEFT);
        button32.setHorizontalAlignment(SwingConstants.LEFT);
        button33.setHorizontalAlignment(SwingConstants.LEFT);
        button34.setHorizontalAlignment(SwingConstants.LEFT);
        button35.setHorizontalAlignment(SwingConstants.LEFT);
        button36.setHorizontalAlignment(SwingConstants.LEFT);
        button37.setHorizontalAlignment(SwingConstants.LEFT);
        button38.setHorizontalAlignment(SwingConstants.LEFT);
        button39.setHorizontalAlignment(SwingConstants.LEFT);
        button40.setHorizontalAlignment(SwingConstants.LEFT);
        button41.setHorizontalAlignment(SwingConstants.LEFT);
        button42.setHorizontalAlignment(SwingConstants.LEFT);
        button43.setHorizontalAlignment(SwingConstants.LEFT);

        // set size for panel2
        Dimension fixedSize = new Dimension(250, 600);
        panel2.setPreferredSize(fixedSize);

        // cursor
        Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);

        button21.setCursor(handCursor);
        button22.setCursor(handCursor);
        button31.setCursor(handCursor);
        button32.setCursor(handCursor);
        button33.setCursor(handCursor);
        button34.setCursor(handCursor);
        button35.setCursor(handCursor);
        button36.setCursor(handCursor);
        button37.setCursor(handCursor);
        button38.setCursor(handCursor);
        button39.setCursor(handCursor);
        button40.setCursor(handCursor);
        button41.setCursor(handCursor);
        button42.setCursor(handCursor);
        button43.setCursor(handCursor);

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
     // Generated using JFormDesigner Evaluation license - Master
     private JPanel panel2;
     private JPanel panel3;
     private JButton button3;
     private JLabel label1;
     private JButton button4;
     private JScrollPane scrollPane1;
     private JPanel panel10;
     private JPanel panel11;
     private JButton button21;
     private JButton button22;
     private JPanel panel12;
     private JButton button31;
     private JButton button32;
     private JButton button33;
     private JButton button34;
     private JButton button35;
     private JPanel panel13;
     private JButton button36;
     private JButton button37;
     private JButton button38;
     private JPanel panel14;
     private JButton button39;
     private JButton button40;
     private JPanel panel15;
     private JButton button41;
     private JButton button42;
     private JButton button43;
     // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

}

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("navbar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Thêm lớp JPanel vào JFrame
        NavBar navBar = new NavBar();
        frame.getContentPane().add(navBar);

        // Thiết lập kích thước cửa sổ và hiển thị nó
        frame.setSize(1280, 800);
        frame.setVisible(true);
    }
}