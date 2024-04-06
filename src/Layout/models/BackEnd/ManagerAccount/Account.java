package Layout.models.BackEnd.ManagerAccount;

public class Account {
    String userName, password, maNV, maQuyen;

    public Account(String userName, String password, String maNV, String maQuyen) {
        this.userName = userName;
        this.password = password;
        this.maNV = maNV;
        this.maQuyen = maQuyen;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

}