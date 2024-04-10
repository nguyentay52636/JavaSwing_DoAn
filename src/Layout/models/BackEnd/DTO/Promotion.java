package Layout.models.BackEnd.DTO;


import java.time.LocalDate;

public class Promotion {
    String MaKM, TenKM;
    float DieuKienKM, PhanTramKM;
    LocalDate NgayBD, NgayKT;

    public Promotion(String maKM, String tenKM, float dieuKienKM, float phanTramKM, LocalDate ngayBD,
            LocalDate ngayKT) {
        MaKM = maKM;
        TenKM = tenKM;
        DieuKienKM = dieuKienKM;
        PhanTramKM = phanTramKM;
        NgayBD = ngayBD;
        NgayKT = ngayKT;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String maKM) {
        MaKM = maKM;
    }

    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String tenKM) {
        TenKM = tenKM;
    }

    public float getDieuKienKM() {
        return DieuKienKM;
    }

    public void setDieuKienKM(float dieuKienKM) {
        DieuKienKM = dieuKienKM;
    }

    public float getPhanTramKM() {
        return PhanTramKM;
    }

    public void setPhanTramKM(float phanTramKM) {
        PhanTramKM = phanTramKM;
    }

    public LocalDate getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(LocalDate ngayBD) {
        NgayBD = ngayBD;
    }

    public LocalDate getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(LocalDate ngayKT) {
        NgayKT = ngayKT;
    }
}