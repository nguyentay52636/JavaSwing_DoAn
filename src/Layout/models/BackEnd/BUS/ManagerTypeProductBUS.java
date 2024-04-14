package Layout.models.BackEnd.BUS;

import java.util.ArrayList;

import Layout.models.BackEnd.DAO.ManagerTypeProductDAO;
import Layout.models.BackEnd.DTO.TypeProductDTO;

public class ManagerTypeProductBUS {
    private ArrayList<TypeProductDTO> dslsp = new ArrayList<>();
    private ManagerTypeProductDAO qllspDAO = new ManagerTypeProductDAO();

    public ManagerTypeProductBUS() {
        dslsp = qllspDAO.readDB();
    }

    public void hienThi() {
        dslsp.forEach((lsp) -> {
            System.out.print(lsp.getMaLoaiSanPham() + " ");
            System.out.print(lsp.getTenLoaiSanPham());
        });
    }

    public String[] getHeaders() {
        return new String[] { "Mã loại", "Tên loại", "Mô tả" };
    }

    public String getNextID() {
        return "LSP" + String.valueOf(this.dslsp.size() + 1);
    }

    public void readDB() {
        dslsp = qllspDAO.readDB();
    }

    public TypeProductDTO getLoaiSanPham(String maloaiSanPham) {
        for (TypeProductDTO lsp : dslsp) {
            if (lsp.getMaLoaiSanPham().equals(maloaiSanPham)) {
                return lsp;
            }
        }
        return null;
    }

    public ArrayList<TypeProductDTO> search(String value, String type) {

        ArrayList<TypeProductDTO> result = new ArrayList<>();

        dslsp.forEach((lsp) -> {
            if (type.equals("Tất cả")) {
                if (lsp.getMaLoaiSanPham().toLowerCase().contains(value.toLowerCase())
                        || lsp.getTenLoaiSanPham().toLowerCase().contains(value.toLowerCase())
                        || lsp.getMoTa().toLowerCase().contains(value.toLowerCase())) {
                    result.add(lsp);
                }
            } else {
                switch (type) {
                    case "Mã loại":
                        if (lsp.getMaLoaiSanPham().toLowerCase().contains(value.toLowerCase())) {
                            result.add(lsp);
                        }
                        break;
                    case "Tên loại":
                        if (lsp.getTenLoaiSanPham().toLowerCase().contains(value.toLowerCase())) {
                            result.add(lsp);
                        }
                        break;
                    case "Mô tả":
                        if (lsp.getMoTa().toLowerCase().contains(value.toLowerCase())) {
                            result.add(lsp);
                        }
                        break;

                }
            }
        });

        return result;
    }

    public Boolean add(TypeProductDTO TypeProductDTO) {
        Boolean result = qllspDAO.add(TypeProductDTO);

        if (result) {
            dslsp.add(TypeProductDTO);
        }
        return false;
    }

    public Boolean add(String maLoaiSanPham, String tenLoaiSanPham, String moTa) {
        TypeProductDTO typeProduct = new TypeProductDTO(maLoaiSanPham, tenLoaiSanPham, moTa);
        return add(typeProduct);
    }

    public Boolean delete(String maLoaiSanPham) {
        Boolean result = qllspDAO.delete(maLoaiSanPham);

        if (result) {
            for (int i = 0; i < dslsp.size(); i++) {
                if (dslsp.get(i).getMaLoaiSanPham().equals(maLoaiSanPham)) {
                    dslsp.remove(i);
                }
            }
        }
        return result;
    }

    public Boolean update(String maLoaiSanPham, String tenLoaiSanPham, String moTa) {
        Boolean result = qllspDAO.update(maLoaiSanPham, tenLoaiSanPham, moTa);

        if (result) {
            dslsp.forEach((lsp) -> {
                if (lsp.getMaLoaiSanPham().equals(maLoaiSanPham)) {
                    lsp.setTenLoaiSanPham(tenLoaiSanPham);
                    lsp.setMoTa(moTa);
                }
            });
        }
        return result;
    }

    public ArrayList<TypeProductDTO> getDslsp() {
        return dslsp;
    }

}
