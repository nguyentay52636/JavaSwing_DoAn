package Layout.models.BackEnd.ManagerOrder;

import java.time.LocalDate;

public class InvoiceDTO {
    private String maHoadon = "";
    private String maNhanVien = "";
    private String maKhachHang = "";
    private String maGiamGia = "";
    private LocalDate ngayLap;
    private LocalDate gioLap;
    private float tongTien = 0;

    public InvoiceDTO() {
        this.ngayLap = LocalDate.now();
        this.gioLap = LocalDate.now();
    }

    public InvoiceDTO(String maHoadon, String maNhanVien, String maKhachHang, String maGiamGia, LocalDate ngayLap,
            LocalDate gioLap, float tongTien) {
        this.maHoadon = maHoadon;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maGiamGia = maGiamGia;
        this.ngayLap = ngayLap;
        this.gioLap = gioLap;
        this.tongTien = tongTien;
    }

    public String getMaHoadon() {
        return maHoadon;
    }

    public void setMaHoadon(String maHoadon) {
        this.maHoadon = maHoadon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public LocalDate getGioLap() {
        return gioLap;
    }

    public void setGioLap(LocalDate gioLap) {
        this.gioLap = gioLap;
    }

    public float getTotalAmount() {
        return tongTien;
    }

    public void setTotalAmount(float totalAmount) {
        tongTien = totalAmount;
    }

}