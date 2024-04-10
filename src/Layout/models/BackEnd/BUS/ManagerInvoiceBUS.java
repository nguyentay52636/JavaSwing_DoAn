package Layout.models.BackEnd.BUS;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import Layout.models.BackEnd.DAO.ManagerInvoiceDAO;
import Layout.models.BackEnd.DTO.InvoiceDTO;

public class ManagerInvoiceBUS {
    private ArrayList<InvoiceDTO> listInvoice = new ArrayList<>();
    private ManagerInvoiceDAO invoiceDAO = new ManagerInvoiceDAO();

    public ManagerInvoiceBUS() {
        listInvoice = invoiceDAO.readDB();
    }

    public ArrayList<InvoiceDTO> getListInvoice() {
        return listInvoice;
    }

    public void setListInvoice(ArrayList<InvoiceDTO> listInvoice) {
        this.listInvoice = listInvoice;
    }

    public ManagerInvoiceDAO getInvoiceDAO() {
        return invoiceDAO;
    }

    public void setInvoiceDAO(ManagerInvoiceDAO invoiceDAO) {
        this.invoiceDAO = invoiceDAO;
    }

    public String[] getHeaders() {
        return new String[] { "Mã hóa đơn", "Mã nhân viên", "Mã khách hàng", "Mã khuyến mãi", "Ngày lập", "Giờ lập",
                "Tổng tiền" };
    }

    public String getNextID() {
        return "HD" + String.valueOf(this.listInvoice.size() + 1);
    }

    public InvoiceDTO getInvoice(String idInvoice) {
        for (InvoiceDTO invoice : listInvoice) {
            if (invoice.getMaHoadon().equals(idInvoice)) {
                return invoice;
            }
        }
        return null;
    }

    public Boolean addInvoiceBUS(InvoiceDTO invoice) {
        Boolean success = invoiceDAO.addInvoice(invoice);
        if (success) {
            listInvoice.add(invoice);
            return true;

        }
        return false;
    }

    public Boolean deleteInvoiceBUS(String idInvoice) {
        Boolean success = invoiceDAO.deleteInvoice(idInvoice);
        if (success) {
            for (InvoiceDTO invoice : listInvoice) {
                if (invoice.getMaHoadon().equals(idInvoice)) {
                    listInvoice.remove(invoice);
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean update(InvoiceDTO invoice) {
        Boolean success = invoiceDAO.update(invoice);
        if (success) {
            for (InvoiceDTO invoiceDTO : listInvoice) {
                if (invoiceDTO.getMaHoadon().equals(invoice.getMaHoadon())) {
                    invoiceDTO = invoice;

                }
            }
            return true;
        }
        return false;
    }

    public Boolean updateInvoice(String maHoaDon, String maNhanVien, String maKhachHang, String makm,
            LocalDate ngayNhap, LocalTime gioNhap, float tongTien) {
        InvoiceDTO invoice = new InvoiceDTO(maHoaDon, maNhanVien, maKhachHang, makm, ngayNhap, gioNhap, tongTien);
        return update(invoice);
    }

    public Boolean updateTotalAmount(String idInvoice, float totalAmount) {
        Boolean success = invoiceDAO.InvoiceTotalAmountDAO(idInvoice, totalAmount);
        if (success) {
            for (InvoiceDTO invoice : listInvoice) {
                if (invoice.getMaHoadon().equals(idInvoice)) {
                    invoice.setTongTien(totalAmount);
                    return true;
                }
            }
        }
        return false;
    }

}
