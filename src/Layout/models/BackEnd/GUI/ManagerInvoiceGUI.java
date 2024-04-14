/*
 * Created by JFormDesigner on Sun Apr 14 01:00:29 ICT 2024
 */

package Layout.models.BackEnd.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 * @author m1lt43
 */
public class ManagerInvoiceGUI extends JPanel {
    public ManagerInvoiceGUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Teddy
        panel8 = new JPanel();
        action = new JPanel();
        btnPanel = new JPanel();
        button15 = new JButton();
        button16 = new JButton();
        button18 = new JButton();
        searchPanel = new JPanel();
        search = new JPanel();
        optionSearch = new JComboBox();
        textField1 = new JTextField();
        dateCreate = new JPanel();
        textField3 = new JTextField();
        label1 = new JLabel();
        textField2 = new JTextField();
        label2 = new JLabel();
        panel11 = new JPanel();
        button20 = new JButton();
        button19 = new JButton();
        scrollPane1 = new JScrollPane();
        TableInvoice = new JTable();

        //======== panel8 ========
        {
            panel8.setForeground(new Color(0xcccccc));
            panel8.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
            . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing
            .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
            Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
            ) ,panel8. getBorder () ) ); panel8. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
            public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName (
            ) ) )throw new RuntimeException( ) ;} } );
            panel8.setLayout(new BorderLayout());

            //======== action ========
            {
                action.setLayout(new BorderLayout());

                //======== btnPanel ========
                {
                    btnPanel.setLayout(new FlowLayout());

                    //---- button15 ----
                    button15.setText("xu\u1ea5t Excel");
                    button15.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/javaSwing/src/Layout/images/icons8_ms_excel_30px.png"));
                    btnPanel.add(button15);

                    //---- button16 ----
                    button16.setText("Nh\u1eadp Excel");
                    button16.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/javaSwing/src/Layout/images/icons8_ms_excel_30px.png"));
                    btnPanel.add(button16);

                    //---- button18 ----
                    button18.setText("In PDF");
                    button18.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/javaSwing/src/Layout/images/icons8_agreement_30px.png"));
                    btnPanel.add(button18);
                }
                action.add(btnPanel, BorderLayout.NORTH);

                //======== searchPanel ========
                {
                    searchPanel.setLayout(new FlowLayout());

                    //======== search ========
                    {
                        search.setBorder(new TitledBorder("T\u00ecm ki\u1ebfm"));
                        search.setLayout(new FlowLayout());

                        //---- optionSearch ----
                        optionSearch.setMaximumRowCount(10);
                        optionSearch.setMinimumSize(new Dimension(100, 30));
                        optionSearch.setPreferredSize(new Dimension(90, 45));
                        optionSearch.setAlignmentX(2.5F);
                        search.add(optionSearch);

                        //---- textField1 ----
                        textField1.setMinimumSize(new Dimension(120, 30));
                        textField1.setPreferredSize(new Dimension(120, 45));
                        search.add(textField1);
                    }
                    searchPanel.add(search);

                    //======== dateCreate ========
                    {
                        dateCreate.setBorder(new TitledBorder("Ng\u00e0y l\u1eadp"));
                        dateCreate.setLayout(new FlowLayout());

                        //---- textField3 ----
                        textField3.setBorder(new TitledBorder("T\u1eeb:"));
                        textField3.setPreferredSize(new Dimension(100, 45));
                        dateCreate.add(textField3);

                        //---- label1 ----
                        label1.setIcon(new ImageIcon(getClass().getResource("/Layout/images/icons8_calendar_31_30px.png")));
                        dateCreate.add(label1);

                        //---- textField2 ----
                        textField2.setBorder(new TitledBorder("\u0110\u1ebfn:"));
                        textField2.setPreferredSize(new Dimension(90, 45));
                        dateCreate.add(textField2);

                        //---- label2 ----
                        label2.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/javaSwing/src/Layout/images/icons8_calendar_31_30px.png"));
                        dateCreate.add(label2);
                    }
                    searchPanel.add(dateCreate);

                    //======== panel11 ========
                    {
                        panel11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        panel11.setLayout(new FlowLayout());

                        //---- button20 ----
                        button20.setText("Xem chi ti\u1ebft");
                        button20.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/javaSwing/src/Layout/images/icons8_show_property_30px.png"));
                        panel11.add(button20);

                        //---- button19 ----
                        button19.setText("L\u00e0m m\u1edbi");
                        button19.setIcon(new ImageIcon("/Users/m1lt43/Desktop/DoAnJavaSwing/javaSwing/src/Layout/images/icons8_data_backup_30px.png"));
                        panel11.add(button19);
                    }
                    searchPanel.add(panel11);
                }
                action.add(searchPanel, BorderLayout.CENTER);
            }
            panel8.add(action, BorderLayout.NORTH);

            //======== scrollPane1 ========
            {

                //---- TableInvoice ----
                TableInvoice.setCellSelectionEnabled(true);
                TableInvoice.setDragEnabled(true);
                TableInvoice.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                    },
                    new String[] {
                        "STT","Mã hoá đơn","Mã nhân viên","Mã Khách hàng","Mã khuyến mãi","Ngày lập","Giờ lập","Tổng tiền"
                    }
                ));
                scrollPane1.setViewportView(TableInvoice);
            }
            panel8.add(scrollPane1, BorderLayout.CENTER);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Teddy
    private JPanel panel8;
    private JPanel action;
    private JPanel btnPanel;
    private JButton button15;
    private JButton button16;
    private JButton button18;
    private JPanel searchPanel;
    private JPanel search;
    private JComboBox optionSearch;
    private JTextField textField1;
    private JPanel dateCreate;
    private JTextField textField3;
    private JLabel label1;
    private JTextField textField2;
    private JLabel label2;
    private JPanel panel11;
    private JButton button20;
    private JButton button19;
    private JScrollPane scrollPane1;
    private JTable TableInvoice;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) {
        new ManagerInvoiceGUI().setVisible(true);
    }
}
