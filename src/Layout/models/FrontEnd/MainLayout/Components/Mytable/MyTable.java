package Layout.models.FrontEnd.MainLayout.Components.Mytable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MyTable extends JPanel {

    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;

    public MyTable() {
    }

    public MyTable(JFrame parentFrame, Object[][] data, String[] columns) {
        setLayout(new BorderLayout());
        model = new DefaultTableModel(data, columns);
        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        scrollPane.getVerticalScrollBar().setUnitIncrement(8);

        table.setFillsViewportHeight(true);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        table.setRowHeight(40);

        // color
        int bgColor = 235;
        int color = 0;
        table.getTableHeader().setBackground(new Color(bgColor, bgColor, bgColor));
        table.getTableHeader().setForeground(new Color(color, color, color));
        table.setBackground(new Color(bgColor, bgColor, bgColor));
        table.setForeground(new Color(color, color, color));

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(scrollPane, BorderLayout.CENTER);
    }

    public void setHeaders(String[] headers) {
        model.setColumnIdentifiers(headers);
    }

    public void setHeaders(ArrayList<String> headers) {
        model.setColumnIdentifiers(headers.toArray());
    }

    // https://stackoverflow.com/questions/7433602/how-to-center-in-jtable-cell-a-value
    public void setAlignment(int column, int align) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(align);
        table.getColumnModel().getColumn(column).setCellRenderer(centerRenderer);
    }

    // https://stackoverflow.com/questions/28823670/how-to-sort-jtable-in-shortest-way
    public void setupSort() {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(sorter);

        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        for (int i = 0; i < model.getColumnCount(); i++) {
            sortKeys.add(new RowSorter.SortKey(i, SortOrder.ASCENDING));
        }
        sorter.setSortKeys(sortKeys);
    }

    public void addRow(String[] data) {
        model.addRow(data);
    }

    public JTable getTable() {
        return table;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void clear() {
        model.setRowCount(0);
    }

    public void setColumnsWidth(double[] percentages) {

        double total = 0;
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            total += percentages[i];
        }

        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth((int) (getWidth() * (percentages[i] / total)));
        }
    }

    public void resizeColumnWidth() {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }

            width += 15;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
}
