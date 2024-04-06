package Layout.models.BackEnd.ManagerTypeProducts.ManagerAccount;

public class TypeProductDTO {
    String MaLSP, TenLSP, MoTa;

    public TypeProductDTO(String maLSP, String tenLSP, String moTa) {
        MaLSP = maLSP;
        TenLSP = tenLSP;
        MoTa = moTa;
    }

    public String getMaLSP() {
        return MaLSP;
    }

    public void setMaLSP(String maLSP) {
        MaLSP = maLSP;
    }

    public String getTenLSP() {
        return TenLSP;
    }

    public void setTenLSP(String tenLSP) {
        TenLSP = tenLSP;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

}