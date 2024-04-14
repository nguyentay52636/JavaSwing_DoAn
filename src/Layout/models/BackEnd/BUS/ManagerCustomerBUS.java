package Layout.models.BackEnd.BUS;

import java.util.ArrayList;

import Layout.models.BackEnd.DAO.ManagerCustomerDAO;
import Layout.models.BackEnd.DTO.CustomerDTO;

public class ManagerCustomerBUS {
    private ArrayList<CustomerDTO> dskh = new ArrayList<>();
    private ManagerCustomerDAO qlkhDAO = new ManagerCustomerDAO();

    public ManagerCustomerBUS() {
        dskh = qlkhDAO.readDB();
    }

    public void hienThi() {
        dskh.forEach((kh) -> {
            System.out.print(kh.getMaKH() + " ");
            System.out.println(kh.getTenKh() + " ");
            System.out.println(kh.getDiaChi() + " ");
            System.out.println(kh.getSdt() + " ");
            System.out.println(kh.getTrangThai());
        });
    }

    public String[] getHeaders() {
        return new String[] { "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "SĐT", "Trạng thái" };
    }

    public void readDB() {
        dskh = qlkhDAO.readDB();
    }

    public String getNextID() {
        return "KH" + String.valueOf(this.dskh.size() + 1);
    }

    public CustomerDTO getKhachHang(String makh) {
        for (CustomerDTO kh : dskh) {
            if (kh.getMaKH().equals(makh)) {
                return kh;
            }
        }
        return null;
    }

    public ArrayList<CustomerDTO> search(String value, String type) {

        ArrayList<CustomerDTO> result = new ArrayList<>();

        dskh.forEach((kh) -> {
            if (type.equals("Tất cả")) {
                if (kh.getMaKH().toLowerCase().contains(value.toLowerCase())
                        || kh.getTenKh().toLowerCase().contains(value.toLowerCase())
                        || kh.getDiaChi().toLowerCase().contains(value.toLowerCase())
                        || String.valueOf(kh.getSdt()).toLowerCase().contains(value.toLowerCase())
                        || String.valueOf(kh.getTrangThai() == 1 ? "Ẩn" : "Hiện").toLowerCase()
                                .contains(value.toLowerCase())) {
                    result.add(kh);
                }
            } else {
                switch (type) {
                    case "Mã khách hàng":
                        if (kh.getMaKH().toLowerCase().contains(value.toLowerCase())) {
                            result.add(kh);
                        }
                        break;
                    case "Tên khách hàng":
                        if (kh.getTenKh().toLowerCase().contains(value.toLowerCase())) {
                            result.add(kh);
                        }
                        break;
                    case "Địa chỉ":
                        if (kh.getDiaChi().toLowerCase().contains(value.toLowerCase())) {
                            result.add(kh);
                        }
                        break;
                    case "Số điện thoại":
                        if (kh.getSdt().toLowerCase().contains(value.toLowerCase())) {
                            result.add(kh);
                        }
                        break;
                    case "Trạng thái":
                        if (String.valueOf(kh.getTrangThai() == 1 ? "Ẩn" : "Hiện").toLowerCase()
                                .contains(value.toLowerCase())) {
                            result.add(kh);
                        }
                        break;
                }
            }

        });

        return result;
    }

    public Boolean add(CustomerDTO kh) {
        Boolean ok = qlkhDAO.add(kh);

        if (ok) {
            dskh.add(kh);
        }
        return ok;
    }

    public Boolean add(String makh, String tenkh, String diachi, String sdt, int trangthai) {
        CustomerDTO kh = new CustomerDTO(makh, tenkh, diachi, sdt, trangthai);
        return add(kh);
    }

    public Boolean delete(String makh) {
        Boolean ok = qlkhDAO.delete(makh);

        if (ok) {
            for (int i = (dskh.size() - 1); i >= 0; i--) {
                if (dskh.get(i).getMaKH().equals(makh)) {
                    dskh.remove(i);
                }
            }
        }
        return ok;
    }

    public Boolean update(String makh, String tenkh, String diachi, String sdt, int trangthai) {
        Boolean ok = qlkhDAO.update(makh, tenkh, diachi, sdt, trangthai);

        if (ok) {
            dskh.forEach((kh) -> {
                if (kh.getMaKH().equals(makh)) {
                    kh.setTenKh(tenkh);
                    kh.setDiaChi(diachi);
                    kh.setSdt(sdt);
                }
            });
        }

        return ok;
    }

    public Boolean updateTrangThai(String makh, int trangthai) {
        Boolean ok = qlkhDAO.updateTrangThai(makh, trangthai);

        if (ok) {
            dskh.forEach((kh) -> {
                if (kh.getMaKH().equals(makh)) {
                    kh.setTrangThai(trangthai);
                }
            });
        }

        return ok;
    }

    public ArrayList<CustomerDTO> getDskh() {
        return dskh;
    }
}
