package Layout.models.BackEnd.DAO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Layout.models.BackEnd.ConnectDataBasee.ConnectionDB;
import Layout.models.BackEnd.DTO.InvoiceDTO;

public class ManagerInvoiceDAO {
    private ConnectionDB connection;

    public ManagerInvoiceDAO() {
    }

    public ArrayList<InvoiceDTO> readDB() {
        connection = new ConnectionDB();
        ArrayList<InvoiceDTO> listOrder = new ArrayList<>();

        try {
            String query = "SELECT * FROM Invoice";
            ResultSet resultSet = connection.sqlQuery(query);
            if (resultSet != null) {
                while (resultSet.next()) {
                    InvoiceDTO invoice = new InvoiceDTO();
                    invoice.setMaHoadon(resultSet.getString("maHD"));
                    invoice.setMaNhanVien(resultSet.getString("MaNV"));
                    invoice.setMaKhuyenMai(resultSet.getString(" MaKH"));
                    invoice.setMaKhachHang(resultSet.getString("MaKH"));
                    invoice.setNgayLap(resultSet.getDate("NgayLap").toLocalDate());
                    invoice.setGioLap(resultSet.getTime("GioLap").toLocalTime());
                    invoice.setTongTien(resultSet.getFloat("TongTien"));
                    listOrder.add(invoice);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không đọc được dữ liệu bảng hóa đơn !!");
            e.printStackTrace();
        } finally {
            connection.closeConnection();
        }
        return listOrder;
    }

    public boolean addInvoice(InvoiceDTO invoice) {
        connection = new ConnectionDB();
        String query = "INSERT INTO Invoice(MaHD, MaNV, MaKH, NgayLap, GioLap, TongTien) VALUES('" +
                invoice.getMaHoadon() + "','" +
                invoice.getMaNhanVien() + "','" +
                invoice.getMaKhachHang() + "','" +
                Date.valueOf(invoice.getNgayLap()) + "','" +
                Time.valueOf(invoice.getGioLap()) + "'," +
                invoice.getTongTien() + ")";
        boolean result = connection.sqlUpdate(query);
        System.out.println("Thêm thành công!");
        return result;

    }

    public boolean deleteInvoice(String idInvoice) {
        connection = new ConnectionDB();
        Boolean result = connection.sqlUpdate("DELETE FROM Invoice WHERE MAHD = '" + idInvoice + "'");
        if (!result) {
            JOptionPane.showMessageDialog(null, "Vui long xoa het chi tiet cua hoa don truoc !!!");
            connection.closeConnection();
            return false;
        } else {
            connection.closeConnection();
            return result;
        }

    }

    public boolean update(InvoiceDTO invoice) {
        connection = new ConnectionDB();
        Boolean success = connection.sqlUpdate("UPDATE hoadon SET "
                + "MaNV='" + invoice.getMaNhanVien()
                + "', MaKH='" + invoice.getMaKhachHang()
                + "', MaKM='" + invoice.getMaKhuyenMai()
                + "', NgayLap='" + invoice.getNgayLap()
                + "', GioLap='" + invoice.getGioLap()
                + "', TongTien='" + invoice.getTongTien()
                + "' WHERE MaHD='" + invoice.getMaHoadon() + "';");
        connection.checkConnect();
        return success;
    }

    public boolean InvoiceTotalAmountDAO(String idInvoice, Float totalAmount) {
        connection = new ConnectionDB();
        Boolean success = connection
                .sqlUpdate("UPDATE hoadon SET TongTien='" + totalAmount + "' WHERE MaHD='" + idInvoice + "';");
        connection.closeConnection();
        return success;

    }
}