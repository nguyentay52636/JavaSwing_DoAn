package Layout.models.BackEnd.ManagerAccount;

public class Account {
    String userName, password, codeNV, codeQuyen;

    public Account(String userName, String password, String codeNV, String codeQuyen) {
        this.userName = userName;
        this.password = password;
        this.codeNV = codeNV;
        this.codeQuyen = codeQuyen;
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

    public String getCodeNV() {
        return codeNV;
    }

    public void setCodeNV(String codeNV) {
        this.codeNV = codeNV;
    }

    public String getCodeQuyen() {
        return codeQuyen;
    }

    public void setCodeQuyen(String codeQuyen) {
        this.codeQuyen = codeQuyen;
    }
    
}
