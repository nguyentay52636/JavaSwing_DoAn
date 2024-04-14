package Layout.models.BackEnd.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Layout.models.BackEnd.ConnectDataBasee.ConnectionDB;
import Layout.models.BackEnd.DTO.TypeProductDTO;

public class ManagerTypeProductDAO {
    ConnectionDB qllspConnection;

    public ManagerTypeProductDAO() {

    }

    public ArrayList<TypeProductDTO> readDB() {
        qllspConnection = new ConnectionDB();

        ArrayList<TypeProductDTO> dslsp = new ArrayList<>();
        try {
            String qry = "SELECT * FROM type_product";
            ResultSet r = qllspConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String malsp = r.getString(1);
                    String tenlsp = r.getString(2);
                    String mota = r.getString(3);

                    dslsp.add(new TypeProductDTO(malsp, tenlsp, mota));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Lỗi đọc dữ liệu bảng loại sản phẩm");
        } finally {
            qllspConnection.closeConnection();
        }

        return dslsp;
    }

    public ArrayList<TypeProductDTO> search(String columnName, String value) {
        qllspConnection = new ConnectionDB();
        ArrayList<TypeProductDTO> dslsp = new ArrayList<>();

        try {
            String qry = "SELECT * FROM type_product WHERE " + columnName + " LIKE '%" + value + "%'";
            ResultSet r = qllspConnection.sqlQuery(qry);
            if (r != null) {
                while (r.next()) {
                    String malsp = r.getString(1);
                    String tenlsp = r.getString(2);
                    String mota = r.getString(3);

                    dslsp.add(new TypeProductDTO(malsp, tenlsp, mota));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "-- ERROR! Lỗi tìm dữ liệu " + columnName + " = " + value + " bảng loại sản phẩm");
        } finally {
            qllspConnection.closeConnection();
        }

        return dslsp;
    }

    public Boolean add(TypeProductDTO typeProduct) {
        qllspConnection = new ConnectionDB();
        Boolean result = qllspConnection.sqlUpdate("INSERT INTO type_product (MaLSP,TenLSP,MoTa) VALUES ('"
                + typeProduct.getMaLoaiSanPham() + "','"
                + typeProduct.getTenLoaiSanPham() + "','"
                + typeProduct.getMoTa() + "')");

        qllspConnection.closeConnection();
        return result;
    }

    public boolean delete(String maLoaiSanPham) {
        qllspConnection = new ConnectionDB();
        Boolean result = qllspConnection.sqlUpdate("DELETE FROM type_product WHERE MaLSP = '" + maLoaiSanPham + "'");
        qllspConnection.closeConnection();
        return result;
    }

    public Boolean update(String maLoaiSanPham, String tenLoaiSanPham, String moTa) {
        qllspConnection = new ConnectionDB();
        Boolean ok = qllspConnection.sqlUpdate("Update type_product Set TenLSP='" + tenLoaiSanPham + "', MoTa='" + moTa
                + "' where MaLSP='" + maLoaiSanPham + "'");
        qllspConnection.closeConnection();
        return ok;
    }

    public void close() {
        qllspConnection.closeConnection();
    }
}
