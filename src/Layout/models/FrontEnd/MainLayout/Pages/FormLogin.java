/*
 * Created by JFormDesigner on Sat Apr 13 22:14:26 ICT 2024
 */

package Layout.models.FrontEnd.MainLayout.Pages;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author m1lt43
 */
public class FormLogin extends JFrame {
    public FormLogin() {
        initComponents();
        // pack();
        // setUndecorated(true);

    }

    private void showPasswordMouseClicked(MouseEvent e) {
        // Đặt EchoChar của JPasswordField thành 0 để hiển thị mật khẩu
        txtPassword.setEchoChar((char) 0);
        // Ẩn biểu tượng cho mật khẩu đã hiển thị
        showPassword.setVisible(false);
        showPassword.setEnabled(false);
        // Hiển thị biểu tượng cho mật khẩu đã che
        hiddenPassword.setVisible(true);
        hiddenPassword.setEnabled(true);
    }


    private void hiddenPasswordMouseClicked(MouseEvent e) {
        // Đặt EchoChar của JPasswordField thành '*' để che mật khẩu
        txtPassword.setEchoChar('*');
        // Hiển thị biểu tượng cho mật khẩu đã che
        showPassword.setVisible(true);
        showPassword.setEnabled(true);
        // Ẩn biểu tượng cho mật khẩu đã hiển thị
        hiddenPassword.setVisible(false);
        hiddenPassword.setEnabled(false);
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Teddy
        this2 = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel3 = new JPanel();
        userNameLabel = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        passwordLabel = new JLabel();
        label9 = new JLabel();
        showPassword = new JLabel();
        checkBox1 = new JCheckBox();
        label10 = new JLabel();
        label11 = new JLabel();
        btnLogin = new JButton();
        txtuserName = new JTextField();
        txtPassword = new JPasswordField();
        hiddenPassword = new JLabel();
        IconClose = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== this2 ========
        {
            this2.setBackground(new Color(0xcccccc));
            this2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,this2. getBorder( )) )
            ; this2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            this2.setLayout(null);

            //======== panel1 ========
            {
                panel1.setBackground(new Color(0xdfe1e5));
                panel1.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText("text");
                label1.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/LoginForm/src/icon/bg-login.png"));
                label1.setFont(new Font("Inter", Font.PLAIN, 15));
                panel1.add(label1, BorderLayout.CENTER);
            }
            this2.add(panel1);
            panel1.setBounds(0, 0, 515, 585);

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0x3399ff));
                panel2.setFont(new Font("Inter", Font.PLAIN, 18));
                panel2.setLayout(null);

                //---- label2 ----
                label2.setText("Login");
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                label2.setFont(new Font("Luminari", Font.BOLD | Font.ITALIC, 28));
                label2.setForeground(Color.white);
                label2.setIconTextGap(10);
                panel2.add(label2);
                label2.setBounds(5, 95, 560, 50);

                //---- label3 ----
                label3.setText("Ch\u00e0o m\u1eebng b\u1ea1n \u0111\u1ebfn v\u1edbi ph\u1ea7n m\u1ec1m qu\u1ea3n l\u00fd c\u1ee7a h\u00e0ng \u0111i\u1ec7n tho\u1ea1i ");
                label3.setFont(new Font("Kokonor", Font.ITALIC, 16));
                panel2.add(label3);
                label3.setBounds(55, 160, 465, 30);

                //======== panel3 ========
                {
                    panel3.setAutoscrolls(true);
                    panel3.setBackground(new Color(0x3399ff));
                    panel3.setForeground(new Color(0x0066ff));
                    panel3.setLayout(null);

                    //---- userNameLabel ----
                    userNameLabel.setText("Username");
                    userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    userNameLabel.setFont(new Font("Inter", Font.BOLD, 13));
                    panel3.add(userNameLabel);
                    userNameLabel.setBounds(75, 70, 100, 40);

                    //---- label5 ----
                    label5.setText("____________________________________________________");
                    label5.setBackground(Color.white);
                    panel3.add(label5);
                    label5.setBounds(90, 115, 330, 30);

                    //---- label6 ----
                    label6.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/LoginForm/src/icon/icons8_user_20px_1.png"));
                    label6.setHorizontalAlignment(SwingConstants.CENTER);
                    label6.setIconTextGap(5);
                    label6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    panel3.add(label6);
                    label6.setBounds(425, 95, 35, 35);

                    //---- passwordLabel ----
                    passwordLabel.setText("Password");
                    passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    passwordLabel.setFont(new Font("Inter", Font.BOLD, 13));
                    panel3.add(passwordLabel);
                    passwordLabel.setBounds(75, 135, 105, 40);

                    //---- label9 ----
                    label9.setBackground(Color.white);
                    label9.setText("_____________________________________________________");
                    panel3.add(label9);
                    label9.setBounds(90, 175, 335, 35);

                    //---- showPassword ----
                    showPassword.setText("text");
                    showPassword.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/LoginForm/src/icon/icons8_invisible_20px_1.png"));
                    showPassword.setFont(new Font("Inter", Font.PLAIN, 12));
                    showPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    showPassword.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            showPasswordMouseClicked(e);
                        }
                    });
                    panel3.add(showPassword);
                    showPassword.setBounds(435, 160, 25, 35);

                    //---- checkBox1 ----
                    checkBox1.setText("Remember Password");
                    checkBox1.setBackground(new Color(0x3399ff));
                    checkBox1.setAutoscrolls(true);
                    checkBox1.setHorizontalAlignment(SwingConstants.LEFT);
                    checkBox1.setFont(new Font("Inter", Font.BOLD, 13));
                    panel3.add(checkBox1);
                    checkBox1.setBounds(90, 210, 155, checkBox1.getPreferredSize().height);

                    //---- label10 ----
                    label10.setText("Forget Password ?");
                    label10.setFont(new Font("Inter", Font.BOLD, 13));
                    panel3.add(label10);
                    label10.setBounds(320, 210, 130, label10.getPreferredSize().height);

                    //---- label11 ----
                    label11.setText("Let Go !!!");
                    label11.setIconTextGap(6);
                    label11.setFont(new Font("Luminari", Font.BOLD, 21));
                    label11.setHorizontalAlignment(SwingConstants.CENTER);
                    panel3.add(label11);
                    label11.setBounds(180, 10, 165, label11.getPreferredSize().height);

                    //---- btnLogin ----
                    btnLogin.setText("LOGIN");
                    btnLogin.setBackground(Color.white);
                    btnLogin.setFont(new Font("Oriya MN", Font.BOLD, 18));
                    btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    panel3.add(btnLogin);
                    btnLogin.setBounds(90, 255, 335, 40);

                    //---- txtuserName ----
                    txtuserName.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    txtuserName.setDisabledTextColor(new Color(0x0099ff));
                    txtuserName.setSelectionColor(new Color(0x3399ff));
                    txtuserName.setBackground(new Color(0x3399ff));
                    txtuserName.setForeground(Color.black);
                    txtuserName.setBorder(null);
                    panel3.add(txtuserName);
                    txtuserName.setBounds(90, 95, 335, 35);

                    //---- txtPassword ----
                    txtPassword.setBackground(new Color(0x3399ff));
                    txtPassword.setForeground(Color.black);
                    txtPassword.setBorder(null);
                    panel3.add(txtPassword);
                    txtPassword.setBounds(90, 160, 335, 35);

                    //---- hiddenPassword ----
                    hiddenPassword.setText("text");
                    hiddenPassword.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/LoginForm/src/icon/icons8_eye_20px_1.png"));
                    hiddenPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    hiddenPassword.setEnabled(false);
                    hiddenPassword.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            hiddenPasswordMouseClicked(e);
                        }
                    });
                    panel3.add(hiddenPassword);
                    hiddenPassword.setBounds(435, 160, 25, 35);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel3.getComponentCount(); i++) {
                            Rectangle bounds = panel3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel3.setMinimumSize(preferredSize);
                        panel3.setPreferredSize(preferredSize);
                    }
                }
                panel2.add(panel3);
                panel3.setBounds(30, 205, 510, 345);

                //---- IconClose ----
                IconClose.setText("X");
                IconClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                IconClose.setBackground(new Color(0xff0033));
                IconClose.setHorizontalAlignment(SwingConstants.CENTER);
                IconClose.setFont(new Font("Inter", Font.BOLD, 18));
                IconClose.setBorder(BorderFactory.createEmptyBorder());
                panel2.add(IconClose);
                IconClose.setBounds(535, 0, 29, 30);
            }
            this2.add(panel2);
            panel2.setBounds(515, 0, 565, 585);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < this2.getComponentCount(); i++) {
                    Rectangle bounds = this2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = this2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                this2.setMinimumSize(preferredSize);
                this2.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(this2);
        this2.setBounds(0, 0, 1080, 555);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Teddy
    private JPanel this2;
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel2;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel3;
    private JLabel userNameLabel;
    private JLabel label5;
    private JLabel label6;
    private JLabel passwordLabel;
    private JLabel label9;
    private JLabel showPassword;
    private JCheckBox checkBox1;
    private JLabel label10;
    private JLabel label11;
    private JButton btnLogin;
    private JTextField txtuserName;
    private JPasswordField txtPassword;
    private JLabel hiddenPassword;
    private JLabel IconClose;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
