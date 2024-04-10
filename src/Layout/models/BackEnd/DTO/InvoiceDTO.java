package Layout.models.BackEnd.DTO;


import java.time.LocalDate;
import java.time.LocalTime;

public class InvoiceDTO {
    private String maHoadon = "";
    private String maNhanVien = "";
    private String maKhachHang = "";
    private String maKhuyenMai = "";
    private LocalDate ngayLap;
    private LocalTime gioLap;
    private float tongTien = 0;

    public InvoiceDTO() {
        this.ngayLap = LocalDate.now();
        this.gioLap = LocalTime.now();
    }

    public InvoiceDTO(String maHoadon, String maNhanVien, String maKhachHang, String maKhuyenMai, LocalDate ngayLap,
            LocalTime gioLap, float tongTien) {
        this.maHoadon = maHoadon;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maKhuyenMai = maKhuyenMai;
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

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public LocalTime getGioLap() {
        return gioLap;
    }

    public void setGioLap(LocalTime gioLap) {
        this.gioLap = gioLap;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
}
