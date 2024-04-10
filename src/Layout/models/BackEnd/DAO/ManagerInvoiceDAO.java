package Layout.models.BackEnd.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Layout.models.BackEnd.ConnectDataBasee.ConnectionDB;
import Layout.models.BackEnd.DTO.InvoiceDTO;

public class ManagerInvoiceDAO {
    private ConnectionDB connection;
    private PreparedStatement pst;

    public ManagerInvoiceDAO() {
        connection = new ConnectionDB();
        pst = null;
    }

    public ArrayList<InvoiceDTO> readDB() {
        connection = new ConnectionDB();
        ArrayList<InvoiceDTO> listOrder = new ArrayList<>();

        try {
            String query = "SELECT * FROM Invoice";
            ResultSet resultSet = connection.executeQuery(query);

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
            connection.close();
        }
        return listOrder;
    }

    public boolean addInvoice(InvoiceDTO invoice) {
        try {
            String query = "INSERT INTO Invoice(MaHD, MaNV, MaKH, NgayLap, GioLap, TongTien) VALUES(?, ?, ?, ?, ?, ?)";
            pst = connection.prepareStatement(query);
            pst.setString(1, invoice.getMaHoadon());
            pst.setString(2, invoice.getMaNhanVien());
            pst.setString(3, invoice.getMaKhachHang());
            pst.setDate(4, Date.valueOf(invoice.getNgayLap()));
            pst.setTime(5, Time.valueOf(invoice.getGioLap()));
            pst.setFloat(6, invoice.getTongTien());

            int rowsAffected = pst.executeUpdate();
            System.out.println("Thêm thành công!");
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection.close();
        }
    }

    public boolean deleteInvoice(String idInvoice) {
        try {
            String query = "DELETE FROM Invoice WHERE MaHD = ?";
            pst = connection.prepareStatement(query);
            pst.setString(1, idInvoice);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Hóa đơn đã được xoá thành công.");
                return true;
            } else {
                System.out.println("Xảy ra lỗi khi xoá hóa đơn.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error deleting invoice from database!!");
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection.close();
        }
    }

    public boolean update(InvoiceDTO invoice) {
        try {
            if (checkInvoiceExists(invoice.getMaHoadon())) {
                String query = "UPDATE Invoice SET MaNV=?, MaKH=?, NgayLap=?, GioLap=?, TongTien=? WHERE MaHB=?";
                pst = connection.prepareStatement(query);
                pst.setString(1, invoice.getMaNhanVien());
                pst.setString(2, invoice.getMaKhachHang());
                pst.setDate(3, Date.valueOf(invoice.getNgayLap()));
                pst.setTime(4, Time.valueOf(invoice.getGioLap()));
                pst.setFloat(5, invoice.getTongTien());
                pst.setString(6, invoice.getMaHoadon());

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Hóa đơn đã được cập nhật thành công.");
                    return true;
                } else {
                    System.out.println("Không tìm thấy hóa đơn để cập nhật.");
                    return false;
                }
            } else {
                System.out.println("Không tìm thấy hóa đơn để cập nhật.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating invoice in database!!");
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection.close();
        }
    }

    private boolean checkInvoiceExists(String idInvoice) throws SQLException {

        String query = "SELECT COUNT(*) FROM Invoice WHERE MaHD = ?";
        pst = connection.prepareStatement(query);
        pst.setString(1, idInvoice);
        ResultSet rs = pst.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        return count > 0;
    }

    public boolean InvoiceTotalAmountDAO(String idInvoce, Float totalAmount) {
        try {
            String query = "UPDATE Invoice SET TongTien=? WHERE MaHD =?";
            pst = connection.prepareStatement(query);
            pst.setFloat(1, totalAmount);
            pst.setString(2, idInvoce);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Tổng tiền hóa đơn đã được cập nhật thành công.");
                return true;
            } else {
                System.out.println("Không tìm thấy hóa đơn để cập nhật tổng tiền.");

                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return false;
    }

}